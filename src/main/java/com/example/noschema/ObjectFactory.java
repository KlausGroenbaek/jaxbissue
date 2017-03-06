package com.example.noschema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private final static QName QNAME = new QName("http://localhost:8080/myNamespace.xsd", "aroot");

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ARoot }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:8080/myNamespace.xsd", name = "aroot")
    public JAXBElement<ARoot> createRoot(ARoot value) {
        return new JAXBElement<ARoot>(QNAME, ARoot.class, null, value);
    }

}
