package ar.edu.utn.frba.dds.corrector.CorrectorParciales;

public class MultipleChoice extends PreguntaYRespuesta {
	

	public int respuestaAlumno;
	public int respuestaCorrecta;
	int puntajePorRespuesta;
	
	public int respuestaAlumno() {
		return respuestaAlumno;
	}
	public void respuestaAlumno(char respuestaAlumno) {
		this.respuestaAlumno = respuestaAlumno;
	}
	public int respuestaCorrecta() {
		return respuestaCorrecta;
	}
	public void respuestaCorrecta(char respuestaCorrecta) {
		this.respuestaCorrecta = respuestaCorrecta;
	}
	public MultipleChoice(int respuestaCorrecta,int respuestaAlumno,int puntajePorRespuesta){
		this.respuestaAlumno= respuestaAlumno;
		this.respuestaCorrecta = respuestaCorrecta;
		super.puntajePorRespuesta= puntajePorRespuesta;

	}


	
	public boolean laRespuestaEsCorrecta(){
		if(respuestaCorrecta == respuestaAlumno){
			return (true);
		}
		else {return (false);
		}
	}
	
}
