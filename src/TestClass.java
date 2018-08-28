import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int i = in.nextInt();

        if (i > 80) {
            System.out.println("More");
        }
        else if (i > 10 && i == 45){
            System.out.println("Bingo!");
        }
        else if (i == 10) {
            System.out.println("Equal");
        }
        else {
            System.out.println("Less");
        }


        if ( i != 0) {
            if (i == 100) {
                System.out.println("qwerty");
            }
            else {
                System.out.println("poiuy");
            }
        }


        i = 27;

        switch (i) {
            case 1:
                System.out.println("1");
            case 27:
                System.out.println(2);
        }

    }
}
