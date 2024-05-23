import java.util.Locale;
import java.util.Scanner;

public class MinhaClasse {

    public static void main(String[] args) throws Exception {
        System.out.println("Executado pelo terminalh!!!");
        //String nome = args[0];
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        System.out.println("Seu nome: " + scanner.next());s
    }
    
}
