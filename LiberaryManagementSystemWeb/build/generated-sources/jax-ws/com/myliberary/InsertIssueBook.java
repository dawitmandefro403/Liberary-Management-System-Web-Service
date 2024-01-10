
package com.myliberary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for insertIssueBook complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="insertIssueBook">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="studId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="studName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bookId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bookName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="issueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="studStream" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="studClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertIssueBook", propOrder = {
    "studId",
    "studName",
    "bookId",
    "bookName",
    "address",
    "issueDate",
    "studStream",
    "studClass"
})
public class InsertIssueBook {

    protected String studId;
    protected String studName;
    protected String bookId;
    protected String bookName;
    protected String address;
    protected String issueDate;
    protected String studStream;
    protected String studClass;

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
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueDate(String value) {
        this.issueDate = value;
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

}
