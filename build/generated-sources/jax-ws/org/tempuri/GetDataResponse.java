
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.weatherserviceapplication.ArrayOfJavaMessage;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetDataResult" type="{http://schemas.datacontract.org/2004/07/WeatherServiceApplication}ArrayOfJavaMessage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getDataResult"
})
@XmlRootElement(name = "GetDataResponse")
public class GetDataResponse {

    @XmlElementRef(name = "GetDataResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfJavaMessage> getDataResult;

    /**
     * Gets the value of the getDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfJavaMessage }{@code >}
     *     
     */
    public JAXBElement<ArrayOfJavaMessage> getGetDataResult() {
        return getDataResult;
    }

    /**
     * Sets the value of the getDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfJavaMessage }{@code >}
     *     
     */
    public void setGetDataResult(JAXBElement<ArrayOfJavaMessage> value) {
        this.getDataResult = value;
    }

}
