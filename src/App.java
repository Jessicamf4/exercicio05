import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double metros, centimetros;
        System.out.println("Digite uma medida em metros");
        metros = sc.nextInt();
        sc.close();
        centimetros = metros*100;
        System.out.println("A medida digitada em metros corresponde a " + centimetros + " centímetros");
    }
}
