public class Familia extends Ingresso {

    private int pessoas;

    public Familia(double value, String movieName, String type, int pessoas) {
        super(value, movieName, type);
        this.pessoas = pessoas;
        if (pessoas > 3) {
            setValue(value * pessoas * 0.95);
        } else {
            setValue(value * pessoas);
        }
    }

    public int getPessoas() {
        return pessoas;
    }

    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
    }

}
