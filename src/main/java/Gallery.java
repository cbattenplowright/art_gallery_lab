import java.util.ArrayList;
import java.util.Objects;

public class Gallery {

    private String name;
    private int till;
    private ArrayList<Artwork> artworks;


    public Gallery(String name, int till){
        this.name = name;
        this.till = till;
        this.artworks = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getTill() {
        return this.till;
    }

    public int getArtworkCount() {
        return this.artworks.size();
    }

    public void addArtwork(Artwork artwork) {
        this.artworks.add(artwork);
    }

    public void setTill(int amount) {
        this.till = amount;
    }

    public void addToTill(int amount) {
        this.till += amount;
    }

    public void getArtworkIndex() {

    }

    public Artwork getArtwork(String artworkTitle) {
//        gets artwork from array by searching for artwork given its title
        for (Artwork artwork : artworks) {
            if (Objects.equals(artwork.getTitle(), artworkTitle)) {
                return artwork;
            }
        }
        return null;
    }
}
