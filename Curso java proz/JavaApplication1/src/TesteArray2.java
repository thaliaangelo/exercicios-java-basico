public class TesteArray2 {
   // criando um método que recebe um array como parâmetro
   static void min(int arr[]){
   
   int min = arr[0];
   for(int i = 1; i<arr.length; i++)
          if(min>arr[i])
     min = arr[i];
     System.out.println(min);
   }
   public static void main(String[] args){
     int a[]={33, 3, 4, 5};//declarando e inicializando um array
     min(a);//passando array para método
    }
}
