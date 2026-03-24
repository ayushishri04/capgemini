package com.gal.algo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class FileListProvider {

	String dirToSearch = "files";
	String fileFilter = ".java";
	public List<File> getFiles(){
		File dir = new File(dirToSearch);
		File[] files = dir.listFiles();
		List<File> result = new ArrayList<>();
		if(files == null) {
			System.out.println("Directory not found");
			return result;
		}
		for(File f : files) {
			if(f.getName().endsWith(fileFilter)) {
				result.add(f);
			}
		}
		return result;
	}

	@PostConstruct
	public void onInit() {
		System.out.println("FileListProvider init");
	}

	@PreDestroy
	public void onDestroy() {
		System.out.println("FileListProvider closed");
	}
}