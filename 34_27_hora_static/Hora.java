/*

 * es un exercisi per aprendre el funcionamet de les referencies y les instancies

 */

public class Hora {

	/**

	 * Compara dues hores i retorna l'operador corresponent

	 * Per exemple, si hora1 és menor que hora2, l'operador serà "<". Els

	 * altres dos valors possibles són ">" i "=="

	 * @param hora1: primera hora a comparar

	 * @param hora2: segona hora a comparar

	 * @return operador resultant

	 */

	private int hores;

	private int minuts;

	private int segons;

	public Hora(){

		setHores(0);

        setMinuts(0);

        setSegons(0);

	}

	public Hora(int hores, int minuts, int segons){

		if (hores <= 0 || hores > 23 || minuts <= 0 || minuts > 59 || segons <= 0 || segons > 59) {

            setHores(0);

            setMinuts(0);

            setSegons(0);

        } else {

            setHores(hores);

            setMinuts(minuts);

            setSegons(segons);

        }

	}

	public int getHores () {return hores;}

	public int getMinuts () {return minuts;}

	public int getSegons () {return segons;}

	public void setHores(int hores){

		 if (hores >= 0 && hores < 24) {

            this.hores = hores;

        } else {

            this.hores = 0;

        }

	}

	public void setMinuts(int minuts){

		 if (minuts >= 0 && minuts < 60) {

            this.minuts = minuts;

        } else {

            this.minuts = 0;

        }

	}

	public void setSegons(int segons){

		 if (segons >= 0 && segons < 60) {

            this.segons = segons;

        } else {

            this.segons = 0;

        }

	}

	@Override

    public String toString() {

        return String.format("%d:%02d:%02d", getHores(), getMinuts(), getSegons());

    }

	public void incrementa(){

		incrementa(1);

	}

	public void incrementa(int cuants){

		int segI = getHores() * 3600 + getMinuts() * 60 + getSegons();		

		if (cuants < 0) {

            decrementa(cuants*-1);

        } else {

            cuants += segI;

            convertirAHora(cuants);

        }

	}

	public void decrementa(){

		decrementa(1);

	}

	public void decrementa(int cuants){

		int segI = getHores() * 3600 + getMinuts() * 60 + getSegons();

        if (cuants <  0) {

            incrementa(cuants * -1);

        }else if (segI < cuants) {

            cuants -= segI;

            while (cuants > 86400) {

                cuants -= 86400;

            }

            int finals = 86400 - cuants;

            convertirAHora(finals);

        } else {

            segI -= cuants;

            convertirAHora(segI);

        }

	}

	public int compareTo(Hora hora){

		int segHora1 = getHores() * 3600 + getMinuts() * 60 + getSegons();

		int segHora2 = hora.hores * 3600 + hora.minuts * 60 + hora.segons;

		if (segHora1 < segHora2){return -1;}

		if (segHora1 > segHora2){return 1;}

		return 0;

	}

    private static String composaOperadorComparacio(Hora hora1, Hora hora2) {

		int comparacio = hora1.compareTo(hora2);

		if (comparacio < 0) {

		    return "<";

		} else if (comparacio > 0) {

		    return ">";

		} else {

		    return "==";

		}

	}

	public static boolean esValida(int hores, int minuts, int segons) {

		if (hores < 24 && hores >= 0 && minuts < 60 && minuts >= 0 && segons < 60 && segons >= 0) {return true;} 

	return false;

	}

	public static int compareTo(Hora hora1, Hora hora2) {

		int segHora1 = hora1.hores * 3600 + hora1.minuts * 60 + hora1.segons;

		int segHora2 = hora2.hores * 3600 + hora2.minuts * 60 + hora2.segons;

		if (segHora1 < segHora2){return -1;}

		if (segHora1 > segHora2){return 1;}

		return 0;

	}

	public static Hora duplica(Hora hora1) {

		Hora newhora = new Hora(hora1.getHores(),hora1.getMinuts(),hora1.getSegons());

        return newhora;

	}

	public Hora duplica() {

		Hora newhora = new Hora();

        newhora.setHores(this.getHores());

        newhora.setMinuts(this.getMinuts());

        newhora.setSegons(this.getSegons());

        return newhora;

	}

	public void convertirAHora(int total) {

		int h = total / 3600;

        while (h > 23) {

            h -= 24;

        }

        setHores(h);

		setMinuts((total % 3600) / 60);

		while (getHores() > 59) {

           setHores(getHores()-60);

        }

		setSegons(total % 60);



	}

	public static void main(String[] args) {

		Hora hora1 = new Hora();

		Hora hora2 = new Hora(2, 3, 0);

		System.out.printf("Inicialment hora1: %s %s hora2: %s%n",

		        hora1,

		        composaOperadorComparacio(hora1, hora2),

		        hora2);

		System.out.println("Incrementem 1 segon a la primera i decrementem 1 segon a la segona");

		hora1.incrementa();

		hora2.decrementa();

		System.out.printf("Finalment hora1: %s %s hora2: %s%n",

		        hora1,

		        composaOperadorComparacio(hora1, hora2),

		        hora2);



	}

	

}
