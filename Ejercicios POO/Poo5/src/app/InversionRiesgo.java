
package app;

public class InversionRiesgo extends Inversion{
    private String nivelRiesgo;
    private double potencialGanancia;

    public InversionRiesgo(String codigoInversion, String inversor, double montoInicial, double tasaInteresAnual, String nivelRiesgo) {
        super(codigoInversion, inversor, montoInicial, tasaInteresAnual);
        this.nivelRiesgo = nivelRiesgo;
        this.potencialGanancia = calcularPotencialGanancia();
    }

    // Getters y Setters
    public String getNivelRiesgo() {
        return nivelRiesgo;
    }

    public void setNivelRiesgo(String nivelRiesgo) {
        this.nivelRiesgo = nivelRiesgo;
        this.potencialGanancia = calcularPotencialGanancia();
    }

    public double getPotencialGanancia() {
        return potencialGanancia;
    }
    
    private double calcularPotencialGanancia(){
        double interesGen = getInteresGenerado();
        //el metodo toLowerCase() convierte la cadena de texto en minuscula
        switch(nivelRiesgo.toLowerCase()) {
            case "alto":
                return interesGen * 2;
            case "medio":
                return interesGen * 1.5;
            case "bajo":
                return interesGen;
            default:
                return interesGen;
        }
    }
    
    @Override
    public String toString() {
        return """
               Inversion
               Codigo Inversion: """ + getCodigoInversion() + "\n"+ 
               "inversor: " + getInversor() +"\n"+
               "montoInicia: " + getMontoInicial()+"\n"+
               "tasaInteresAnua: " + getTasaInteresAnual()+"\n"+ 
               "interesGenerad: " + getInteresGenerado()+"\n"+
               "nivelRiesgo: " + nivelRiesgo +"\n"+
               "potencialGananci: " + potencialGanancia +"\n";
    
    
    }
    
    
}
