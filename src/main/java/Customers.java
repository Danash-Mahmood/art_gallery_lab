import java.util.ArrayList;

public class Customers {

    private String name;
    private int money;
    public ArrayList<Artwork>customersartcollection;

    public Customers(String name, int money){

        this.name = name;
        this.money = money;
        this.customersartcollection= new ArrayList<>();

    }

    public String getName(){
        return this.name;
    }

    public int getMoney(){
        return this.money;
    }

    public void setMoney(int amount){
        this.money = amount;
    }

    public ArrayList<Artwork> getCustomersartcollection() {
        return this.customersartcollection;
    }
}
