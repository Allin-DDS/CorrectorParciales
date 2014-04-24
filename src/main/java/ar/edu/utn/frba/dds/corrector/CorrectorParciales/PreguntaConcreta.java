package ar.edu.utn.frba.dds.corrector.CorrectorParciales;

public class PreguntaConcreta extends PreguntaYRespuesta {

	public String respuestaAlumno;
	public String respuestaCorrecta;
	int puntajePorRespuesta;

	public String getRespuestaAlumno() {
		return respuestaAlumno;
	}
	public void RespuestaAlumno(String respuestaAlumno) {
		this.respuestaAlumno = respuestaAlumno;
	}
	public String respuestaCorrecta() {
		return respuestaCorrecta;
	}
	public void respuestaCorrecta(String respuestaCorrecta) {
		this.respuestaCorrecta = respuestaCorrecta;
	}
	
	public PreguntaConcreta(String respuestaCorrecta,String respuestaAlumno,int puntajePorRespuesta){
		this.respuestaAlumno= respuestaAlumno;
		this.respuestaCorrecta = respuestaCorrecta;
		super.puntajePorRespuesta= puntajePorRespuesta;

	}
	public boolean laRespuestaEsCorrecta(){
		if(respuestaCorrecta == respuestaAlumno){
			return true;
		}
		else {return false;}
	}
	
}
