package model;

public class Main {

	public static void main(String[] args) {
		NavioCargueiro c1 = new NavioCargueiro();
		Capitao cap1 = new Capitao();
		cap1.setNome("Renato");
		c1.setCapitao(cap1);
		System.out.println(cap1);
	}
}
