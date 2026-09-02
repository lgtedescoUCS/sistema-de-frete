public class EntregaEconomica implements FormaDeEntrega {

    @Override
    public double calcularFrete(double peso) {
        return 10.0 + (1.0 * peso);
    }

    @Override
    public String getDescricao() {
        return "Entrega Econômica";
    }
}
