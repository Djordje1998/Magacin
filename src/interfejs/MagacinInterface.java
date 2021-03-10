package interfejs;

import java.util.LinkedList;

import domen.Artikal;

public interface MagacinInterface {

	// dodavanje artikala u magacin (novog artikla ili povećanje količine postojećeg artikla)
	public void dodajArtikal(Artikal artikal);
	
	// izbacivanje artikala iz magacina (samo za smanjenje količine artikla)
	public void izbaciArtikal(Artikal artikal);
	
	// pronalaženje (i vraćanje) informacija o artiklu preko šifre (tačne šifre).
	public Artikal pronadjiArtikal(int sifra);
	
}
