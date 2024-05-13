public class Customers {

    private String name;
    private int money;

    public Customers(String name, int money){

        this.name = name;
        this.money = money;

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




}
