package ar.edu.utn.frba.dds.corrector.CorrectorParciales;

public class VerdaderoOFalso extends PreguntaYRespuesta {

	public char respuestaAlumno;
	public char respuestaCorrecta;
	int puntajePorRespuesta;

	public char RespuestaAlumno() {
		return respuestaAlumno;
	}
	public void respuestaAlumno(char respuestaAlumno) {
		this.respuestaAlumno = respuestaAlumno;
	}
	public char respuestaCorrecta() {
		return respuestaCorrecta;
	}
	public void respuestaCorrecta(char respuestaCorrecta) {
		this.respuestaCorrecta = respuestaCorrecta;
	}
	
public VerdaderoOFalso(char respuestaCorrecta,char respuestaAlumno, int puntajePorRespuesta){
		this.respuestaAlumno= respuestaAlumno;
		this.respuestaCorrecta = respuestaCorrecta;
		super.puntajePorRespuesta= puntajePorRespuesta;
		}
		
	public boolean laRespuestaEsCorrecta(){
		if(respuestaCorrecta == respuestaAlumno){
			return true;
		}
		else {return false;
		}
	}
	
	
}
