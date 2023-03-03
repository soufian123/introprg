/*
 * es un picarol que la seva funcio es contar quans cops ha sonat i escriure "clink-clink" quan soni.
 * 
 * 
 * 
 */



public class Picarol{
    private int cops=0;
    public void sona(){
        cops++;
        System.out.println("clink-clink");
    }
    public int quantsCops(){
        return cops;
    }
}
