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
        File f = new File("C:\\Users\\YETK�N\\Desktop\\Game of Thrones S08E06-TR.srt");
        lines = Files.readAllLines(f.toPath(),Charset.defaultCharset());
        changeValueOf(); // the name and the value you want to modify
        Files.write(f.toPath(), changeValueOf(), Charset.defaultCharset());
    }

    private static List<String> changeValueOf(){
        List<String> newLines = new ArrayList<String>();
        for(String line: lines){
        	
        	char[] c = line.toCharArray();
			
			for(int i = 0; i < line.length();i++){  
		        if(c[i] == '�') {
		        	line = line.replace('�', 'i');
		        }else if(c[i] == '�') {
		        	line = line.replace('�', 'o');
		        }else if(c[i] == '�') {
		        	line = line.replace('�', 'O');
		        }else if(c[i] == '�') {
		        	line = line.replace('�', 'g');
		        }else if(c[i] == '�') {
		        	line = line.replace('�', 'c');
		        }else if(c[i] == '�') {
		        	line = line.replace('�', 'C');
		        }else if(c[i] == '�') {
		        	line = line.replace('�', 's');
		        }else if(c[i] == '�') {
		        	line = line.replace('�', 'S');
		        }else if(c[i] == '�') {
		        	line = line.replace('�', 'u');
		        }else if(c[i] == '�') {
		        	line = line.replace('�', 'U');
		        }else if(c[i] == '�') {
		        	line = line.replace('�', 'I');
		        }
			}
			newLines.add(line);
        }
        return newLines;
    }
	/*public static void main(String args[]) {
		
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader("C:\\Users\\YETK�N\\Desktop\\sub-file.txt"));
			String line = reader.readLine();
			
			while (line != null) {
				System.out.println(line);
				char[] c = line.toCharArray();
				
				for(int i = 0; i < line.length();i++){  
					
			        if(c[i] == '�') {
			        	line.replace('�', 'i');
			        }else if(c[i] == '�') {
			        	line.replace('�', 'o');
			        }else if(c[i] == '�') {
			        	line.replace('�', 'O');
			        }else if(c[i] == '�') {
			        	line.replace('�', 'g');
			        }else if(c[i] == '�') {
			        	line.replace('�', 'c');
			        }else if(c[i] == '�') {
			        	line.replace('�', 'C');
			        }else if(c[i] == '�') {
			        	line.replace('�', 's');
			        }else if(c[i] == '�') {
			        	line.replace('�', 'S');
			        }else if(c[i] == '�') {
			        	line.replace('�', 'u');
			        }else if(c[i] == '�') {
			        	line.replace('�', 'U');
			        }else if(c[i] == '�') {
			        	line.replace('�', 'I');
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
