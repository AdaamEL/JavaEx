public class Exercice3_1 {
    public static void main(String[] args) {
        for (int i=1; i<101; i++) {
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
    }
}