/*
 *
 *
 *
 *
 *
 */



class EsserViu{
    public boolean estaViu(){
        if(getVides()<1){
            return false;
        }
        return true;
    }
    
    public String mor(){
        String text;
        if (estaViu()) {
            text= "adéu món cruel";
        }else{
            text="ja l'he espifiada";
        }
        Gat.setVides(0);
        return text;
    }
    
    public String ressulcita(){
        String text;
        if (estaViu()) {
            text= "encara miolo";
        }else{
            text="guai!";
            setVides(7);
        }
        
        return text;
    }
    
    
    
}



 

