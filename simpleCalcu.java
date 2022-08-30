import javax.swing.JOptionPane;

class simpleCalcu {
    int mul, div, add, min, ave, num1, num2;

    simpleCalcu(int m, int d, int a, int n, int v, int c, int e) {
        mul = m;
        div = d;
        add = a;
        min = n;
        ave = v;
        num1 = c;
        num2 = e;
    }

    static simpleCalcu getSimpleCalcu(int a, int b) {
        return new simpleCalcu(a * b, a / b, (a + b), (a - b), (a + b) / 2, a * a, b * b);
    }

    class test {
        public static void main(String[] args) {
            int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
            int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter another number: "));

            simpleCalcu sc = getSimpleCalcu(num1, num2);
            System.out.println("Mul " + sc.mul);
            System.out.println("Div " + sc.div);
            System.out.println("Add " + sc.add);
            System.out.println("Min " + sc.min);
            System.out.println("ave " + sc.ave);
            System.out.println("num1 " + sc.num1);
            System.out.println("num2 " + sc.num2);

        }
    }
}
