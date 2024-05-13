import java.util.ArrayList;

public class Gallery {

    private String name;
    private int till;
    private ArrayList<Artwork> stock;

    public Gallery(String name){
        this.name = name;
        this.till = 0;
        this.stock = new ArrayList<>();

    }

    public String getName () {
       return this.name;

    }


    public int getTill (){
        return this.till;

    }

    public void setTill (int amount){
        this.till = amount;
    }

    public void addToStock(Artwork painting){
        this.stock.add(painting);
    }


    // purchase(some painting name){
    // do a for loop, if the paining name is in the stock then do till
    // + paining cost and
    // do customer wallet - painting cost


    //
    //
    //
    //
    //
    // }

    public void purchaseArtwork(String artworkName, Customers customer){

        for (Artwork artwork : stock){ //for each artwork in the galleries collection
            //if the artwork title matches what the customer wants, then take the artworks price away from the customers wallet
            // and add it to the galleries till
            if (artwork.getTitle().equals(artworkName)){
                this.till += artwork.getPrice();
                customer.setMoney(customer.getMoney() - artwork.getPrice());
                customer.customersartcollection.add(artwork);
                stock.remove(artwork);
            }
        }






    }

    public int stockTake(){
        int sum = 0;
        for (Artwork artwork:stock){
            sum += artwork.getPrice();

        }

        return sum;
    }


}
