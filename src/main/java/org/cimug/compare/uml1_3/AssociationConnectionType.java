//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.25 at 06:13:11 PM CDT 
//

package org.cimug.compare.uml1_3;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for Association.connectionType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Association.connectionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AssociationEnd" type="{omg.org/UML1.3}AssociationEndType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AssociationEndRole" type="{omg.org/UML1.3}AssociationEndRoleType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Association.connectionType", propOrder = { "associationEnds", "associationEndRoles" })
public class AssociationConnectionType {

	@XmlElement(name = "AssociationEnd")
	protected List<AssociationEndType> associationEnds;
	@XmlElement(name = "AssociationEndRole")
	protected List<AssociationEndRoleType> associationEndRoles;

	/**
	 * Gets the value of the associationEnds property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the associationEnds property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAssociationEnds().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link AssociationEndType }
	 * 
	 * 
	 */
	public List<AssociationEndType> getAssociationEnds() {
		if (associationEnds == null) {
			associationEnds = new ArrayList<AssociationEndType>();
		}
		return this.associationEnds;
	}

	/**
	 * Gets the value of the associationEndRoles property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the associationEndRoles property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAssociationEndRoles().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link AssociationEndRoleType }
	 * 
	 * 
	 */
	public List<AssociationEndRoleType> getAssociationEndRoles() {
		if (associationEndRoles == null) {
			associationEndRoles = new ArrayList<AssociationEndRoleType>();
		}
		return this.associationEndRoles;
	}

}
