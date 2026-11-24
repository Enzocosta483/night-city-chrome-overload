public enum Implante {

    GORILLA("Bracos Gorilla"),
    PELE_SUBDERMICA("Pele Subdermica"),
    SANDEVISTAN("Sandevistan"),
    MANTIS("Mantis Blades"),
    CAPRI("Capricorn (Capri)");

    private final String nome;

    // Valores provisórios para o esboco.
    private final int preco = 0;
    private final int risco = 0;
    private final int danoEspecial = 0;
    private final String descricao = "";

    Implante(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getPreco() {
        return preco;
    }

    public int getRisco() {
        return risco;
    }

    public int getDanoEspecial() {
        return danoEspecial;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean temHabilidade() {
        // TODO: Identificar implantes com habilidades ativas.
        return false;
    }
}