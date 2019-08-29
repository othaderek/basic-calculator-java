import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First Number: ");
        byte firstNum = scanner.nextByte();
        System.out.print("Second Number: ");
        byte secondNum = scanner.nextByte();
        int result = firstNum + secondNum;
        System.out.println(firstNum + " + " + secondNum + " = " + result);
    }
}
