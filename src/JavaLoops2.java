import java.util.Scanner;

public class JavaLoops2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int result = a;
            for (int j = 0; j<n;j++) {
                result += Math.pow(2,j)*b;
                System.out.print(result);
                if (j==n-1) System.out.println("");
                else System.out.print(" ");
            }
        }
        in.close();


    }
}
