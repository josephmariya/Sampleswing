import java.util.Scanner;
public class welcome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i, k = 1, j;
        int l = s.length();
        for (i = 0; i < l; i++) {
            if (s.charAt(i) == 'A' || s.charAt(i) == 'a' || s.charAt(i) == 'E' || s.charAt(i) == 'e' || s.charAt(i) == 'I' || s.charAt(i) == 'i' || s.charAt(i) == 'O' || s.charAt(i) == 'o' || s.charAt(i) == 'U' || s.charAt(i) == 'u') {
                {
                    for (j = 0; j < k; j++) {

                        System.out.print("*");
                    }
                    System.out.print(s.charAt(i));
                    for (j = 0; j < k; j++) {
                        System.out.print("*");
                    }
                    k++;
                }
            }
            else {
                System.out.print(s.charAt(i));
            }

        }

    }
}



