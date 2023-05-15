/*
 * es el usa envolta string un programa que ho envolta a 
 * string sense mirar les majuscules ni minuscules
 *
 */



public class EnvoltaString {
    private String valor;

    public EnvoltaString(String valor) { this.valor = valor; }
    public String toString() { return String.format("ENVOLTAT(\"%s\")", valor); }

    public boolean equals(EnvoltaString altre) {
        return valor.equalsIgnoreCase(altre.valor);
    }
}
