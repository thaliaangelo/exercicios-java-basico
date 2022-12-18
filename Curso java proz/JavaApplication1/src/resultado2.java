public class resultado2 {
    public static void main(String[] args){
        int A,B,C,D,E,F,G;
        A=8;
        B=9;
        C=4;
        D=6;
        F=5;
        G=5;
        if((!(C<6))&&(D!=5)){
            G=C-G;
            if(G<=5){
                G=F-A;
            }else{
                if((C!=7)||(C<3)){
                    D=F-A;
                }
            }
           
        }else{
            if(C<=5){
                G=D+F;
            }
            A=G-C;
        }
        System.out.println(B+F+G-C);
    }
}
