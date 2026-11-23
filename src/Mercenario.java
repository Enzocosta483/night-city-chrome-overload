public class Mercenario extends Inimigo {

    public Mercenario() {
        super("Mercenario de Rua", 45, 100);
    }

    @Override
    public int calcularDano() {
        return 10;
    }
}