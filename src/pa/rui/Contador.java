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
    
    
    private void setContador(int conta){
    
        this.conta=conta;
    }
    
    public int getContador(){
    
        return this.conta;
    }

    
    public void incremento(){
    
        for(int i=0; i<3; i++){
            
            setContador(getContador()+1);
        }
    }
    
    
}
