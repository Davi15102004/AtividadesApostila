import java.util.Scanner;

public class exer1{
    public static void main(String[] args) {
    Scanner  input = new Scanner(System.in);
    Double R,b,B,C;
    System.out.println("Digite o valor da altura: ");
    R = input.nextDouble();
    System.out.println("Digite o valor da base menor: ");
    b = input.nextDouble();
    System.out.println("Digite o valor da base maior: ");
    B = input.nextDouble();

    C = (R*(b + B))/2;

    System.out.println("O valor da área do trapézio: "+ C +"cm");
}
}
