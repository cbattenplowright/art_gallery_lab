import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    Gallery gallery;

    @BeforeEach
    public void setUp(){
        gallery = new Gallery("The Louvre", 5000);
        Artwork galenas = new Artwork ("Galenas", new Artist("Picasso"), 500);
        Artwork candidas = new Artwork ("Candidas", new Artist ("Monet"), 300);
        Artwork perk = new Artwork ("Perk", new Artist("Vladimir"), 100);
        gallery.addArtwork(galenas);
        gallery.addArtwork(candidas);
        gallery.addArtwork(perk);
    }

    @Test
    public void canGetName(){
        assertThat(gallery.getName()).isEqualTo("The Louvre");
    }

    @Test
    public void canGetTill() {
        assertThat(gallery.getTill()).isEqualTo(5000);
    }

    @Test
    public void canAddArtworkToGallery() {
        Artwork artwork = new Artwork("Tree at night", new Artist("Van Gogh"), 200);
        gallery.addArtwork(artwork);
        assertThat(gallery.getArtworkCount()).isEqualTo(4);
    }

    @Test
    public void canSetTill() {
        gallery.setTill(1000);
        assertThat(gallery.getTill()).isEqualTo(1000);
    }

    @Test
    public void canAddToTill() {
        gallery.addToTill(100);
        assertThat(gallery.getTill()).isEqualTo(5100);
    }

    @Test

    public void canBuyArtwork() {
        // TODO Final bit of MVP
        //Get price of artwork from arraylist
        //Substract price from customers wallet
        //Add price to the galleries till
        Customer customer = new Customer("Bob", 2000);
        Artwork artwork = gallery.getArtwork("galenas");
        int priceOfArtwork = artwork.getPrice();
        gallery.addToTill(priceOfArtwork);
        customer.subtractWallet(priceOfArtwork);
    }
}
