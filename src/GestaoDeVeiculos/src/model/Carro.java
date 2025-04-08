package GestaoDeVeiculos.src.model;

public class Carro extends Veiculo implements Movel {

	public Carro(String marca, String modelo) {
		super(marca, modelo);
	}

	
	@Override
	public void mover() {
		System.out.println("O carro está se movendo");
		
	}

	@Override
	public void ligar() {
		System.out.println("O carro está ligado");
		
	}
	
}
