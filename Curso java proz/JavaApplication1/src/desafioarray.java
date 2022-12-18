public class desafioarray{
   public static void main(String[] args){
   
   int a[] = new int[15];
   int b[] = new int[15];
   int c[] = new int[15];
   
   a [0] = 1;
   a [1] = 5;
   a [2] = 10;
   a [3] = 7;
   a [4] = 9;
   a [5] = 2;
   a [6] = 11;
   a [7] = 15;
   a [8] = 8;
   a [9] = 20;
   a [10] = 16;
   a [11] = 12;
   a [12] = 14;
   a [13] = 19;
   a [14] = 30;

   b [0] = 1;
   b [1] = 7;
   b [2] = 10;
   b [3] = 2;
   b [4] = 9;
   b [5] = 2;
   b [6] = 12;
   b [7] = 18;
   b [8] = 8;
   b [9] = 20;
   b [10] = 24;
   b [11] = 22;
   b [12] = 14;
   b [13] = 19;
   b [14] =30;

   for(int i = 0; i < 15; i++){
    System.out.print(a [i] + ",");
   }

   System.out.println();

   for(int i = 0; i < 15; i++){
    System.out.print(b [i] + ",");
   }

   System.out.println();

   for(int i = 0; i < 15; i++){
     if(a[i] == b[i]){
    c[i] = 1;
     }else{
             c[i] = 0; 
     }
    System.out.print(c[i] + ",");
      }
    }
 
 }