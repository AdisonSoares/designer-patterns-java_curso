package aula02.parte06_FlowGridContainerNovaFuncionalidadeOtimizadaHerancaComposicao_;

/**
 * @Classe criada para implementar uma caracteristica solida
 * de Borda.
 * 
 * @Princ�pioDeFavorecimentoDaComposi��oSobreHeran�a
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confec��o do arranjo entre as classes envolvidas
 * do designer em espec�fico, nesse exemplo se programa para INTEFACE.
 * 
 * @autor Adison
 */
public class BordaSolida implements IBorda{

	@Override
	public void gerarBorda() {
		System.out.println("Contem uma borda solida ao redor");
		
	}

}