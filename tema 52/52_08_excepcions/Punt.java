/* 
 * Es el famos programa Punt que es on te totes les informacions de punt
 * es a dir, on te guardat tota la informacio del punt, les posicions, els  
 * getters, els setters i mes coses.
 *
 */

class Punt{
    private int[] coord= new int[2];
    
    public Punt(){}
    
    public Punt(int x,int y){
        setX(x);
        setY(y);
    }
    public int getX() { return coord[0]; }
    public int getY() { return coord[1]; }
    
    public void setY(int y){
        if (y<0) throw new IllegalArgumentException("a nostra classe Punt només admeti coordenades positives");

        this.coord[1]=y;
    }
    public void setX(int x){
        if (x<0) throw new IllegalArgumentException("a nostra classe Punt només admeti coordenades positives");
        this.coord[0] = x;
    }
    public void suma(Punt p) { 
        coord[0]+=p.coord[0];
        coord[1]+=p.coord[1];
    }
    public String toString(){
        return ("Punt("+coord[0]+", "+coord[1]+")");
    }
}




