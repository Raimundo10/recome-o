//JESUS CRISTO
package texto;



import java.text.ParseException;
import java.text.SimpleDateFormat;

import entidade.Comentario;
import entidade.Poste;

public class Progt {

	public static void main(String[] args) throws ParseException{
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comentario c1=new Comentario(" JOAO MARIA E JOSE \n") ;
		Comentario c2=new Comentario(" RAIMUNDO ANA HAYSSA") ;
		
	    Poste      p1=new Poste(sdf.parse ("21/06/2018 15:05:44 "),
	    		                " Jesus Cristo",
	    		                " Igreja Mundial do Poder de Deus ",
	    		                12);
	    p1.addComentario(c1);
	    p1.addComentario(c2);  
	    
	    System.out.println(p1);
	}

}
