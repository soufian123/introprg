/* 
 * Es el famos programa Punt que es on te totes les informacions de punt
 * es a dir, on te guardat tota la informacio del punt, les posicions, els  
 * getters, els setters i mes coses.
 *
 */

class Punt{
    private int[] coord= new int[2];
    private int x=coord[0];
    private int y=coord[1];
    
    public Punt(){}
    
    public Punt(int x,int y){
        setX(x);
        setY(y);
    }
    public int getX() { return x; }
    public int getY() { return y; }
    
    public void setY(int y){
        this.y=y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void suma(Punt p) { 
        x+=p.x;
        y+=p.y;
    }
    public String toString(){
        return ("Punt("+x+", "+y+")");
    }
}




