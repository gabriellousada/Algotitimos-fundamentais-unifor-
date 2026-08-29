class MDC {
 
    // Calcula o MDC entre dois números usando o Algoritmo de Euclides
    public int calcular(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }
        return a;
    }
}
 