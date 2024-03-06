import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float temperaturaCelsius;
        float temperaturaFahrenheit;

        System.out.println("Digite a temperatura em Celsius para a conversão em Fahrenheit");
        temperaturaCelsius = scanner.nextFloat();
        temperaturaFahrenheit = (float)(temperaturaCelsius * 1.8) + 32;


        System.out.println(String.format("A temperatura %.0f graus celsius equivale a %.1f graus Fahrenheit",temperaturaCelsius,temperaturaFahrenheit));

    }
}