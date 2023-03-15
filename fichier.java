package fr.beowolfk.project1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.List;

public class fichier {
	public static void fichier() {
		File file = new File("D://Ce PC/Bureau/Programmation/_Java/workspace/dossier/doc.txt");
		File folder = new File("D://Ce PC/Bureau/Programmation/_Java/workspace/dossier/");
		
		
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("Dossier créé!");
		}
		
		if(!file.exists()) {
			try {
				file.createNewFile();
				System.out.println("Fichier créé!");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else {
			try {
				FileWriter writer = new FileWriter(file);
				BufferedWriter bw = new BufferedWriter(writer);
				bw.write("Ligne numéro 1 ");
				bw.newLine();
				bw.write("Ligne numéro 2 ");
				bw.newLine();
				bw.write("Ligne numéro 3 ");
				bw.close();
				writer.close();
				System.out.println("Fichier écrit");
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	public static void html() {
		File file = new File("D://Ce PC/Bureau/Programmation/_Java/workspace/index.html");

		if(!file.exists()) {
			try {
				file.createNewFile();
				System.out.println("Fichier créé!");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else {
			
			List<String> htmlLines = Arrays.asList("<html>","<head>", "</head>", "<title>Mon Titre</title>","</head>","<body>","<p>paragraphe de la page</p>","</body>", "</html>");
			
			try {
				FileWriter writer = new FileWriter(file);
				BufferedWriter bw = new BufferedWriter(writer);
				for(String line : htmlLines) {
					bw.write(line);
					bw.newLine();
					System.out.println(line);
				}
				bw.close();
				writer.close();
				System.out.println("Fichier écrit");
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void copie() {

		File source = new File("D://Ce PC/Bureau/Programmation/_Java/workspace/index.html");
		File dest = new File("D://Ce PC/Bureau/Programmation/_Java/workspace/dossier/" + source.getName());
		try {
			Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
			System.out.println("Copie du fichier source -> destination");
		} catch (IOException e) {
			e.printStackTrace();
		}
		source.delete();
		System.out.println("Suppression fichier source");
	}
	
	
	public static void lecture() {
		File file = new File("D://Ce PC/Bureau/Programmation/_Java/workspace/dossier/index.html");
		File folder = new File("D://Ce PC/Bureau/Programmation/_Java/workspace/dossier/");
		
		
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("Dossier créé!");
		}
		
		if(!file.exists()) {
			try {
				file.createNewFile();
				System.out.println("Fichier créé!");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else {
			try {
				BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
				String line = reader.readLine();
				while(line != null) {
				System.out.println(line);
				line = reader.readLine();
				}
				reader.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	

}
