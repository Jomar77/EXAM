import javax.swing.JOptionPane;

public class addOverload {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter another number: "));

        System.out.println(add(num, num2));
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
