package aula05.parte04Facade_FachadaAplicacao;


/**
 * @Facade vem de fachada, uma interface que unifica
 * um conjunto de interfaces ou subsistemas, define
 * uma interface de n�vel mais alto, tornando o 
 * subsistema mais f�cil de ser utilizado por um cliente,
 * � criado  para simplificar o uso das classes, a fa�ade 
 * referencia todo o subsitema.
 *
 * @Objetivo desse designe pattern � facilitar o uso dos 
 * subsistemas interligados com o cliente, ou seja, 
 * deixar a liga��o do cliente com as classes dependetes 
 * mais flexivel criando uma classe intermediaria entre
 * o cliente e o subsitema de classes que � o fa�ade que
 * vai agregar todos os comportamentos do subsistema, 
 * tendo uma comunica��o apenas com a inteface cliente por
 * meio de delega��o.
 *
 * @AcoplamentoFraco
 * O fa�ade facilita o uso de toda a interface, tornando o 
 * acomplamento, de todos os codigos clientes com o subsistema,
 * mais fraco. Fraco acoplamento � um dos principios de bons 
 * projetos de desenvolvimento principalmente
 * para reuso de classes e ter uma melhor manuten��o.
 *
 * @ConhecimentoMinimo lei de Dem�trio ou n�o fale com estranhos
 * previne a cria��o de designers que possuem um grande n�mero 
 * de classes acopladas dessa forma mudan�as em uma parte 
 * do sistema n�o � refletido para outras partes.
 *
 * @ConsideracoesDoPrincipio
 * Dado um objeto a partir de qualquer metodo desse objeto devemos 
 * invocar metodos que perten�am apenas ao proprio objeto, diminuindo a
 * quantidade de classes envolvidas. Ao fazer a manuten��o ou mudan�a
 * n�o gera o efeito de cascateamento, afetando outras classes ou m�todos.
 * 
 * @Ideal � usar esse principio do conhecimento minimo em interfaces
 * inst�veis, quando tenho uma grande probabilidade de mudan�as.
 *
 * @SignificadoDeOverride 
 * Uma referencia que indica a sobrescrita de m�todo herdado de
 * uma super classe, caso edite o nome da assinatura da classe 
 * ela perde a refer�ncia.
 */
public class Produto {
	private int id;
	private String nome;
	private double preco;
	
	public Produto(int id, String nome, double preco) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return "Product ID....: "+this.id+"\n"+
				"Product name....: "+this.nome+"\n"+
				"Product price....: "+this.preco+"\n";
	}	
}
