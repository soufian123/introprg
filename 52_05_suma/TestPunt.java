/* es el meu testejador del programa Punt, anira fent crides 
 * i verificant la informacio del programa Punt amb el meu testejador
 * o intentan fent totes les crides i que no falli.
 * 
*/



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
public class TestPunt {
    @Test
    public void constructor() {
        // comprova que Punt() pugui ser cridat
        new Punt();
    }
    /*
    @Test
    public void constructorXY() {
        // comprova que Punt() pugui ser cridat
        new Punt(0,0);
    }
*/
    @Test
    public void constructorDefecteXZero() {
        // comprova que Punt() deixi a 0 la propietat x de Punt
        Punt p = new Punt();
        assertEquals(0, p.getX());
    }
    @Test
    public void constructorDefecteYZero() {
        // comprova que Punt() deixi a 0 la propietat x de Punt
        Punt p = new Punt();
        assertEquals(0, p.getY());
    }
    
    @Test
    public void setX42() {
        Punt p = new Punt();
        p.setX(42);
        assertEquals(42, p.getX());
    }
    @Test
    public void setY42() {
        Punt p = new Punt();
        p.setY(42);
        assertEquals(42, p.getY());
    }
    @Test
    public void testSuma() {
        Punt p1 = new Punt();
        Punt p2 = new Punt(1, 2);
        int x = p1.getX();
        int y = p1.getY();
        p1.suma(p2);
        Assertions.assertEquals(p1.getX(), p2.getX() + x);
        Assertions.assertEquals(p1.getY(), p2.getY() + y);
    }
}
