package klokapp;

public class Teller {
	private int maximum, waarde;
	private float x, y, breedte, hoogte;

	public Teller(int maximum, float x, float y, float breedte) {
		this.maximum = maximum;
		this.x = x;
		this.y = y;
		this.breedte = breedte;
		this.hoogte = breedte * 0.8f;
	}

	public void tik() {
		waarde = (waarde + 1) % maximum;
	}

	public void tekenTeller() {
		KlokApp.klokapp.rectMode(KlokApp.CENTER);
		KlokApp.klokapp.noStroke();
		KlokApp.klokapp.fill(0);
		KlokApp.klokapp.rect(x, y, breedte, hoogte);

		KlokApp.klokapp.fill(255, 0, 0);
		KlokApp.klokapp.textSize(hoogte);
		KlokApp.klokapp.textAlign(KlokApp.CENTER);
		float verschuiving = (KlokApp.klokapp.textAscent() - KlokApp.klokapp.textDescent()) / 2;
		KlokApp.klokapp.text(getTijdNotatie(), x, y + verschuiving);
	}

	// region - Getters & setters
	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getBreedte() {
		return breedte;
	}

	public void setBreedte(float breedte) {
		this.breedte = breedte;
	}

	public float getHoogte() {
		return hoogte;
	}

	public void setHoogte(float hoogte) {
		this.hoogte = hoogte;
	}

	public String getTijdNotatie() {
		if (waarde < 10) {
			return "0" + waarde;
		} else {
			return "" + waarde;
		}
	}

	public int getWaarde() {
		return waarde;
	}

	public void setWaarde(int waarde) {
		if (waarde >= 0 && waarde < maximum) {
			this.waarde = waarde;
		}
	}
}
