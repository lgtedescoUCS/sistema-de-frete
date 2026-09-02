public class EntregaDrone implements FormaDeEntrega {

    private static final double PESO_MAXIMO = 5.0;
    private static final double VALOR_FIXO = 30.0;

    @Override
    public double calcularFrete(double peso) {
        if (peso > PESO_MAXIMO) {
            throw new IllegalArgumentException(
                "Entrega por Drone não suporta pesos acima de " + PESO_MAXIMO + " kg. Peso informado: " + peso + " kg."
            );
        }
        return VALOR_FIXO;
    }

    @Override
    public String getDescricao() {
        return "Entrega por Drone";
    }
}
