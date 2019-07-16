//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.07.13 às 07:39:03 PM BRT 
//


package br.com.spring.model.generated.reinf;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="evtInfoContri"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ideEvento"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="tpAmb" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                             &lt;element name="procEmi" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                             &lt;element name="verProc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ideContri"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="tpInsc" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                             &lt;element name="nrInsc" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="infoContri"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="inclusao"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="idePeriodo"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="iniValid" type="{http://www.w3.org/2001/XMLSchema}gYearMonth"/&gt;
 *                                                 &lt;element name="fimValid" type="{http://www.w3.org/2001/XMLSchema}gYearMonth"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="infoCadastro"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="classTrib" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                                                 &lt;element name="indEscrituracao" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                                                 &lt;element name="indDesoneracao" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                                                 &lt;element name="indAcordoIsenMulta" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                                                 &lt;element name="indSitPJ" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                                                 &lt;element name="contato"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="nmCtt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                           &lt;element name="cpfCtt" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/&gt;
 *                                                           &lt;element name="foneFixo" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *                                                           &lt;element name="foneCel" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *                                                           &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="softHouse"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="cnpjSoftHouse" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/&gt;
 *                                                           &lt;element name="nmRazao" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                           &lt;element name="nmCont" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                           &lt;element name="telefone" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *                                                           &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "evtInfoContri"
})
@XmlRootElement(name = "Reinf")
public class Reinf {

    @XmlElement(required = true)
    protected Reinf.EvtInfoContri evtInfoContri;

    /**
     * Obtém o valor da propriedade evtInfoContri.
     * 
     * @return
     *     possible object is
     *     {@link Reinf.EvtInfoContri }
     *     
     */
    public Reinf.EvtInfoContri getEvtInfoContri() {
        return evtInfoContri;
    }

    /**
     * Define o valor da propriedade evtInfoContri.
     * 
     * @param value
     *     allowed object is
     *     {@link Reinf.EvtInfoContri }
     *     
     */
    public void setEvtInfoContri(Reinf.EvtInfoContri value) {
        this.evtInfoContri = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ideEvento"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="tpAmb" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                   &lt;element name="procEmi" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                   &lt;element name="verProc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ideContri"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="tpInsc" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                   &lt;element name="nrInsc" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="infoContri"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="inclusao"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="idePeriodo"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="iniValid" type="{http://www.w3.org/2001/XMLSchema}gYearMonth"/&gt;
     *                                       &lt;element name="fimValid" type="{http://www.w3.org/2001/XMLSchema}gYearMonth"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="infoCadastro"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="classTrib" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                                       &lt;element name="indEscrituracao" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                                       &lt;element name="indDesoneracao" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                                       &lt;element name="indAcordoIsenMulta" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                                       &lt;element name="indSitPJ" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *                                       &lt;element name="contato"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="nmCtt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                                 &lt;element name="cpfCtt" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/&gt;
     *                                                 &lt;element name="foneFixo" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
     *                                                 &lt;element name="foneCel" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
     *                                                 &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="softHouse"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="cnpjSoftHouse" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/&gt;
     *                                                 &lt;element name="nmRazao" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                                 &lt;element name="nmCont" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                                 &lt;element name="telefone" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
     *                                                 &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ideEvento",
        "ideContri",
        "infoContri"
    })
    public static class EvtInfoContri {

        @XmlElement(required = true)
        protected Reinf.EvtInfoContri.IdeEvento ideEvento;
        @XmlElement(required = true)
        protected Reinf.EvtInfoContri.IdeContri ideContri;
        @XmlElement(required = true)
        protected Reinf.EvtInfoContri.InfoContri infoContri;
        @XmlAttribute(name = "id", required = true)
        protected String id;

        /**
         * Obtém o valor da propriedade ideEvento.
         * 
         * @return
         *     possible object is
         *     {@link Reinf.EvtInfoContri.IdeEvento }
         *     
         */
        public Reinf.EvtInfoContri.IdeEvento getIdeEvento() {
            return ideEvento;
        }

        /**
         * Define o valor da propriedade ideEvento.
         * 
         * @param value
         *     allowed object is
         *     {@link Reinf.EvtInfoContri.IdeEvento }
         *     
         */
        public void setIdeEvento(Reinf.EvtInfoContri.IdeEvento value) {
            this.ideEvento = value;
        }

        /**
         * Obtém o valor da propriedade ideContri.
         * 
         * @return
         *     possible object is
         *     {@link Reinf.EvtInfoContri.IdeContri }
         *     
         */
        public Reinf.EvtInfoContri.IdeContri getIdeContri() {
            return ideContri;
        }

        /**
         * Define o valor da propriedade ideContri.
         * 
         * @param value
         *     allowed object is
         *     {@link Reinf.EvtInfoContri.IdeContri }
         *     
         */
        public void setIdeContri(Reinf.EvtInfoContri.IdeContri value) {
            this.ideContri = value;
        }

        /**
         * Obtém o valor da propriedade infoContri.
         * 
         * @return
         *     possible object is
         *     {@link Reinf.EvtInfoContri.InfoContri }
         *     
         */
        public Reinf.EvtInfoContri.InfoContri getInfoContri() {
            return infoContri;
        }

        /**
         * Define o valor da propriedade infoContri.
         * 
         * @param value
         *     allowed object is
         *     {@link Reinf.EvtInfoContri.InfoContri }
         *     
         */
        public void setInfoContri(Reinf.EvtInfoContri.InfoContri value) {
            this.infoContri = value;
        }

        /**
         * Obtém o valor da propriedade id.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Define o valor da propriedade id.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="tpInsc" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *         &lt;element name="nrInsc" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "tpInsc",
            "nrInsc"
        })
        public static class IdeContri {

            @XmlSchemaType(name = "unsignedByte")
            protected short tpInsc;
            @XmlSchemaType(name = "unsignedInt")
            protected long nrInsc;

            /**
             * Obtém o valor da propriedade tpInsc.
             * 
             */
            public short getTpInsc() {
                return tpInsc;
            }

            /**
             * Define o valor da propriedade tpInsc.
             * 
             */
            public void setTpInsc(short value) {
                this.tpInsc = value;
            }

            /**
             * Obtém o valor da propriedade nrInsc.
             * 
             */
            public long getNrInsc() {
                return nrInsc;
            }

            /**
             * Define o valor da propriedade nrInsc.
             * 
             */
            public void setNrInsc(long value) {
                this.nrInsc = value;
            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="tpAmb" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *         &lt;element name="procEmi" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *         &lt;element name="verProc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "tpAmb",
            "procEmi",
            "verProc"
        })
        public static class IdeEvento {

            @XmlSchemaType(name = "unsignedByte")
            protected short tpAmb;
            @XmlSchemaType(name = "unsignedByte")
            protected short procEmi;
            @XmlElement(required = true)
            protected String verProc;

            /**
             * Obtém o valor da propriedade tpAmb.
             * 
             */
            public short getTpAmb() {
                return tpAmb;
            }

            /**
             * Define o valor da propriedade tpAmb.
             * 
             */
            public void setTpAmb(short value) {
                this.tpAmb = value;
            }

            /**
             * Obtém o valor da propriedade procEmi.
             * 
             */
            public short getProcEmi() {
                return procEmi;
            }

            /**
             * Define o valor da propriedade procEmi.
             * 
             */
            public void setProcEmi(short value) {
                this.procEmi = value;
            }

            /**
             * Obtém o valor da propriedade verProc.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVerProc() {
                return verProc;
            }

            /**
             * Define o valor da propriedade verProc.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVerProc(String value) {
                this.verProc = value;
            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="inclusao"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="idePeriodo"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="iniValid" type="{http://www.w3.org/2001/XMLSchema}gYearMonth"/&gt;
         *                             &lt;element name="fimValid" type="{http://www.w3.org/2001/XMLSchema}gYearMonth"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="infoCadastro"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="classTrib" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *                             &lt;element name="indEscrituracao" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *                             &lt;element name="indDesoneracao" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *                             &lt;element name="indAcordoIsenMulta" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *                             &lt;element name="indSitPJ" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
         *                             &lt;element name="contato"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="nmCtt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                                       &lt;element name="cpfCtt" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/&gt;
         *                                       &lt;element name="foneFixo" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
         *                                       &lt;element name="foneCel" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
         *                                       &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                                     &lt;/sequence&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="softHouse"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="cnpjSoftHouse" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/&gt;
         *                                       &lt;element name="nmRazao" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                                       &lt;element name="nmCont" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                                       &lt;element name="telefone" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
         *                                       &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                                     &lt;/sequence&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "inclusao"
        })
        public static class InfoContri {

            @XmlElement(required = true)
            protected Reinf.EvtInfoContri.InfoContri.Inclusao inclusao;

            /**
             * Obtém o valor da propriedade inclusao.
             * 
             * @return
             *     possible object is
             *     {@link Reinf.EvtInfoContri.InfoContri.Inclusao }
             *     
             */
            public Reinf.EvtInfoContri.InfoContri.Inclusao getInclusao() {
                return inclusao;
            }

            /**
             * Define o valor da propriedade inclusao.
             * 
             * @param value
             *     allowed object is
             *     {@link Reinf.EvtInfoContri.InfoContri.Inclusao }
             *     
             */
            public void setInclusao(Reinf.EvtInfoContri.InfoContri.Inclusao value) {
                this.inclusao = value;
            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="idePeriodo"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="iniValid" type="{http://www.w3.org/2001/XMLSchema}gYearMonth"/&gt;
             *                   &lt;element name="fimValid" type="{http://www.w3.org/2001/XMLSchema}gYearMonth"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="infoCadastro"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="classTrib" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
             *                   &lt;element name="indEscrituracao" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
             *                   &lt;element name="indDesoneracao" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
             *                   &lt;element name="indAcordoIsenMulta" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
             *                   &lt;element name="indSitPJ" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
             *                   &lt;element name="contato"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="nmCtt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                             &lt;element name="cpfCtt" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/&gt;
             *                             &lt;element name="foneFixo" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
             *                             &lt;element name="foneCel" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
             *                             &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                           &lt;/sequence&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="softHouse"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="cnpjSoftHouse" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/&gt;
             *                             &lt;element name="nmRazao" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                             &lt;element name="nmCont" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                             &lt;element name="telefone" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
             *                             &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                           &lt;/sequence&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "idePeriodo",
                "infoCadastro"
            })
            public static class Inclusao {

                @XmlElement(required = true)
                protected Reinf.EvtInfoContri.InfoContri.Inclusao.IdePeriodo idePeriodo;
                @XmlElement(required = true)
                protected Reinf.EvtInfoContri.InfoContri.Inclusao.InfoCadastro infoCadastro;

                /**
                 * Obtém o valor da propriedade idePeriodo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Reinf.EvtInfoContri.InfoContri.Inclusao.IdePeriodo }
                 *     
                 */
                public Reinf.EvtInfoContri.InfoContri.Inclusao.IdePeriodo getIdePeriodo() {
                    return idePeriodo;
                }

                /**
                 * Define o valor da propriedade idePeriodo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Reinf.EvtInfoContri.InfoContri.Inclusao.IdePeriodo }
                 *     
                 */
                public void setIdePeriodo(Reinf.EvtInfoContri.InfoContri.Inclusao.IdePeriodo value) {
                    this.idePeriodo = value;
                }

                /**
                 * Obtém o valor da propriedade infoCadastro.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Reinf.EvtInfoContri.InfoContri.Inclusao.InfoCadastro }
                 *     
                 */
                public Reinf.EvtInfoContri.InfoContri.Inclusao.InfoCadastro getInfoCadastro() {
                    return infoCadastro;
                }

                /**
                 * Define o valor da propriedade infoCadastro.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Reinf.EvtInfoContri.InfoContri.Inclusao.InfoCadastro }
                 *     
                 */
                public void setInfoCadastro(Reinf.EvtInfoContri.InfoContri.Inclusao.InfoCadastro value) {
                    this.infoCadastro = value;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="iniValid" type="{http://www.w3.org/2001/XMLSchema}gYearMonth"/&gt;
                 *         &lt;element name="fimValid" type="{http://www.w3.org/2001/XMLSchema}gYearMonth"/&gt;
                 *       &lt;/sequence&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "iniValid",
                    "fimValid"
                })
                public static class IdePeriodo {

                    @XmlElement(required = true)
                    @XmlSchemaType(name = "gYearMonth")
                    protected XMLGregorianCalendar iniValid;
                    @XmlElement(required = true)
                    @XmlSchemaType(name = "gYearMonth")
                    protected XMLGregorianCalendar fimValid;

                    /**
                     * Obtém o valor da propriedade iniValid.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getIniValid() {
                        return iniValid;
                    }

                    /**
                     * Define o valor da propriedade iniValid.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setIniValid(XMLGregorianCalendar value) {
                        this.iniValid = value;
                    }

                    /**
                     * Obtém o valor da propriedade fimValid.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getFimValid() {
                        return fimValid;
                    }

                    /**
                     * Define o valor da propriedade fimValid.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setFimValid(XMLGregorianCalendar value) {
                        this.fimValid = value;
                    }

                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="classTrib" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
                 *         &lt;element name="indEscrituracao" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
                 *         &lt;element name="indDesoneracao" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
                 *         &lt;element name="indAcordoIsenMulta" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
                 *         &lt;element name="indSitPJ" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
                 *         &lt;element name="contato"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="nmCtt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *                   &lt;element name="cpfCtt" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/&gt;
                 *                   &lt;element name="foneFixo" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
                 *                   &lt;element name="foneCel" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
                 *                   &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *                 &lt;/sequence&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="softHouse"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="cnpjSoftHouse" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/&gt;
                 *                   &lt;element name="nmRazao" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *                   &lt;element name="nmCont" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *                   &lt;element name="telefone" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
                 *                   &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *                 &lt;/sequence&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *       &lt;/sequence&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "classTrib",
                    "indEscrituracao",
                    "indDesoneracao",
                    "indAcordoIsenMulta",
                    "indSitPJ",
                    "contato",
                    "softHouse"
                })
                public static class InfoCadastro {

                    @XmlSchemaType(name = "unsignedByte")
                    protected short classTrib;
                    @XmlSchemaType(name = "unsignedByte")
                    protected short indEscrituracao;
                    @XmlSchemaType(name = "unsignedByte")
                    protected short indDesoneracao;
                    @XmlSchemaType(name = "unsignedByte")
                    protected short indAcordoIsenMulta;
                    @XmlSchemaType(name = "unsignedByte")
                    protected short indSitPJ;
                    @XmlElement(required = true)
                    protected Reinf.EvtInfoContri.InfoContri.Inclusao.InfoCadastro.Contato contato;
                    @XmlElement(required = true)
                    protected Reinf.EvtInfoContri.InfoContri.Inclusao.InfoCadastro.SoftHouse softHouse;

                    /**
                     * Obtém o valor da propriedade classTrib.
                     * 
                     */
                    public short getClassTrib() {
                        return classTrib;
                    }

                    /**
                     * Define o valor da propriedade classTrib.
                     * 
                     */
                    public void setClassTrib(short value) {
                        this.classTrib = value;
                    }

                    /**
                     * Obtém o valor da propriedade indEscrituracao.
                     * 
                     */
                    public short getIndEscrituracao() {
                        return indEscrituracao;
                    }

                    /**
                     * Define o valor da propriedade indEscrituracao.
                     * 
                     */
                    public void setIndEscrituracao(short value) {
                        this.indEscrituracao = value;
                    }

                    /**
                     * Obtém o valor da propriedade indDesoneracao.
                     * 
                     */
                    public short getIndDesoneracao() {
                        return indDesoneracao;
                    }

                    /**
                     * Define o valor da propriedade indDesoneracao.
                     * 
                     */
                    public void setIndDesoneracao(short value) {
                        this.indDesoneracao = value;
                    }

                    /**
                     * Obtém o valor da propriedade indAcordoIsenMulta.
                     * 
                     */
                    public short getIndAcordoIsenMulta() {
                        return indAcordoIsenMulta;
                    }

                    /**
                     * Define o valor da propriedade indAcordoIsenMulta.
                     * 
                     */
                    public void setIndAcordoIsenMulta(short value) {
                        this.indAcordoIsenMulta = value;
                    }

                    /**
                     * Obtém o valor da propriedade indSitPJ.
                     * 
                     */
                    public short getIndSitPJ() {
                        return indSitPJ;
                    }

                    /**
                     * Define o valor da propriedade indSitPJ.
                     * 
                     */
                    public void setIndSitPJ(short value) {
                        this.indSitPJ = value;
                    }

                    /**
                     * Obtém o valor da propriedade contato.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Reinf.EvtInfoContri.InfoContri.Inclusao.InfoCadastro.Contato }
                     *     
                     */
                    public Reinf.EvtInfoContri.InfoContri.Inclusao.InfoCadastro.Contato getContato() {
                        return contato;
                    }

                    /**
                     * Define o valor da propriedade contato.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Reinf.EvtInfoContri.InfoContri.Inclusao.InfoCadastro.Contato }
                     *     
                     */
                    public void setContato(Reinf.EvtInfoContri.InfoContri.Inclusao.InfoCadastro.Contato value) {
                        this.contato = value;
                    }

                    /**
                     * Obtém o valor da propriedade softHouse.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Reinf.EvtInfoContri.InfoContri.Inclusao.InfoCadastro.SoftHouse }
                     *     
                     */
                    public Reinf.EvtInfoContri.InfoContri.Inclusao.InfoCadastro.SoftHouse getSoftHouse() {
                        return softHouse;
                    }

                    /**
                     * Define o valor da propriedade softHouse.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Reinf.EvtInfoContri.InfoContri.Inclusao.InfoCadastro.SoftHouse }
                     *     
                     */
                    public void setSoftHouse(Reinf.EvtInfoContri.InfoContri.Inclusao.InfoCadastro.SoftHouse value) {
                        this.softHouse = value;
                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * &lt;complexType&gt;
                     *   &lt;complexContent&gt;
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *       &lt;sequence&gt;
                     *         &lt;element name="nmCtt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                     *         &lt;element name="cpfCtt" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/&gt;
                     *         &lt;element name="foneFixo" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
                     *         &lt;element name="foneCel" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
                     *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                     *       &lt;/sequence&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "nmCtt",
                        "cpfCtt",
                        "foneFixo",
                        "foneCel",
                        "email"
                    })
                    public static class Contato {

                        @XmlElement(required = true)
                        protected String nmCtt;
                        @XmlElement(required = true)
                        @XmlSchemaType(name = "unsignedLong")
                        protected BigInteger cpfCtt;
                        @XmlSchemaType(name = "unsignedInt")
                        protected long foneFixo;
                        @XmlSchemaType(name = "unsignedInt")
                        protected long foneCel;
                        @XmlElement(required = true)
                        protected String email;

                        /**
                         * Obtém o valor da propriedade nmCtt.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNmCtt() {
                            return nmCtt;
                        }

                        /**
                         * Define o valor da propriedade nmCtt.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNmCtt(String value) {
                            this.nmCtt = value;
                        }

                        /**
                         * Obtém o valor da propriedade cpfCtt.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigInteger }
                         *     
                         */
                        public BigInteger getCpfCtt() {
                            return cpfCtt;
                        }

                        /**
                         * Define o valor da propriedade cpfCtt.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigInteger }
                         *     
                         */
                        public void setCpfCtt(BigInteger value) {
                            this.cpfCtt = value;
                        }

                        /**
                         * Obtém o valor da propriedade foneFixo.
                         * 
                         */
                        public long getFoneFixo() {
                            return foneFixo;
                        }

                        /**
                         * Define o valor da propriedade foneFixo.
                         * 
                         */
                        public void setFoneFixo(long value) {
                            this.foneFixo = value;
                        }

                        /**
                         * Obtém o valor da propriedade foneCel.
                         * 
                         */
                        public long getFoneCel() {
                            return foneCel;
                        }

                        /**
                         * Define o valor da propriedade foneCel.
                         * 
                         */
                        public void setFoneCel(long value) {
                            this.foneCel = value;
                        }

                        /**
                         * Obtém o valor da propriedade email.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getEmail() {
                            return email;
                        }

                        /**
                         * Define o valor da propriedade email.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setEmail(String value) {
                            this.email = value;
                        }

                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * &lt;complexType&gt;
                     *   &lt;complexContent&gt;
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *       &lt;sequence&gt;
                     *         &lt;element name="cnpjSoftHouse" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/&gt;
                     *         &lt;element name="nmRazao" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                     *         &lt;element name="nmCont" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                     *         &lt;element name="telefone" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
                     *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                     *       &lt;/sequence&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "cnpjSoftHouse",
                        "nmRazao",
                        "nmCont",
                        "telefone",
                        "email"
                    })
                    public static class SoftHouse {

                        @XmlElement(required = true)
                        @XmlSchemaType(name = "unsignedLong")
                        protected BigInteger cnpjSoftHouse;
                        @XmlElement(required = true)
                        protected String nmRazao;
                        @XmlElement(required = true)
                        protected String nmCont;
                        @XmlSchemaType(name = "unsignedInt")
                        protected long telefone;
                        @XmlElement(required = true)
                        protected String email;

                        /**
                         * Obtém o valor da propriedade cnpjSoftHouse.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigInteger }
                         *     
                         */
                        public BigInteger getCnpjSoftHouse() {
                            return cnpjSoftHouse;
                        }

                        /**
                         * Define o valor da propriedade cnpjSoftHouse.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigInteger }
                         *     
                         */
                        public void setCnpjSoftHouse(BigInteger value) {
                            this.cnpjSoftHouse = value;
                        }

                        /**
                         * Obtém o valor da propriedade nmRazao.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNmRazao() {
                            return nmRazao;
                        }

                        /**
                         * Define o valor da propriedade nmRazao.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNmRazao(String value) {
                            this.nmRazao = value;
                        }

                        /**
                         * Obtém o valor da propriedade nmCont.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNmCont() {
                            return nmCont;
                        }

                        /**
                         * Define o valor da propriedade nmCont.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNmCont(String value) {
                            this.nmCont = value;
                        }

                        /**
                         * Obtém o valor da propriedade telefone.
                         * 
                         */
                        public long getTelefone() {
                            return telefone;
                        }

                        /**
                         * Define o valor da propriedade telefone.
                         * 
                         */
                        public void setTelefone(long value) {
                            this.telefone = value;
                        }

                        /**
                         * Obtém o valor da propriedade email.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getEmail() {
                            return email;
                        }

                        /**
                         * Define o valor da propriedade email.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setEmail(String value) {
                            this.email = value;
                        }

                    }

                }

            }

        }

    }

}
