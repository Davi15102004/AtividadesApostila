import java.util.Scanner;

public class atv5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float sal,hora,trab; 
       hora = 10.25f;
       System.out.println("Digite as suas horas trabalhadas");
       trab = entrada.nextInt();
       sal=trab * hora;
       System.out.println("seu salario é "+ sal);


    }
}
