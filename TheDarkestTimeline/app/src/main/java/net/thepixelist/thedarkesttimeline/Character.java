package net.thepixelist.thedarkesttimeline;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by Matt on 11/6/2015.
 */
public class Character {

    private String name;
    private int x, y;
    private int location[] = {x,y};
    private List<Item> inventory;

    public Character(String n, int a, int b){

        this.name = n;
        a = this.x;
        b = this.y;
        inventory = new ArrayList<Item>();

    }

    public void move(int a, int b){
        this.x = this.x + a;
        this.y = this.y + b;

    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public String getName(){
        return this.name;
    }

    /*
    adds an item to the end of the characters inventory
    */
    public void addItem(Item i){
        inventory.add(inventory.size()-1, i);
    }



}
