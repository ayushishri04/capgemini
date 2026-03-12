package com.gal.algo;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WordCounter {

	String wordToSearch = "public";

	// -------- FIELD INJECTION --------
	@Autowired
	FileListProvider fileListProvider;

	// -------- CONSTRUCTOR INJECTION --------
	//@Autowired
	//public WordCounter(FileListProvider fileListProvider) {
	//	System.out.println("Constructor injection");
	//	this.fileListProvider = fileListProvider;
	//}

	// -------- SETTER INJECTION --------
	//@Autowired
	//public void setFileListProvider(FileListProvider fileListProvider) {
	//	System.out.println("Setter injection");
	//	this.fileListProvider = fileListProvider;
	//}

	public Map<String,Integer> createMapResult(){

		Map<String,Integer> result = new HashMap<>();

		for(File file : fileListProvider.getFiles()) {

			int count = 0;

			try(Scanner sc = new Scanner(file)) {

				while(sc.hasNext()) {
					String word = sc.next();

					if(word.contains(wordToSearch)) {
						count++;
					}
				}

			}catch(Exception e) {
				e.printStackTrace();
			}

			result.put(file.getName(), count);
		}

		return result;
	}
}