
package app;

public class Pago {
    private String numeroPago;
    private String empleado;
    private double salarioBase;
    private double bonificacion;
    private double deduccion;
    private double salarioNeto;

    public String getNumeroPago() {
        return numeroPago;
    }

    public void setNumeroPago(String numeroPago) {
        this.numeroPago = numeroPago;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
        this.salarioNeto = calcularSalarioNeto();
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
        this.salarioNeto = calcularSalarioNeto();
    }

    public double getDeduccion() {
        return deduccion;
    }

    public void setDeduccion(double deduccion) {
        this.deduccion = deduccion;
        this.salarioNeto = calcularSalarioNeto();
    }

    

    public Pago(String numeroPago, String empleado, double salarioBase, double bonificacion, double deduccion) {
        this.numeroPago = numeroPago;
        this.empleado = empleado;
        this.salarioBase = salarioBase;
        this.bonificacion = bonificacion;
        this.deduccion = deduccion;
        this.salarioNeto = calcularSalarioNeto();
    }
    
    private double calcularSalarioNeto() {
        return this.salarioBase + this.bonificacion - this.deduccion;
    }
    
    @Override
    public String toString() {
    return """
           Pago
           Numero de Pago: """+ numeroPago + "\n"+
           "Empleado: " + empleado +"\n"+
           "Salario Base: " + salarioBase + "\n"+
           "Bonificacion: " + bonificacion + "\n"+
           "Deduccion: " + deduccion + "\n"+
           "Salario neto: " + salarioNeto + "\n";
    }
    
}
