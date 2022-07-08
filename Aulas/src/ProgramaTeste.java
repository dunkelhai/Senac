package Aulas.src;

import java.util.Date;

public class ProgramaTeste {
    public static void main(String[] args) {

        Pedido pedido1 = new Pedido(1,new Date(),PedidoStatus.PAGAMENTO_PENDENTE);

        System.out.println(pedido1);

        //Como passar o valor de String para Enum

        PedidoStatus ps1 = PedidoStatus.ENTREGUE;

        PedidoStatus ps2 = PedidoStatus.valueOf("ENVIADO");

    }
}
