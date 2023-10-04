public class Embarcacion {
    private Capitan capitan;
    private int precioBase;
    private int valorAdicional;
    private int annioFabricacion;
    private double eslora;

    public Embarcacion(){}
    public Embarcacion(Capitan capitan, int precioBase, int valorAdicional, int annioFabricacion, double eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.annioFabricacion = annioFabricacion;
        this.eslora = eslora;
    }

    public int calcularMontoAlquiler() {
        int montoAlquiler = precioBase;
        if (annioFabricacion > 2020) {
            montoAlquiler += 20000;
        }
        return montoAlquiler;
    }

    public Capitan getCapitan() {
        return capitan;
    }
    public double getPrecioBase() {
        return precioBase;
    }
    public int getValorAdicional() {
        return valorAdicional;
    }
    public int getAnnioFabricacion() {
        return annioFabricacion;
    }
    public double getEslora() {
        return eslora;
    }
    public void setCapitan(Capitan capitan) {
        this.capitan = capitan;
    }
    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }
    public void setValorAdicional(int valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
    public void setAnnioFabricacion(int annioFabricacion) {
        this.annioFabricacion = annioFabricacion;
    }
    public void setEslora(double eslora) {
        this.eslora = eslora;
    }
    public String getDescripcion() {
        return null;
    }

}


