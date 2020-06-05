import java.util.Iterator;
import java.util.Random;

public class Materiales {

	public static void main(String[] args) {
		
		int cont=0,cont3=0,cont2=0,c=0,cont4=0,cont5=0,t=0;
		boolean ban=false,ban2=false,ban3=false,ban4=false,ban5=false;
		//Creacion de pilas
		  EjercicioPila<Integer>PilaM=new<Integer>EjercicioPila(30);
		  EjercicioPila<Integer>PilaR=new<Integer>EjercicioPila(30);
		  EjercicioPila<Integer>PilaH=new<Integer>EjercicioPila(30);
		  //LLenado de las pilas
		  try {
		  for (int i =0 ; i < 30; i++) {
			int madera=(0);
			int Resina=(1);
			int Hilo=(2);
			PilaM.apilar(madera);
			PilaR.apilar(Resina);
			PilaH.apilar(Hilo);
		  }
		  }catch(DesbordamientoPila err) {
			  System.out.println(err.getMessage());
		}
		 try {
			 //Crear Mesa
			 if(PilaM.cantidad()>=4) {
				 
					int e=PilaM.sacar();
					e=PilaM.sacar();
					e=PilaM.sacar();
					e=PilaM.sacar();
				  ban=true;
				  t++;
			 }else {
				 ban=false;
			 }
			 for (int i = 30; i >0; i--) {
				
			 //crear el baston
			 if(ban=true&&PilaM.cantidad()>=2) {
				 int p2=PilaM.sacar();
				 p2=PilaM.sacar();
				 ban2=true;
				 cont++;
			 }else {
				 ban2=false;
			 }
			 if(ban=true&&PilaH.cantidad()>=4&&PilaR.cantidad()>=1) {
				 int p3=PilaH.sacar();
				 p3=PilaH.sacar();
				 p3=PilaH.sacar();
				 p3=PilaH.sacar();
				 ///
				 int p4=PilaR.sacar();
				 ban3=true;
				 
				 cont2++;
			 }else {
				 ban3=false; 
			 }
			 if(ban==true&&ban2==true&&ban3==true) {
				 	c++;	
			 }
			 if(ban=true&&PilaM.cantidad()>=5) {
				 int p5=PilaM.sacar();
				 p5=PilaM.sacar();
				 p5=PilaM.sacar();
				 p5=PilaM.sacar();
				 p5=PilaM.sacar();
				 ban5=true;
				 cont4++;
			 }else {
				 ban5=false;
			 }
			 }
		 }catch(SubDesbordamientoPila err) {
			 System.out.println(err.getMessage());
		 }
		 	System.out.println("Mesa adquirida "+ t);
		 	System.out.println("Baston adquirido "+cont);
		 	System.out.println("Cuerda adquiridab "+cont2);
		 	System.out.println("Cana adquiridab "+c);
		 	System.out.println("Barco adquirido "+cont4);
		 	System.out.println();
			System.out.println("Madera restante "+PilaM.cantidad());
			System.out.println("Hilo restante "+PilaH.cantidad());
			System.out.println("Resina restante "+PilaR.cantidad());
	}

}
