import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        
        System.out.println("Cálculo de IMC");
        System.out.println("---");

        System.out.println("Digite sua altura:");
        var altura = scanner.nextFloat();

        System.out.println("Digite seu peso:");
        var peso = scanner.nextFloat();

        var imc = peso / (altura * altura);

        if(imc <= 18.5){
            System.out.printf("Abaixo do peso");
        }else if (imc <= 24.9) {
            System.out.printf("Peso ideal");
        }else if(imc <= 29.9){
            System.out.printf("Levemente acima do peso");
        }else if (imc <= 34.9) {
            System.out.printf("Obesidade Grau I");
        }else if (imc <= 39.9) {
            System.out.printf("Obesidade Grau II (Severa)");
        }else{
            System.out.printf("Obesidade Grau III (Mórbida)");
        }
    }
}
