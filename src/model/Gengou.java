package model;

public class Gengou {
	private int gengou;
	private int nen;

	public Gengou(int gengou, int nen) {
		this.gengou = gengou;
		this.nen = nen;
	}

	public String getGengou() {
		switch(gengou){
		case 1:
			return "昭和";
		case 2:
			return "平成";
		case 3:
			return "令和";
		default:
			return 0 + "";
		}
	}

	public void setGengou(int gengou) {
		this.gengou = gengou;
	}

	public int getNen() {
		switch(this.gengou){
		case 1:
			return 1926 + nen - 1;
		case 2:
			return 1989 + nen  - 1;
		case 3:
			return 2019 + nen - 1;
		default:
			return 0;
		}
	}

	public void setNen(int nen) {
		this.nen = nen;
	}


}
