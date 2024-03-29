import java.util.ArrayList;

public class Exercice2_2 {
    private static Integer findFruit(ArrayList<String> tab, String [] str){
        for(Integer i = 0; i < tab.size(); i++){
            if(tab.get(i).equals(str[0]))
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Proper Usage is: java program filename");
            System.exit(0);
        }

        ArrayList<String> tab = new ArrayList<String>();
        tab.add("kiwi");
        tab.add("pomme");
        tab.add("poire");
        tab.add("litchi");
        tab.add("rhubarbe");

        Integer findIndex = findFruit(tab, args);
        if(findIndex != -1)
            System.out.println("Le fruit " + args[0] + " est à l'index " + findIndex);
        else if(findIndex == -1)
            System.out.println (args[0] + " n'est pas dans le tableau");
    }
}