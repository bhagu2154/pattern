package pattern;

public class pa7 {
    public static void main(String[] args) {
      int  counter = 1;
        for (int r = 1; r <= 5; r++) {
            for ( int c = 1; c <= 5; c++) {
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
}
/*
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
 */