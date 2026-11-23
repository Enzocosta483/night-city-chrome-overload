import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("   NIGHT CITY: CHROME OVERLOAD");
        System.out.println("================================");

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        if (nome.isBlank()) {
            nome = "Edgerunner";
        }

        Jogador jogador = new Jogador(nome);

        ArrayList<Inimigo> inimigos = new ArrayList<>();

        inimigos.add(new Mercenario());
        inimigos.add(new SoldadoCorporativo());

        while (!inimigos.isEmpty() && jogador.estaVivo()) {

            Inimigo inimigoAtual = inimigos.get(0);

            boolean venceu = Combate.iniciar(
                    jogador, inimigoAtual, scanner
            );

            if (venceu) {
                inimigos.remove(0);

                System.out.println(
                        "Saldo atual: E$" + jogador.getDinheiro()
                );
            } else {
                break;
            }
        }

        if (jogador.estaVivo() && inimigos.isEmpty()) {
            System.out.println("Todos os inimigos foram derrotados!");
        } else {
            System.out.println("Fim de jogo.");
        }

        scanner.close();
    }
}