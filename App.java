package it.edu.itismeucci;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws JsonGenerationException, JsonMappingException, IOException
    {
        Alunno a1=new Alunno();
        Alunno a2=new Alunno();
        Alunno a3=new Alunno();
        Alunno a4=new Alunno();
        Classe c=new Classe();
        c.aggiungi(a1);
        c.aggiungi(a2);
        c.aggiungi(a3);
        c.aggiungi(a4);
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.writeValue(new File("classe.xml"), c);
    }
}
