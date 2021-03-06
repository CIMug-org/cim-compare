//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.25 at 06:13:11 PM CDT 
//

package org.cimug.compare.xmi1_1;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.cimug.compare.uml1_3.Diagram;
import org.cimug.compare.uml1_3.Model;

/**
 * <p>
 * Java class for XMI.contentType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="XMI.contentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{omg.org/UML1.3}Model"/&gt;
 *         &lt;element ref="{omg.org/UML1.3}Diagram" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XMI.contentType", propOrder = { "model", "diagrams" })
public class XMIContentType {

	@XmlElement(name = "Model", namespace = "omg.org/UML1.3", required = true)
	protected Model model;
	@XmlElement(name = "Diagram", namespace = "omg.org/UML1.3")
	protected List<Diagram> diagrams;

	/**
	 * Gets the value of the model property.
	 * 
	 * @return possible object is {@link Model }
	 * 
	 */
	public Model getModel() {
		return model;
	}

	/**
	 * Sets the value of the model property.
	 * 
	 * @param value
	 *            allowed object is {@link Model }
	 * 
	 */
	public void setModel(Model value) {
		this.model = value;
	}

	/**
	 * Gets the value of the diagrams property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the diagrams property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getDiagrams().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Diagram }
	 * 
	 * 
	 */
	public List<Diagram> getDiagrams() {
		if (diagrams == null) {
			diagrams = new ArrayList<Diagram>();
		}
		return this.diagrams;
	}

}
