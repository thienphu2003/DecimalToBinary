import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử mảng");
        int input = sc.nextInt();
        int[] arr = new int[input];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử " + (i + 1));
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        Stack<String> stack = new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            String string = DecimalToBinary(arr[i]);
            stack.push(string);
        }
        System.out.println(stack);
    }
    private static String DecimalToBinary(int number)
    {
        String s ="";
        int Quotient=number/2;
        int Remainder;
        while(Quotient!=0) {
            Remainder = number % 2;
            s = Remainder+s;
            number=number/2;
            Quotient=number;
        }
        return s;
    }

}