package aula01.parte01_DBImplementacao;

/**
 * @CamadaDeNeg�cio do relatorio
 * de reservas fechadas ou abertas, que depende de um banco de dados.
 * 
 * @Princ�pioDeFavorecimentoDaComposi��oSobreHeran�a
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confec��o do arranjo entre as classes envolvidas
 * do designer em espec�fico, nesse exemplo se programa para IMPLEMENTA��O.
 */
public class RelatorioReserva {
	private MySqlConnection connection;
	
	public RelatorioReserva() {
		connection = new MySqlConnection();
	}
	
	public void GeracaoDeRelatorio() {
		connection.connect();
		System.out.println("L�gica de neg�cios - Gera��o de relat�rio");
	}
}