public class Artwork {

    private String title;
    private Artist artist; // Why don't we need to do Artist artist = new Artist();
    private int price;

    public Artwork(String inputTitle,int inputPrice, Artist inputArtist){

        this.title = inputTitle;
        this.price = inputPrice;
        this.artist = inputArtist;



    }


    public String getTitle(){
        return this.title;
    }

    public void setTitle(String inputTitle){
        this.title = inputTitle;
    }

    public String getArtist(){
        return this.artist.getName();
    }

    public int getPrice(){
        return this.price;
    }

    public void setPrice(int amount){
        this.price = amount;
    }





}
