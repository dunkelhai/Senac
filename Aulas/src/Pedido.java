package Aulas.src;

import java.util.Date;

public class Pedido {
    private Integer id;
    private Date moment;

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", moment=" + moment +
                ", status=" + status +
                '}';
    }

    private PedidoStatus status;

    public Pedido(){

    }
    public Pedido(Integer id, Date moment, PedidoStatus status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public PedidoStatus getStatus() {
        return status;
    }

    public void setStatus(PedidoStatus status) {
        this.status = status;
    }
}
