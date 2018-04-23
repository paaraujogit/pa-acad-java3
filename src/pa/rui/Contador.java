package pa.rui;

public class Contador {
    
    private static Contador contaSinngleton=null;
    public static int conta;
    
    
    private Contador(){
        
    }
    
    public static Contador getInstancia(){
    
        if(contaSinngleton==null){
            
            contaSinngleton=new Contador();
        }
        
        return contaSinngleton;
    
    }
    
    
    private void setConta(int conta){
    
        this.conta=conta;
    }
    
    public int getConta(){
    
        return this.conta;
    }

    
    public void incremento(){
    
        for(int i=0; i<3; i++){
            
            setConta(getConta()+1);
        }
    }
    
    
}
