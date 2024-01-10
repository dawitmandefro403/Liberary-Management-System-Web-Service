
package com.myliberary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for studentRegister complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="studentRegister">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="studId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="studName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="studStream" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="studClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="studAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "studentRegister", propOrder = {
    "studId",
    "studName",
    "studStream",
    "studClass",
    "studAddress"
})
public class StudentRegister {

    protected String studId;
    protected String studName;
    protected String studStream;
    protected String studClass;
    protected String studAddress;

    /**
     * Gets the value of the studId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudId() {
        return studId;
    }

    /**
     * Sets the value of the studId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudId(String value) {
        this.studId = value;
    }

    /**
     * Gets the value of the studName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudName() {
        return studName;
    }

    /**
     * Sets the value of the studName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudName(String value) {
        this.studName = value;
    }

    /**
     * Gets the value of the studStream property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudStream() {
        return studStream;
    }

    /**
     * Sets the value of the studStream property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudStream(String value) {
        this.studStream = value;
    }

    /**
     * Gets the value of the studClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudClass() {
        return studClass;
    }

    /**
     * Sets the value of the studClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudClass(String value) {
        this.studClass = value;
    }

    /**
     * Gets the value of the studAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudAddress() {
        return studAddress;
    }

    /**
     * Sets the value of the studAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudAddress(String value) {
        this.studAddress = value;
    }

}
