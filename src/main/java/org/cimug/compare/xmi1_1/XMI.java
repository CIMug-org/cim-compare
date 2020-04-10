//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.25 at 06:13:11 PM CDT 
//

package org.cimug.compare.xmi1_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for XMIType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="XMIType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="XMI.header" type="{}XMI.headerType"/&gt;
 *         &lt;element name="XMI.content" type="{}XMI.contentType"/&gt;
 *         &lt;element name="XMI.difference" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="XMI.extensions" type="{}XMI.extensionsType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="xmi.version" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="timestamp" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XMIType", propOrder = { "xmiHeader", "xmiContent", "xmiDifference", "xmiExtensions" })
@XmlRootElement(name = "XMI")
public class XMI {

	@XmlElement(name = "XMI.header", required = true)
	protected XMIHeaderType xmiHeader;
	@XmlElement(name = "XMI.content", required = true)
	protected XMIContentType xmiContent;
	@XmlElement(name = "XMI.difference", required = true)
	protected String xmiDifference;
	@XmlElement(name = "XMI.extensions", required = true)
	protected XMIExtensionsType xmiExtensions;
	@XmlAttribute(name = "xmi.version")
	protected String xmiVersion;
	@XmlAttribute(name = "timestamp")
	protected String timestamp;

	/**
	 * Gets the value of the xmiHeader property.
	 * 
	 * @return possible object is {@link XMIHeaderType }
	 * 
	 */
	public XMIHeaderType getXMIHeader() {
		return xmiHeader;
	}

	/**
	 * Sets the value of the xmiHeader property.
	 * 
	 * @param value
	 *            allowed object is {@link XMIHeaderType }
	 * 
	 */
	public void setXMIHeader(XMIHeaderType value) {
		this.xmiHeader = value;
	}

	/**
	 * Gets the value of the xmiContent property.
	 * 
	 * @return possible object is {@link XMIContentType }
	 * 
	 */
	public XMIContentType getXMIContent() {
		return xmiContent;
	}

	/**
	 * Sets the value of the xmiContent property.
	 * 
	 * @param value
	 *            allowed object is {@link XMIContentType }
	 * 
	 */
	public void setXMIContent(XMIContentType value) {
		this.xmiContent = value;
	}

	/**
	 * Gets the value of the xmiDifference property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getXMIDifference() {
		return xmiDifference;
	}

	/**
	 * Sets the value of the xmiDifference property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setXMIDifference(String value) {
		this.xmiDifference = value;
	}

	/**
	 * Gets the value of the xmiExtensions property.
	 * 
	 * @return possible object is {@link XMIExtensionsType }
	 * 
	 */
	public XMIExtensionsType getXMIExtensions() {
		return xmiExtensions;
	}

	/**
	 * Sets the value of the xmiExtensions property.
	 * 
	 * @param value
	 *            allowed object is {@link XMIExtensionsType }
	 * 
	 */
	public void setXMIExtensions(XMIExtensionsType value) {
		this.xmiExtensions = value;
	}

	/**
	 * Gets the value of the xmiVersion property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getXmiVersion() {
		return xmiVersion;
	}

	/**
	 * Sets the value of the xmiVersion property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setXmiVersion(String value) {
		this.xmiVersion = value;
	}

	/**
	 * Gets the value of the timestamp property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTimestamp() {
		return timestamp;
	}

	/**
	 * Sets the value of the timestamp property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTimestamp(String value) {
		this.timestamp = value;
	}

}
