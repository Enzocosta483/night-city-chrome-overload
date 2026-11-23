import java.util.Scanner;

public class Combate {

    public static boolean iniciar(
            Jogador jogador,
            Inimigo inimigo,
            Scanner scanner
    ) {

        System.out.println();
        System.out.println("Inimigo encontrado: " + inimigo.getNome());

        while (jogador.estaVivo() && inimigo.estaVivo()) {

            System.out.println();
            System.out.println("=== COMBATE ===");
            System.out.println("Seu HP: " + jogador.getVida());
            System.out.println("HP inimigo: " + inimigo.getVida());
            System.out.println("MaxDocs: " + jogador.getMaxDocs());

            System.out.println("1 - Atacar");
            System.out.println("2 - Usar MaxDoc");
            System.out.print("Escolha: ");

            String escolha = scanner.nextLine();

            if (escolha.equals("1")) {

                int dano = jogador.calcularDano();
                inimigo.receberDano(dano);

                System.out.println("Voce causou " + dano + " de dano!");

            } else if (escolha.equals("2")) {

                if (jogador.usarMaxDoc()) {
                    System.out.println("MaxDoc utilizado! HP recuperado.");
                } else {
                    System.out.println("Nao foi possivel usar MaxDoc.");
                    continue;
                }

            } else {
                System.out.println("Opcao invalida.");
                continue;
            }

            // Inimigos mortos nao podem atacar.
            if (!inimigo.estaVivo()) {
                break;
            }

            int danoInimigo = inimigo.calcularDano();
            jogador.receberDano(danoInimigo);

            System.out.println(
                    inimigo.getNome() + " causou " +
                            danoInimigo + " de dano!"
            );
        }

        if (jogador.estaVivo()) {
            System.out.println("Inimigo derrotado!");

            jogador.ganharDinheiro(inimigo.getRecompensa());

            System.out.println(
                    "Recompensa: E$" + inimigo.getRecompensa()
            );

            return true;
        }

        System.out.println("VOCE MORREU!");
        return false;
    }
}