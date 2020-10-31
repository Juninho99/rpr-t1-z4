package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] niz;
    private int broj_artikala;

    public Korpa() {
        niz = new Artikl[50];
        broj_artikala = 0;
    }

    public boolean dodajArtikl(Artikl a) {
        if(broj_artikala > 49)  return false;
        else
        {
            niz[broj_artikala] = new Artikl(a.getNaziv(), a.getCijena(), a.getKod());
            broj_artikala = broj_artikala + 1;
            return true;
        }
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

    public int dajUkupnuCijenuArtikala() {
        int suma = 0;
        for (int i = 0; i < broj_artikala; i++)
            suma = suma + niz[i].getCijena();
        return suma;
    }
}
