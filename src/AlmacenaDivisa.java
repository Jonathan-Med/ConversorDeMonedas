import java.util.ArrayList;
import java.util.List;

public class AlmacenaDivisa {
    private final List<Divisa> listaDivisas;


    public AlmacenaDivisa() {
        listaDivisas = new ArrayList<>();
        listaDivisas.add(new Divisa(1, "USD", "Dólar estadounidense"));
        listaDivisas.add(new Divisa(2, "EUR", "Euro"));
        listaDivisas.add(new Divisa(3, "GBP", "Libra esterlina"));
        listaDivisas.add(new Divisa(4, "CHF", "Franco suizo"));
        listaDivisas.add(new Divisa(5, "JPY", "Yen japonés"));
        listaDivisas.add(new Divisa(6, "VES", "Bolívar Soberano"));
        listaDivisas.add(new Divisa(7, "CAD", "Dólar canadiense"));
        listaDivisas.add(new Divisa(8, "CNY", "Yuan chino"));
        listaDivisas.add(new Divisa(9, "AUD", "Dólar australiano"));
        listaDivisas.add(new Divisa(10, "BRL", "Real brasileño"));
        listaDivisas.add(new Divisa(11, "RUB", "Rublo ruso"));
        listaDivisas.add(new Divisa(12, "MXN", "Peso mexicano"));
        listaDivisas.add(new Divisa(13, "ARS", "Peso Argentino"));
        listaDivisas.add(new Divisa(14, "COP", "Peso colombiano"));
        listaDivisas.add(new Divisa(15, "PEN", "Sol peruano"));
    }

    public String obtenerCodigoPorId(int buscaID) {
        if (buscaID >= 0 && buscaID < listaDivisas.size()) {
            return listaDivisas.get(buscaID).getCodigo();
        }
        return null;
    }

    public void muestraDivisa() {
        for (Divisa divisa : listaDivisas) {
            System.out.println(divisa.toString());
        }
    }
}
