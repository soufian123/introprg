/*
En aquesta ocasió, desenvoluparem un programa que demani un text i el mostri codificat segons les següents instruccions:

    només codificarem les lletres entre la a i la z minúscules de l'alfabet llatí. La resta d'elements que apareguin al text, es mantindran iguals.

    la lletra z serà substituïda per la a

*/






public class CodificaBasic{
    public static void main (String[] args){
        
        
        
        System.out.println("Text?");
        String text= Entrada.readLine();
        String vocals="áéíúóàèìùòäëïöü";

        if(!text.isBlank()){
            char ch= text.charAt(0);
            String accents= "false";


            for(int num=0; num<text.length(); num++){
                ch= text.charAt(num);
                accents= "false";
                    if(text.charAt(num)=='@'){
                        System.out.print("@");
                    }else if (!(Character.isLetter(text.charAt(num)))){
                        System.out.print(ch);
                    }else if(text.charAt(num)=='z'){
                        System.out.print("a");
                    }else if(text.charAt(num)==' '){
                        System.out.print(" ");
                    
                        
                        
                    }else if(Character.isLetter(text.charAt(num)) && Character.isLowerCase(text.charAt(num))){
                        
                    for (int v=0; v<vocals.length(); v++){
                
                        if(text.charAt(num)==vocals.charAt(v)){

                            accents="true";
                            break;
                        }
                    }
                    if(accents=="true"){
                        System.out.print((char)(ch));
                    }else{
                        System.out.print((char)(ch+1));
                    }

                        }else{ 
                            System.out.print((char)(ch));
                        }
                    
            }
        }
    }
}
