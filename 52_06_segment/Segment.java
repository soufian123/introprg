/* 
 * Es el famos programa Segment que es on te totes les informacions de punt
 * es a dir, on te guardat tota la informacio del punt, les posicions, els  
 * getters, els setters i mes coses.
 *
 */

class Segment{
    private Punt p1 = new Punt();
    private Punt p2 = new Punt();
    
    public Segment(Punt p1, Punt p2){
        setP1(p1);
        setP2(p2);
    }
    public Punt getP1() { return p1; }
    public Punt getP2() { return p2; }
    
    public void setP1(Punt p1){
        this.p1=p1;
    }
    public void setP2(Punt p2){
        this.p2 = p2;
    }
    
    public double Longitud (){
        return Math.sqrt(Math.pow(p1.getX()-p2.getX(), 2) + Math.pow(p1.getY()-p2.getY(), 2));
    }
    
    
    public String toString(){
        return String.format("Segment(Punt(%d, %d), Punt(%d, %d))", p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }
}

