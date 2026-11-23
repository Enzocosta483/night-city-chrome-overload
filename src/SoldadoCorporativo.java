public class SoldadoCorporativo extends Inimigo {

    private int ataquesRealizados = 0;

    public SoldadoCorporativo() {
        super("Soldado Corporativo", 60, 150);
    }

    @Override
    public int calcularDano() {
        ataquesRealizados++;

        if (ataquesRealizados % 3 == 0) {
            return 20;
        }

        return 12;
    }
}