public class Exercice3_3 {
    public static void main(String[] args) {
        Integer count = 0;
        Integer start = 1;
        Integer end = 50;
        for (int i=start; i<end+1; i++) {
            if(i % 2 == 0){
                count+=i;
            }
        }
        System.out.print("La somme des nombres pairs entre " + start + " et " + end + " est : " + count);
    }
}