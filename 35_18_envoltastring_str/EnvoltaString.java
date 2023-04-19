/*
 * es el usa envolta string un programa que ho envolta a 
 * string sense mirar les majuscules ni minuscules
 *
 */



public class EnvoltaString {
    private String valor;

    public EnvoltaString(String valor) { this.valor = valor; }


    public boolean equals(EnvoltaString altre) {
        return valor.equalsIgnoreCase(altre.valor);
    }
    @Override
     public String toString() { return String.format("ENVOLTAT(\"%s\")", valor); }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof EnvoltaString) {  // si ja ni tant sols és ni un EnvoltaString malament
            EnvoltaString altre = (EnvoltaString) obj;
            return valor.equalsIgnoreCase(altre.valor);
        }
        return false;
    }
}
