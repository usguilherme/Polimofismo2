package GestaoDeVeiculos.src.model;

public class Veiculo {
	protected String marca;
	protected String modelo;
	
	public Veiculo(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public String exibirDetalhes() {
		StringBuilder sb = new StringBuilder();
		sb.append("Marca do carro: ").append(this.marca).append("\n");
		sb.append("Modelo do carro: ").append(this.modelo);
		return sb.toString();
	}

	public String getMarca() {return marca;}

	public void setMarca(String marca) {this.marca = marca;}

	public String getModelo() {return modelo;}

	public void setModelo(String modelo) {this.modelo = modelo;}
	
	
	
	
}
