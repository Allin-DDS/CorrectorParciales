package ar.edu.utn.frba.dds.corrector.CorrectorParciales;
import java.util.ArrayList; 
import java.util.Collection;


public class Examen{
	
	Collection<PreguntaYRespuesta> preguntasYRespuestas = new ArrayList<PreguntaYRespuesta>();
	
	public void añadirPregunta(PreguntaYRespuesta preguntaYRespuesta){
		preguntasYRespuestas.add(new PreguntaYRespuesta());

}

public Examen(Collection<PreguntaYRespuesta> preguntasYRespuestas){
	this.preguntasYRespuestas=preguntasYRespuestas;
}




public double calcularNotaCriterioReglaDeTresSimple(){ //Lo calcula usando la regla de 3 simple
	double puntajeTotal = this.puntajeTotalDePregunta();
	double puntajeAlumno = this.puntajeTotalDelAlumno();
	double laNota = 0;
	laNota = (puntajeAlumno*10)/puntajeTotal;
	return(laNota);
	}

public int calcularNotaCriterioTablaDeConvenciones(){ //Usando tabla de convenciones
	int laNota = 0;
	int numero = this.puntajeTotalDePregunta() - this.puntajeTotalDelAlumno();
	switch(numero){
	case 0 : 
		laNota = 10; 	
		break;
	case 1 :
		laNota = 8;
		break;
	case 2 : 
		laNota = 6;
		break;
	case 3: 
		laNota = 4;
		break;	
	 default: 
		 laNota = 2;
		break;
	}
	 return laNota;

}

public int calcularNotaCriterioRestandoNpuntos(){ //Retando n puntos
	
	int puntosARestar = this.puntajeTotalDePregunta() - 10; 
	return (this.puntajeTotalDelAlumno()-puntosARestar);
}

public double calcularNotaCriterioMaximo(){ //Usando criterio 1, 2 y 3 saca el maximo
return (Math.max( this.calcularNotaCriterioReglaDeTresSimple(),  Math.max( this.calcularNotaCriterioTablaDeConvenciones(), this.calcularNotaCriterioRestandoNpuntos())));
	
}

public double calcularNotaCriterioPromedio(){ //Usando criterio 1, 2 y 3 saca un promedio

	
	double laNota = (this.calcularNotaCriterioReglaDeTresSimple()+this.calcularNotaCriterioTablaDeConvenciones()+this.calcularNotaCriterioRestandoNpuntos())/3;
	 return(laNota);
}

public int puntajeTotalDelAlumno(){
	int puntajeDelAlumnoRespuestas = 0;
	
	for (PreguntaYRespuesta preguntasYRespuesta: preguntasYRespuestas){
		puntajeDelAlumnoRespuestas = puntajeDelAlumnoRespuestas + preguntasYRespuesta.puntajePorRespuesta();
	}
	return(puntajeDelAlumnoRespuestas);
}
public int puntajeTotalDePregunta(){
	int puntajeDelPreguntas = 0;
	
	for (PreguntaYRespuesta preguntasYRespuesta: preguntasYRespuestas){
		
		if(preguntasYRespuesta.laRespuestaEsCorrecta){
		puntajeDelPreguntas = puntajeDelPreguntas + preguntasYRespuesta.puntajePorRespuesta();
		}
	}	
	return(puntajeDelPreguntas);
}
}