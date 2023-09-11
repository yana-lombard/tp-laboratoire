import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SourisTest {
    @Test
    public void testGetAge() {
        Souris sourisTest = new Souris(10, "Grise", 5);
        int ageSourisTest = sourisTest.getAge();
        assertEquals("test age", 5,  ageSourisTest);

    }
}
