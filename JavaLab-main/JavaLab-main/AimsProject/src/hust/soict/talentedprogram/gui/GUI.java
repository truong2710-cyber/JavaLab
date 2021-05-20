package hust.soict.talentedprogram.gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import hust.soict.talentedprogram.aims.media.Media;
import hust.soict.talentedprogram.aims.order.Order;
import hust.soict.talentedprogram.aims.storage.Storage;

import javax.swing.JScrollPane;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;
import javax.swing.JToolBar;

public class GUI extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable table;
	private JTextField Total;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private ArrayList<Integer> unitList;
	private ArrayList<Integer> unitListBook;
	private ArrayList<Integer> unitListDVD;
	private ArrayList<Integer> unitListCD;
	private Float total=(float)0;
	private Float total_temp=(float)0;
	private Float total1=(float)0,total2=(float)0,total3=(float)0;
	private int amount=0,count=1;
	private boolean checkSave=false;
	@SuppressWarnings("serial")
	public GUI() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		setTitle("Order");
		this.setSize(1000,500);
		getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(515, 29, 459, 402);
		getContentPane().add(tabbedPane);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_4, null);
		panel_4.setLayout(null);
		tabbedPane.setTitleAt(0,"Bill");
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(0, 0, 454, 374);
		panel_4.add(textPane);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Order", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(4, 29, 507, 273);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 16, 495, 246);
		panel_2.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(194, 16, 280, 219);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Title", "Price per unit ($)", "Amount "
			}
		) {
			@SuppressWarnings("rawtypes")
			Class[] columnTypes = new Class[] {
				String.class, Float.class, Integer.class
			};
			@SuppressWarnings({ "unchecked", "rawtypes" })
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(96);
		table.getColumnModel().getColumn(1).setPreferredWidth(97);
		
		JButton OKBtn = new JButton("OK");
		OKBtn.setBounds(10, 73, 66, 23);
		panel.add(OKBtn);
		
		JLabel lblNewLabel = new JLabel("Choose the type");
		lblNewLabel.setBounds(45, 16, 120, 14);
		panel.add(lblNewLabel);
		
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Price", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3.setBounds(6, 313, 507, 118);
		getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 21, 487, 86);
		panel_3.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Total");
		lblNewLabel_1.setBounds(10, 11, 46, 14);
		panel_1.add(lblNewLabel_1);
		
		Total = new JTextField();
		Total.setBounds(83, 8, 86, 20);
		panel_1.add(Total);
		Total.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Lucky item ");
		lblNewLabel_2.setBounds(10, 36, 61, 14);
		panel_1.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(83, 33, 86, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Final price");
		lblNewLabel_3.setBounds(10, 61, 61, 14);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("with price of an unit is:");
		lblNewLabel_4.setBounds(179, 36, 115, 14);
		panel_1.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(293, 33, 86, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("$");
		lblNewLabel_5.setBounds(382, 36, 54, 14);
		panel_1.add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setBounds(83, 58, 86, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("$");
		lblNewLabel_6.setBounds(174, 11, 46, 14);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("$");
		lblNewLabel_7.setBounds(174, 61, 46, 14);
		panel_1.add(lblNewLabel_7);
		
		
		ArrayList<TableModelListener> tbl=new ArrayList<TableModelListener>();
		Storage str=new Storage();
		JComboBox<String> comboBox = new JComboBox<String>();
		
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Book", "DVD", "CD"}));
		comboBox.setBounds(10, 38, 159, 24);
		
		panel.add(comboBox);
		
		JButton DoneBtn = new JButton("Done");
		DoneBtn.setBounds(99, 73, 66, 23);
		panel.add(DoneBtn);
		
		JLabel lblNewLabel_8 = new JLabel("If you order at least 10 items and\r\r\n");
		lblNewLabel_8.setBounds(10, 107, 174, 23);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("total price is not less than 100$,");
		lblNewLabel_9.setBounds(10, 126, 174, 14);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("you will get a lucky item. The higher");
		lblNewLabel_10.setBounds(10, 141, 174, 14);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("the total cost is, the higher the");
		lblNewLabel_11.setBounds(10, 157, 174, 14);
		panel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("value of the lucky item you may get");
		lblNewLabel_12.setBounds(10, 172, 174, 14);
		panel.add(lblNewLabel_12);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 0, 621, 23);
		getContentPane().add(toolBar);
		
		JButton newBtn = new JButton("New");
		newBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!checkSave) {
					int choice=JOptionPane.showConfirmDialog(null, "You haven't saved your order yet. All data of this order will be lost. Create new order anyway?","Warning", JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
					if (choice==JOptionPane.CANCEL_OPTION)
						return;
				}
				checkSave=false;
				Total.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				unitListBook=new ArrayList<Integer>(Collections.nCopies(4, 0));
				unitListDVD=new ArrayList<Integer>(Collections.nCopies(4, 0));
				unitListCD=new ArrayList<Integer>(Collections.nCopies(4, 0));
				total=(float)0;
				total_temp=(float)0;
				total1=(float)0;
				total2=(float)0;
				total3=(float)0;
				textPane.setText(null);
				for (int i=0;i<table.getRowCount();i++)
					for (int j=0;j<table.getColumnCount();j++){
						table.setValueAt(null, i, j);
					}
			}
		});
		toolBar.add(newBtn);
		
		JButton saveBtn = new JButton("Save");
		saveBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkSave=true;
				String s=textPane.getText();
				try {
					String path=null;
					JFileChooser chooser=new JFileChooser();
					chooser.setDialogTitle("Choose place to save the bill");
					chooser.setCurrentDirectory(new File("E:\\eclipse-workspace\\JavaLab-main\\JavaLab-main\\AimsProject\\order bills"));
					File f = new File("E:\\eclipse-workspace\\JavaLab-main\\JavaLab-main\\AimsProject\\order bills\\order"+count+".txt");
					chooser.setSelectedFile(f);
					if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) { 
						path=chooser.getSelectedFile().getAbsolutePath();
						if(!chooser.getSelectedFile().exists()) {
							String filename=chooser.getSelectedFile().getName();
							PrintStream out = new PrintStream(new FileOutputStream(path));
							count++;
							out.println(s);
							out.close();
						}
						else System.out.println("File already exist!");
						int choice=JOptionPane.showConfirmDialog(null, "File already exist! Overwrite anyway?","Warning", JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
						if (choice!=JOptionPane.CANCEL_OPTION) {
							String filename=chooser.getSelectedFile().getName();
							PrintStream out = new PrintStream(new FileOutputStream(path));
							count++;
							out.println(s);
							out.close();
						}
					}
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		toolBar.add(saveBtn);
		
		unitListBook=new ArrayList<Integer>(Collections.nCopies(4, 0));
		unitListDVD=new ArrayList<Integer>(Collections.nCopies(4, 0));
		unitListCD=new ArrayList<Integer>(Collections.nCopies(4, 0));
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String type=(String) comboBox.getSelectedItem();
				if (type.equals("Book")) {unitList = unitListBook; total_temp=total1;}
				if (type.equals("DVD")) {unitList = unitListDVD; total_temp=total2;}
				if (type.equals("CD")) {unitList = unitListCD; total_temp=total3;}
				ArrayList<Media> items=str.storage(type);
				int i=0;
				for (Media item : items) {
					table.setValueAt(item.getTitle(), i, 0);
					table.setValueAt(item.getCost(), i, 1);
					table.setValueAt(unitList.get(i), i, 2);
					i++;
				}
				if (tbl.size()>0)
					for (TableModelListener al:tbl)
						table.getModel().removeTableModelListener(al);
				table.getModel().addTableModelListener(new TableModelListener() {
					public void tableChanged(TableModelEvent tableModelEvent) {
						tbl.add(this);
						if (table.isEditing()) {
							unitList.set(table.getSelectedRow(),(Integer)table.getValueAt(table.getSelectedRow(), 2));
							System.out.println(table.getSelectedRow());
						}
					}
				});
				total_temp=(float)0;
				if (OKBtn.getActionListeners().length>=1) {
		        	for( ActionListener al : OKBtn.getActionListeners() ) {
		        		OKBtn.removeActionListener( al );
		        	}
		        }
				
				OKBtn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						total_temp=(float)0;
						for (int j=0;j<items.size();j++) {
							total_temp+=unitList.get(j)*(Float)table.getValueAt(j, 1);
						}
						if (type.equals("Book")) { total1=total_temp;}
						if (type.equals("DVD")) { total2=total_temp;}
						if (type.equals("CD")) { total3=total_temp;}
						total=total1+total2+total3;
						Total.setText(String.valueOf(total));
					}
				});
				
				
			}
		});
		DoneBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HashMap<Media,Integer> itemMap= new HashMap<Media,Integer>();
				Order order=new Order();
				ArrayList<Media> bookstr=str.storage("Book");
				ArrayList<Media> dvdstr=str.storage("DVD");
				ArrayList<Media> cdstr=str.storage("CD");
				amount=0;
				for (int i=0;i<bookstr.size();i++) {
					if (unitListBook.get(i)>0) {
						for(int j=0;j<unitListBook.get(i);j++)
							order.addMedia(bookstr.get(i));
						itemMap.put(bookstr.get(i), unitListBook.get(i));
						amount+=unitListBook.get(i);
					}
				}
				for (int i=0;i<dvdstr.size();i++) {
					if (unitListDVD.get(i)>0) {
						for(int j=0;j<unitListDVD.get(i);j++)
							order.addMedia(dvdstr.get(i));
						itemMap.put(dvdstr.get(i), unitListDVD.get(i));
						amount+=unitListDVD.get(i);
					}
				}
				for (int i=0;i<cdstr.size();i++) {
					if (unitListCD.get(i)>0) {
						for(int j=0;j<unitListCD.get(i);j++)
							order.addMedia(cdstr.get(i));
						itemMap.put(cdstr.get(i), unitListCD.get(i));
						amount+=unitListCD.get(i);
					}
				}
				Media li=order.getALuckyItem(amount,total);
				textPane.setText(order.getBill(itemMap,total,li));
				if(li!=null) {
					textField_1.setText(li.getTitle());
					textField_2.setText(String.valueOf(li.getCost()));
					textField_3.setText(String.valueOf(total-li.getCost()));
				}
				else {
					textField_3.setText(String.valueOf(total));
				}
			}
		});
	}
	public static void main(String[] args) {
		GUI frame=new GUI();
		frame.setVisible(true);
	}
}
