public class EvenNumber {
    public static void main(String[] args) {
        int number = 10; 

        if (isEven(number)) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is not an even number.");
        }
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}