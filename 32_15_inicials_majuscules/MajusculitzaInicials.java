//Desenvolupa un programa que demani un text i mostri el mateix text amb les inicials de cada paraula en majúscules i la resta en minúscules.

//Una paraula és cada segment del text que només conté lletres que davant i darrere tenen quelcom que no sigui una lletra, o bé són la primera o darrera paraula del text.

//(modul)



public class MajusculitzaInicials{
    public static void main (String[] args){
        
        
        System.out.println("Text?");
        String text= Entrada.readLine();
        
        majusculitzaInicials(text);
        
    }
    
    public static void majusculitzaInicials(String text){
        String seguenMajuscula="false";
            if(!(text.isBlank() || text.isEmpty())){
                System.out.print(Character.toUpperCase(text.charAt(0)));
                text= text.toLowerCase();
                String espai=" ";


                for(int num=1; num<text.length(); num++){

                    if(seguenMajuscula=="true" || text.charAt(num-1)==' '){
                        System.out.print(Character.toUpperCase(text.charAt(num)));
                        seguenMajuscula="false";
                        
                    }else if(seguenMajuscula=="false"){
                    
                        if (text.charAt(num)==' ' || Character.isLetter(text.charAt(num))==false){
                            seguenMajuscula="true";
                            System.out.print(text.charAt(num));
                            
                        }else{
                            System.out.print(text.charAt(num));
                        }
                    }

                }
            }
    
    
    }
}
