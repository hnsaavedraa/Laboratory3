public class BicycleStrategy implements AirportTransportStrategy {

    public double speed = 15;
    private int distanceToAirport;

    public BicycleStrategy(int distanceToAirport) {
        this.distanceToAirport = distanceToAirport;
    }

    @Override
    public void transport(int time, int budget) {
        System.out.println("\nMetodo de transporte: bicicleta" + "\n" + "Valor a pagar: 0" + "\n" + "Tiempo de viaje (minutos): "
                + ((double) distanceToAirport / speed)*60 + "\n" + "Dinero restante: " + budget + "\n");
    }
}