/*
 *
 *
 *
 *
 *aquest es el programa del gat renat on tenim tota la seva informacio guardada
 *
 */


public class GatRenat{
    public String aixecat(){return "m'aixeco";}
    public String seu (){return "m'assec";}
    public int num=0;
    public String estirat(){
        if(num==0){
            num++;
            return "m'estiro";
            
        }else{
            return "no faig res";
        }
        
    }
    public static void main(String[] args){
        GatRenat renat = new GatRenat();
    }
}

