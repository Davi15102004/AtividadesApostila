import java.util.Scanner;

public class atv6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float sal,hora,trab; 
       hora = 10.25f;
       System.out.println("Digite as suas horas trabalhadas");
       trab = entrada.nextInt();
       sal=trab * hora;
       if (sal > 50 ){
       
       System.out.println("seu salario é "+ sal);

       }
       System.out.println("Suas horas são insuficientes va para o hotel");
    }
}


