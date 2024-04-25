public class Divisa {
    private final int id;
    private final String codigo;
    private final String nombre;

    public Divisa(int id, String codigo, String nombre) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "-" + id + "     " + codigo + "     " + nombre;
    }
}
