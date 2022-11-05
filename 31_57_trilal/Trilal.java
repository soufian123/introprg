
//Trilal
/*
...................9...................
..................898..................
.................78987.................
................6789876................
...............567898765...............
..............45678987654..............
.............3456789876543.............
............234567898765432............
...........12345678987654321...........
..........0123456789876543210..........
.........9...................9.........
........898.................898........
.......78987...............78987.......
......6789876.............6789876......
.....567898765...........567898765.....
....45678987654.........45678987654....
...3456789876543.......3456789876543...
..234567898765432.....234567898765432..
.12345678987654321...12345678987654321.
0123456789876543210.0123456789876543210
*/


public class Trilal {
    public static void main (String[] args){
    
        //primer triangle
        for(int lin=9; lin>=0; lin--){
        System.out.print(lin+ "    ");
            //punts esquerra
            int punts= lin+9;
            for(int col=0; col<=punts; col++){
                System.out.print(".");
            }
            //escriu numeros creixents
            for(int col=lin; col<=9; col++){
                System.out.print(col);
            }    
            //escriu numeros decreixents
            for(int col=8; col>=lin; col--){
                System.out.print(col);
            }
            //punts dreta
            for(int col=0; col<=punts; col++){
                System.out.print(".");
            }
            System.out.println();
        }
        
        //segon triangle amb el tercer
        for(int lin=9; lin>=0; lin--){
            System.out.print(lin+ "    ");
            int punts= lin-1;
            int puntsMedio=lin+10;            
        
            //punts esquerra
            for(int col=0; col<=punts; col++){
                System.out.print(".");
            }
            //escriu numeros creixents
            for(int col=lin; col<=9; col++){
                System.out.print(col);
            }    
            //escriu numeros decreixents
            for(int col=8; col>=lin; col--){
                System.out.print(col);
            }
            //punts medio
            for(int col=lin*2; col>=0; col--){
                System.out.print(".");
            }
            //escriu numeros creixents
            for(int col=lin; col<=9; col++){
                System.out.print(col);
            }    
            //escriu numeros decreixents
            for(int col=8; col>=lin; col--){
                System.out.print(col);
            }
            //punts esquerra
            for(int col=0; col<=punts; col++){
                System.out.print(".");
            }
            System.out.println();
        }
    }
}
