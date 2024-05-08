package ecommerce;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import ecommerce.controller.EcommerceController;
import ecommerce.model.EcommerceCadastro;
import ecommerce.model.EcommercePedidos;
import ecommerce.model.EcommerceProdutos;
import ecommerce.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		EcommerceController ecommerce = new EcommerceController();
		
		Scanner scanner = new Scanner(System.in);
		
		String produto, cliente, email, telefone;
		int opcao, pedido, codigoItem;
		float valor;
		
		System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND
				+ "*****************************************************");
		System.out.println("                                                     ");
		System.out.println("                JAVA ELETRO                          ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.println("                                                     ");
		System.out.println("            1 - Criar Cadastro                       ");
		System.out.println("            2 - Listar Itens               	     ");
		System.out.println("            3 - Buscar Código do Item                ");
		System.out.println("            4 - Atualizar Dados de Cadastro          ");
		System.out.println("            5 - Excluir Cadastro                     ");
		System.out.println("            6 - Formas de Pagamento                  ");
		System.out.println("            7 - Cancelar Pedido                      ");
		System.out.println("            8 - Consultar Pedido                     ");
		System.out.println("            9 - Sair                                 ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.println("Entre com a opção desejada:                          ");
		System.out.println("                                                     " + Cores.TEXT_RESET);

	try {
		opcao = scanner.nextInt();
	} catch (InputMismatchException e) {
		System.out.println("\nDigite valores inteiros!");
		scanner.nextLine();
		opcao = 0;
	}

	if (opcao == 9) {
		System.out.println(Cores.TEXT_WHITE_BOLD + "\nJAVA ELETRO - A gente descomplica tecnologia pra você!");
		sobre();
		scanner.close();
		System.exit(0);
	}

	switch (opcao) {
	case 1:
		System.out.println(Cores.TEXT_WHITE + "Criar Cadastro\n\n");
		
		System.out.println("Digite o nome do titular: ");
			cliente = scanner.nextLine();
			scanner.skip("\\R?"); //para permitir que o comando nextLine() leia palavras compostas. Lembre-se que o titular possui pelo menos nome e um sobrenome.
			cliente = scanner.nextLine();
			System.out.println("Digite o e-mail do titular: ");
			email = scanner.nextLine();
			System.out.println("Digite um telefone para contato: ");
			telefone = scanner.nextLine();
			
		keyPress();
		break;
	case 2:
		System.out.println("\nListar todas os produtos");

	case 3:
		System.out.println(Cores.TEXT_WHITE + "Consultar código do produto - por número\n\n");
		
		keyPress();
		break;
	case 4:
		System.out.println(Cores.TEXT_WHITE + "Atualizar dados de cadastro\n\n");

        keyPress();
		break;
	case 5:
		System.out.println(Cores.TEXT_WHITE + "Excluir Cadastro\n\n");
		keyPress();
		break;
	case 6:
		System.out.println(Cores.TEXT_WHITE + "Consultar formas de pagamento\n\n");
		
		keyPress();
		break;
	case 7:
		System.out.println(Cores.TEXT_WHITE + "Cancelar pedido\n\n");
			

		keyPress();
		break;
	case 8:
		System.out.println(Cores.TEXT_WHITE + "Consultar pedido\n\n");
		
		keyPress();
		break;
	default:
		System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);

		keyPress();
		break;
	}
}

public static void sobre() {
System.out.println("\n*********************************************************");
System.out.println("Projeto Desenvolvido por: Ellen Silva");
System.out.println("Generation Brasil - ellen.silva@genstudents.org");
System.out.println("github.com/ellenmape");
System.out.println("*********************************************************");
}

public static void keyPress() {

try {

	System.out.println(Cores.TEXT_RESET + "\nPressione Enter para Continuar...");
	System.in.read();

} catch (IOException e) {

	System.out.println("Você pressionou uma tecla diferente de enter!");

}

}


}

