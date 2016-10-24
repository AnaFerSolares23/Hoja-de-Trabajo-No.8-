/*  
* Ana Fernanda Solares, 13125
* Jose Rosales, 12576
*/

import java.io.*;

public class main {
    public static void main(String[] args) {
		Paciente2[] clinica = new Paciente2[4];
        VectorHeap vectorPacientes = new VectorHeap();
        int cont = 0;
		try{
            FileReader lector=new FileReader("pacientes.txt");
            BufferedReader contenido=new BufferedReader(lector);
            String linea;
            while((linea=contenido.readLine())!=null) {
            		String [] texto = linea.split(",");
                    System.out.println(linea);
                    clinica[cont] = new Paciente2(texto[0], texto[1], texto[2], texto[3]);
                    cont++;
           	} 
        }
        //Si se causa un error al leer cae aqui
        catch(Exception e) {
            System.out.println("Error al leer el archivo.");
        }
        System.out.println();
        System.out.println("Resultados de Atencion: \n");
        for (cont =0; cont<4; cont++){
            vectorPacientes.add(clinica[cont]);
        }
        for (cont =0; cont<4; cont++){
            System.out.println(vectorPacientes.poll());
        }
       

	}
}
