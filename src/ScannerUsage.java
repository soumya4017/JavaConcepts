import java.util.Scanner;

public class ScannerUsage {

    /**
     * @param args
     */
    public static void main(String[] args) {
	String input = "1 2 a 3 45 6";
	Scanner sc = new Scanner(input);
	int x = 0;
	while (sc.hasNextInt()) {
	    x = sc.nextInt();
	    System.out.print(x + " ");
	}
	sc.close();
    }

}
