import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String x = scanner.next();
        String b = scanner.next();



        String [] arab = new String[]{"10","1","2","3","4","5","6","7","8","9"};
        String [] rome = new String[]{"X","I","II","III","IV","V","VI","VII","VIII","IX"};
        for (int c =0;c<arab.length;c++){
            if (rome[c].equals(a)){
                a = arab[c];
            }
            if (rome[c].equals(b)){
                b = arab[c];
            }

        }
        int a1 = Integer.parseInt(a.trim());
        int b1 = Integer.parseInt(b.trim());
        int ff = 0;


        if (x.equals("+")) {
            System.out.println(a1 + b1);
        }

    }
}
