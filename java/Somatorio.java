public class Somatorio {
 
    // Soma todos os números de 'inicio' até 'fim'
    public long somarIntervalo(int inicio, int fim) {
        long soma = 0;
        for (int i = inicio; i <= fim; i++) {
            soma += i;
        }
        return soma;
    }
 
    // Soma todos os elementos de um vetor
    public long somarVetor(int[] vetor) {
        long soma = 0;
        for (int valor : vetor) {
            soma += valor;
        }
        return soma;
    }
}


