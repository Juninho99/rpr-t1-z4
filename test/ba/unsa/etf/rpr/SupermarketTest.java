package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {
    private static Supermarket supermarket;

    @BeforeEach
    void setUp() {
        supermarket = new Supermarket();
    }

    @Test
    void testDodavanjeArtikla() {
        Artikl a = new Artikl("ttt", 101, "22");

        supermarket.dodajArtikl(a);

        assertEquals(1,supermarket.getBroj_artikala());
    }

    @Test
    void testIzbaciArtikalSaKodom() {
        Artikl a = new Artikl("arr", 10, "JA");

        for(int i = 0; i < 10; i++)
            supermarket.dodajArtikl(a);

        assertEquals(10, supermarket.izbaciArtiklSaKodom("JA").getCijena());
    }

}