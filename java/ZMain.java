import java.util.Scanner;
public class ZMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // ---- Contagem ----
        System.out.println("=== Contagem ===");
        Contagem contagem = new Contagem();
        contagem.contar(1, 10);
 
        // ---- Fibonacci ----
        System.out.println("\n=== Fibonacci (10 primeiros termos) ===");
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.imprimirSequencia(10);
 
        // ---- Números Primos ----
        System.out.println("\n=== Números Primos entre 1 e 50 ===");
        NumeroPrimo primo = new NumeroPrimo();
        primo.listarPrimo(1, 50);
 
        // ---- Ordenação ----
        System.out.println("\n=== Ordenação (Bubble Sort) ===");
        Ordenacao ordenacao = new Ordenacao();
        int[] vetor = {9, 3, 7, 1, 8, 2, 5};
        System.out.print("Vetor original: ");
        ordenacao.imprimirVetor(vetor);
        ordenacao.bubbleSort(vetor);
        System.out.print("Vetor ordenado: ");
        ordenacao.imprimirVetor(vetor);
 
        // ---- Somatório ----
        System.out.println("\n=== Somatório ===");
        Somatorio somatorio = new Somatorio();
        System.out.println("Soma de 1 até 100: " + somatorio.somarIntervalo(1, 100));
        System.out.println("Soma do vetor ordenado: " + somatorio.somarVetor(vetor));
 
        // ---- MDC ----
        System.out.println("\n=== MDC ===");
        MDC mdc = new MDC();
        int numA = 48, numB = 18;
        System.out.println("MDC entre " + numA + " e " + numB + " = " + mdc.calcular(numA, numB));
 
        scanner.close();
    }
}
 