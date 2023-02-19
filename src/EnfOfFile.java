import java.util.Scanner;

public class EnfOfFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        while (scanner.hasNextLine()){
            String a = scanner.nextLine();
            System.out.println(counter + " " + a);
            counter++;
        }


    }
}
