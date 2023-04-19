package com.cleartrip.utilities;




	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.List;

	public class TextFilesReusables {
		private String filePath;
		private FileWriter fw;
		private FileReader fr;
		private BufferedWriter bw;
		private BufferedReader br;
		public TextFilesReusables(String filePath) throws IOException {
			this.filePath=filePath;
			fw= new FileWriter(filePath,true);
			bw = new BufferedWriter(fw);
			fr = new FileReader(filePath);
			br = new BufferedReader(fr);
		}
		public String readOneLine() throws IOException{
			String data = br.readLine();
			return data;
		}
		public List<String> readAllLines() throws IOException{
			List list = new ArrayList();
			while (br.ready()) {
				String data=br.readLine();
				list.add(data);
			}
			return list;
		}
		
		public void writeIntData(int data) throws IOException{
			bw.write(data);
			bw.flush();
		}
		
		public void writeStringData(int data) throws IOException{
			bw.write(data);
			bw.flush();
		}	
		
	}



