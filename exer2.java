import java.util.Scanner;

public class exer2 {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        Double R,b,B,a;
        System.out.println("Digite o valor da altura: ");
        R = input.nextDouble();
        System.out.println("Digite o valor da base menor: ");
        b = input.nextDouble();
        System.out.println("Digite o valor da base maior: ");
        B = input.nextDouble();
        a = (R*(b + B))/2;
    
        System.out.println("O valor da área do trapézio: "+ a +"cm");
        System.out.println("O valor da área arredondado: " + Math.ceil(a));
       
}
}
