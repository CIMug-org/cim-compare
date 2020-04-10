//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.25 at 06:13:11 PM CDT 
//

package org.cimug.compare.uml1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.cimug.compare.uml1_3.ifaces.NamedType;
import org.cimug.compare.uml1_3.ifaces.TypeIdentifier;

/**
 * <p>
 * Java class for AssociationEndRoleType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="AssociationEndRoleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ModelElement.taggedValue" type="{omg.org/UML1.3}ModelElement.taggedValueType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="visibility" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="aggregation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="isOrdered" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="targetScope" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="changeable" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="isNavigable" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssociationEndRoleType", propOrder = { "modelElementTaggedValue" })
public class AssociationEndRoleType implements NamedType, TypeIdentifier {

	@XmlElement(name = "ModelElement.taggedValue", required = true)
	protected ModelElementTaggedValue modelElementTaggedValue;
	@XmlAttribute(name = "visibility")
	protected String visibility;
	@XmlAttribute(name = "aggregation")
	protected String aggregation;
	@XmlAttribute(name = "isOrdered")
	protected String isOrdered;
	@XmlAttribute(name = "targetScope")
	protected String targetScope;
	@XmlAttribute(name = "changeable")
	protected String changeable;
	@XmlAttribute(name = "isNavigable")
	protected String isNavigable;
	@XmlAttribute(name = "type")
	protected String type;
	@XmlAttribute(name = "name")
	protected String name;

	/**
	 * Gets the value of the modelElementTaggedValue property.
	 * 
	 * @return possible object is {@link ModelElementTaggedValue }
	 * 
	 */
	public ModelElementTaggedValue getModelElementTaggedValue() {
		return modelElementTaggedValue;
	}

	/**
	 * Sets the value of the modelElementTaggedValue property.
	 * 
	 * @param value
	 *            allowed object is {@link ModelElementTaggedValue }
	 * 
	 */
	public void setModelElementTaggedValue(ModelElementTaggedValue value) {
		this.modelElementTaggedValue = value;
	}

	/**
	 * Gets the value of the visibility property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVisibility() {
		return visibility;
	}

	/**
	 * Sets the value of the visibility property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVisibility(String value) {
		this.visibility = value;
	}

	/**
	 * Gets the value of the aggregation property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAggregation() {
		return aggregation;
	}

	/**
	 * Sets the value of the aggregation property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAggregation(String value) {
		this.aggregation = value;
	}

	/**
	 * Gets the value of the isOrdered property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIsOrdered() {
		return isOrdered;
	}

	/**
	 * Sets the value of the isOrdered property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIsOrdered(String value) {
		this.isOrdered = value;
	}

	/**
	 * Gets the value of the targetScope property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTargetScope() {
		return targetScope;
	}

	/**
	 * Sets the value of the targetScope property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTargetScope(String value) {
		this.targetScope = value;
	}

	/**
	 * Gets the value of the changeable property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getChangeable() {
		return changeable;
	}

	/**
	 * Sets the value of the changeable property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setChangeable(String value) {
		this.changeable = value;
	}

	/**
	 * Gets the value of the isNavigable property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIsNavigable() {
		return isNavigable;
	}

	/**
	 * Sets the value of the isNavigable property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIsNavigable(String value) {
		this.isNavigable = value;
	}

	/**
	 * Gets the value of the type property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the value of the type property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setType(String value) {
		this.type = value;
	}

	/**
	 * Gets the value of the name property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

}
