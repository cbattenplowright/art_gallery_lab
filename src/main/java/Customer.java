import java.util.ArrayList;

public class Customer {

    private String name;
    private int wallet;
    private ArrayList<Artwork> artCollection;

    public Customer(String name, int wallet) {
        this.name = name;
        this.wallet = wallet;
        this.artCollection = new ArrayList<>();
    }

    public boolean canBuy(Artwork artwork) {
//        We pass in the artwork object as an argument to access its methods
        return this.wallet >= artwork.getPrice();
//        ABOVE is simplified version of
//        if (wallet >= artwork.getPrice()){
//          return true;
//        }
//        return false;
    }

    public void buyArtwork(Artwork artwork) {
        this.wallet -= artwork.getPrice();
        artCollection.add(artwork);
    }

    public boolean isArtworkInCollection(Artwork artwork) {
        return artCollection.contains(artwork);
    }

//    GETTERS AND SETTERS

    public String getName() {
        return this.name;
    }

    public int getWallet() {
        return this.wallet;
    }

    public void setWallet(int number) {
        this.wallet = number;
    }

}
