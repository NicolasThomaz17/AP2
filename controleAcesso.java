import java.util.*;
public class controleAcesso {

 public static int acesso(int[] array, int idProcurado){
    
    Arrays.sort(array);

     int inicio = 0;
     int fim = array.length -1;

 while(inicio <= fim){
 int meio = inicio + (fim-inicio) / 2;

     if(array[meio] == idProcurado){
         System.out.println("Valor Id " + idProcurado + " encontrado no indice " + meio);
             return meio;
 }


     if (array[meio ] > idProcurado){
         fim = meio -1;
     }

     else{
         inicio = meio + 1;
     }
 }

 System.out.println("Id procurado: " + idProcurado + " não foi encontrado");
 return -1;
 }
 public static void main (String [] args){

 Scanner ler = new Scanner(System.in);
     int [] idVisitantes = {123, 423, 564, 5431, 561, 212, 875, 123};
        System.out.println("Informe o Id do visitante: ");
            int idBuscado = ler.nextInt();

            acesso(idVisitantes, idBuscado);

}
}