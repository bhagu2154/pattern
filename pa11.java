package pattern;

public class pa11 {
    public static void main(String[] args) {
        for( int r=1;r<=5;r++){
            for(int c=5;c>=r;c--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
*****
****
***
**
*
 */