package switchexercicio1;
import java.util.Scanner;

//Implemente em Java, um código que leia uma letra entre “a” e “d”.
//Utilize uma estrutura switch-case em que cada caso imprime o nome
//de uma fruta diferente e o padrão mostre que o usuário cometeu um
//erro.

public class SwitchExercicio1 {

 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma letra: ");
        String letra = input.nextLine();
        
        String fruta;
        switch (letra) {
            case "a":
              fruta = "Maracujá";
              break;
            case "b":
              fruta = "Maçã";
              break;
            case "c":
              fruta = "Goiaba";
              break;
            case "d":
              fruta = "Amora";
              break;
            default:
              fruta = "Você cometeu um erro.";
        }
        System.out.println(fruta);
    }
    
}
