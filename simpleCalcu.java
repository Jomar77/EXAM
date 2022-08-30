import javax.swing.JOptionPane;
public class simpleCalcu {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter another number: "));
        simpleCalcu calc = new simpleCalcu();
        System.out.println(calc.add(num1, num2));
        System.out.println(calc.minus(num1, num2));
        System.out.println(calc.multiply(num1, num2));
        System.out.println(calc.divide(num1, num2));
        System.out.println(calc.squared(num1));
        System.out.println(calc.squared(num2));
    }

    public int add(int a, int b) {
        return a + b;
    }
    public int minus(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public int divide(int a, int b) {
        return a / b;
    }
    public int squared(int a) {
        return a * a;
    }
}
