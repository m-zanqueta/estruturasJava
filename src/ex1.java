import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        
        System.out.println("Tabuada automática!");
        System.out.println("--- \n");

        System.out.println("Digite um número:");
        var numero = scanner.nextInt();

        for (var i = 1; i <= 10; i++){
            var total = numero * i;
            System.out.printf("%s x %s = %s \n", numero, i, total);
        }
    }
}
