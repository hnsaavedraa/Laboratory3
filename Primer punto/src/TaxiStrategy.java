public class TaxiStrategy implements AirportTransportStrategy {

    private int pricePerMinute = 250;
    public double speed = 80;
    private int distanceToAirport;

    public TaxiStrategy(int distanceToAirport) {
        this.distanceToAirport = distanceToAirport;
    }

    @Override
    public void transport(int time, int budget) {
        double price = ((double) distanceToAirport / speed)* 60 * pricePerMinute;
        System.out
                .println("\nMetodo de transporte: taxi" + "\n" + "Valor a pagar: " + price + "\n" + "Tiempo de viaje (minutos): "
                        + ((double) distanceToAirport / speed)*60 + "\n" + "Dinero restante: " + (budget - price) + "\n");

        if((budget - price) < 0){
            System.out.println("No tienes dinero suficiente, Te recomendamos seleccionar otro metodo de transporte");
        }
    }
}