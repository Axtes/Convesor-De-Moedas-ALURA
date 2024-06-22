import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        apiRequest request = new apiRequest();
        int opcao = 0;
        double valorConverter;

        while (opcao != 7) {
            System.out.println("""
                    *****************************************
                                    
                    Seja bem-vindo(a) ao Conversor de Moedas!
                                    
                    1. Dólar para Peso Argentino
                    2. Peso Argentino para Dólar
                    3. Dólar para Real Brasileiro
                    4. Real Brasileiro para Dólar
                    5. Dólar para Peso Colombiano
                    6. Peso Colombiano para Dólar
                    7. Sair
                                    
                    Digite uma opção válida:
                                    
                    *****************************************
                    """);

            Scanner leitura = new Scanner(System.in);

            opcao = leitura.nextInt();
            double resultadoConversao;

            switch (opcao) {
                case 1 -> {
                    conversor conversao = request.convesorMoeda("USD", "ARS");
                    Moedas moeda = new Moedas(conversao);

                    System.out.println("Digite um valor para ser convertido:");
                    valorConverter = leitura.nextDouble();

                    resultadoConversao = valorConverter * moeda.getConverter();

                    System.out.println("O resultado da conversão de dólar(es) para peso(s) argentino(s) é: " + resultadoConversao);
                }
                case 2 -> {
                    conversor conversao = request.convesorMoeda("ARS", "USD");
                    Moedas moedas = new Moedas(conversao);

                    System.out.println("Digite um valor para ser convertido:");
                    valorConverter = leitura.nextDouble();

                    resultadoConversao = valorConverter * moedas.getConverter();

                    System.out.println("O resultado da conversão de peso(s) argentino(s) para dólar(es) é: " + resultadoConversao);
                }
                case 3 -> {
                    conversor conversao = request.convesorMoeda("USD", "BRL");
                    Moedas moeda = new Moedas(conversao);

                    System.out.println("Digite um valor para ser convertido:");
                    valorConverter = leitura.nextDouble();

                    resultadoConversao = valorConverter * moeda.getConverter();

                    System.out.println("O resultado da conversão de dólar(es) para real(is) brasileiro(s) é: " + resultadoConversao);
                }
                case 4 -> {
                    conversor conversao = request.convesorMoeda("BRL", "USD");
                    Moedas moeda = new Moedas(conversao);

                    System.out.println("Digite um valor para ser convertido:");
                    valorConverter = leitura.nextDouble();

                    resultadoConversao = valorConverter * moeda.getConverter();

                    System.out.println("O resultado da conversão de real(is) brasileiro(s) para dólar(es) é: " + resultadoConversao);
                }
                case 5 -> {
                    conversor conversao = request.convesorMoeda("USD", "COP");
                    Moedas moeda = new Moedas(conversao);

                    System.out.println("Digite um valor para ser convertido:");
                    valorConverter = leitura.nextDouble();

                    resultadoConversao = valorConverter * moeda.getConverter();

                    System.out.println("O resultado da conversão de dólar(es) para peso(s) colombiano(s) é: " + resultadoConversao);
                }
                case 6 -> {
                    conversor conversao = request.convesorMoeda("COP", "USD");
                    Moedas moeda = new Moedas(conversao);

                    System.out.println("Digite um valor para ser convertido:");
                    valorConverter = leitura.nextDouble();

                    resultadoConversao = valorConverter * moeda.getConverter();

                    System.out.println("O resultado da conversão de peso(s) colombiano(s) para dólar(es) é: " + resultadoConversao);
                }
                case 7 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}