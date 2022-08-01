import javax.swing.JOptionPane;


public class atv10 { 
    public static void main (String[] args ) {
    float  peso1=0, alt=0,IMC=0;
    String aux="";
   try {
   aux= JOptionPane.showInputDialog("Peso");
   peso1 = Float.parseFloat(aux);
   aux= JOptionPane.showInputDialog("altura");
   alt = Float.parseFloat(aux);
    IMC= peso1/alt ;
JOptionPane.showMessageDialog(null,"Seu IMC é" + IMC);
   
   
 }
}
}