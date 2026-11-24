public abstract class Inimigo extends Personagem {

    private final int recompensa;

    public Inimigo(String nome, int vida, int recompensa) {
        super(nome, vida);
        this.recompensa = recompensa;
    }

    public int getRecompensa() {
        return recompensa;
    }

    public int getDefesa() {
        // TODO: Definir a defesa do inimigo.
        return 0;
    }

    public int receberAtaque(int dano, int penetracao) {
        // TODO: Calcular o dano recebido.
        return 0;
    }
}