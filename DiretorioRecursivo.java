public class fatorialRecursivo {

    // Método recursivo que calcula o fatorial
    public static long fatorialRecursivo(int n) {
        // Validação da entrada: Fatorial não está definido para números negativos
        if (n < 0) {
            // CORREÇÃO: Nome da classe de exceção corrigido
            throw new IllegalArgumentException("N não pode ser negativo");
        }
        // Caso base: 0! e 1! valem 1 - aqui a recursão termina
        if (n == 0 || n == 1) {
            return 1L;
        }

        // Caso recursivo: n! = n * (n-1)!
        // A função chama ela mesma com o argumento
        return n * fatorialRecursivo(n - 1);
    }

    // Versão iterativa do fatorial (usada para comparar e evitar a recursão)
    public static long fatorialIterativo(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("N não pode ser negativo");
        }
        long resultado = 1L; // Acumulador
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        int[] teste = {0, 1, 4, 10}; // Exemplos para calcular

        System.out.println("Fatorial Recursivo");
        for (int t : teste) {
            // Imprime o valor de t e o resultado do fatorialRecursivo
            System.out.printf("%d! = %d%n", t, fatorialRecursivo(t));
        }

        System.out.println("\nFatorial Iterativo (verificação)");
        for (int t : teste) {
            // Imprime o valor de t e o resultado do fatorialIterativo
            System.out.printf("%d! = %d%n", t, fatorialIterativo(t));
        }
    }
}
