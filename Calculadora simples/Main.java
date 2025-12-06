import java.util.Scanner;
import java.util.InputMismatchException;

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    while(true){
        menu();
        System.out.print("Opção: ");
        String opcao = input.nextLine();
        switch(opcao){
            case "1":
                try {
                    System.out.println("Digite a primeira parcela: ");
                    float parcela1 = input.nextInt();
                    System.out.println("Digite a segunda parcela: ");
                    float parcela2 = input.nextInt();
                    adicao(parcela1, parcela2, input);
                } catch (InputMismatchException e) {
                    System.out.println("Digite apenas números.");

                }
                break;
            case "2":
                try {
                    System.out.println("Digite o minuendo: ");
                    float minuendo = input.nextInt();
                    System.out.println("Digite o subtraendo: ");
                    float subtraendo = input.nextInt();
                    subtracao(minuendo, subtraendo, input);
                } catch (InputMismatchException e) {
                    System.out.println("Digite apenas números.");

                }
                break;
            case "3":
                try {
                    System.out.println("Digite o multiplicando: ");
                    float multiplicando = input.nextInt();
                    System.out.println("Digite o multiplicador: ");
                    float multiplicador = input.nextInt();
                    multiplicacao(multiplicando, multiplicador, input);
                } catch (InputMismatchException e) {
                    System.out.println("Digite apenas números.");

                }
                break;
            case "4":
                try {
                    System.out.println("Digite o dividendo");
                    float dividendo = input.nextInt();
                    System.out.println("Digite o divisor");
                    float divisor = input.nextInt();
                    divisao(dividendo, divisor, input);
                } catch (InputMismatchException e) {
                    System.out.println("Digite apenas números.");
                }
                break;
            case "0":
                System.out.println("Encerrando");
                return;
            default:
                System.out.println("Porfavor digite uma das opções validadas");
                System.out.println("Aperte enter para sair");

                input.nextLine();
                break;

        }



    }





}

static void menu(){
    System.out.println("O que gostaria de fazer?");
    System.out.println("(1) soma");
    System.out.println("(2) subtracao");
    System.out.println("(3) multiplicacao");
    System.out.println("(4) divisao");
    System.out.println("(0) sair");
}




static void subtracao(float numero1, float numero2, Scanner input){
    System.out.println("O resultado da subtracao foi " + (numero1 - numero2));
    System.out.println("Aperte enter para voltar pro menu:");

    input.nextLine();
    input.nextLine();

}

static void divisao (float numero1, float numero2, Scanner input){
    System.out.println("O resultado da divisão foi " + (numero1/numero2));
    if(numero2 == 0){
        System.out.println("O divisor não pode ser zero");
        System.out.println("Aperte enter para voltar pro menu:");

        input.nextLine();
        input.nextLine();
        return;
    }
    System.out.println("Aperte enter para voltar pro menu:");

    input.nextLine();
    input.nextLine();
}

static void adicao(float numero1, float numero2, Scanner input) {
    System.out.println("O resultado da adicao foi " + (numero1 + numero2));
    System.out.println("Aperte enter para voltar pro menu:");

    input.nextLine();
    input.nextLine();
}

static void multiplicacao(float numero1, float numero2, Scanner input) {
    System.out.println("O resultado da multiplicação foi " + (numero1 * numero2));
    System.out.println("Aperte enter para voltar pro menu:");

    input.nextLine();
    input.nextLine();
}




