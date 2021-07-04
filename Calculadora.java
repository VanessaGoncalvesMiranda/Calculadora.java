import java.util.Scanner;
import java.text.NumberFormat;

// Classe Calculadora de anuncios 
public class Calculadora {

	public static void main(String[] args){
	    
		// --------------------------------------------------------------------
		// Declaracao de variaveis constantes
		// --------------------------------------------------------------------
	    
		int visualizacoesPorRealInvestido = 30; // R$ 1,00 investido = 30 visualizacoes
	    double cliquesPorCadaCemVisualizacoes = .12; // 100 visualizacoes = 12 cliques
	    double compartilhamentosParaCadaVinteCliques = .15; // 3 compartilhamentos dividido por 20 cliques  
	    int quantidadeDeCompartilhamentosEmSequencia = 4; // 1 compartilhamento geram 4 novos
	    int novasVisualizacoesParaCadaCompartilhamento = 40; // 1 compartilhamento = 40 novas visualizacoes
    	
	    // --------------------------------------------------------------------
    	// Declaracao de variaveis
	    // --------------------------------------------------------------------
	    
    	double investimento; // Valor investido em anuncios
    	double visualizacaoOriginal; // Quantidade de visualizacoes originais
    	double visualizacaoCompartilhada; // Quantidade de visualizacoes compartilhadas
    	double cliques; // Quantidade de cliques por visualizacao
    	double compartilhamentos; // Quantidade de compartilhamentos gerados por visualizacoes
    	double compartilhamentosEmSequencia; // Quantidade de compartilhamentos gerados em sequencia
    	double totalVisualizacoes; // Total de visualizacoes originais e compartilhadas
    	
        // Inicializacao da classe input
    	Scanner input = new Scanner(System.in);
       
    	// Ler a entrada de valor digitada pelo usuario
        System.out.print ("Por favor digite o valor a ser investido: R$ ");
        investimento = input.nextDouble();

        // Calculos dos investimentos e retorno de visualizacoes
        visualizacaoOriginal = (investimento * visualizacoesPorRealInvestido);
        cliques = (visualizacaoOriginal * cliquesPorCadaCemVisualizacoes);
        compartilhamentos = (cliques * compartilhamentosParaCadaVinteCliques);
        compartilhamentosEmSequencia = (compartilhamentos * quantidadeDeCompartilhamentosEmSequencia);
        visualizacaoCompartilhada = (compartilhamentosEmSequencia * novasVisualizacoesParaCadaCompartilhamento);
        totalVisualizacoes = (visualizacaoCompartilhada + visualizacaoOriginal);
        
        
        // Formatação
        NumberFormat inteiro = NumberFormat.getInstance();

        System.out.printf ("Quantidade prevista de visualizações para este "
        		+ "investimento: " + inteiro.format(totalVisualizacoes) + " visualizações.");

        
    }
    
}

