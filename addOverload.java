import javax.swing.JOptionPane;


public class addOverload {
    public static void main(String[] args) {
        int choice  = Integer.parseInt(JOptionPane.showInputDialog("Enter 1 for integer, 2 for double, 3 for mixed:  "));
        if (choice ==1 ){
            int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter a integer: "));
            int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter another integer: "));
            JOptionPane.showMessageDialog(null, "The sum of " + num1 + " and " + num2 + " is " + add(num1, num2));
        } else if (choice == 2){
            double num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter a double: "));
            double num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter another double: "));
            JOptionPane.showMessageDialog(null, "The sum of " + num1 + " and " + num2 + " is " + add(num1, num2));
        } else if (choice == 3){
            int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer: "));
            double num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter a double: "));
            JOptionPane.showMessageDialog(null, "The sum of " + num1 + " and " + num2 + " is " + add(num1, num2));
        } else {
            System.out.println("Invalid input");
        }
    }
    
    static int add(int a, int b) {
        return a + b;
    }

    static double add(int a, double b) {
        return a + b;
    }
    
    static double add(double a, double b) {
        return a + b;
    }
}
