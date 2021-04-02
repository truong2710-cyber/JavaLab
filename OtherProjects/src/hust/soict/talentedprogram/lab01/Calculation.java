package hust.soict.talentedprogram.lab01;
import javax.swing.JOptionPane;
import java.lang.Math;
public class Calculation {
    public static void main(String[] args){
        String strNum1, strNum2;
        strNum1=JOptionPane.showInputDialog(null, "Please input the first number", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strNum2=JOptionPane.showInputDialog(null, "Please input the second number", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        double num1=Double.parseDouble(strNum1);
        double num2=Double.parseDouble(strNum2);
        double s=num1+num2, d=Math.abs(num1-num2), p=num1*num2 ;
        JOptionPane.showMessageDialog(null, "Sum of " + num1 + " and " + num2 + " is: " + s, "Sum", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Difference of " + num1 + " and " + num2 + " is: " + d, "Difference", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Product of " + num1 + " and " + num2 + " is: " + p, "Product", JOptionPane.INFORMATION_MESSAGE);
        if (num2!=0){
            JOptionPane.showMessageDialog(null, "Quotient of " + num1 + " and " + num2 + " is: " + num1/num2, "Quotient", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Error! The divisor is 0", "Quotient", JOptionPane.INFORMATION_MESSAGE);
        }
        System.exit(0);
    }
}
