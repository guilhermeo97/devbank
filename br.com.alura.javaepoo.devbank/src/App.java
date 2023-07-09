import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String nome = "Guilherme Oliveira";
        String tipoConta = "Conta corrente";
        double saldo = 1599.99;
        int opcao = 0;

    
        System.out.println("********************");
        System.out.println("Titutalr da conta: " + nome);        
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("********************");


        String menu = """
                Operações

                1 - Consultar saldos
                2 - Receber valor
                3 - Transferir valor
                4 - Sair

                Digite o número da operação desejada
                """;

        while(opcao != 4){
            System.out.println(menu);        
            opcao = sc.nextInt();

            switch(opcao){
            case 1:
                System.out.println("O saldo atual é R$" + saldo);
            break;
            case 2:
                System.out.println("Qual o valor desejado: ");
                double valor = sc.nextDouble();
                if (valor > saldo){
                    System.out.println("O seu saldo é insuficiente");
                } else{
                    saldo -= valor;
                    System.out.println("Saldo atual: " + saldo);
                }
                break;
                case 3:
                    System.out.println("Valor recebido");
                    double receberValor = sc.nextDouble();
                    saldo += receberValor;
                    System.out.println("Saldo atual: " + saldo);
                break;
                case 4:
                    System.out.println("Você saiu com sucesso");
                break;
                default:
                    System.out.println("Informe uma operação válida"); 
                    
                break;
            }
        }

        

        sc.close();
    }

}
