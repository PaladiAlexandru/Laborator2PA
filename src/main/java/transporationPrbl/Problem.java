package transporationPrbl;

import utils.CostGenerator;

/**
 * O problema de tipul 'Transportation problem'
 * Contine un vector de destinatii si unul de surse
 * Are o metoda care rezolva problema
 */
public class Problem {
    Destination[] destinations;
    Source[] sources;
    private int totalCost=0;
    /**
     * Rezolva problema
     */
    public void solve() {

    }
    public void addToTheTotalCost(int cost){
        this.totalCost += cost;
    }

    public Destination[] getDestinations() {
        return destinations;
    }

    public void setDestinations(Destination[] destinations) {
        this.destinations = destinations;
    }

    public Source[] getSources() {
        return sources;
    }

    public void setSources(Source[] sources) {
        this.sources = sources;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }
}
