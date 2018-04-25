package pa.rui;
import pa.hugo.Conta;

import java.util.Scanner;

public class Cartoes {

    int tipo;
    Conta c1,c2;
    int op;
    Contador numero;
    
    Scanner teclado=new Scanner(System.in);

    public Cartoes() {

            do{   
                System.out.println("Menu Tipo de Cartão");
                System.out.println("1 - Debito");
                System.out.println("2 - Credito");
                System.out.println("Insira a Opcao : ");
                op=teclado.nextInt();

                switch(op){

                    case 1: this.numero=numero.getInstancia();
                            this.numero.incremento();
                            this.setTipo(op);
                            System.out.println("Cartao de Debito Criado com o numero "+numero.getContador());
                            break;

                    case 2: this.numero=numero.getInstancia();
                            this.numero.incremento();
                            this.setTipo(op);
                            System.out.println("Cartao de Credito Criado com o numero "+numero.getContador());
                            break;

                    default:System.out.println("A opcao inserido é invalida");
                }
                }while(op!=1 || op!=2);   
    
    
        }
    
    
    
    
     public void transferencia (Conta c1, Conta c2){
        
        double valor=0;
        int op;
        
           /* System.out.println("Menu de Transferencia (Seleccione o tipo de cartão)");
            System.out.println("1-Debito");
            System.out.println("2-Credito");
            op=teclado.nextInt();*/
            
            op=this.getTipo();
            
            switch (op){
                
                case 1:
            
                    System.out.println("Qual a Quantia que pretende transferir da Conta "+c1.getNumeroConta()+"Para a Conta "+c2.getNumeroConta());
                    valor=teclado.nextDouble();

                    if(valor>c1.getSaldo()){

                        System.out.println("A conta "+c1.getNumeroConta()+"Não tem dinheiro suficiente para efectuar a transferência");

                    }
                    else {

                        c1.setSaldo(c1.getSaldo()-=valor);
                        c2.setSaldo(c2.getSaldo()+=valor);

                        System.out.println("Status das Contas");
                        System.out.println("Conta "+c1.getNumeroConta()+" : ");
                        System.out.println("Proprietario "+c1.getProprietario()+"\n\n");


                        System.out.println("Conta "+c2.getNumeroConta()+" : ");
                        System.out.println("Proprietario "+c2.getProprietario()+"\n\n");

                    }
                    break;
                
                
                case 2:
                    
                    System.out.println("Qual a Quantia que pretende transferir da Conta "+c1.getNumeroConta()+"Para a Conta "+c2.getNumeroConta());
                    valor=teclado.nextDouble();
                    
                    if(valor>((c1.getSaldo())+500){

                        System.out.println("A conta "+c1.getNumeroConta()+"Não tem dinheiro suficiente para efectuar a transferência");

                    }
                    
                    else {

                        c1.setSaldo(c1.getSaldo()-=valor);
                        c2.setSaldo(c2.getSaldo()+=valor);

                        System.out.println("Status das Contas");
                        System.out.println("Conta "+c1.getNumeroConta()+" : ");
                        System.out.println("Proprietario "+c1.getProprietario()+"\n\n");


                        System.out.println("Conta "+c2.getNumeroConta()+" : ");
                        System.out.println("Proprietario "+c2.getProprietario()+"\n\n");

                    }
                    
                    break;
                    
                default:;

                     
                    
            }
            
            
    }
     
    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
        
        
    
    
    
    
    
}
