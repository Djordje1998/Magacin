package domen;

import java.util.LinkedList;

import interfejs.MagacinInterface;

public class MagacinImpl implements MagacinInterface {

	private LinkedList<Artikal> artikli = new LinkedList<Artikal>();
	
	@Override
	public void dodajArtikal(Artikal artikal) {
		if(artikli.contains(artikal)) {
			for (Artikal art : artikli) {
				if(art.getSifra()==artikal.getSifra()) {
					artikal.setKolicina(artikal.getKolicina()+1);
					return;
				}
			}
		}
		
	}
	
	@Override
	public void izbaciArtikal(Artikal artikal) {
		if(artikli.contains(artikal)) {
			for (Artikal art : artikli) {
				if(art.getSifra()==artikal.getSifra()) {
					if(artikal.getKolicina()>0) {
						artikal.setKolicina(artikal.getKolicina()-1);
					}
				}
			}
		}

	}
	

	@Override
	public Artikal pronadjiArtikal(int sifra) {
		if(sifra>0) {
			for (Artikal artikal : artikli) {
				if(artikal.getSifra()==sifra) {
					return artikal;
				}
			}
		}
		return null;
	}

}
