package CantantesFamosos.Code;

public class CantanteFamoso implements Comparable<CantanteFamoso> {

    private String nombre, discoMasFamoso;
    private int discoVentas;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDiscoMasFamoso(String discoMasFamoso) {
        this.discoMasFamoso = discoMasFamoso;
    }

    public String getDiscoMasFamoso() {
        return discoMasFamoso;
    }

    public void setDiscoVentas(int discoVentas) {
        this.discoVentas = discoVentas;
    }

    public int getDiscoVentas() {
        return discoVentas;
    }

    @Override
    public int compareTo(CantanteFamoso cantFam) {
        return Integer.compare(this.discoVentas, cantFam.getDiscoVentas());
    }
}
