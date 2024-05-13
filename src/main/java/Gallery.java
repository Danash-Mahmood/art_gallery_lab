import java.util.ArrayList;

public class Gallery {

    private String name;
    private int till;
    private ArrayList<Artwork> stock;

    public Gallery(String name,int till, ArrayList<Artwork> stock){
        this.name = name;
        this.till = 0;
        this.stock = stock;
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



}
