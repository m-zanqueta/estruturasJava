import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        var seg = 0;
        
        System.out.println("Pares ou ímpares");
        System.out.println("--- \n");

        System.out.println("Digite um primeiro número:");
        var prim = scanner.nextInt();

        while(true){
            System.out.println("Digite o segundo número:");
            seg = scanner.nextInt();

            if(seg > prim){
                break;
            } else {
                System.out.println("O segundo número tem que ser maior que o primeiro! \n");
            }
        }
        

        while(true){
            System.out.println("Par ou impar: ");
            var escolha =  scanner.next();

            if(escolha.equalsIgnoreCase("par")){
                for (var i = prim; i < seg; i++) {
                    if(i % 2 == 0){
                        System.out.printf("%s \n", i);
                    }
                }
                break;
            }else if(escolha.equalsIgnoreCase("impar")){
                for(var i = prim; i <= seg; i++){
                    if(i % 2 != 0){
                        System.out.printf("%s \n", i);
                    }
                }
                break;
            }else{
                System.out.println("Digite uma das duas opções \n");
            }
        }


    }
}
