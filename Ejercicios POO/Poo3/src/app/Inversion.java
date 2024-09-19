
package app;

public class Inversion {
    private String codigoInversion;
    private String inversor;
    private double montoInicial;
    private double tasaInteresAnual;
    private double interesGenerado;

    public String getCodigoInversion() {
        return codigoInversion;
    }

    public void setCodigoInversion(String codigoInversion) {
        this.codigoInversion = codigoInversion;
    }

    public String getInversor() {
        return inversor;
    }

    public void setInversor(String inversor) {
        this.inversor = inversor;
    }

    public double getMontoInicial() {
        return montoInicial;
    }

    public void setMontoInicial(double montoInicial) {
        this.montoInicial = montoInicial;
    }

    public double getTasaInteresAnual() {
        return tasaInteresAnual;
    }

    public void setTasaInteresAnual(double tasaInteresAnual) {
        this.tasaInteresAnual = tasaInteresAnual;
    }

    public double getInteresGenerado() {
        return interesGenerado;
    }

    public void setInteresGenerado(double interesGenerado) {
        this.interesGenerado = interesGenerado;
        this.interesGenerado = calcularInteresGenerado();
        
    }
    
    private double calcularInteresGenerado() {
        return this.montoInicial * this.tasaInteresAnual / 100;
    }


    public Inversion(String codigoInversion, String inversor, double montoInicial, double tasaInteresAnual) {
        this.codigoInversion = codigoInversion;
        this.inversor = inversor;
        this.montoInicial = montoInicial;
        this.tasaInteresAnual = tasaInteresAnual;
        this.interesGenerado = calcularInteresGenerado();
    }
    
    
    @Override
    public String toString() {
    return """
           Inversion
           Codigo de Inversion: """+ codigoInversion + "\n"+
           "Inversor: " + inversor +"\n"+
           "Monto inicial: " + montoInicial + "\n"+
           "Tasa de interes Anual: " + tasaInteresAnual + "\n"+
           "Interes Generado: " + interesGenerado + "\n";
    }
    
    
    
    
    
}
