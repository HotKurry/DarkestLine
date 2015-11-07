package net.thepixelist.thedarkesttimeline;
import java.util.Map;

/**
 * Created by Matt on 11/6/2015.
 */
public class Area {

    private Node[][] map1;
    private int xmax;
    private int ymax;

    public Area (int xmax, int ymax){
        map1 = new Node[xmax][ymax];
        this.xmax = xmax;
        this.ymax = ymax;
    }

    public void addLocale(Node entry){

        this.map1[entry.getX()][entry.getY()] = entry;

    }

    public void clear(){
        int l;
        for(int i = 0; i < xmax; i++){
            for(int j = 0; j < ymax; j++){
                this.map1[i][j] = null;
            }
        }
        this.xmax = 0;
        this.ymax = 0;
    }

}
