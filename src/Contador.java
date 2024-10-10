import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        try{
            System.out.println("Insira um numero");
            int parametroUm = terminal.nextInt();
            System.out.println("Insira outro numero");
            int parametroDois = terminal.nextInt();
            contar(parametroUm,parametroDois);
        } catch (ParametroInvalidoException e) {
            System.out.println(e);
        }catch (InputMismatchException e){
            System.out.println("Apenas numeros");
        }

    }
    static void contar(int parametroUm , int parametroDois) throws ParametroInvalidoException{
        if (parametroUm > parametroDois){
            throw new ParametroInvalidoException("O segundo parametro deve ser maior que o primeiro");
        }
        int contagem = parametroDois - parametroUm;
        for (int i = 1 ; i <= contagem ; i ++){
            System.out.println("Imprimindo o numero "+ i);
        }
    }
}