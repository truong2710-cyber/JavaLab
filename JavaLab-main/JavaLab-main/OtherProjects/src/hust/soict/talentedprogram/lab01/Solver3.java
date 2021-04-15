package hust.soict.talentedprogram.lab01;
// solve set of  linear equations a1*x+b1*y=c1, a2*x+b2*y=c2
import javax.swing.JOptionPane;
public class Solver3 {
    public static void main(String[] args){
        String sa1, sb1, sc1, sa2, sb2, sc2;
        sa1=JOptionPane.showInputDialog(null, "Please input a1", "Input a1", JOptionPane.INFORMATION_MESSAGE);
        sb1=JOptionPane.showInputDialog(null, "Please input b1", "Input b1", JOptionPane.INFORMATION_MESSAGE);
        sc1=JOptionPane.showInputDialog(null, "Please input c1", "Input c1", JOptionPane.INFORMATION_MESSAGE);
        sa2=JOptionPane.showInputDialog(null, "Please input a2", "Input a2", JOptionPane.INFORMATION_MESSAGE);
        sb2=JOptionPane.showInputDialog(null, "Please input b2", "Input b2", JOptionPane.INFORMATION_MESSAGE);
        sc2=JOptionPane.showInputDialog(null, "Please input c2", "Input c2", JOptionPane.INFORMATION_MESSAGE);
        double a1=Double.parseDouble(sa1);
        double b1=Double.parseDouble(sb1);
        double c1=Double.parseDouble(sc1);
        double a2=Double.parseDouble(sa2);
        double b2=Double.parseDouble(sb2);
        double c2=Double.parseDouble(sc2);
        double d=a1*b2-a2*b1;
        if (d==0){
            if (c1*b2==c2*b1)
                JOptionPane.showMessageDialog(null, "Countless root!", a1 +"*x + "+ b1 +"*y = "+c1+ ", "+a2 +"*x + "+ b2 +"*y = "+c2, JOptionPane.INFORMATION_MESSAGE);
            else
                JOptionPane.showMessageDialog(null, "No root!",a1 +"*x + "+ b1 +"*y = "+c1+ ", "+a2 +"*x + "+ b2 +"*y = "+c2, JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            double x=(c1*b2-c2*b1)/d;
            double y=(c2*a1-c1*a2)/d;
            JOptionPane.showMessageDialog(null, "x = " + x + "\ny = " + y,a1 +"*x + "+ b1 +"*y = "+c1+ ", "+a2 +"*x + "+ b2 +"*y = "+c2, JOptionPane.INFORMATION_MESSAGE);
        }
        System.exit(0);
    }
}
