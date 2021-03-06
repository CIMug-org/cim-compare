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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for XMI.extensionsType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="XMI.extensionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="EAModel.paramSub" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EANoteLink" type="{}EANoteLinkType"/&gt;
 *         &lt;element name="EAModel.scenario" type="{}EAModel.scenarioType"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="xmi.extender" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XMI.extensionsType", propOrder = { "eaModelParamSubsAndEANoteLinksAndEAModelScenarios" })
public class XMIExtensionsType {

	@XmlElements({ @XmlElement(name = "EAModel.paramSub", type = String.class),
			@XmlElement(name = "EANoteLink", type = EANoteLinkType.class),
			@XmlElement(name = "EAModel.scenario", type = EAModelScenarioType.class) })
	protected List<Object> eaModelParamSubsAndEANoteLinksAndEAModelScenarios;
	@XmlAttribute(name = "xmi.extender")
	protected String xmiExtender;

	/**
	 * Gets the value of the eaModelParamSubsAndEANoteLinksAndEAModelScenarios
	 * property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the eaModelParamSubsAndEANoteLinksAndEAModelScenarios property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getEAModelParamSubsAndEANoteLinksAndEAModelScenarios().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * {@link EANoteLinkType } {@link EAModelScenarioType }
	 * 
	 * 
	 */
	public List<Object> getEAModelParamSubsAndEANoteLinksAndEAModelScenarios() {
		if (eaModelParamSubsAndEANoteLinksAndEAModelScenarios == null) {
			eaModelParamSubsAndEANoteLinksAndEAModelScenarios = new ArrayList<Object>();
		}
		return this.eaModelParamSubsAndEANoteLinksAndEAModelScenarios;
	}

	/**
	 * Gets the value of the xmiExtender property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getXmiExtender() {
		return xmiExtender;
	}

	/**
	 * Sets the value of the xmiExtender property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setXmiExtender(String value) {
		this.xmiExtender = value;
	}

}
