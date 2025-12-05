import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String nomeCliente = "Elielson Cantão";
        String tipoConta = "Corrente";
        Double saldo = 25.0;

        Double valorInput = 0.0;
        int operacao = 0;

        String template = """

                ****************************
                Dados Iniciais do cliente
                ****************************

                Nome: %s
                Tipo conta: %s
                Saldo Atual: R$%.2f

                ****************************
                Operações:

                ****************************
                1- Consultar saldo;
                2- Receber valor;
                3- Transferir valor
                4- Sair
                ****************************

                """.formatted(nomeCliente,tipoConta,saldo);



                while (operacao != 4) {
                    System.out.println(template);
                    System.out.println("Digite a opção desejada:");
                    operacao = sc.nextInt();

                    if (operacao >= 1 && operacao <= 4 ) {
                        switch (operacao) {
                            case 1:
                                System.out.println("Salto atual: R$%.2f".formatted(saldo));
                                break;
                            case 2:
                                //CAPTURA ENTRADA
                                System.out.println("Informe o valor a receber:");
                                valorInput = sc.nextDouble();

                                // REALIZA A SOMA
                                saldo += valorInput;

                                //IMPRIME
                                System.out.println("Salto atual: R$%.2f".formatted(saldo));
                                break;
                            case 3:
                                //CAPTURA ENTRADA
                                System.out.println("Informe o valor que deseja transferir:");
                                valorInput = sc.nextDouble();

                                if (valorInput > saldo) {
                                    System.out.println("Não é possivel realizar transferência. Seu saldo é insuficiente.");
                                }else {
                                    // REALIZA OPERAÇAO 
                                    saldo -= valorInput;
                                    //IMPRIME
                                    System.out.println("Salto atual: R$%.2f".formatted(saldo));
                                
                                }
                                break;
                            case 4:
                                System.out.println("4- Saindo");
                                break;

                            default:
                                System.out.println("Operação não permitida");
                                break;
                        }

                    }else {
                        System.out.println("""
                            ****************************
                            Operação invalida!
                            ****************************
                                """);
                        System.out.println(template);
                        System.out.println("Digite a opção desejada:");
                        operacao = sc.nextInt();
                    }
                }
    }
}
