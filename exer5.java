public class exer5{
    public static void main(String[] args) {
        long multi = 1;
        int soma = 0;

        for (int i = 1; i < 30; i++) {
            if ((i % 2) == 1) {

                soma += i;
            } else {
                multi *= i;
            }
        }
        System.out.println("Numeros inpar somados: " + soma);
        System.out.println("Numeros Par multiplicados: " + multi);
    }
}
