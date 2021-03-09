package domen;

public class Artikal {
	
	private String naziv;
	private int sifra;
	private String opis;
	private int kolicija;
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	public int getKolicija() {
		return kolicija;
	}
	public void setKolicija(int kolicija) {
		this.kolicija = kolicija;
	}
	@Override
	public String toString() {
		return "Artikal [naziv=" + naziv + ", sifra=" + sifra + ", opis=" + opis + ", kolicija=" + kolicija + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + kolicija;
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + ((opis == null) ? 0 : opis.hashCode());
		result = prime * result + sifra;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artikal other = (Artikal) obj;
		if (kolicija != other.kolicija)
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (opis == null) {
			if (other.opis != null)
				return false;
		} else if (!opis.equals(other.opis))
			return false;
		if (sifra != other.sifra)
			return false;
		return true;
	}
	
	

}
