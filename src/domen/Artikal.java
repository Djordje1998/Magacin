package domen;

public class Artikal {

	private String naziv;
	private int sifra;
	private String opis;
	private int kolicina;

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		if (!naziv.isEmpty()) {
			this.naziv = naziv;
		}
	}

	public int getSifra() {
		return sifra;
	}

	public void setSifra(int sifra) {
		if (sifra > 0) {
			this.sifra = sifra;
		}
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		if (!opis.isEmpty()) {
			this.opis = opis;
		}
	}

	public int getKolicina() {
		return kolicina;
	}

	public void setKolicina(int kolicina) {
		if (kolicina > 0) {
			this.kolicina = kolicina;
		}
	}

	@Override
	public String toString() {
		return "Artikal [naziv=" + naziv + ", sifra=" + sifra + ", opis=" + opis + ", kolicija=" + kolicina + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + kolicina;
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
		if (kolicina != other.kolicina)
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
