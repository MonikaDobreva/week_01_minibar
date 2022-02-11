package minibar;

import static org.assertj.core.api.Assertions.*;
import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Pieter van den Hombergh {@code p.vandehombergh@gmail.com}
 */
public class GuestTest {

    @Test
    public void soberGuest() {
        double beerV = 10.0;
        double cap = 15.0;
        Beer beer = new Beer(beerV);
        Guest guest = new Guest(cap);
        guest.drink(beer);
        assertThat(guest.getFill()).isEqualTo(beerV);
    }

    @Test
    public void drunkGuest() {
        double beerV = 10.0;
        double cap = 5.0;
        Beer beer = new Beer(beerV);
        Guest guest = new Guest(cap);
        ThrowingCallable code = () -> {
            guest.drink(beer);
        };
        assertThatCode(code).isInstanceOf(DrunkenException.class);
    }
    
}
