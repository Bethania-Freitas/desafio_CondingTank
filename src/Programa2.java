import java.util.Scanner;

public class Programa2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int soma = 0;
        double media = 0;
        double MH = 0;
        String tipoMedia = null;
        int n = 0;
        boolean found = false;

        while (found == false) {
            System.out.println("Quantos numeros deseja digitar: ");
            String num1 = sc.next();
            if (num1.matches("[0-9]")) {
                n = Integer.parseInt(num1);
                found = true;
            } else {
                System.out.println("Resposta inválida");
            }
        }


        double[] vect = new double[n];

            for (int i = 0; i < n; i++) {
                System.out.printf("Digite o numero: ");
                String num1 = sc.next();
                if (num1.matches("[0-9]")) {
                    vect[i] = Integer.parseInt(num1);
                    soma += vect[i];
                    found = true;
                } else {
                    System.out.println("Valor Inválido!");
                    found = false;
                }

        }
            for (int i = 0; i < n; i++) {
                MH += 1 / vect[i];
            }



        while (tipoMedia == null) {
            System.out.println("Qual a media desejada: (1) ARITMETICA - (2) para HARMONICA");
            int option = sc.nextInt();
            if (option == 1) {
                media = soma / n;
                tipoMedia = "ARITMETICA";
            } else if (option == 2) {
                media = n / MH;
                tipoMedia = "HARMONICA";
            } else {
                System.out.println("Opção Inválida!");
            }
        }

        // RESULTADOS:
        System.out.printf("Numeros digitados: ");
        for (int i = 0; i < vect.length; i++) {
            System.out.printf(String.valueOf(vect[i]) + " ");
        }
        System.out.println();
        System.out.println("Soma dos numeros:" + soma);
        System.out.println("Tipo de média: " + tipoMedia);
        System.out.printf("Media: %.2f%n", media);

    }
}
