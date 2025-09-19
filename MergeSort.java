public class MargeSort {
    
    //Método principal que inicia  processo de ordenação
    public static void mergeSort(int[] array){
        //Se o array tiver 1 ou 0 elemento ele já está ordenado
        if(array.length < 2){
            return;
        }

        //Encontrar o ponto médio do array
        int mid = array.length / 2;
        //Cria um sub-array para a metade da esquerda
        int[] left = new int[mid];
        //Cria um sub-array para a metade da direita
        int[] right = new int[array.length - mid];


        //Copia os elementos para o sub-array
        //array copyOfranges é uma maneira efeciente de fazer isso
        System.arraycopy(array, 0, left, 0, mid);
        System.arraycopy(array, mid, right, 0, array.length - mid);

        //Chamada recursiva para ordenar a metade da esquerda
        mergeSort(left);
        //Chamada recursiva para ordenar a metade da direita
        mergeSort(right);

        //Combina as duas metades ordenadas em um só array
        merge(array, left, right);
    }
        //Método que vai mesclar (combinar) dois sub-arrays ordenados
        private static void merge(int[]array, int [] left, int[] right){
            int i = 0; //Ponteiro para o array left
            int j = 0; //Ponteiro para o array right
            int k = 0; //Ponteiro para o array original array

            //Percorre os dois sub-arrays e insere o menor elemento no array principal
            while(i < left.length && j < right.length){
                if(left[i] <= right[i]){
                array[k++] = left[i++];
                }
                else{
                    array[k++] = right[j++];
                }
            }

            //Copia os elementos restantes do array left(se houver)
            while(i < left.length){
                array[k++] = left[i++];
            }

            //Copia os elementos restantes do array left(se houver)
            while(i < right.length){
                array[k++] = right[j++];
            }
        }

    
    public static void main(String[]args){
        
        int[] dados = {31, 23, 43, 65, 12, 5, 10, 2,};

        System.out.println("Array original: " + array.tostring(dados));
        mergeSort(dados);
        System.out.println("Array ordenado: " + array.tostring(dados));

    }
}
