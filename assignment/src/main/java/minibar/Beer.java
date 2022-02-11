package minibar;

/**
 * This class represents a beer. A beer will have an id, a size and a ordered
 * time.
 *
 */
public class Beer {

    private double volume;

    public Beer(double beerLeftValue) {
        this.volume = beerLeftValue;
    }

    public double getVolume() {
        return this.volume;
    }
    
}
