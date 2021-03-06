package hust.soict.talentedprogram.aims;

import java.util.Scanner;

import hust.soict.talentedprogram.aims.media.Book;
import hust.soict.talentedprogram.aims.media.CompactDisc;
import hust.soict.talentedprogram.aims.media.DigitalVideoDisc;
import hust.soict.talentedprogram.aims.media.MemoryDaemon;
import hust.soict.talentedprogram.aims.order.Order;

public class Aims {
	private static Order anOrder;
	public static void main(String[] args) {
		MemoryDaemon md=new MemoryDaemon();
		Thread th=new Thread(md);
		th.setDaemon(true);
		th.start();
		int n;
		boolean check=false;
		Scanner sc=new Scanner(System.in);
		do {
		showMenu();
		n=sc.nextInt();
		switch (n){
			case 1:	
				anOrder=new Order();
				check=true;
				break;
			case 2:
				if (check==false)
					System.out.println("You have not created any order!");
				else {
					int j=0;
					do {    
						j=0;
						System.out.println("Press 1 for Book, 2 for DVD, 3 for CD");
						try {
							sc.nextLine();
							j=Integer.parseInt(sc.nextLine());
						}catch(NumberFormatException e) {
							System.out.println("Invalid input! Please re-enter!");
							continue;
						}
					
						if (j!=1 && j!=2 && j!=3)
							System.out.println("Invalid input! Please re-enter!");
					} while(j!=1 && j!=2 && j!=3);
					if (j==1) {
						System.out.println("Enter book title:");
						String title=sc.nextLine();
						Book b=new Book(title);
						anOrder.addMedia(b);
					}
					if (j==2) {
						System.out.println("Enter DVD title:");
						String title=sc.nextLine();
						DigitalVideoDisc dvd=new DigitalVideoDisc(title);
						
						anOrder.addMedia(dvd);
						System.out.println("Do you want to play this DVD (y/n)?");
						String s=sc.nextLine();
						if (s.equals("y"))
							try {
								dvd.play();
							} catch (PlayerException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
					}
					if (j==3) {
						System.out.println("Enter CD title:");
						String title=sc.nextLine();
						CompactDisc cd=new CompactDisc(title);
						anOrder.addMedia(cd);
						System.out.println("Do you want to play this CD (y/n)?");
						String s=sc.nextLine();
						if (s.equals("y"))
							try {
								cd.play();
							} catch (PlayerException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
					}
				}
				break;
			case 3:
				System.out.println("Enter item id: ");
				int k;
				do {
					k=sc.nextInt();
					if (k>anOrder.getItemsOrdered().size() || k<1)
						System.out.println("Invalid id. Please re-enter!");
				} while(k>anOrder.getItemsOrdered().size() || k<1);
				anOrder.removeMedia(anOrder.getItemsOrdered().get(k-1));
				break;
			case 4:
				anOrder.printList();
				break;
			case 0:
				System.exit(0);
				break;
		}
		}while(n!=0);
		sc.close();
		
		
	}
	public static void showMenu() {
		System.out.println("\nOrder Manager Application:");
		System.out.println("--------------------------");
		System.out.println("1. Create new order");
		System.out.println("2. Add item to the order");
		System.out.println("3. Delete item by id");
		System.out.println("4. Display the items list of order");
		System.out.println("0. Exit");
		System.out.println("--------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4\n");
	}
}
