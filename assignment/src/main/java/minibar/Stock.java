package minibar;


/**
 * This class represents a stock. It has an initial fill.
 *
 */
public class Stock {

    /**
     * The current volume of the stock.
     */
    private double fill;

    /**
     * This constructor creates a new stock object with an maximum volume. The
     * currentSize is equals to maximum volume, because the stock will be
     * created as a full stock.
     *
     * @param fill initial fill
     */
    public Stock( double fill ) {
        this.fill = fill;
    }

    /**
     * This method taps a beer from the stock.
     *
     * @param volume the size of the beer.
     * @return a Beer object.
     * @throws EmptyStockException when the stock has not enough volume for the
     * ordered beer.
     */
    public Beer draw( double volume ) throws
            EmptyStockException {
        //TODO 1 implement  Stock.draw(Volume)
        return null;
    }

    public double getLeft() {
        return fill;
    }
}
