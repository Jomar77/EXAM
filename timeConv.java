import javax.swing.JOptionPane;

public class timeConv {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));

        int[] conv = convert(num1);
        System.out.println("Hours " + conv[0]);
        System.out.println("Minutes " + conv[1]);
        System.out.println("Seconds " + conv[2]);
    }

    static int[] convert(int a) {
        int[] time = new int[3];
        time[0] = a / 60;
        time[1] = (a % 3600) / 60;
        time[2] = (a % 3600) % 60;
        return time;
    }
}
