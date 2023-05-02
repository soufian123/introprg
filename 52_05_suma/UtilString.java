/* 
* utilitats de programes anteriors (en moduls)  UtilString
* miniprogrames dels exercicis usats
*/
public class UtilString{

	
//et diu si es true o fals les vocals, es a dir, revisa el char(la lletra) que li entra si coincideix en la lletra en una de les vocals que hi ha asignat en el String vocal, retorna un true, en el cas de que no ho sigui retorna un false
    public static boolean esVocal(char inicial){
        String vocal= "aeiouàèéíïòóúüAÀEÈÉIÍÏOÒÓUÚÙÜ";
            
            for(int num=0; num<vocal.length(); num++){
                if( inicial==vocal.charAt(num)){
                    return true;
                }
            }
            return false;
    }
	
//agafa totes les lletres
    public static String nomesLletres(String text){
        String lletres="";
        int fin=0;
        if (lletres==","){
            lletres="";
            return lletres;
        }
        for(int num=text.length()-1; num>=0; num--){
            if (Character.isLetter(text.charAt(num))){
                fin=num;
                num=0;
            }
        }
        for(int num=0; num<=fin; num++){
            if (Character.isLetter(text.charAt(num))){
                lletres = lletres + text.charAt(num);
            }
        }
        return lletres;
    }
    
//separa les lletres en ", " y la ultima la deixa sense ", "
    public static String lletresSeparades(String nomesLletres){
        String separat="";
        if (nomesLletres==","){
            separat=" ";
            return separat;
        } 
        if (nomesLletres.isBlank()){
            separat="";
            return separat;
        }
        for(int num=0; num<nomesLletres.length()-1; num++){
            if (Character.isLetter(nomesLletres.charAt(num))){
                separat = (separat + nomesLletres.charAt(num)+", ");
            }
            
        }
        separat = separat + nomesLletres.charAt(nomesLletres.length()-1);
    return separat;
    
    }
	
	
/* Utilitats de confirmació
	 *
	 * Aquest mòdul conté diferents utilitats per gestionar les confirmacions
	 * Bé, de moment només en tenim una però potser anirem ampliant-ho
	 */
	// public class UtilitatsConfirmacio {

    /*
     * Donada una resposta textual, aquesta funció tradueix la resposta a
     * un booleà.
     * Considera true quan la resposta és, independentment de majúscules i
     * sense considerar espais a l'inici ni al final,
     * "sí", "s", "yes" o "y", i algunes variants amb errors ortogràfics.
     * Altrament considera false.
     */
    public static boolean respostaABoolean(String resposta) {
        if (null == resposta) {     // si la resposta és null, la donem com a false
            return false;
        }
        resposta = resposta.toLowerCase();
        if (resposta.equals("s") || resposta.equals("y")) {
            return true;
        }
        if (resposta.equals("sí") || resposta.equals("yes")) {
            return true;
        }
        if (resposta.equals("si") || resposta.equals("vale") || resposta.equals("yeah")) {
            return true;
        }
        return false;
    }
//}
	
	public static String intervalString(String text, int inici, int fin){
        String resultat="";
        if (fin<0 && inici<0 && fin<inici){
            fin=-fin+inici-1;
            inici=0;
        }
        if (fin<0 && inici<0 && fin>inici){
            fin=-inici+fin-1;
            inici=0;
        }
        if (inici<0){
            inici=0;
        }
        if (fin<0){
            fin=-fin-2;
        }
        if ((text.length()-1)<inici){
            inici=text.length()-1;
        }
        
        if (fin>text.length()-1){
            fin= text.length()-1;
        }
        
        if(inici<=fin){
        
            for(int num=inici; num<=fin; num++){

                resultat= resultat + text.charAt(num);

            }
        
        }else if (fin<inici){
            for(int num=inici; num>=fin; num--){
                    
                resultat= resultat + text.charAt(num);
                    
            }
        }
        return resultat;
    }
	
	
	    public static boolean esEnter(String text){

        for(int num=0; num<=(text.length()-1); num++){
            if (text.charAt(num) == ','){
                return false;
            }
            if (text.charAt(num) == ',' || text.charAt(num) == ' ') {
				return false;
			}
            if(Character.isLetter(text.charAt(num))){
                return false;
            }
        }
        if(text.isEmpty()) {
            return false;
        }
        return true;
        
        
    }


    public static String cadenaContinua(String text, int cops){
        
        String sortida="";
        if (cops>=0){
            int numero=0;
            for(int num=0; num<cops; num++){
                
                if (numero<text.length()){
                }else{
                    numero=0;
                }
                
                sortida= sortida + text.charAt(numero);
                numero= numero+1;
            }
        }
        return sortida;

    }
    

    public static String entreComes(int[] numeros, char separador){

        String text="";
        int v=1;
        String valor="";
        for(int q=0; q<numeros.length; q++){
            System.out.println("Valor "+v+"?");
            valor = Entrada.readLine();
            while (!(esEnter(valor))){
                System.out.println("Per favor, un valor enter");
                valor= Entrada.readLine();
            }
            
            
            
            numeros[q] = Integer.parseInt(valor);
            v++;

        }
        text= text+numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            
            text= text+ separador +" " + numeros[i];

        }
        return text;  
    }
        
	
}
