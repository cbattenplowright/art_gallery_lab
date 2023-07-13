import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtworkTest {

    Artist artist;
    Artwork artwork;

    @BeforeEach
    public void setUp() {
        artist = new Artist("Van Gogh");
        artwork = new Artwork("Sunflower", artist, 100);
    }

    @Test
    public void canGetTitle() {
        assertThat(artwork.getTitle()).isEqualTo("Sunflower");

    }

    @Test
    public void canGetArtist() {
        assertThat(artwork.getArtist()).isEqualTo(artist);
    }

    @Test
    public void canGetPrice() {
        assertThat(artwork.getPrice()).isEqualTo(100);
    }

    @Test
    public void canSetTitle() {
        artwork.setTitle("Monalisa");
        assertThat(artwork.getTitle()).isEqualTo("Monalisa");

    }

    @Test
    public void canSetArtist() {
        Artist newArtist = new Artist("Monet");
        artwork.setArtist(newArtist);
        assertThat(artwork.getArtist()).isEqualTo(newArtist);
    }

    @Test
    public void canSetPrice() {
        artwork.setPrice(250);
        assertThat(artwork.getPrice()).isEqualTo(250);
    }


}
