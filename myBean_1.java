import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;


public class myBean_1 {
	 public static void main( String[] args ) throws Exception  
	    {  
	        final MyBean bean = new MyBean();  
	        bean.setA( "Some A String" );  
	        bean.setB( "Some B String" );  
	        final PrintWriter out = new PrintWriter( "out.xml" );  
	        out.println( XmlUtils.toXml( bean ) );  
	        out.close();  
	      
	    }  
	   
//	    public static class MyBean  
//	    {  
//	        private String a, b;  
//	   
//	        public String getA()  
//	        {  
//	            return a;  
//	        }  
//	   
//	        public void setA( String a )  
//	        {  
//	            this.a = a;  
//	        }  
//	   
//	        public String getB()  
//	        {  
//	            return b;  
//	        }  
//	   
//	        public void setB( String b )  
//	        {  
//	            this.b = b;  
//	        }  
//	    }   
}