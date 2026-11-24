import java.util.ArrayList;

public class Jogador extends Personagem {

    public enum Status {
        EM_ANDAMENTO,
        VITORIA,
        DERROTA_MORTE,
        DERROTA_CIBERPSICOSE,
        DERROTA_CAPRI
    }

    private int dinheiro;
    private int maxDocs;
    private int capitulo;

    private boolean capriSincronizada;

    private Status status = Status.EM_ANDAMENTO;

    private final ArrayList<Implante> implantesComprados =
            new ArrayList<>();

    private final ArrayList<Implante> implantesEquipados =
            new ArrayList<>();

    public Jogador(String nome) {
        super(nome, 0);

        // TODO: Definir os atributos iniciais do jogador.
    }

    @Override
    public int calcularDano() {
        // TODO: Calcular o dano do jogador.
        return 0;
    }

    @Override
    public void receberDano(int dano) {
        // TODO: Considerar os implantes defensivos.
    }

    public int getDinheiro() {
        return dinheiro;
    }

    public int getMaxDocs() {
        return maxDocs;
    }

    public int getCapitulo() {
        return capitulo;
    }

    public Status getStatus() {
        return status;
    }

    public boolean isCapriSincronizada() {
        return capriSincronizada;
    }

    public void ganharDinheiro(int valor) {
        // TODO: Adicionar dinheiro ao jogador.
    }

    public boolean usarMaxDoc() {
        // TODO: Implementar o uso de MaxDoc.
        return false;
    }

    public boolean comprarMaxDoc() {
        // TODO: Implementar a compra de MaxDoc.
        return false;
    }

    public boolean possuiImplante(Implante implante) {
        // TODO: Verificar se possui o implante.
        return false;
    }

    public boolean estaEquipado(Implante implante) {
        // TODO: Verificar se o implante esta equipado.
        return false;
    }

    public boolean comprarImplante(Implante implante) {
        // TODO: Implementar a compra de implantes.
        return false;
    }

    public boolean alternarImplante(Implante implante) {
        // TODO: Equipar ou retirar um implante.
        return false;
    }

    public ArrayList<Implante> getImplantesComprados() {
        return new ArrayList<>(implantesComprados);
    }

    public ArrayList<Implante> getImplantesEquipados() {
        return new ArrayList<>(implantesEquipados);
    }

    public ArrayList<Implante> getHabilidades() {
        // TODO: Identificar habilidades disponiveis.
        return new ArrayList<>();
    }

    public int getChanceCiberpsicose() {
        // TODO: Calcular a chance de ciberpsicose.
        return 0;
    }

    public void sincronizarCapri() {
        // TODO: Implementar a sincronizacao da Capri.
    }

    public void avancarCapitulo() {
        // TODO: Implementar a progressao da campanha.
    }

    public void encerrarPartida(Status resultado) {
        // TODO: Implementar o encerramento da partida.
    }
}