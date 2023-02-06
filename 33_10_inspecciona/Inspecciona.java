

/*
 *
 *Desenvolupa un programa que consideri els arguments de línia de comanda com si fossin camins del 
 *sistema de fitxer.
 *
 *Per cada argument, comprovarà si correspon a un camí existent.
 */


import java.io.File;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Inspecciona{
	public static void main(String[] args) throws IOException{
		if (args.length>-1){
			for (int num=0; num<args.length; num++){
			
				String cami = args[num];
				File fitxer = new File(cami);

				String argument = "Processant argument: " + cami;
				System.out.println(argument);
				for (int n=0; n<argument.length(); n++){
					System.out.print("=");
				}
				
				System.out.println();
				System.out.println();
				
		    	if (!fitxer.exists()) {
				    System.out.println("no trobat");
				} else {
				
				    if(fitxer.canRead()){
						System.out.print("r");
					} else {
						System.out.print("-");
					}
					
					
					if(fitxer.canWrite()){
						System.out.print("w");
					} else {
						System.out.print("-");
					}
					
					
					if(fitxer.canExecute()){
						System.out.print("x");	
					} else {
						System.out.print("-");
					}
					
					
					if (fitxer.isDirectory()){
						String[] informacio = fitxer.list();
						Arrays.sort(informacio);
						if (informacio.length<1){
							System.out.println("directori buit");
						} else {
							System.out.print("directori que conté: ");
							for (int a=0; a<informacio.length; a++){
								System.out.print(informacio[a]);
								if (informacio.length-1 != a) {
								    System.out.print(", ");
							    }
							}
						}
						
						System.out.println();
					}
					
					if (fitxer.isFile()){
						if (fitxer.length()>0){
							System.out.print("fitxer de mida en bytes: ");
							System.out.print(fitxer.length());
							System.out.println();
							
							if (cami.contains(".txt") || cami.contains(".java")){
								System.out.println("Amb els informacio:");
								BufferedReader input = new BufferedReader(new FileReader(fitxer));
								while (true) {
									String linia = input.readLine();
									if (null == linia) break;
									System.out.println("|" + linia + "|");
								}
								input.close();
							}
						
						} else {
                        	System.out.println("fitxer buit");
						}
						System.out.println();
					}
				}
			}
		}
	}
}
