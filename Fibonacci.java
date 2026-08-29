class Fibonacci {
 
    // Retorna o n-ésimo termo de Fibonacci (0, 1, 1, 2, 3, 5, ...)
    public long calcular(int n) {
        if (n <= 1) {
            return n;
        }
        long anterior = 0, atual = 1;
        for (int i = 2; i <= n; i++) {
            long proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
        return atual;
    }
 
    // Imprime os 'quantidade' primeiros termos da sequência
    public void imprimirSequencia(int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            System.out.print(calcular(i) + " ");
        }
        System.out.println();
    }
}

