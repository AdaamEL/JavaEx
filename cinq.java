public class cinq {
    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        Integer i = 0;

        while(i<str.length()){
            if(str.charAt(i) % 2 == 0){
                System.out.print(str.charAt(i));
            }
            i++;
        }
    }
}