
package app;
//subclase gerente
public final class Gerente extends Empleado{
    private double bonificacion;
    private double salarioTotal;

    public Gerente() {
    }

    public Gerente(String nombre, double salarioBase, double bonificacion) {
        super(nombre, salarioBase);
        this.bonificacion = bonificacion;
        this.salarioTotal = calcularSalarioTotal();
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
        this.salarioTotal = calcularSalarioTotal();
    }

    public double getSalarioTotal() {
        return salarioTotal;
    }

    private double calcularSalarioTotal() {
        return getSalarioBase() + bonificacion;
    }

    @Override
    public String toString() {
        return "Gerente: " + getNombre() + "\n"+
               "Salario Base: " + getSalarioBase()+ "\n"+
               "Bonificacion: " + bonificacion + "\n" +
               "Salario Total: " + salarioTotal +"\n";
    }
    
    
   
    

    
}
