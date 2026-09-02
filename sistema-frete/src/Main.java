import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pedido> pedidos = new ArrayList<>();

        pedidos.add(new Pedido(150.00, 3.0, new EntregaEconomica()));
        pedidos.add(new Pedido(500.00, 5.5, new EntregaExpressa()));
        pedidos.add(new Pedido(80.00, 1.2, new RetiradaNaLoja()));
        pedidos.add(new Pedido(1200.00, 4.0, new EntregaInternacional()));
        pedidos.add(new Pedido(250.00, 2.5, new EntregaEconomica()));
        pedidos.add(new Pedido(300.00, 2.0, new EntregaDrone()));   // Drone dentro do limite
        pedidos.add(new Pedido(400.00, 7.0, new EntregaDrone()));   // Drone acima do limite (vai dar erro)

        int contador = 1;
        for (Pedido pedido : pedidos) {
            System.out.println("=========== Pedido " + contador + " ===========");
            try {
                System.out.println(pedido.relatorio());
            } catch (IllegalArgumentException e) {
                System.out.println("ERRO ao processar pedido: " + e.getMessage());
            }
            System.out.println();
            contador++;
        }
    }
}
