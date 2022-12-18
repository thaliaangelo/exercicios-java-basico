import java.util.Scanner;
public class coelhinho {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N, A, B;
        System.out.println("Quantos minutos faltam para o final do expediente? ");
        N = scan.nextInt();
        System.out.println("Quantos minutos levará para fazer o ovo A? ");
        A = scan.nextInt();
        System.out.println("Quantos minutos levará para fazer o ovo B? ");
        B = scan.nextInt();
        if(A + B > N){
            System.out.println("Deixe para amanhã !");
        }else{
            System.out.println("Farei hoje !");
        }
    }
}
