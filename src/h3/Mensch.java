package h3;

public class Mensch {
	int gebJahr= 0;
	int alter = 0;
	String name = "Chris";
	
	public void setName(String a) {
		name = a;
	}
	public void setGebJahr(int a) {
		gebJahr = a;
	}
	public void setAlter() {
		alter = 2025-gebJahr;
	}
	public String getName() {
		return name;
	}
	public int getAlter() {
		return alter;
	}
	public int getGebJahr() {
		return gebJahr;
	}
}
