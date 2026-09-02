public class Pedido {
    private double valorProdutos;
    private double peso;
    private FormaDeEntrega formaDeEntrega;

    public Pedido(double valorProdutos, double peso, FormaDeEntrega formaDeEntrega) {
        this.valorProdutos = valorProdutos;
        this.peso = peso;
        this.formaDeEntrega = formaDeEntrega;
    }

    public double calcularTotal() {
        return valorProdutos + formaDeEntrega.calcularFrete(peso);
    }

    public String relatorio() {
        return "Valor dos produtos: R$" + String.format("%.2f", valorProdutos) + "\n" +
               "Peso: " + peso + " kg\n" +
               "Forma de entrega: " + formaDeEntrega.getDescricao() + "\n" +
               "Frete: R$" + String.format("%.2f", formaDeEntrega.calcularFrete(peso)) + "\n" +
               "Total: R$" + String.format("%.2f", calcularTotal());
    }
}
