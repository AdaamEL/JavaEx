import java.util.Random;
import java.util.Scanner;

public class morpion {
    public static void main(String[] args) {

        char tab[][] = {    {' ',' ',' '},
                            {' ',' ',' '},
                            {' ',' ',' '}
                            };

        Random rand = new Random();
        Integer Player = rand.nextInt(1,3);
        char joueurActuel;
        Boolean EndGame = false;

        Scanner scanner = new Scanner(System.in);

        while(EndGame != true)
        {
            if(Player == 1){
                joueurActuel = 'X';
                System.out.println("Joueur, c'est à votre tour.");
                System.out.println();
                System.out.print("Veuillez saisir la ligne : ");
                Integer ligne = scanner.nextInt();
                System.out.print("Veuillez saisir la colonne : ");
                Integer colonne = scanner.nextInt();

                tab[ligne][colonne] = 'X';
                Player = 2;
            }

            else if(Player == 2){
                joueurActuel = 'O';
                JoueurOrdi(tab, rand, joueurActuel);
                Player = 1;

            }

            afficherTableau(tab);
            if(Win(tab)){
                if(Player == 1){
                    System.out.println("Ordinateur a gagné!");
                } else{
                    System.out.println("Tu as gagné!");
                }
                EndGame = true;
            }

            if(Egalite(tab)){
                System.out.println("Match nul!");
                EndGame = true;
            }
        }
        scanner.close();
    }

    public static void JoueurOrdi(char tab[][], Random random, char joueur){
        Integer ligne;
        Integer colonne;

        do{
            System.out.println("Tour de l'ordinateur");
            ligne = random.nextInt(3);
            colonne = random.nextInt(3);
        } while(tab[ligne][colonne] != ' ');
        tab[ligne][colonne] = joueur;
    }

    public static void afficherTableau(char tab[][]) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tab[i][j]);
                if (j < 2) {
                    System.out.print("   | ");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("--------------");
            }
        }
        System.out.println();
    }

    public static boolean Win(char tab[][]) {
        /////////////verif horizontale/////////////////////////
        for (int i=0; i < 3; i++){ 
            if((tab[i][0] == tab[i][1] && tab[i][2] == tab[i][2]) && (tab[i][0] != ' ' && tab[i][1] != ' ' && tab[i][2] != ' ')){
                return true;
            }
        }
        /////////////verif verticale/////////////////////////
        for (int j=0; j<3; j++){
            if(tab[0][j] == tab[1][j] && tab[0][j] == tab[2][j] && tab[0][j] != ' ' && tab[1][j] != ' ' && tab[2][j] != ' '){
                return true;
            }
        }
        /////////////verif diagonale/////////////////////////
        if(tab[0][0] == tab[1][1] && tab[0][0] == tab[2][2] && tab[0][0] != ' ' && tab[1][1] != ' ' && tab[2][2] != ' '){
            return true;
        }
        if(tab[2][0] == tab[1][1] && tab[2][0] == tab[2][0] && tab[2][0] != ' ' && tab[1][1] != ' ' && tab[0][2] != ' '){
            return true;
        }
        
        return false;
    }

    public static boolean Egalite(char tab[][]){
        for(Integer ligne = 0; ligne < 3; ligne++){
            for(Integer colonne = 0; colonne < 3; colonne++){
                if(tab[ligne][colonne] == ' '){
                    return false;
                }
            }
        }
        return true;
    }
}