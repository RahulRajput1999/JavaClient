
package org.datacontract.schemas._2004._07.weatherserviceapplication;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.weatherserviceapplication package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _JavaMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WeatherServiceApplication", "JavaMessage");
    private final static QName _ArrayOfJavaMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WeatherServiceApplication", "ArrayOfJavaMessage");
    private final static QName _JavaMessageTemp_QNAME = new QName("http://schemas.datacontract.org/2004/07/WeatherServiceApplication", "Temp");
    private final static QName _JavaMessageHumidity_QNAME = new QName("http://schemas.datacontract.org/2004/07/WeatherServiceApplication", "Humidity");
    private final static QName _JavaMessageTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/WeatherServiceApplication", "Time");
    private final static QName _JavaMessageWindSpeed_QNAME = new QName("http://schemas.datacontract.org/2004/07/WeatherServiceApplication", "WindSpeed");
    private final static QName _JavaMessagePlace_QNAME = new QName("http://schemas.datacontract.org/2004/07/WeatherServiceApplication", "Place");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.weatherserviceapplication
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfJavaMessage }
     * 
     */
    public ArrayOfJavaMessage createArrayOfJavaMessage() {
        return new ArrayOfJavaMessage();
    }

    /**
     * Create an instance of {@link JavaMessage }
     * 
     */
    public JavaMessage createJavaMessage() {
        return new JavaMessage();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JavaMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WeatherServiceApplication", name = "JavaMessage")
    public JAXBElement<JavaMessage> createJavaMessage(JavaMessage value) {
        return new JAXBElement<JavaMessage>(_JavaMessage_QNAME, JavaMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfJavaMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WeatherServiceApplication", name = "ArrayOfJavaMessage")
    public JAXBElement<ArrayOfJavaMessage> createArrayOfJavaMessage(ArrayOfJavaMessage value) {
        return new JAXBElement<ArrayOfJavaMessage>(_ArrayOfJavaMessage_QNAME, ArrayOfJavaMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WeatherServiceApplication", name = "Temp", scope = JavaMessage.class)
    public JAXBElement<String> createJavaMessageTemp(String value) {
        return new JAXBElement<String>(_JavaMessageTemp_QNAME, String.class, JavaMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WeatherServiceApplication", name = "Humidity", scope = JavaMessage.class)
    public JAXBElement<String> createJavaMessageHumidity(String value) {
        return new JAXBElement<String>(_JavaMessageHumidity_QNAME, String.class, JavaMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WeatherServiceApplication", name = "Time", scope = JavaMessage.class)
    public JAXBElement<String> createJavaMessageTime(String value) {
        return new JAXBElement<String>(_JavaMessageTime_QNAME, String.class, JavaMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WeatherServiceApplication", name = "WindSpeed", scope = JavaMessage.class)
    public JAXBElement<String> createJavaMessageWindSpeed(String value) {
        return new JAXBElement<String>(_JavaMessageWindSpeed_QNAME, String.class, JavaMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WeatherServiceApplication", name = "Place", scope = JavaMessage.class)
    public JAXBElement<String> createJavaMessagePlace(String value) {
        return new JAXBElement<String>(_JavaMessagePlace_QNAME, String.class, JavaMessage.class, value);
    }

}
