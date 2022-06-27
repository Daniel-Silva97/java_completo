package enumeracoesComposicao.enumeracao.application;

import enumeracoesComposicao.enumeracao.entities.Order;
import enumeracoesComposicao.enumeracao.entities.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        // Enviando uma STRING para instanciar um objeto de status
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
        System.out.println(os1);
        System.out.println(os2);
    }
}
