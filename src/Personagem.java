public abstract class Personagem {

    private final String nome;
    private final int vidaMaxima;
    private int vida;

    public Personagem(String nome, int vidaMaxima) {
        this.nome = nome;
        this.vidaMaxima = vidaMaxima;
        this.vida = vidaMaxima;
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
        return vida > 0;
    }

    public void receberDano(int dano) {
        if (dano > 0) {
            vida = Math.max(0, vida - dano);
        }
    }

    protected void recuperarVida(int quantidade) {
        if (quantidade > 0) {
            vida = Math.min(vidaMaxima, vida + quantidade);
        }
    }

    public abstract int calcularDano();
}