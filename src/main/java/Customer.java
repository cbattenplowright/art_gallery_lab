public class Customer {

    private String name;
    private int wallet;

    public Customer (String name, int wallet){
        this.name = name;
        this.wallet = wallet;
    }

    public String getName(){
        return this.name;
    }

    public int getWallet(){
        return this.wallet;
    }

    public void setWallet(int number){
        this.wallet = number;
    }
    
    public void subtractWallet(int amount) {
        this.wallet -= amount;
    }
    
    
}
