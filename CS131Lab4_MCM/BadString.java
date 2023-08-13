public class BadString{
  
  public static void main(String[] args) throws StringTooLongException{
    	
    	FileProcessor fp = new FileProcessor("BadString.txt",10);
		  fp.processFile();
    
  }//end main
  
}//end class