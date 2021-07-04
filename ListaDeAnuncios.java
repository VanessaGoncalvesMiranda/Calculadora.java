import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;



public class ListaDeAnuncios {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
		ArrayList<Anuncios> Anuncios = new ArrayList();
		
		boolean rodando = true;
		
		while (rodando) {
		
			System.out.println ("[1] Cadastrar an�ncio");
			System.out.println ("[2] Listar todos an�ncios cadastrados");
			System.out.println ("[3] Procurar an�ncio por cliente");
			System.out.println ("[4] Atualizar dados de um an�ncio");
			System.out.println ("[5] Remover an�ncio");
			System.out.println ("[6] Sair");
			System.out.print ("Digite a op��o: ");
			String opcao = scanner.nextLine();
	
	
			switch (opcao) 
			{
		
				case "1": 
				{
					System.out.println("CADASTRO DE AN�NCIO");
					
					
					System.out.print ("Digite o cliente: ");
					String cliente = scanner.nextLine();		
					System.out.print ("Digite o an�ncio: ");
					String anuncio = scanner.nextLine();
					System.out.print ("Digite a data inicial: ");
					String dataInicial = scanner.nextLine();		
					System.out.print ("Digite a data final: ");
					String dataFinal = scanner.nextLine();
					System.out.print ("Digite o  investimento: ");
					String investimento = scanner.nextLine();
					
																
					Anuncios a = new Anuncios ();
					a.setCliente (cliente);
					a.setAnuncio (anuncio);
					a.setDataInicial (dataInicial);
					a.setDataFinal (dataFinal);
					a.setInvestimento (investimento);
						
					Anuncios.add(a);
					
										
					break;
				}
			
				
				case "2": 
				{
					System.out.println("AN�NCIOS CADASTRADOS");
					for (int i = 0; i < Anuncios.size(); i++)
					{
						
						Anuncios aTemp = Anuncios.get(i);
						System.out.println("An�ncio " + i);
						System.out.println("\tCliente: " + Anuncios.get(i).getCliente());
						System.out.println("\tAnuncio: " + Anuncios.get(i).getAnuncio());
						System.out.println("\tDataInicial: " + Anuncios.get(i).getDataInicial());
						System.out.println("\tDataFinal: " + Anuncios.get(i).getDataFinal());
						System.out.println("\tInvestimento: " + Anuncios.get(i).getInvestimento());
					}
					break;
				}
				
				
				case "3":
				{
					System.out.println("PROCURAR AN�NCIO POR T�TULO");
					System.out.print("Digite o nome do an�ncio: ");
					String anuncio = scanner.nextLine();
					
					boolean encontrado = false;
					for (int i = 0; i < Anuncios.size(); i++) 
					{
						
						Anuncios aTemp = Anuncios.get(i);
						
						if (anuncio.equals(aTemp.getAnuncio())) 
						{
							System.out.println("An�ncio encontrado");
							System.out.println("\tCliente: " + Anuncios.get(i).getCliente());
							System.out.println("\tAnuncio: " + Anuncios.get(i).getAnuncio());
							System.out.println("\tDataInicial: " + Anuncios.get(i).getDataInicial());
							System.out.println("\tDataFinal: " + Anuncios.get(i).getDataFinal());
							System.out.println("\tInvestimento: " + Anuncios.get(i).getInvestimento());
							encontrado = true;
							break;
						}
					
						if (!encontrado)
						{
							System.out.println("N�o foi encontrado nenhum an�ncio com esse t�tulo");
						}
						
						break;
					}	
				}
				
					
				case "4":
				{
					System.out.println("ATUALIZA��O DE VIG�NCIA DO AN�NCIO");
					
					for (int i = 0; i < Anuncios.size(); i++) 
					{
						
						Anuncios aTemp = Anuncios.get(i);
						
						System.out.println("[" + i + "]" + aTemp.getCliente() + " - " + aTemp.getAnuncio() + " - " +
								aTemp.getDataInicial() + " - " + aTemp.getDataFinal());
					}
					
					System.out.println("Digite o valor de refer�ncia: ");
					int referencia = scanner.nextInt();
					scanner.nextLine();
					
					System.out.print("Digite a nova data final: ");
					String novaDataFinal = scanner.nextLine();
										
					Anuncios a = Anuncios.get(referencia);
					a.setDataFinal(novaDataFinal);
										
					break;
				}
			
				
				case "5":
				{
					System.out.println("REMOVER USU�RIO");
					
					for (int i = 0; i < Anuncios.size(); i++) 
					{
						
						Anuncios aTemp = Anuncios.get(i);
						
						System.out.println("[" + i + "]" + aTemp.getCliente() + " - " + aTemp.getAnuncio() + " - " +
								aTemp.getDataInicial() + " - " + aTemp.getDataFinal());
					}
					
					System.out.println("Digite o valor de refer�ncia: ");
					int referencia = scanner.nextInt();
					scanner.nextLine();
					
					Anuncios.remove(referencia);
					
					break;
				}
				
				case "6": 
				{
					rodando = false;
					break;
				}
			
			}
			
		}
	}
}