//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.19 at 10:47:45 PM JST 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for configurationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="configurationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="htags_dir" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="output_dir" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="regex" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="graphviz" type="{}graphvizType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "configurationType", propOrder = {
    "htagsDir",
    "outputDir",
    "regex",
    "graphviz"
})
public class ConfigurationType {

    @XmlElement(name = "htags_dir", required = true)
    protected String htagsDir;
    @XmlElement(name = "output_dir", required = true)
    protected String outputDir;
    @XmlElement(required = true)
    protected String regex;
    @XmlElement(required = true)
    protected GraphvizType graphviz;

    /**
     * Gets the value of the htagsDir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtagsDir() {
        return htagsDir;
    }

    /**
     * Sets the value of the htagsDir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtagsDir(String value) {
        this.htagsDir = value;
    }

    /**
     * Gets the value of the outputDir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputDir() {
        return outputDir;
    }

    /**
     * Sets the value of the outputDir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputDir(String value) {
        this.outputDir = value;
    }

    /**
     * Gets the value of the regex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegex() {
        return regex;
    }

    /**
     * Sets the value of the regex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegex(String value) {
        this.regex = value;
    }

    /**
     * Gets the value of the graphviz property.
     * 
     * @return
     *     possible object is
     *     {@link GraphvizType }
     *     
     */
    public GraphvizType getGraphviz() {
        return graphviz;
    }

    /**
     * Sets the value of the graphviz property.
     * 
     * @param value
     *     allowed object is
     *     {@link GraphvizType }
     *     
     */
    public void setGraphviz(GraphvizType value) {
        this.graphviz = value;
    }

}
