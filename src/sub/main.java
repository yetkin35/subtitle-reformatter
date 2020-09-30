package sub;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class main {
	
	private static List<String> lines;

    public static void main (String [] args) throws IOException{
        File f = new File("C:\\Users\\YETKÝN\\Desktop\\Game of Thrones S08E06-TR.srt");
        lines = Files.readAllLines(f.toPath(),Charset.defaultCharset());
        changeValueOf(); // the name and the value you want to modify
        Files.write(f.toPath(), changeValueOf(), Charset.defaultCharset());
    }

    private static List<String> changeValueOf(){
        List<String> newLines = new ArrayList<String>();
        for(String line: lines){
        	
        	char[] c = line.toCharArray();
			
			for(int i = 0; i < line.length();i++){  
		        if(c[i] == 'ý') {
		        	line = line.replace('ý', 'i');
		        }else if(c[i] == 'ö') {
		        	line = line.replace('ö', 'o');
		        }else if(c[i] == 'Ö') {
		        	line = line.replace('Ö', 'O');
		        }else if(c[i] == 'ð') {
		        	line = line.replace('ð', 'g');
		        }else if(c[i] == 'ç') {
		        	line = line.replace('ç', 'c');
		        }else if(c[i] == 'Ç') {
		        	line = line.replace('Ç', 'C');
		        }else if(c[i] == 'þ') {
		        	line = line.replace('þ', 's');
		        }else if(c[i] == 'Þ') {
		        	line = line.replace('Þ', 'S');
		        }else if(c[i] == 'ü') {
		        	line = line.replace('ü', 'u');
		        }else if(c[i] == 'Ü') {
		        	line = line.replace('Ü', 'U');
		        }else if(c[i] == 'Ý') {
		        	line = line.replace('Ý', 'I');
		        }
			}
			newLines.add(line);
        }
        return newLines;
    }
	/*public static void main(String args[]) {
		
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader("C:\\Users\\YETKÝN\\Desktop\\sub-file.txt"));
			String line = reader.readLine();
			
			while (line != null) {
				System.out.println(line);
				char[] c = line.toCharArray();
				
				for(int i = 0; i < line.length();i++){  
					
			        if(c[i] == 'ý') {
			        	line.replace('ý', 'i');
			        }else if(c[i] == 'ö') {
			        	line.replace('ö', 'o');
			        }else if(c[i] == 'Ö') {
			        	line.replace('Ö', 'O');
			        }else if(c[i] == 'ð') {
			        	line.replace('ð', 'g');
			        }else if(c[i] == 'ç') {
			        	line.replace('ç', 'c');
			        }else if(c[i] == 'Ç') {
			        	line.replace('Ç', 'C');
			        }else if(c[i] == 'þ') {
			        	line.replace('þ', 's');
			        }else if(c[i] == 'Þ') {
			        	line.replace('Þ', 'S');
			        }else if(c[i] == 'ü') {
			        	line.replace('ü', 'u');
			        }else if(c[i] == 'Ü') {
			        	line.replace('Ü', 'U');
			        }else if(c[i] == 'Ý') {
			        	line.replace('Ý', 'I');
			        }
				}   
				
				line = reader.readLine();	// Read next line
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}*/
}
