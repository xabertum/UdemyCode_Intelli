package lecture64_herencia;

import java.util.Date;

/**
 * @author xabertum
 *
 */
public class Cliente extends Persona {

    private int idCliente;
    private java.util.Date fechaRegistro;
    private boolean vip;
    private static int contadorClientes;
    
    public Cliente (Date fechaRegistro, boolean vip) {
	this.idCliente = ++contadorClientes;
	this.fechaRegistro = fechaRegistro;
	this.vip = vip;
    }

    
    // GETTERs & SETTERs
    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public java.util.Date getFechaRegistro() {
        return fechaRegistro;
    }
    
    @Override
    public String toString () {
	return super.toString() + "Cliente {" + "idCliente=" + idCliente + 
		", fechaRegistro=" + fechaRegistro + ", vip=" + vip + " }";
    }
    
}
