package net.thepixelist.thedarkesttimeline;

/**
 * Created by Matt on 11/6/2015.
 */
public class Node {

    // the x axis location
    private int x;
    // the y axis location
    private int y;
    // can you go east/west/north/south
    // true = passable, false = locked
    private boolean[] dir;

    public Node(int x, int y, boolean[] directions){
        this.x = x;
        this.y = y;
        dir = directions;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void unlock(int x){
        dir[x] = true;
    }

    public void lock(int x){
        dir[x] = false;
    }


}
