public class StrategyChooser {

    public void getTransport(AirportTransportStrategy airportTransportStrategy, int budget, int time) {
        airportTransportStrategy.transport(time, budget);
    }

}