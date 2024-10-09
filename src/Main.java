public class Main {

    public static void main(String[] args) {

        int primeiroNumero = 10;
        int segundoNumero = 20;

        int soma = primeiroNumero + segundoNumero;
        int subtracao = primeiroNumero - segundoNumero;
        int multiplicacao = primeiroNumero * segundoNumero;
        int divisao = primeiroNumero / segundoNumero;





        int somaViaFuncao = somarValores(primeiroNumero, segundoNumero);
        System.out.println("Valor soma" + somaViaFuncao);
        int subtrairFuncao = subtrairValores( -50,-40);
        System.out.println(subtrairFuncao);
        int multiplicarFuncao = multiplicacaoValores(10, 20);
        System.out.println(multiplicarFuncao);
        int dividirFuncao = divisaoValores(100, 20);
        System.out.println(dividirFuncao);

    }

    private static int divisaoValores(int numA, int numB) {

    return numA / numB;

    }

    private static int multiplicacaoValores(int numA, int numB) {
        return numA * numB;
    }

    public static int somarValores(int numA, int numB){
        return numA + numB;
    }

    public static int subtrairValores(int numA, int numB){

        if(numA < 0);{
            numA = numA * -1;
        }

        return numA - numB;
    }

}
