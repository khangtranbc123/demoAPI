//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.12.09 at 02:22:57 SA ICT 
//


package vn.tpb.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="Header" type="{http://tpb.vn/gen}Header"/>
 *         &lt;element name="ResponseStatus" type="{http://tpb.vn/gen}ResponseStatus"/>
 *         &lt;element name="BodyResponse" type="{http://tpb.vn/gen}BodyResponse"/>
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
    "header",
    "responseStatus",
    "bodyResponse"
})
@XmlRootElement(name = "GetCustomerInfoRes")
public class GetCustomerInfoRes {

    @XmlElement(name = "Header", required = true)
    protected Header header;
    @XmlElement(name = "ResponseStatus", required = true)
    protected ResponseStatus responseStatus;
    @XmlElement(name = "BodyResponse", required = true)
    protected BodyResponse bodyResponse;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link Header }
     *     
     */
    public Header getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header }
     *     
     */
    public void setHeader(Header value) {
        this.header = value;
    }

    /**
     * Gets the value of the responseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseStatus }
     *     
     */
    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    /**
     * Sets the value of the responseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseStatus }
     *     
     */
    public void setResponseStatus(ResponseStatus value) {
        this.responseStatus = value;
    }

    /**
     * Gets the value of the bodyResponse property.
     * 
     * @return
     *     possible object is
     *     {@link BodyResponse }
     *     
     */
    public BodyResponse getBodyResponse() {
        return bodyResponse;
    }

    /**
     * Sets the value of the bodyResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link BodyResponse }
     *     
     */
    public void setBodyResponse(BodyResponse value) {
        this.bodyResponse = value;
    }

}
