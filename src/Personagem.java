public abstract class Personagem {

    private final String nome;
    private final int vidaMaxima;
    private int vida;

    public Personagem(String nome, int vidaMaxima) {
        this.nome = nome;
        this.vidaMaxima = vidaMaxima;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public boolean estaVivo() {
        // TODO: Verificar se o personagem esta vivo.
        return false;
    }

    public void receberDano(int dano) {
        // TODO: Implementar o sistema de dano.
    }

    protected void recuperarVida(int quantidade) {
        // TODO: Implementar a recuperacao de vida.
    }

    public abstract int calcularDano();
}