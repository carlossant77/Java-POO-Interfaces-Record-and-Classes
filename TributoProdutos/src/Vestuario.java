public record Vestuario(double tributo) implements CalculadoraTributo {

    @Override
    public double calcularTributo() {

        return tributo * 0.025;
    }

}
