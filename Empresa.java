import java.util.Scanner; //Importando o Scanner 

public class Empresa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Instanciando o objeto Scanner



        //escolha qual o seu cargo
        System.out.println("Escolha o tipo de pessoa a cadastrar:");
        System.out.println("1. Vendedor");
        System.out.println("2. Gerente");
        System.out.println("3. Cliente");
        System.out.print("Digite o número da opção: ");
        int escolha = scanner.nextInt();

        scanner.nextLine(); // Consumir a quebra de linha


        //Variaveis iniciais
        String nome;
        String cpf;
        String dataNasc;


        //Instanciamento das variaveis com o scanner
        System.out.print("Nome: ");
        nome = scanner.nextLine();
        
        System.out.print("CPF: ");
        cpf = scanner.nextLine();
        scanner.nextLine(); // Consumir a quebra de linha
        
        System.out.print("Data de Nascimento: ");
        dataNasc = scanner.nextLine();

        

        //Escolha o cargo
        switch (escolha) {
            case 1:
                // Cadastrar Vendedor
                System.out.print("Data de Contratação: ");
                String dataContratacaoVendedor = scanner.nextLine();
                System.out.print("Salário Base: ");
                int salarioBaseVendedor = scanner.nextInt();
                System.out.print("Percentual de Comissão: ");
                float percentualComVendedor = scanner.nextFloat();

                Vendedor vendedor = new Vendedor(nome, cpf, dataNasc, dataContratacaoVendedor, salarioBaseVendedor, percentualComVendedor);
                System.out.println("\nCadastro de Vendedor realizado com sucesso!");
                vendedor.status();
                break;

            case 2:
                // Cadastrar Gerente
                System.out.print("Data de Contratação: ");
                String dataContratacaoGerente = scanner.nextLine();
                System.out.print("Salário Base: ");
                int salarioBaseGerente = scanner.nextInt();
                scanner.nextLine(); // Consumir a quebra de linha
                System.out.print("Departamento: ");
                String departamentoGerente = scanner.nextLine();

                Gerente gerente = new Gerente(nome, cpf, dataNasc, dataContratacaoGerente, salarioBaseGerente, departamentoGerente);
                System.out.println("\nCadastro de Gerente realizado com sucesso!");
                gerente.status();
                break;

            case 3:
                // Cadastrar Cliente
                System.out.print("Email: ");
                String emailCliente = scanner.nextLine();
                System.out.print("Número do Cartão: ");
                int numeroCartao = scanner.nextInt();
                System.out.print("Telefone: ");
                int telefoneCliente = scanner.nextInt();

                Cliente cliente = new Cliente(nome, cpf, dataNasc, emailCliente, numeroCartao, telefoneCliente);
                System.out.println("\nCadastro de Cliente realizado com sucesso!");
                cliente.status();
                break;

            default:
                System.out.println("Opção inválida! Tente novamente.");
                break;
        }

        
        scanner.close(); // Fechar o scanner
    }
}