package hust.soict.talentedprogram.lab01;
// solve second degree equation ax^2+bx+c=0
import javax.swing.JOptionPane;
import java.lang.Math;
public class Solver2 {
    public static void main(String[] args){
        String a1, b1, c1;
        a1=JOptionPane.showInputDialog(null, "Please input the first coefficient", "Input the first coefficient", JOptionPane.INFORMATION_MESSAGE);
        b1=JOptionPane.showInputDialog(null, "Please input the second coefficient", "Input the second coefficient", JOptionPane.INFORMATION_MESSAGE);
        c1=JOptionPane.showInputDialog(null, "Please input the third coefficient", "Input the third coefficient", JOptionPane.INFORMATION_MESSAGE);
        double a=Double.parseDouble(a1);
        double b=Double.parseDouble(b1);
        double c=Double.parseDouble(c1);
        if (a==0){
            if (b!=0){
                JOptionPane.showMessageDialog(null, "x = "+ (-c/b), "Solve "+ a +"*x^2 + "+ b +"*x + " + c + " = 0", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                if (c==0)
                    JOptionPane.showMessageDialog(null, "Countless root!", "Solve "+ a +"*x^2 + "+ b +"*x + " + c + " = 0", JOptionPane.INFORMATION_MESSAGE);
                else
                JOptionPane.showMessageDialog(null, "No root!", "Solve "+ a +"*x^2 + "+ b +"*x + " + c + " = 0", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else{
            double delta=b*b-4*a*c;
            if (delta<0){
                double t=Math.abs(Math.sqrt(-delta)/(2*a));
                String x1= -b/(2*a) + " + " + t + "i";
                String x2= -b/(2*a) + " - " + t + "i";
                JOptionPane.showMessageDialog(null, "x1 = "+ x1 + "\nx2 = " +x2, "Solve "+ a +"*x^2 + "+ b +"*x + " + c + " = 0", JOptionPane.INFORMATION_MESSAGE);
            }
            if (delta==0){
                double x=-b/(2*a);
                JOptionPane.showMessageDialog(null, "Double root: x = "+ x , "Solve "+ a +"*x^2 + "+ b +"*x + " + c + " = 0", JOptionPane.INFORMATION_MESSAGE);
            }
            if (delta>0){
                double x1=(-b+Math.sqrt(delta))/(2*a);
                double x2=(-b-Math.sqrt(delta))/(2*a);
                JOptionPane.showMessageDialog(null, "x1 = "+ x1 + "\nx2 = " +x2, "Solve "+ a +"*x^2 + "+ b +"*x + " + c + " = 0", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        System.exit(0);
    }
}
