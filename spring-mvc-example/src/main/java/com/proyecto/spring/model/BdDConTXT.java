package com.proyecto.spring.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BdDConTXT implements BaseDeDatosDeComentarios {

	public String leerComentarios(){
		String comentario="";
		try {
			BufferedReader br;
			FileReader fr = new FileReader("Comentarios.txt");
			br = new BufferedReader(fr);
			String cadena = br.readLine();
		//	int lineaCambio = -1;
		//	String[] Comentarios = new String[5];
			
			while (cadena != null) {
				comentario += cadena + "\n"; 
				cadena = br.readLine();
			}
			
		//	for (int i = 0; i < 5; i++) {
				//Comentario = br.readLine();
				
				
				//Comentarios[i] = cadena;
				//if (lineaCambio == -1) {
					//int j = 2;
					//while (cadena.charAt(j - 1) != ' ')
					//	j++;
					//String valorCad = cadena.substring(j);
					//int valor = Integer.parseInt(valorCad);
					//if (valor < gui.getPuntaje())
						//lineaCambio = i;
			//	}
			//}
			br.close();
			
			//if (lineaCambio >= 0)
				//actualizarTablaHighScores(lineaCambio, Comentarios);
			
		}
		catch(IOException exc) {
			System.out.println("Error al leer el archivo de High Scores.");
			exc.printStackTrace();
		}
		return comentario;
	}
	
		public void agregarComntario(String c) {
			
			try {
				File logFile = new File("Comentarios.txt");
				BufferedWriter bw;
				FileWriter fw = new FileWriter(logFile);
				bw = new BufferedWriter(fw);
				//for (int i = 0; i < lineaCambio; i++) {
					//bw.write(Comentario);
					
			//	}
				//gui.getNombrePersonaje().getText() + " " + gui.getPuntaje()
				bw.write(c);
				bw.newLine();
			//	for (int j = lineaCambio + 1; j < 5; j++) {
				//	bw.newLine();
				//	bw.write(archivoViejo[j - 1]);
				//}
				
				bw.close();
			}
			catch(IOException exc) {
				System.out.println("Error al sobreescribir el archivo de Comentarios.");
				exc.printStackTrace();
			}
		}


		
		


}
