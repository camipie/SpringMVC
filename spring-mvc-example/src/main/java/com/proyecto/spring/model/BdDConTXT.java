package com.proyecto.spring.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
    


public class BdDConTXT implements BaseDeDatosDeLectura {
	File file;
	public BdDConTXT() {
        try {
            String ruta = "C:\\Users\\gero\\Desktop\\filename.txt";
           // String contenido = "Contenido de ejemplo";
             file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
                String contenido ="Archivo nuevo";
             //   bw.write(contenido);
            }
           // FileWriter fw = new FileWriter(file);
            //BufferedWriter bw = new BufferedWriter(fw);
            
            //bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	public String leerContenido(){
		String comentario="";
		try {
			BufferedReader br;
			FileReader fr = new FileReader(file);
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
