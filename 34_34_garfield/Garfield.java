class Garfield extends Gat{
    public Garfield() {
        super("Garfield", 9, "estirat");
    }
    
    public String aixecat(){
        if (estaDret()) {
            return "no faig res";
        }
        if (estaAssegut()) {
            setPosicio("dret");
            return "m\'aixeco";
        }else{
            return "Bai Maitea, bai";
        }
    }
    public String estirat() {
        if (estaEstirat()) {
            return "no faig res";
        }
        if (estaAssegut()) {
            setPosicio("estirat");
            return "m\'estiro";
        }else{
            return "Bai Maitea, bai";
        }
    }
    public String seu() {
        if (estaAssegut()) {
            return "no faig res";
        }
        setPosicio("assegut");
        return "m\'assec";
    }
    @Override
    public void setVides(int novesVides) {
        if (novesVides >= 0 && novesVides<=9)  {
            super.setVides( novesVides);
        }
    }
    
}

