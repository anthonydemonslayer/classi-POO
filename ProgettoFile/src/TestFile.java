import java.io.File;

public class TestFile {

	public static void main(String[] args) {
		File file = new File("prova.dat");
		if(file.exists()) {
			System.out.println("il file " + file + " esiste");
			System.out.println(file.getPath()); //prende il percorso
			System.out.println(file.getAbsolutePath()); //prende il percorso assoluto
			System.out.println(file.isFile()); //verifica se è un file
			
			
		} else {
			System.out.println("il file " + file + " non esiste");
		}
		
	}

}
