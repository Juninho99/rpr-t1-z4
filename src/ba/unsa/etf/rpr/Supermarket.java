package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] niz;
    private int broj_artikala;

    public Supermarket() {
        niz = new Artikl[1000];
        broj_artikala = 0;
    }

    public void dodajArtikl(Artikl a) {
        niz[broj_artikala] = new Artikl(a.getNaziv(), a.getCijena(), a.getKod());
        broj_artikala = broj_artikala + 1;
    }

    public Artikl[] getArtikli() {
        return niz;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl pom = null;
        for (int i = 0; i < broj_artikala; i++)
        {
            if(kod.equals(niz[i].getKod()))
            {
                pom = niz[i];
                int j;
                for (j = i; j < broj_artikala-1; j++)
                {
                    niz[j] = niz[j+1];
                }
                niz[j] = null;
                broj_artikala = broj_artikala - 1;
                break;
            }
        }
        return pom;
    }
}
