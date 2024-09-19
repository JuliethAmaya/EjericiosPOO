
package app;

public class Empleado {
    private String nombre;
    private int horasTrabajadas;
    private double pagoPorHora;
    private double salarioTotal;

    
    public Empleado(String nombre, int horasTrabajadas, double pagoPorHora) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;
        this.salarioTotal = calcularSalarioTotal();
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
        this.salarioTotal = calcularSalarioTotal();
    }

    public double getPagoPorHora() {
        return pagoPorHora;
    }

    public void setPagoPorHora(double pagoPorHora) {
        this.pagoPorHora = pagoPorHora;
        this.salarioTotal = calcularSalarioTotal();
    }

    public double getSalarioTotal() {
        return salarioTotal;
    }

    
    private double calcularSalarioTotal() {
        return this.horasTrabajadas * this.pagoPorHora;
    }
    
    @Override
    public String toString() {
    return """
           Empleado
           Nombre: """+ nombre + "\n"+
           "Horas Trabajadas: " + horasTrabajadas +"\n"+
           "Pago por Hora: " + pagoPorHora + "\n"+
           "Salario Total: " + salarioTotal + "\n";
    }
    
}
