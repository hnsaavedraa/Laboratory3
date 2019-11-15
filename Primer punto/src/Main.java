import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StrategyChooser strategyChooser = new StrategyChooser();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su presupuesto (pesos): ");
        int budget = scanner.nextInt();
        System.out.print("Ingrese el tiempo restante (minutos): ");
        int time = scanner.nextInt();
        System.out.print("Ingrese la distancia al aeropuerto (kilometros): ");
        int distanceToAirport = scanner.nextInt();

        if(distanceToAirport != 0){
            if (budget < 2400) {
                strategyChooser.getTransport(new BicycleStrategy(distanceToAirport), budget, time);
            } else {
                if (time < 25) {
                    strategyChooser.getTransport(new TaxiStrategy(distanceToAirport), budget, time);
                } else {
                    strategyChooser.getTransport(new BusStrategy(distanceToAirport), budget, time);
                }
            }
        }else{
            System.out.println("\nYa estas en el aeropuerto");
        }
    }
}
