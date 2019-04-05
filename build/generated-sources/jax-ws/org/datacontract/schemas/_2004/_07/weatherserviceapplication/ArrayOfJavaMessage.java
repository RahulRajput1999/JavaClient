
package org.datacontract.schemas._2004._07.weatherserviceapplication;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfJavaMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfJavaMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="JavaMessage" type="{http://schemas.datacontract.org/2004/07/WeatherServiceApplication}JavaMessage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfJavaMessage", propOrder = {
    "javaMessage"
})
public class ArrayOfJavaMessage {

    @XmlElement(name = "JavaMessage", nillable = true)
    protected List<JavaMessage> javaMessage;

    /**
     * Gets the value of the javaMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the javaMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJavaMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JavaMessage }
     * 
     * 
     */
    public List<JavaMessage> getJavaMessage() {
        if (javaMessage == null) {
            javaMessage = new ArrayList<JavaMessage>();
        }
        return this.javaMessage;
    }

}
