package minibar;

/**
 * This class represent a typical guest of a pub. He / she want drink beer and
 * can be drunken.
 *
 * @author Pia Erbrath
 */
public class Guest {

    private double fill;
    private double capacity;
    
    /**
     * *
     * Drinks a beer, optionally get drunk, Hickup.
     *
     * @param beer to consume
     * @return self, I am still on my feet.
     * @throws DrunkenException when overfilled.
     */
    public Guest drink( Beer beer ) throws DrunkenException {
        setFill(beer);

        if (this.capacity < this.fill) {
            throw new DrunkenException("Guest is drunk!");
        }
        return this;
    }

    public void setFill(Beer beer){
        this.fill += beer.getVolume();
    }

    public double getFill(){
        return this.fill;
    }

    public Guest(double capacity) {
        this.capacity = capacity;
        this.fill = 0;
    }

    public double getCapacity(){
        return this.capacity;
    }
}
