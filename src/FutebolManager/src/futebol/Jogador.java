package FutebolManager.src.futebol;

public class Jogador extends JogadorBase {

	public Jogador(String nome, int idade, String posicao) {
		super(nome, idade, posicao);
	}

	@Override
	public void jogar() {
		System.out.println(nome + " está jogando como Atacante, buscando marcar gols!");
	}

	@Override
	public void treinar() {
		System.out.println(nome + "está treinando.");
	}
	
}
