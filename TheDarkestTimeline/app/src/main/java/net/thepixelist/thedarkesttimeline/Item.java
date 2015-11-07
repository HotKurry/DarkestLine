package net.thepixelist.thedarkesttimeline;

/**
 * Created by Matt on 11/6/2015.
 */
public class Item {

    private String itemName;
    private int ID;

    public Item(String  a, int b){

        this.itemName = a;
        this.ID = b;

    }

    public String getName(){
        return this.itemName;
    }

    public int getID(){
        return this.ID;
    }

    public void changeName(String a){
        this.itemName = a;
    }

    public void changeID(int b){
        this.ID = b;
    }



}
