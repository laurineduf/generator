package geco;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LoginGeneratorTest {


    @Test
    public void generateLoginForNomAndPrenomTest() { //CT1
        LoginService s = new LoginService(new String[] {"JROL","BPER", "CGUR", "JDU", "JRAL", "JRAL1"});
        LoginGenerator g = new LoginGenerator(s);
        assertEquals("Erreur : generator de login", "PDUR", g.generateLoginForNomAndPrenom("Durand","Paul"));
    }

    @Test
    public void CT2(){
        LoginService s = new LoginService(new String[] {"JROL","BPER", "CGUR", "JDU", "JRAL", "JRAL1"});
        LoginGenerator g = new LoginGenerator(s);
        assertEquals("Erreur: login non généré", "JRAL2", g.generateLoginForNomAndPrenom("Ralling", "John"));
    }

    @Test
    public void CT3() {
        LoginService s = new LoginService(new String[] {"JROL","BPER", "CGUR", "JDU", "JRAL", "JRAL1"});
        LoginGenerator g = new LoginGenerator(s);
        assertEquals("Erreur: login non généré", "JROL1", g.generateLoginForNomAndPrenom("Rolling", "Jean"));
    }

    @Test
    public void CT4() {
        LoginService s = new LoginService(new String[] {"JROL","BPER", "CGUR", "JDU", "JRAL", "JRAL1"});
        LoginGenerator g = new LoginGenerator(s);
        assertEquals("Erreur: login non généré", "PDUR", g.generateLoginForNomAndPrenom("Dùrand", "Paul"));
    }


}


