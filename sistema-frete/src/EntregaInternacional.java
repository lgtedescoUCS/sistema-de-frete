public class EntregaInternacional implements FormaDeEntrega {

    @Override
    public double calcularFrete(double peso) {
        return 50.0 + (5.0 * peso);
    }

    @Override
    public String getDescricao() {
        return "Entrega Internacional";
    }
}
