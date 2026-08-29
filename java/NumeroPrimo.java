class NumeroPrimo {
 
    // Verifica se um número é primo
    public boolean ehPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
 
    // Lista todos os primos entre 'inicio' e 'fim'
    public void listarPrimo(int inicio, int fim) {
        for (int i = inicio; i <= fim; i++) {
            if (ehPrimo(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}