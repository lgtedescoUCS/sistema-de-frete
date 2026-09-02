public class RetiradaNaLoja implements FormaDeEntrega {

    @Override
    public double calcularFrete(double peso) {
        return 0.0;
    }

    @Override
    public String getDescricao() {
        return "Retirada na Loja";
    }
}
