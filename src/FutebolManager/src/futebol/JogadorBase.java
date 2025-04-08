package FutebolManager.src.futebol;

public class JogadorBase implements JogadorInterface{
	protected String nome;
	protected int idade;
	protected String posicao;
	
	public JogadorBase(String nome, int idade, String posicao) {
		this.nome = nome;
		this.idade = idade;
		this.posicao = posicao;
	}

	@Override 
	public void jogar() {
		StringBuilder sb = new StringBuilder();
		sb.append("O jogador: ").append(this.nome).append(" está jogando como ").append(this.posicao).append(".");
		System.out.println(sb);
	}

	@Override
	public void treinar() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.nome).append(" está treinando, ").append("e tem ").append(this.idade).append(" anos de idade.");
	}
	
	@Override
	public void marcarGol() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.nome).append(" marcou um gol");
		
	}
	
}
