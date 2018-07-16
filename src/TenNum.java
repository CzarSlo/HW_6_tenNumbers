import java.util.Random;

public class TenNum {
    public static void main(String[] args) {
        int[] tab = new int[10];

        Random rand = new Random();

        for (int i = 0; i < tab.length; i++) {
            tab[i] = rand.nextInt();
            System.out.print(" " + tab[i]);
        }
        System.out.print(" < oś symetrii > ");
        System.out.print(tab[9] + " " + tab[8] + " " + tab[7] + " " + tab[6] + " " + " " + tab[5] + " "
                + tab[4] + " " + tab[3] + " " + tab[2] + " " + tab[1] + " " + tab[0]);

        //ew. zamiast wyświetlania w stulu powyższym można tak:
//        int a = 9;
//        while (a < tab.length) {
//            System.out.print(" " + tab[a]);
//            a--; //wyświetla dobrze ale z jakimś błędem na końcu
    }

}


