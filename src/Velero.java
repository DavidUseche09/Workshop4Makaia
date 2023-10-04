public class Velero extends Embarcacion implements Validacion{
    private int cantidadMastiles;
    public Velero(){}
    public Velero(Capitan capitan, int precioBase, int valorAdicional, int annioFabricacion, double eslora, int cantidadMastiles) {
        super(capitan, precioBase, valorAdicional, annioFabricacion, eslora);
        this.cantidadMastiles = cantidadMastiles;
    }

    public int getCantidadMastiles() {
        return cantidadMastiles;
    }
    public void setCantidadMastiles(int cantidadMastiles) {
        this.cantidadMastiles = cantidadMastiles;
    }

    @Override
    public boolean validar(int cantidadMastiles) {
        return cantidadMastiles > 4;
    }
}

