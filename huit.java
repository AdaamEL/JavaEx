public class huit {
    public static void main(String[] args) {
        String color[] = {"bleu" ,"rouge", "jaune"};
        for(String value: color){
            if(value=="bleu"){
                System.out.println("La couleur préférée de Louis est le " + value);
            }
            if(value=="rouge"){
                System.out.println("Pour sa peinture, Andrée a utilisé du " + value);
            }
            if(value=="jaune"){
                System.out.println("Anis n'a pas de chemise " + value);
            }
        }
    }
}