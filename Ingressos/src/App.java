public class App {
    public static void main(String[] args) throws Exception {
        Ingresso ingresso = new Ingresso(100, "Gatos no museu", "Legendado");
        MeiaEntrada meiaEntrada = new MeiaEntrada(100, "Gatos no museu", "Legendado");
        Familia familia = new Familia(100, "Gatos no museu", "Legendado", 4);

        System.out.println(ingresso.getMovieName());
        System.out.println(ingresso.getValue());
        System.out.println("==========================");
        System.out.println(meiaEntrada.getMovieName());
        System.out.println(meiaEntrada.getValue());
        System.out.println("==========================");
        System.out.println(familia.getMovieName());
        System.out.println(familia.getValue());
    }
}
