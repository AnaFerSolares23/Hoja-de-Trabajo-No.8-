
/* 	
* Ana Fernanda Solares, 13125
* Jose Rosales, 12576
*/


public class Paciente2 implements Comparable<Paciente2>{

	private String nombre, apellido, enfermedad, codigo;

	public Paciente2(String nom, String ape, String enf, String cod){
		nombre = nom;
		apellido = ape;
		enfermedad = enf;
		codigo = cod;
	}

	public int compareTo(Paciente2 pac) {//Sirve para hacer la comparacion entre emergencias
		String cod2 = pac.getCodigo();
		if (codigo.compareTo(cod2)>0){	//
			return 1;
		}
		else if (codigo.compareTo(cod2)<0){	//
			return -1;
		}
		return 0;
	}

	public String getCodigo(){
		return codigo;
	}
	public String toString(){
		return nombre + " "  + apellido + " " + enfermedad + " " + codigo;
	}
