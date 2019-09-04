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
            String ruta = "C:\\Users\\Usuario\\Desktop\\filename.txt";
           // String contenido = "Contenido de ejemplo";
             file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
                String contenido ="Archivo nuevo";

            }

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

			
			while (cadena != null) {
				comentario += cadena + "\n"; 
				cadena = br.readLine();
			}
			
			br.close();

			
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

				
				bw.close();
			}
			catch(IOException exc) {
				System.out.println("Error al sobreescribir el archivo de Comentarios.");
				exc.printStackTrace();
			}
		}


		
		


}
