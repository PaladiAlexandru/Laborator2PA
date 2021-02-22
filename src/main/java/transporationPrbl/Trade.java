package transporationPrbl;

import utils.PriceCalculator;

/**
 * Contine o sursa, o destinatie respectiv costul unei mărfi si contine o metoda care calculeaza costul total
 */
public class Trade {
    Source source;
    Destination destination;
    int cost;
    private int totalCost;

    public Trade(Source source, Destination destination,int cost) {
        PriceCalculator priceCalculator = new PriceCalculator();
        this.source = source;
        this.destination = destination;
        this.cost = cost;
        this.totalCost=priceCalculator.calulate(this);
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public void setCost(int cost) {

        this.cost = cost;
    }

    public Source getSource() {
        return source;
    }

    public int getCost() {
        return cost;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public Destination getDestination() {
        return destination;
    }

    @Override
    public String toString() {
        return  source.getName() +
                " -> " + destination.getName() +
                ": " + source.getCapacity() +
                " units * cost " + this.cost +
                " = " + this.totalCost;
    }
}
