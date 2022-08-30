import javax.swing.JOptionPane;

public class squareOver {
    public static void main(String[] args) {
        int choice = Integer.parseInt(JOptionPane.showInputDialog("Enter 1 for integer, 2 for double: "));
        if (choice == 1) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
            JOptionPane.showMessageDialog(null, "The square of " + num + " is " + squared(num));
        } else if (choice == 2) {
            double num = Double.parseDouble(JOptionPane.showInputDialog("Enter a number: "));
            JOptionPane.showMessageDialog(null, "The square of " + num + " is " + squared(num));
        } else {
            System.out.println("Invalid input");
        }
    }

    public static int squared(int a) {
        return a * a;
    }

    public static double squared(double a) {
        return a * a;
    }

}