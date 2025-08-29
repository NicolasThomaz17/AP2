import java.util.Scanner;
public class BuscaProdutos {
 public static int[] buscarTodasOcorrencias(int[] array, int valorBuscado)
{
 // Primeiro, conta quantas vezes o valor buscado aparece no array.
 int contador = 0;
 for (int elemento : array) {
 if (elemento == valorBuscado) {
 contador++;
 }
 }
 // Se o valor não for encontrado, retorna um array vazio.
 if (contador == 0) {
 return new int[0];
 }
 // Cria um novo array com o tamanho exato da contagem.
 int[] indicesEncontrados = new int[contador];
 int indiceDePreenchimento = 0;
 // Segundo, percorre o array novamente para preencher o novo array com os índices.
 
 for (int i = 0; i < array.length; i++) {
 if (array[i] == valorBuscado) {
 indicesEncontrados[indiceDePreenchimento] = i;
 indiceDePreenchimento++;
 }
 }
 return indicesEncontrados;
 }
 public static void main(String[] args) {
 Scanner ler = new Scanner(System.in);

 int[] idProdutos = {123, 42, 50, 123, 67, 845, 123, 786};
 System.out.println("Qual ID deseja encontrar?");

 int idBuscado = ler.nextInt();
 int[] resultados = buscarTodasOcorrencias(idProdutos, idBuscado);

 if (resultados.length > 0) {
 System.out.println("Busca linear: Valor " + idBuscado + " encontrado nos seguintes índices:");

 for (int indice : resultados) {
 System.out.println("- " + indice);
 }

 } 
 
 else {
 System.out.println("Busca linear: Valor " + idBuscado + " não encontrado.");
 }

 ler.close();

}
}