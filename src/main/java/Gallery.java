import java.util.ArrayList;

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

    public Artwork getArtwork(Artwork artwork) {
        int artworkIndex = artworks.indexOf(artwork);
        return artworks.get(artworkIndex);
    }
}
