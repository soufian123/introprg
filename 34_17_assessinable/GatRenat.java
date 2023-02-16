/*
 *
 *
 *
 *aquest es el programa del gat renat on tenim tota la seva informacio guardada
 *
 */


public class GatRenat{
    public int num=0;
    public String posicio="estirat";
    private int vides=7;
    
    public void setPosicio(String text){
        if(text.equals("assegut") || text.equals("dret") || text.equals("estirat")){
			posicio = text;
		}
    }
    
	public String aixecat(){
		if (posicio.equals("dret")){
			return "no faig res";
		}
		posicio="dret";
		return "m'aixeco";
	}
	public boolean estaAssegut(){
		if (posicio.equals("assegut")){
			return true;
		}
		return false;
	}
	public String seu(){
		if (posicio.equals("assegut")){
			return "no faig res";
		}
		posicio="assegut";
		return "m'assec";
	}
	public boolean estaEstirat(){
		if (posicio.equals("estirat")){
			return true;
		}
		return false;
	}

	public String estirat(){
		if (posicio.equals("estirat")){
			return "no faig res";
		}
		posicio="estirat";
		return "m'estiro";
	}
	public boolean estaDret(){
		if (posicio.equals("dret")){
			return true;
		}
		return false;
	}
	public String mor(){
	    
	    if (vides>1){
	        vides--;
	        return "auch";
        }else if (vides==1){
            vides--;
            return "ximpún";
        }else{
            return "...";
        }
	}
	public String resuscita(int num){
	    
	    if(estaViu()){
			return "...";
		}
	    if(num<0){
			return "...";
		}
		vides = num;
		return "guai!";
	    
	}
	public String resuscita(){
	    
	    if(estaViu()){
			return "...";
		}
	    if(num<0){
			return "...";
		}
		vides++;
		return "guai!";
	    
	}
	
	
	public boolean estaViu(){
	    if (vides>0){
	        return true;
	    }else{
	        return false;
        }
    }
	
    public static void main(String[] args){
        GatRenat renat = new GatRenat();
    }
}

