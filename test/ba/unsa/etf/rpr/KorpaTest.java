package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {
    private static Korpa korpa;

    @BeforeEach
    void setUp(){
        korpa = new Korpa();
    }

    @Test
    void testPunaKorpaArtikala() {
        Artikl a = new Artikl("arr", 123, "JA");

        for(int i = 0; i < 50; i++)
            korpa.dodajArtikl(a);

        assertEquals( false, korpa.dodajArtikl(a));
    }

    @Test
    void testDajUkupnuCijenuArtikala() {
        Artikl a = new Artikl("arr", 10, "JA");

        for(int i = 0; i < 10; i++)
            korpa.dodajArtikl(a);

        assertEquals( 100, korpa.dajUkupnuCijenuArtikala());
    }

    @Test
    void testIzbaciArtikalSaKodom() {
        Artikl a = new Artikl("arr", 10, "JA");

        for(int i = 0; i < 10; i++)
            korpa.dodajArtikl(a);

        assertEquals("JA", korpa.izbaciArtiklSaKodom("JA").getKod());
    }

}