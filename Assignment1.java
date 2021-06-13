import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Assignment1 {
   public static void main(String arg[]) throws IOException {
	   LeakyStack ls=new LeakyStack(5);                               //create the class object
	   BufferedReader br = new BufferedReader(new FileReader(new File("assignment1.txt")));  //use BufferedReader to read data line by line

	   String content;
	   String[] tokens;
	   while((content=br.readLine())!=null){              //keep reading line by line until reach the bottom
		   tokens=content.split(" ");                    //use Tokens to separate white space in order to push data 
                   switch(tokens[0]) {                   //use switch method for choosing the correct command to operate
           case "push": 
                  ls.push(tokens[1]);                    //push the data into Stack
           break;
        	   
           case "pop" :                                  //Print and remove the data on the top of the Stack, if its empty claim it.
        	   
        	   if((content=(String)ls.pop())==null) {
        	   System.out.println("The LeakyStack is empty");
        	   break;
           }
           System.out.println(content);
           break;
           
           case "top" : if(ls.top()==null) {                      //Print the data on the top of the Stack, if its empty claim it.
        	   System.out.println("The LeakyStack is empty");
        	   break;
           }
             System.out.println(ls.top());
             break;
             
           case "size": System.out.println(ls.size());  break;       //print the size of the Stack
           
           case "is_empty": if(ls.isEmpty()) {                          //identify if the stack is empty or not
        	   System.out.println("The LeakyStack is empty");
        	  break;
           }
           System.out.println("The LeakyStack is not empty");       
    	   break;
    	   
           default : System.out.println("Wrong command");               //default value for the invalid command
           }
           
	   }
	  
   }
}
