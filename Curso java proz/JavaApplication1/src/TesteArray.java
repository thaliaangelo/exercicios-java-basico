public class TesteArray {
  public static void main(String[] args){
  
  int a [] = new int [5]; // declaração e instanciação
  a [0] = 10; //inicialização
  a [1] = 20;
  a [2] = 70;
  a [3] = 40;
  a [4] = 50;

  //percorrendo a matriz
  for(int i = 0; i<a.length; i++){ //comprimento é a propriedade da matriz
  System.out.println(a[i]);
    }
  }
}
