import java.util.Scanner;

public class App {

    public static Scanner scanner = new Scanner(System.in);

    public static double calculadora(double value, String type) {
        if (type == "Alimentacao") {
            CalculadoraTributo calculator = new Alimentacao(value);

            return calculator.calcularTributo();
        } else if (type == "Saude") {
            CalculadoraTributo calculator = new Saude(value);

            return calculator.calcularTributo();
        } else if (type == "Vestuario") {
            CalculadoraTributo calculator = new Vestuario(value);

            return calculator.calcularTributo();
        } else if (type == "Cultura") {
            CalculadoraTributo calculator = new Cultura(value);

            return calculator.calcularTributo();
        } else {
            return 0.0;
        }

    }

    public static void main(String[] args) throws Exception {

        System.out.println("Olá, bem vindo a calculadora de Tributos!");

        String options = """
                Insira o tipo de produto que deseja calcular o tributo:
                1) Alimentação
                2) Saúde e bem estar
                3) Vestuario
                4) Cultura\n
                """;

        while (true) {
            System.out.println("Insira o valor do produto que deseja saber o tributo: (Ou insira 0 para encerrar)");
            double value = scanner.nextDouble();

            if (value == 0) {
                System.out.print("Obrigado por utilizar nossos serviços!");
                break;
            } else {
                System.out.println(options);
                int option = scanner.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("Tributo do produto: R$" + calculadora(value, "Alimentacao"));
                        break;
                    case 2:
                        System.out.println("Tributo do produto: R$" + calculadora(value, "Saude"));
                        break;
                    case 3:
                        System.out.println("Tributo do produto: R$" + calculadora(value, "Vestuario"));
                        break;
                    case 4:
                        System.out.println("Tributo do produto: R$" + calculadora(value, "Cultura"));
                        break;
                    default:
                        break;
                }
            }

        }
    }
}
