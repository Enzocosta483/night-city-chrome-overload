public abstract class Inimigo extends Personagem {

    private final int recompensa;

    public Inimigo(String nome, int vida, int recompensa) {
        super(nome, vida);
        this.recompensa = recompensa;
    }

    public int getRecompensa() {
        return recompensa;
    }
}