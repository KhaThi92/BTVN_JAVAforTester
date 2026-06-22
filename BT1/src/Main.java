import java.util.Scanner;

public class Main {

    public static String removeVowels(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = Character.toLowerCase(str.charAt(i));

            if (ch != 'a'
                    && ch != 'e'
                    && ch != 'i'
                    && ch != 'o'
                    && ch != 'u') {

                result += str.charAt(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");

        String input = scanner.nextLine();

        String output = removeVowels(input);

        System.out.println("Ket qua: " + output);
    }
}