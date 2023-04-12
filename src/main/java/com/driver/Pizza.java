package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean extracheese;
    private boolean extratoppings;
    private boolean paperbag;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg) this.price = 300;
        else this.price = 400;
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        if(!extracheese){
            extracheese = true;
            this.price += 80;
        }
    }

    public void addExtraToppings(){
        if(!extratoppings){
            extratoppings= true;

            if(this.isVeg) this.price += 70;
            else this.price += 120;
        }
    }

    public void addTakeaway(){
        if(!paperbag){
            paperbag = true;

            this.price += 20;
        }
    }

    public String getBill(){
        if(this.isVeg){
            this.bill = "Base Price Of The Pizza: " +300;
        }
        else this.bill = "Base Price Of The Pizza: " +400;

        if(extracheese) this.bill += "\n" + "Extra Cheese Added: "+80;

        if(extratoppings){
            if(this.isVeg) this.bill += "\n" + "Extra Toppings Added: "+70;
            else  this.bill += "\n" + "Extra Toppings Added: "+120;
        }

        if(paperbag) this.bill += "\n" + "Paperbag Added: "+20;

        this.bill += "\n" + "Total Price: " + this.price +"\n";
        return this.bill;
    }
}
