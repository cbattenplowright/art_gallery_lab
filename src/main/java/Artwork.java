public class Artwork {

    private String title;
    private Artist artist;
    private int price;

    public Artwork(String title, Artist artist, int price) {
        this.title = title;
        this.artist = artist;
        this.price = price;
    }

//    GETTERS AND SETTERS

    public String getTitle() {
        return this.title;
    }

    public Artist getArtist() {
        return this.artist;
    }

    public int getPrice() {
        return this.price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
