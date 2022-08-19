import java.util.Scanner;

class Eldest_ABLAY {
    public static void main(String[] args) {
        Eldest_ABLAY b = new Eldest_ABLAY();
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of your pets: ");
        n = sc.nextInt();

        String[] name = new String[n];
        String[] species = new String[n];
        String[] gender = new String[n];
        int[] age = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the name , species, gender,  and age of your pet no. %d\n", i + 1);
            name[i] = sc.next();
            species[i] = sc.next();
            gender[i] = sc.next();
            age[i] = sc.nextInt();
        }
        b.bsort(age, species, gender, name);
    }

    void bsort(int[] a, String[] s, String[] g, String[] n) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        int j = a.length;
        for (int i = 0; i < j; i++) {
            System.out.println("Your Pets are: " + "\t" + n[i] + "\t" + s[i] + "\t" + g[i] + "\t" + a[i]);
        }
    }
}