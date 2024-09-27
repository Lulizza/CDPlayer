import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        int numMusica, escolha;

        CdPlayer cd1 = new CdPlayer();

        System.out.print("Quantas faixas têm o seu CD: ");
        numMusica = scnr.nextInt();
        cd1.setNumMusica(numMusica);

        System.out.printf("Inicializando CD com %d faixas...\n", numMusica);

        do{
            Menu.imprimeMenu();
            escolha = scnr.nextInt();
            switch (escolha){
                case 1:
                    cd1.tocaCD();
                    cd1.setStatus("Tocando");
                    System.out.println(cd1);
                    break;

                case 2:
                    cd1.paraCD();
                    cd1.setStatus("Pausado");
                    System.out.println(cd1);
                    break;

                case 3:
                    cd1.interrompeCD();
                    cd1.setStatus("Interrompido");
                    System.out.println(cd1);
                    break;

                case 4:
                    cd1.proximaFaixa();
                    cd1.setStatus("Avançando");
                    System.out.println(cd1);
                    break;

                case 5:
                    cd1.faixaAnterior();
                    cd1.setStatus("Retrocedendo");
                    System.out.println(cd1);
                    break;
            }
        }while(escolha != 0);

        System.out.println("CD Ejetado...");
    }
}
