import java.util.ArrayList;
import java.util.Objects;

public class Gallery {

    private String name;
    private int till;
    private ArrayList<Artwork> stock;


    public Gallery(String name) {
        this.name = name;
        this.till = 0;
        this.stock = new ArrayList<>();
    }

    public void addArtwork(Artwork artwork) {
        this.stock.add(artwork);
    }

    public void addToTill(int amount) {
        this.till += amount;
    }

    public void removeFromGallery(Artwork artwork) {
        stock.remove(artwork);
    }

    public void sellArtwork(Customer customer, Artwork artwork) {
        if (customer.canBuy(artwork)) {
            customer.buyArtwork(artwork);
            removeFromGallery(artwork);
            setTill(this.till + artwork.getPrice());
        }
    }

    public boolean ArtworkInCollection(Artwork artwork) {
        return stock.contains(artwork);
    }

    //    GETTERS and SETTERS
    public String getName() {
        return this.name;
    }

    public int getTill() {
        return this.till;
    }

    public void setTill(int amount) {
        this.till = amount;
    }

    public int getArtworkCount() {
        return this.stock.size();
    }

    public int getCollectionValue() {
        int total = 0;
        for (Artwork artwork : stock) {
            total += artwork.getPrice();
        }
        return total;
    }
}
