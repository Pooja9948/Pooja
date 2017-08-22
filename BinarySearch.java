import java.io.FileReader;
import java.io.IOException;

class BinarySearch{
public static void main(String[] args) throws IOException{
	String file_name="Home:/Pooja/JavaCode/MyFile.txt";
try {
     FileReader file= new FileReader(file_name);
     String[] aryLines = file.OpenFile();
    }catch(IOException e){
    	e.printStackTrace();
    }
}
}
