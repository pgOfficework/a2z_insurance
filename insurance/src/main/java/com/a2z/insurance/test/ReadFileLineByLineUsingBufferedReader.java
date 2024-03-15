package com.a2z.insurance.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class ReadFileLineByLineUsingBufferedReader {

	

	public static Set<String> listFilesUsingFilesList(String dir) throws IOException {
		try (Stream<Path> stream = Files.list(Paths.get(dir))) {
			return stream.filter(file -> !Files.isDirectory(file)).map(Path::getFileName).map(Path::toString)
					.collect(Collectors.toSet());
		}
	}

	public static void main(String[] args) {
		BufferedWriter writer = null;
		FileWriter file = null;
		List<String> allLines;
		String folder = null;
		String filename = null;

		try {
			Set<String> setOfFiles = listFilesUsingFilesList("E:/insurance_backend/data/kafkaInput");

			for (String  inputfilename : setOfFiles) {
				
				BufferedReader br = new BufferedReader(new FileReader("E:/insurance_backend/data/kafkaInput/" + inputfilename));
				System.out.println(inputfilename);
				String line;
				while((line = br.readLine()) != null) {
			  //      System.out.println(line);
			    
				
				
				allLines = Files.readAllLines(Paths.get("E:/insurance_backend/data/kafkaInput/" + inputfilename));

				
					
					try {
						folder = line.substring(0, line.indexOf("_"));
						filename = line.substring(0, line.indexOf("{") - 1);
						file = new FileWriter("E:/insurance_backend/data/" + folder + "/" + filename + ".json");
						writer = new BufferedWriter(file);
						writer.write(new JSONObject(new JSONTokener(line.substring(line.indexOf("{")))).toString(4));
						writer.close();
						
					}
					catch (StringIndexOutOfBoundsException e) {
						System.out.println("SKIPED");
					}
					
					catch (Exception e) {
						new File("E:/insurance_backend/data/" + folder).mkdir();
						file = new FileWriter("E:/insurance_backend/data/" + folder + "/" + filename + ".json");
						writer = new BufferedWriter(file);
						System.out.println(line);
						System.out.println(line.substring(line.indexOf("{")));
						writer.write(new JSONObject(new JSONTokener(line.substring(line.indexOf("{")))).toString(4));
						writer.close();
						
					}
					
				}

				System.out.println("Insertion of file " + inputfilename + " done");
				br.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}