public class Divisa {
    private int id;
    private String codigo;
    private String nombre;
    private boolean disponible;

    public Divisa(int id, String codigo, String nombre) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.disponible = true;
    }

    public int getId() {
        return id;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "-" + id + "     " + codigo + "     " + nombre;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
