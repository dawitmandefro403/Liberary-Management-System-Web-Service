
package com.myliberary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bookDetailByStream complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bookDetailByStream">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bookStream" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bookClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bookDetailByStream", propOrder = {
    "bookStream",
    "bookClass"
})
public class BookDetailByStream {

    protected String bookStream;
    protected String bookClass;

    /**
     * Gets the value of the bookStream property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookStream() {
        return bookStream;
    }

    /**
     * Sets the value of the bookStream property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookStream(String value) {
        this.bookStream = value;
    }

    /**
     * Gets the value of the bookClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookClass() {
        return bookClass;
    }

    /**
     * Sets the value of the bookClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookClass(String value) {
        this.bookClass = value;
    }

}
