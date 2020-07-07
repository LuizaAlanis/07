package mediasequenciaint;
import java.util.Scanner;
public class MediaSequenciaInt 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("informe uma sequência, para calcular a média informe qualquer valor negativo");
        
        int num = 1 ;
        int sequencia = 1;
        int i = 0;
        
        while(num >= 0)
        {
            System.out.println("informe o número");
            num = sc.nextInt();
            sequencia += num;
            i++;
        }
        System.out.println("a media é " +sequencia/(i-1));
    }  
}
