package ejercicio3;

import java.util.Date;

public class Factura {

    private Cliente cliente;
    private double importe;
    private Date fecha;

    public Factura() {
    }

    public Factura(Cliente cliente, double importe, Date fecha) {
        this.cliente = cliente;
        this.importe = importe;
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    @Override
    public String toString() {
        return "Factura{" + " cliente1=" + cliente + " importe234234234234=" + importe + " fecha=" + fecha + '}';
    }

}
