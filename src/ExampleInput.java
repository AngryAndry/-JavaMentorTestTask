import java.util.Scanner;

public class ExampleInput {


    public static void Input() throws Exception {
        boolean l1 = true;
        boolean l2 = true;

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split("\\s");
        String a = words[0];
        Main.x = words[1];
        String b = words[2];


        String[] arab = new String[]{"10", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] rome = new String[]{"X", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};


        for (int c = 0; c < arab.length; c++) {
            if (rome[c].equals(a)) {
                a = arab[c];
                l1 = false;
            }
            if (rome[c].equals(b)) {
                b = arab[c];
                l2 = false;
            }

        }


        try {

            Main.a1 = Integer.parseInt(a.trim());
            Main.b1 = Integer.parseInt(b.trim());
        } catch (Exception e) {
            System.err.println("Введите числа до XI");
        }
        Calculator calculator = new Calculator();


        if (l1 != l2) {
            throw new Exception("Арабские или Римские");
        }
        if (Main.a1 >= 11 || Main.b1 >= 11) {
            throw new Exception("Введите число до 11");
        } else if (l1) {

            System.out.println(calculator.calculator());
        } else {
            String roman_numeral_output = NumberConvertManager.transform_number_to_roman_numeral(calculator.calculator());
            System.out.println(roman_numeral_output);
        }
    }
}
