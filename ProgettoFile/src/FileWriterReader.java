import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class FileWriterReader {

	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("prova.dat");
			writer.write("E' il DemonSlayer che lotta contro il male \n");
			writer.append("\n Combatte solo la malvagità");
			writer.append("\n Non ha paura, si batte con furore");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
		FileReader reader = new FileReader("prova.dat");
		int data = reader.read();
		
		while(data != -1) {
			System.out.print((char)data);
			data = reader.read();
			} 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
