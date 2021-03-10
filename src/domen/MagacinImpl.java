package domen;

import java.util.LinkedList;

import interfejs.MagacinInterface;

public class MagacinImpl implements MagacinInterface {

	private LinkedList<Artikal> artikli = new LinkedList<Artikal>();

	// dodavanje artikala u magacin (novog artikla ili povećanje količine postojećeg artikla)

	@Override
	public void dodajArtikal(Artikal artikal) {
		if (artikal != null) {
			if (artikli.contains(artikal)) {
				for (Artikal art : artikli) {
					if (art.getSifra() == artikal.getSifra()) {
						artikal.setKolicina(artikal.getKolicina() + 1);
						return;
					}
				}
			} else {
				artikli.add(artikal);
			}
		} else {
			throw new RuntimeException("Artikal ne moze biti null!");
		}
	}

	// izbacivanje artikala iz magacina (samo za smanjenje količine artikla)

	@Override
	public void izbaciArtikal(Artikal artikal) {
		if (artikal != null && artikli.contains(artikal)) {
			for (Artikal art : artikli) {
				if (art.getSifra() == artikal.getSifra()) {
					if (artikal.getKolicina() > 0) {
						artikal.setKolicina(artikal.getKolicina() - 1);
						return;
					} else {
						throw new RuntimeException("Ima 0 komada trazenog artikla!");
					}
				}
			}
		} else {
			throw new RuntimeException("Artikal ne postoji u listi ili je null!");
		}

	}

	// pronalaženje (i vraćanje) informacija o artiklu preko šifre (tačne šifre).

	@Override
	public Artikal pronadjiArtikal(int sifra) {
		if (sifra > 0) {
			for (Artikal artikal : artikli) {
				if (artikal.getSifra() == sifra) {
					return artikal;
				}
			}
			throw new RuntimeException("Nema artikla sa zadatom sifrom");
		} else {
			throw new RuntimeException("Sifra ne moze biti nula");
		}
	}

}
