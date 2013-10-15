import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;


public class XmlUtils  
{  
    private XmlUtils()  
    {     
    }  
    
    public static String toXml( Object object )  
    {  
        if( object == null )  
        {  
            return null;  
        }  
        final ByteArrayOutputStream bout = new ByteArrayOutputStream();  
        final XMLEncoder encoder = new XMLEncoder( bout );  
        encoder.writeObject( object );  
        encoder.close();  
        return new String( bout.toByteArray() );  
    }  
       
    public static Object fromXml( String xml )  
    {  
    	 System.out.println(xml);

        if( xml == null )  
        {  
            return null;  
        }  
        final ByteArrayInputStream bin = new ByteArrayInputStream( xml.getBytes() );  
        final XMLDecoder decoder = new XMLDecoder(bin);
        decoder.close();
        return decoder.readObject();  
    }  
   
}  
