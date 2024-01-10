
package com.myliberary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addBook complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addBook">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bookId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bookName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bookStream" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bookClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="available" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addBook", propOrder = {
    "bookId",
    "bookName",
    "author",
    "bookStream",
    "bookClass",
    "available"
})
public class AddBook {

    protected String bookId;
    protected String bookName;
    protected String author;
    protected String bookStream;
    protected String bookClass;
    protected String available;

    /**
     * Gets the value of the bookId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookId() {
        return bookId;
    }

    /**
     * Sets the value of the bookId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookId(String value) {
        this.bookId = value;
    }

    /**
     * Gets the value of the bookName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookName() {
        return bookName;
    }

    /**
     * Sets the value of the bookName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookName(String value) {
        this.bookName = value;
    }

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
    }

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

    /**
     * Gets the value of the available property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailable() {
        return available;
    }

    /**
     * Sets the value of the available property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailable(String value) {
        this.available = value;
    }

}
