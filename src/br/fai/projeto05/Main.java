package br.fai.projeto05;

public class Main {

	public static void main(String[] args) {
		
		Main app = new Main();
		app.start();

	}

	private void start() {
		
		System.out.println("enviando esta branch para repositorio");
		
		for (int i = 0; i < 5; i++) {
			
			switch(i) {
			case 1:
				System.out.println("Primeira condicao");
			break;
			
			case 2:
				System.out.println("Segunda condicao");
			break;
			
			case 3:
				System.out.println("Não há condicao");
			break;
			}
		}
	}

}
