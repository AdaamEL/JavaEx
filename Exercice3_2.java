import java.util.Scanner;

public class Exercice3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Veuillez saisir un min :");
        Integer min = scanner.nextInt();

        System.out.print("Veuillez saisir un max :");
        Integer max = scanner.nextInt();

        for (int i=min; i<max; i++) {
            if(i % 3 == 0){
                System.out.print("Fizz ");
            }
            else if(i % 5 == 0){
                System.out.print("Buzz ");
            }
            else if(i%3==0 && i%5==0){
                System.out.print("FizzBuzz ");
            }
            else{
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}