package telefonia;

import java.util.Scanner;

public class Telefonia {

    private int numPosPago;
    private int numPrePago;
    private PrePago[]prePago;
    private PosPago[]posPago;

    public Telefonia(int pos, int pre, PrePago[] prePago, PosPago[] posPago){
        this.numPosPago = pos;
        this.numPrePago = pre;
        this.posPago = posPago;
        this.prePago = prePago;
    }


    public static void main(String[] args){
        
        int opcao;
        Scanner entrada = new Scanner(System.in);

        System.out.println("\tMenu da Telefonia");
        System.out.println("0. Sair");
        System.out.println("1. Cadastrar assinante");
        System.out.println("2. Listar assinante");
        System.out.println("3. Fazer chamada");
        System.out.println("4. Fazer recarga");
        System.out.println("5. Imprimir fatura");
        System.out.println("6. Localizar pré pagp");
        System.out.println("7. Localizar pós pago");
        System.out.println("Opcao: ");
        
        do{
            opcao = entrada.nextInt();
            
            switch(opcao){
            case 1:
                
                break;
                
            case 2:
                
                break;
                
            case 3:
               
                break;
                
            case 4:
                
                break;

            case 5:
                
                break;

            case 6:
                
                break;

            case 7:
               
                break;
            
            default:
                System.out.println("Opção inválida.");
            }
        } while(opcao != 0);
    }
}
