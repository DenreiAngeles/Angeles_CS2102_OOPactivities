public class Escseq {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            if(i % 2 == 0) {
                System.out.println("\t" + (i*7));
            } 
            else {
                System.out.println(i*7);
            }
        }
    }
}
