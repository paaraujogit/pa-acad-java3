package src.calc.RuiDuarte;
public class OpFactRuiD implements InOfCal {
    
    int factorial;
   
   /* @Override
    public double mul(double val1, double val2) {
        
    }*/
    

    

    @Override
    public double fact(int val1) {
        
       for( int i=val1; i>=1;i--){
           if(i==1){
               this.factorial=1;
           }
           else {
               //factorial=mul(factorial, i);
               this.factorial*=i;  
           }
           }
       return this.factorial;
       }


        
        
    }
    
    
   
   
