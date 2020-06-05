public class EjercicioPila<T> {
	private T Materiales[];
	private int indice;

	    public EjercicioPila(int n) {
	        Materiales =(T[])new Object [n]; 
	    }
	 public int cantidad(){
	        return indice;
	    }
	    public void apilar(T valor)throws DesbordamientoPila{
	        if(this.llena()){
	            throw new DesbordamientoPila();
	        }
	        Materiales [indice]=valor;
	       indice ++;
	    }
	    public T sacar()throws SubDesbordamientoPila{
	        if(this.vacia()){
	            throw new SubDesbordamientoPila();
	        }
	        T esacar;
	        esacar=Materiales[indice-1];
	        indice--;
	        return esacar;
	    }
	    public boolean vacia(){
	        if(indice==0){
	            return true;
	        }
	        return false;
	    }
	    public boolean llena(){
	        if(indice==Materiales.length){
	            return true;
	        }
	        return false;
	    }
	    public int capacidad(){
	        return Materiales.length;
	    }
	  
}
