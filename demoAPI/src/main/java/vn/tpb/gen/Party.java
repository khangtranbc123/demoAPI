//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.01.18 at 10:05:34 SA ICT 
//


package vn.tpb.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Party complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Party">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PartyInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PersonalPartyInfo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CIFNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="FullName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ContactInfo" type="{http://tpb.vn/gen}ContactInfo"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Party", propOrder = {
    "partyInfo"
})
public class Party {

    @XmlElement(name = "PartyInfo", required = true)
    protected Party.PartyInfo partyInfo;

    /**
     * Gets the value of the partyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Party.PartyInfo }
     *     
     */
    public Party.PartyInfo getPartyInfo() {
        return partyInfo;
    }

    /**
     * Sets the value of the partyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party.PartyInfo }
     *     
     */
    public void setPartyInfo(Party.PartyInfo value) {
        this.partyInfo = value;
    }


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
     *         &lt;element name="PersonalPartyInfo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CIFNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="FullName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ContactInfo" type="{http://tpb.vn/gen}ContactInfo"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "personalPartyInfo"
    })
    public static class PartyInfo {

        @XmlElement(name = "PersonalPartyInfo", required = true)
        protected Party.PartyInfo.PersonalPartyInfo personalPartyInfo;

        /**
         * Gets the value of the personalPartyInfo property.
         * 
         * @return
         *     possible object is
         *     {@link Party.PartyInfo.PersonalPartyInfo }
         *     
         */
        public Party.PartyInfo.PersonalPartyInfo getPersonalPartyInfo() {
            return personalPartyInfo;
        }

        /**
         * Sets the value of the personalPartyInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link Party.PartyInfo.PersonalPartyInfo }
         *     
         */
        public void setPersonalPartyInfo(Party.PartyInfo.PersonalPartyInfo value) {
            this.personalPartyInfo = value;
        }


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
         *         &lt;element name="CIFNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="FullName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ContactInfo" type="{http://tpb.vn/gen}ContactInfo"/>
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
            "cifNo",
            "fullName",
            "contactInfo"
        })
        public static class PersonalPartyInfo {

            @XmlElement(name = "CIFNo", required = true)
            protected String cifNo;
            @XmlElement(name = "FullName", required = true)
            protected String fullName;
            @XmlElement(name = "ContactInfo", required = true)
            protected ContactInfo contactInfo;

            /**
             * Gets the value of the cifNo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCIFNo() {
                return cifNo;
            }

            /**
             * Sets the value of the cifNo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCIFNo(String value) {
                this.cifNo = value;
            }

            /**
             * Gets the value of the fullName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFullName() {
                return fullName;
            }

            /**
             * Sets the value of the fullName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFullName(String value) {
                this.fullName = value;
            }

            /**
             * Gets the value of the contactInfo property.
             * 
             * @return
             *     possible object is
             *     {@link ContactInfo }
             *     
             */
            public ContactInfo getContactInfo() {
                return contactInfo;
            }

            /**
             * Sets the value of the contactInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ContactInfo }
             *     
             */
            public void setContactInfo(ContactInfo value) {
                this.contactInfo = value;
            }

        }

    }

}
