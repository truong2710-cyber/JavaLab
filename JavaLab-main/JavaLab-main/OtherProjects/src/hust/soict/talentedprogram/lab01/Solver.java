package hust.soict.talentedprogram.lab01;
// solve first degree equation ax+b=0
import javax.swing.JOptionPane;
public class Solver {
    public static void main(String[] args){
        String a1, b1;
        a1=JOptionPane.showInputDialog(null, "Please input the first coefficient", "Input the first coefficient", JOptionPane.INFORMATION_MESSAGE);
        b1=JOptionPane.showInputDialog(null, "Please input the second coefficient", "Input the second coefficient", JOptionPane.INFORMATION_MESSAGE);
        double a=Double.parseDouble(a1);
        double b=Double.parseDouble(b1);
        if (a!=0){
            JOptionPane.showMessageDialog(null, "x = "+ (-b/a), "Solve "+ a +"*x + "+ b + " = 0", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            if (b==0)
                JOptionPane.showMessageDialog(null, "Countless root!", "Solve "+ a +"*x + "+ b + " = 0", JOptionPane.INFORMATION_MESSAGE);
            else
            JOptionPane.showMessageDialog(null, "No root!", "Solve "+ a +"*x + "+ b + " = 0", JOptionPane.INFORMATION_MESSAGE);
        }
        System.exit(0);
    }
}
