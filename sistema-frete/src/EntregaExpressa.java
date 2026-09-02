public class EntregaExpressa implements FormaDeEntrega {

    @Override
    public double calcularFrete(double peso) {
        return 20.0 + (2.5 * peso);
    }

    @Override
    public String getDescricao() {
        return "Entrega Expressa";
    }
}
