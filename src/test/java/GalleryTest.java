import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    Gallery gallery;
    Artist picasso;
    Artist monet;
    Artist vanGogh;
    Artwork galenas;
    Artwork candidas;
    Artwork perk;

    @BeforeEach
    public void setUp() {
        gallery = new Gallery("The Louvre");
        picasso = new Artist("Picasso");
        monet = new Artist("Monet");
        vanGogh = new Artist("Van Gogh");
        galenas = new Artwork("Galenas", picasso, 500);
        candidas = new Artwork("Candidas", monet, 300);
        perk = new Artwork("Perk", vanGogh, 100);
        gallery.addArtwork(galenas);
        gallery.addArtwork(candidas);
        gallery.addArtwork(perk);
    }

    @Test
    public void canGetName() {
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
    public void isArtworkInCollection(){
        assertThat(gallery.ArtworkInCollection(galenas)).isEqualTo(true);
    }

    @Test
    public void canSellArtwork() {
        Customer customer = new Customer("Bob Geldof", 20000);
        gallery.sellArtwork(customer, galenas);
//        You can write multiple asserts to test if a complex method has succeeded
        assertThat(gallery.ArtworkInCollection(galenas)).isEqualTo(false);
        assertThat(gallery.getTill()).isEqualTo(500);
        assertThat(customer.getWallet()).isEqualTo(19500);
        assertThat(customer.isArtworkInCollection(galenas)).isEqualTo(true);
    }

    @Test
    public void canCalculateCollectionValue() {
        assertThat(gallery.getCollectionValue()).isEqualTo(900);
    }

}
