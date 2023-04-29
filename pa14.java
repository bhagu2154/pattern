package pattern;

public class pa14 {
    public static void main(String[] args) {
        for(int r=1;r<=5;r++)
            for(int space=4;space>=r;space--){
                System.out.print("*");
            }
        System.out.println();
    }
}
