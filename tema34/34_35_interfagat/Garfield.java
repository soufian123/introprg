
/*
 * aquest archiu Garfield es una herencia de la classe base anomenada Gat i es te com a implenets l' AnimalDeCompanyia.
 * Cada objecte de gat té un nom, vides i pot realitzar accions com ara mirar les seves vides, canviarles i defnir el nom.
 * pero en Garfield es un altre tipos de gat comparat amb altres exercicis, ara es com en renat, pero menys educat
 * no ens deixa estimarlo molt amb el seu metode deixatEstimar
 *
 *
 */


class Garfield extends Gat implements AnimalDeCompanyia {
    public Garfield() {
        super("Garfield");
    }
    @Override
    public String deixatEstimar(){
        return "em deixo estimar, però només una mica";
    }
    /*public Garfield() {
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
    */
    
}

