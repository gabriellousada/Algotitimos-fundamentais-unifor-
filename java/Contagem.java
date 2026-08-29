class Contagem {
 
    // Conta de 'inicio' até 'fim' (crescente ou decrescente) e imprime os valores
    public void contar(int inicio, int fim) {
        if (inicio <= fim) {
            for (int i = inicio; i <= fim; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = inicio; i >= fim; i--) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}