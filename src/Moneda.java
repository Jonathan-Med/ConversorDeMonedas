public record Moneda(String base_code,
                     String target_code,
                     double conversion_rate,
                     double conversion_result) {
    public String formatResultado(double cantidad) {
        return String.format("El valor de %.2f [%s] corresponde al valor final de ==> %.2f [%s]",
                cantidad, base_code, conversion_result, target_code);
    }
}
