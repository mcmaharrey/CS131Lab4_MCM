import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileProcessor {

	private String fileName;
	private int stringLength;
	
	private ArrayList<String> stringList;
	private Scanner input;
	
	public FileProcessor(String fileName, int stringLength) {
		this.fileName = fileName;
		this.stringLength = stringLength;
			
	}//end empty-argument constructor
	
	public int getArrayListSize() {
		return stringList.size();
		
	}//end getArrayListSize
	
	public void processFile() throws StringTooLongException{
		StringTooLongException stringTooLongException = new StringTooLongException("String is too long!");
		setStringLength(5);
		try {
			Scanner s = new Scanner(new FileReader(fileName));
			while (s.hasNextLine()) {
				try {
					String line = s.nextLine();
					if (line.length() > stringLength) {
						throw stringTooLongException;
					}  
				} catch (StringTooLongException e) {
					System.out.println(e.getMessage());
				}
			}
			s.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		
	}//end processFile

	public String getFileName() {
		return fileName;
	}//end getFileName

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}//end setFileName

	public int getStringLength() {
		return stringLength;
	}//end getStringLength

	public void setStringLength(int stringLength) {
		if(stringLength < 5) {
			stringLength = 5;
		} else {
			this.stringLength = stringLength;
		}
		
	}//end setStringLength
	
	
}//end class
