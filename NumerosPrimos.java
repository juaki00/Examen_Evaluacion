
import java.util.Scanner;

public class NumerosPrimos {
    static Scanner sc = new Scanner(System.in);

    public static boolean esPrimo(int num){
        int divisor = 2;
        boolean loEs = true;
        while(loEs && divisor < num){
            if(num % divisor == 0){
                loEs = false;
            }
            divisor++;
        }
        return loEs;
    }

    public static void imprimirPrimos(int ini, int fin){
        if(ini < 0 || ini >= fin){
            System.out.println("Numeros incorrectos!");
        }
        else{
            int conPrimos = 0;
            System.out.println("Buscando primos...");
            for (int i = ini; i < fin; i++) {
                if(esPrimo(i)){
                    System.out.println(i);
                    conPrimos++;
                }
            }
            System.out.println("Se han encontrado " + conPrimos + " primos en el intervalo.");
        }
    }


    public static void main(String[] args) {
        int numInicial = -1;
        int numFinal;
        while(numInicial != 0){
            System.out.println("Escriba un numero inicial: ");
            numInicial = sc.nextInt();
            if(numInicial != 0){
                System.out.println("Escriba un numero final: ");
                numFinal = sc.nextInt();
                imprimirPrimos(numInicial,numFinal);
            }
        }
        System.out.println("BULD SUCCESS");
        sc.close();
    }
}
