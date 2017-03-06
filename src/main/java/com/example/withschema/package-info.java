/**
 * Maps the classes in this package to an XML namespace.
 * When this is present xml elements have to be properly namespaced or 1.8u101 will not convert them correctly using JaxB
 */
@javax.xml.bind.annotation.XmlSchema(namespace = "http://localhost:8080/myNamespace.xsd", elementFormDefault = javax.xml.bind.annotation.XmlNsForm.QUALIFIED)
package com.example.withschema;
