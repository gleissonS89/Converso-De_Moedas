import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 7) {
            System.out.println("************************************");
            System.out.println("Seja bem vindo/a ao Cnversor de Moeda!\n");
            System.out.println("1) Dólar =>> Peso argentino");
            System.out.println("2) Peso argentino =>> Dólar");
            System.out.println("3) Dólar =>> Real brasileiro");
            System.out.println("4) Real brasileiro =>> Dólar");
            System.out.println("5) Dólar =>> Peso colombiano");
            System.out.println("6) Peso colombiano =>> Dólar");
            System.out.println("7) Sair");
            System.out.print("Escolha uma opção válida: ");
            opcao = scanner.nextInt();

            if (opcao == 7) {
                System.out.println("Saindo...");
                break;
            }

            System.out.print("Digite o valor: ");
            double amount = scanner.nextDouble();
            String from = "";
            String to = "";

            switch (opcao) {
                case 1:
                    from = "USD";
                    to = "ARS";
                    break;
                case 2:
                    from = "ARS";
                    to = "USD";
                    break;
                case 3:
                    from = "USD";
                    to = "BRL";
                    break;
                case 4:
                    from = "BRL";
                    to = "USD";
                    break;
                case 5:
                    from = "USD";
                    to = "COP";
                    break;
                case 6:
                    from = "COP";
                    to = "USD";
                    break;
                default:
                    System.out.println("Opção inválida.");
                    continue;
            }

            try {
                double converted = CurrencyConverter.convert(from, to, amount);
                System.out.printf("Valor %.2f [%s] corresponde ao valor final =>>> %.2f [%s]\n", amount, from, converted, to);
            } catch (Exception e) {
                System.out.println("Erro ao converter: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
