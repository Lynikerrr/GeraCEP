import java.io.IOException;
import java.util.Scanner;

import models.endereco;

public class mainCEP {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        consultaCEP consulta = new consultaCEP();

        System.out.println("Digite um CEP para consulta");
        String CEP = teclado.nextLine();
        

        try {
            endereco novEndereco = consulta.buscaEndereco(CEP);
            System.out.println(novEndereco);
            gerador geradorCEP = new gerador();
            geradorCEP.salvarJson(novEndereco);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação...");
        }
        teclado.close();
    }
}
