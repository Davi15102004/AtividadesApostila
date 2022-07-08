import javax.swing.JOptionPane;
import java.util.Scanner;

public class ativ8 { 
    public static void main (String[] args ) {
        Scanner entrada = new Scanner(System.in);
        int id;
          System.out.println(" Digite aqui sua idade ");
        id = entrada.nextInt();
        if ((id > 4) && (id < 9)){
            JOptionPane.showConfirmDialog(null, id + " Você é bebe(a) ");
        }
        else if ((id > 4) && (id < 9)){
            JOptionPane.showConfirmDialog(null, id + " Você é criança(a) ");

        }
        
        else if ((id > 10) && (id < 14)){
            JOptionPane.showConfirmDialog(null, id + " Você é pre-adolecente");
        }

        else if  ((id > 15) && (id < 18)){ 
            JOptionPane.showConfirmDialog(null, id + " Você é Adolescente" );
        }
        
        else if  ((id > 19) && (id < 25)){
        
            JOptionPane.showConfirmDialog(null, id + " Você é jovem ");
        }
        else if  ((id > 25) && (id < 40)){
          JOptionPane.showConfirmDialog(null, id + " Você é adulto");
        }

    }
}