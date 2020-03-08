package program;

public class Program2 {

    public static void sumNumbers(Integer num) {
        Integer result = 0;
        String numero = String.valueOf(num);
        Integer aux = num;
        for (int i = 0; i < numero.length(); i++) {
            int rest = aux % 10;
            aux = (aux - rest) / 10;
            result += rest;
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        System.out.println("Test 1:");
        sumNumbers(12345);
        System.out.println("Test 2:");
        sumNumbers(123);
        System.out.println("Test 3:");
        sumNumbers(123456789);
    }
}
