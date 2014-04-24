package ar.edu.utn.frba.dds.corrector.CorrectorParciales;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;  


public class TestParciales {
	
	private static final String String = null;
	public Examen examen;
	Collection<PreguntaYRespuesta> preguntasYRespuestas = new ArrayList<PreguntaYRespuesta>();
	

	@Before

public void crearExamen(){
		
		
		PreguntaYRespuesta primerPregunta = new VerdaderoOFalso('V','V',5);
		PreguntaYRespuesta segundaPregunta = new MultipleChoice(1,1,5);
		PreguntaYRespuesta tercerPregunta = new PreguntaConcreta("A","A",5);

		preguntasYRespuestas.add(primerPregunta);
		preguntasYRespuestas.add(segundaPregunta);
		preguntasYRespuestas.add(tercerPregunta);
		
		this.examen= new Examen(preguntasYRespuestas);


	}
	@Test 
	public void Test()
	{		double resultado = examen.calcularNotaCriterioReglaDeTresSimple();
				assertTrue( resultado == 10);  
		
	}


	
}
