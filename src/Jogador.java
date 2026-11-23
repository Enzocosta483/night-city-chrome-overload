public class Jogador extends Personagem {

    private int dinheiro;
    private int maxDocs;

    public Jogador(String nome) {
        super(nome, 100);
        this.dinheiro = 150;
        this.maxDocs = 2;
    }

    @Override
    public int calcularDano() {
        return 15;
    }

    public int getDinheiro() {
        return dinheiro;
    }

    public int getMaxDocs() {
        return maxDocs;
    }

    public void ganharDinheiro(int valor) {
        if (valor > 0) {
            dinheiro += valor;
        }
    }

    public boolean usarMaxDoc() {
        if (maxDocs <= 0 || getVida() == getVidaMaxima()) {
            return false;
        }

        maxDocs--;
        recuperarVida(30);
        return true;
    }
}