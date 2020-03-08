package program;

public class Program1 {

    public static void divisibleBy3contains5(Integer num) {
        if (num % 3 == 0)
            System.out.print("Cira");

        String numero = String.valueOf(num);
        Integer aux = num;
        for (int i = 0; i < numero.length(); i++) {
            int rest = aux % 10;
            aux = (aux - rest) / 10;
            if (rest == 5) {
                System.out.print("Dinha");
                break;
            }
        }

        System.out.println("");
    }

    public static void main(String[] args) {
        System.out.println("Test 1");
        divisibleBy3contains5(3);
        System.out.println("Test 2");
        divisibleBy3contains5(5);
        System.out.println("Test 3");
        divisibleBy3contains5(51);
    }
}
