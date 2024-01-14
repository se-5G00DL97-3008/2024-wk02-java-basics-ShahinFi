import java.util.Scanner;

class E09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        while (true) {
            System.out.println("Give a test score (-1 to quit):");
            int score = scanner.nextInt();

            if (score == -1) {
                break;
            }
            sum += score;
            counter++;
            double average = (double) sum / counter;
            System.out.println("Average: " + average);
        }
    }
}