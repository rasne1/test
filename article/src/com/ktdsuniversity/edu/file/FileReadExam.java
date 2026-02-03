package com.ktdsuniversity.edu.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class FileReadExam {
	
	
	
	public static void readAndPrintFileDescriptionUseNIO(String ParentPath, String file) {
		
		//1.읽으려는 파일을 특정.
		File target = new File(ParentPath, file);
		
		//2.파일의 내용을 읽는다.
		//3.파일의 내용을 List에 할당한다
		 try {
			 Files.lines(target.toPath());
			 List<String> lines =Files.readAllLines(target.toPath());
			//4.파일의 내용을 출력한다.
			for(String line: lines) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		//4.파일의 내용을 출력한다.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	public static void readAndPrintFileDexcriptionUseIOAutoClose(String parentPath, String file) {
		
		//1. 읽으려는 파일 특정.
		File target = new File(parentPath, file);
		
		//2. 파일이 존재하는지 확인.
		//3. 읽으려는 대상이 진짜 파일이 맞는지 확인.
		if(target.exists() && target.isFile()) {
			//4. 파일의 내용을 읽기 시작.
			//4-1. 파일의 바이트를 Chunking 해서 가져온다.
			FileReader fileReader =null;
			BufferedReader bufferedReader = null;
			try {
				 fileReader = new FileReader(target);
				//4-2. 파일의 내용을 String 으로 변환한다.
				bufferedReader = new BufferedReader(fileReader);
				String line = null;
				while(true) {
					line = bufferedReader.readLine();
					//EOF(마지막 빈곳 ) 까지 갔느냐.
					if(line == null) {
						break;
					}
					else {
						//4-3. 내용을 출력한다.
						System.out.println(line);
					}
				}
				
				
			} catch (IOException ioe) {
				ioe.printStackTrace();
			} finally {
				if(bufferedReader !=null){
					try {
						bufferedReader.close();
					} catch (IOException e) {}
				}
				if(fileReader != null) {
					try {
						fileReader.close();
					} catch (IOException e) {}
				}
			}
			
			
			
			
		}
		
		
		
		
		
	}
	
	
	
	public static void readAndPrintFileDexcriptionUseIO(String parentPath, String file) {
	
		//1. 읽으려는 파일 특정.
		File target = new File(parentPath, file);
		
		//2. 파일이 존재하는지 확인.
		//3. 읽으려는 대상이 진짜 파일이 맞는지 확인.
		if(target.exists() && target.isFile()) {
			//4. 파일의 내용을 읽기 시작.
			//4-1. 파일의 바이트를 Chunking 해서 가져온다.
			FileReader fileReader =null;
			BufferedReader bufferedReader = null;
			try {
				 fileReader = new FileReader(target);
				//4-2. 파일의 내용을 String 으로 변환한다.
				bufferedReader = new BufferedReader(fileReader);
				String line = null;
				while(true) {
					line = bufferedReader.readLine();
					//EOF(마지막 빈곳 ) 까지 갔느냐.
					if(line == null) {
						break;
					}
					else {
						//4-3. 내용을 출력한다.
						System.out.println(line);
					}
				}
				
				
			} catch (IOException ioe) {
				ioe.printStackTrace();
			} finally {
				if(bufferedReader !=null){
					try {
						bufferedReader.close();
					} catch (IOException e) {}
				}
				if(fileReader != null) {
					try {
						fileReader.close();
					} catch (IOException e) {}
				}
			}
			
			
			
			
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Properties props =System.getProperties();
		String homePath = props.get("user.home").toString();
		System.out.println(homePath);
//		System.out.println(props);
//		System.out.println(props.get("user.home"));
//		
//		
//		Map<String,String> env = System.getenv();
//		System.out.println(env);
//		System.out.println(env.get("HOME"));
		
		
		
		// c:\Java Exam 폴더의 정보 추출.
		//Java.io.File
		System.out.println(File.separator);
		File directory = new File(homePath + File.separator + "Java Exam");
		// 1.폴더의 이름 출력
		String directoryName = directory.getName();
		System.out.println(directoryName);
		// 2.이 경로가 가리키는 것이 파일인지 폴더인지를 구분.
		boolean isFile = directory.isFile();
		//isFile 의 값이 true 이면 파일 false 이면 파일이 아니다.
		System.out.println(isFile);
		
		boolean isDirectory = directory.isDirectory();
		System.out.println(isDirectory);
		// 3.이 경로가 실제 존재하는것인지.
		boolean exists = directory.exists();
		//exists 가 true 이면 존재하는 폴더 
		System.out.println(exists);
		// 4. 이 경로의 크기(폴더의 크기) 출력.
		long bytes = directory.length();
		System.out.println(bytes);
		
		// C:\Java Exam\Java Exam.txt 파일의 정보를 추출.
		File textFile = new File(homePath + File.separator + "Java Exam","Java Exam.txt");
		//1.파일의 이름을 출력
		String textName = textFile.getName();
		System.out.println(textName);
		//2.파일이 폴더인지 파일인지 구분해서 출력한다.
		boolean isTextFile = textFile.isFile();
		System.out.println(isTextFile);
		//3.이 파일이 실제 존재하는 것인지 출력.
		boolean textTrue = textFile.exists();
		System.out.println(textTrue);
		//4.파일의 크기를 출력한다.
		long text = textFile.length();
		System.out.println(text);
		//5.이 파일이 있는 부모의 경로를 출력한다.
		//-첫번쨰 방법
		String parentPath = textFile.getParent();
		System.out.println(parentPath);
		//-두번쨰 방법
		File parentFile = textFile.getParentFile();
		System.out.println(parentFile);
		//6.이 파일의 경로를 출력한다.
		
		String textFilePath = textFile.getAbsolutePath();
		System.out.println(textFilePath);
		
	
		readAndPrintFileDexcriptionUseIO(homePath + File.separator + "Java Exam","Java Exam.txt");
		readAndPrintFileDescriptionUseNIO(homePath + File.separator + "Java Exam","Java Exam.txt");
		
	}

}
