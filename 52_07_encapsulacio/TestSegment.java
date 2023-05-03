/* es el meu testejador del programa Punt, anira fent crides 
 * i verificant la informacio del programa Punt amb el meu testejador
 * o intentan fent totes les crides i que no falli.
 * 
*/


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
public class TestSegment {


    @Test
    public void constructorPerDefecte() {
        Segment segment = new Segment();
        Assertions.assertAll(
            () -> Assertions.assertEquals(0, segment.getP1().getX()),
            () -> Assertions.assertEquals(0, segment.getP1().getY()),
            () -> Assertions.assertEquals(0, segment.getP2().getX()),
            () -> Assertions.assertEquals(0, segment.getP2().getY())
        );
    }
    @Test 
    public void constructorEspecific() {
        Segment segment = new Segment(new Punt(1, 2), new Punt(3, 4));
        Assertions.assertAll(
            () -> Assertions.assertEquals(1, segment.getP1().getX()),
            () -> Assertions.assertEquals(2, segment.getP1().getY()),
            () -> Assertions.assertEquals(3, segment.getP2().getX()),
            () -> Assertions.assertEquals(4, segment.getP2().getY())
        );
    
    }
    
    @Test
    public void testTongitud() {
        Segment segment = new Segment();
        double longitud = segment.longitud();
        assertEquals(0,longitud);
    }
}
    

