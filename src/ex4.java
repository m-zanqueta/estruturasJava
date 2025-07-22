import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        System.out.println("Divisíveis!");
        System.out.println("--- \n");


        System.out.println("Digite o primeiro número:");
        var prim = scanner.nextInt();

        while(true){
            System.out.println("Digite o segundo número:");
            var seg = scanner.nextInt();

            if(seg > prim){
                if((seg % prim) == 0){
                System.out.println("São divisíveis!");
                break;
                }

                System.out.println("Não são divisíveis! \n");
            } else {
                System.out.println("O segundo número deve ser maior que o primeiro! \n");
            }
        }
    }
}
