import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtistTest {

    Artist artist;

    @BeforeEach
    public void setup() {
        artist = new Artist("Picasso");
    }

    @Test
    public void canGetName() {
        assertThat(artist.getName()).isEqualTo("Picasso");
    }

    @Test
    public void canSetName() {
        artist.setName("Van Gogh");
        assertThat(artist.getName()).isEqualTo("Van Gogh");
    }
}
