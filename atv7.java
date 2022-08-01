import java.util.Scanner;
public class atv7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float lr,kg,trab,quilos,c; 
       lr=424;
       kg = 1000;

       System.out.println("Digite 1 para conversão de quilos para libra digite 2 para conversão de libra para quilod ");
       trab = entrada.nextInt();
       
       if (trab == 1 ){
       System.out.println("Quastos quilos voçê quer converter ");
       quilos= entrada.nextInt();
      c = quilos * lr;
       
       System.out.println("A converçãso total é "+ c);

       }
       else if (trab == 2){
        System.out.println("Quastas libras voçê quer converter ");
        quilos= entrada.nextInt();
       c = quilos/kg;
        
        System.out.println("A converçãso total é "+ c);
       }
      else if( trab <= 3 ){
        System.out.println("O numero digitado é invalido");

      }

    }
}


