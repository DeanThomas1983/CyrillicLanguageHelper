/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cyrilliclanguagehelper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.xml.sax.*;

/**
 * @class Language
 * @author Dean Thomas
 */
public class Language extends ArrayList {
    private File fileName;
    
    /**
     * Default constructor
     * 
     * Create an empty language structure
     */
    public Language()
    {
        System.out.println("New language object created");
    }
    
    /** Load a language definition from an XML document
     * 
     * @param fileName the XML document containing the definitions
     */
    public Language(File fileName)
    {
        this();
     
        this.fileName = fileName;
        
        System.out.println(this.fileName.getName());
        
        parseXMLFile();
    }
    
    //  TODO: move this to a separate class?
    private void parseXMLFile()
    {
        XMLReader xmlReader = new XMLReader() {

            @Override
            public boolean getFeature(String name) throws SAXNotRecognizedException, SAXNotSupportedException {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public void setFeature(String name, boolean value) throws SAXNotRecognizedException, SAXNotSupportedException {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public Object getProperty(String name) throws SAXNotRecognizedException, SAXNotSupportedException {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public void setProperty(String name, Object value) throws SAXNotRecognizedException, SAXNotSupportedException {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public void setEntityResolver(EntityResolver resolver) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public EntityResolver getEntityResolver() {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public void setDTDHandler(DTDHandler handler) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public DTDHandler getDTDHandler() {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public void setContentHandler(ContentHandler handler) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public ContentHandler getContentHandler() {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public void setErrorHandler(ErrorHandler handler) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public ErrorHandler getErrorHandler() {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public void parse(InputSource input) throws IOException, SAXException {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public void parse(String systemId) throws IOException, SAXException {
                System.out.println("Begin parsing " + fileName);
                //throw new UnsupportedOperationException("Not supported yet.");
            }
        };
        try {
            xmlReader.parse(this.fileName.toString());
        } catch (IOException ex) {
            Logger.getLogger(Language.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(Language.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
