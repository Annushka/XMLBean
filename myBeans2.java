import java.io.BufferedReader;
import java.io.FileReader;


public class myBeans2 {

    public static void main( String[] args ) throws Exception  
    {  
        final FileReader fin = new FileReader( "out.xml" );  
        final BufferedReader in = new BufferedReader( fin );  
        String line = null;  
        final StringBuffer xml = new StringBuffer();  
        while( ( line = in.readLine() ) != null )  
        {  
            xml.append( line );  
        }  
        MyBean  bean = (MyBean)XmlUtils.fromXml( xml.toString() );  
        System.out.println(" a = "+ bean.getA());  
        System.out.println(" b = "+ bean.getB());  
    }  
   
//    public static class MyBean  
//    {  
//        private String a,b;
//   
//        public MyBean(){
//        	
//        }
//        
//        public String getA()  
//        {  
//            return a;  
//        }  
//   
//        
//        public void setA( String a )  
//        {  
//            this.a = a;  
//        }  
//   
//        public String getB()  
//        {  
//            return b;  
//        }  
//   
//        public void setB( String b )  
//        {  
//            this.b = b;  
//        }  
//    } 
    
}
