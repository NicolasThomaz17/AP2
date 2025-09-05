package ProjetoSerch;

import java.util.Arrays;

public class Principal {

public static void main(String[]args) {
		
		int[] arrayBolha = {123,4,512,37,452,74,31};
		int[] arrayInsercao = {542,364,22,45,67,23,};
		
		//Exibe o array original antes de qualquer ordenação
		
		System.out.println("Array original: "+Arrays.toString(arrayBolha));
		
		//Chama o método de ordenção por bolha
		
		bubbleSort(arrayBolha);
		
		//Exibe o array após a ordeção por bolha
		
		System.out.println("Array ordenado (Bubble sort): "+Arrays.toString(arrayBolha));
		System.out.println("-----------------------------------------------------------");
		
		//Exibe o array original antes de qulquer ordenação
			System.out.println("Array original: "+Arrays.toString(arrayInsercao));
		
		//Chama o método de ordenção por insercao
		
			insertSort(arrayInsercao);
		
		//Exibe o array após a ordeção por bolha
		
			System.out.println("Array ordenado (Bubble sort): "+Arrays.toString(arrayInsercao));
	}
	
	/* Implementação do algoritmo de ordenação por bolha (bubbleSort)
	*arr O array de inteiros a ser ordenado
	*/
	
	public static void bubbleSort(int[]arr) {
	//Obtém o tamanho do array
		
		int n = arr.length;
		//Loop externo: co0ntrol o número de passagens;
		//n-1 passagens s]ao suficientes para garantir a ordenação;
		
		for(int i = 0; i < n-1; i++) {

        //Loop interno: Percorre o array para comparar e trocar elementos;
        //A cada passagem, o maior elemento "borbul" para a posição correta;
        //Então não precisamos verificar os últimos elementos;


            for(int j = 0; j < n - 1; j ++){
                //Compara o elemento atual com o próximo elemento;

                if(arr[j] > arr[j+1]){
                //Se o elemento atual for maior, faz a troca
                //Armazena o valor do elemento atual em uma variável temporária;

                        int temp = arr[j];
                        //Coloca o elemento menor na posição atual;

                        arr[j] = arr[j+1];
                        //Coloca o elemento maior na posição seguinte;

                        arr[j+1] = temp;

                }

            }    

			
		}
		
		
	}
	
    //Implementação do algoritmo de ordenação por inserção (Insertion Sort);

    public static void insertSort(int[] arr){
        //Obtém o tamanho do array
        
        int n = arr.length;
        //Loop externo: Itera sobre o array a partir do segundo elemento (índice 1);
        //Assume que o primeiro elemento (índice 0) já está ordenado;

        for(int i = 0; i < n; i ++){
            //armazena o elemento a ser inserido na posição correta;

            int key = arr[i];
            //Declara a variável 'j' para comaprar o 'key' com os elementos anteriores;

            int j = i - 1;

            //Loop interno: Move os elementos da parte ordenada que são maiores que o 'key';
            //Uma posição para a frente para abrir espço para a inseção.

            while(j > 0 && arr [j] > key){
                //Move o elemento para a próxima posição;

                arr[j+1] = arr[j];
                //Encrementa o indice para continuar a comparação 
                
                j = j - 1; 

            }

            //Insere o 'Key' na sua posição correta

            arr[j+1] =  key;

        }




    }
}
