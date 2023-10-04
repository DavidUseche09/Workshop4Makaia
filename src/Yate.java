public class Yate extends Embarcacion implements Validacion {
    private int cantidadCamarotes;

    public Yate(){}
    public Yate(Capitan capitan, int precioBase, int valorAdicional, int annioFabricacion, double eslora, int cantidadCamarotes) {
        super(capitan, precioBase, valorAdicional, annioFabricacion, eslora);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    public int getCantidadCamarotes() {
        return cantidadCamarotes;
    }
    public void setCantidadCamarotes(int cantidadCamarotes) {
        this.cantidadCamarotes = cantidadCamarotes;
    }
    @Override
    public boolean validar(int cantidadCamarotes) {
        return cantidadCamarotes > 7;
    }
}

