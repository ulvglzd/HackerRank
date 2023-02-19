import java.util.Scanner;

public class StaticInitBlock {
    static int B, H;
    static boolean flag = true;

    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();

        try {
            if (B<=0 || H<=0){
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        if (flag) {
            int area = B*H;
            System.out.println(area);
        }
    }
}
