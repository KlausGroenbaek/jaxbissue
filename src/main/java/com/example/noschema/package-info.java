/**
 * By disabling ths XmlSchema we can make 1.8u101 and newer pass XML that is not properly namespaced, but then it no longer reads correctly formmatted XML
 */
//@javax.xml.bind.annotation.XmlSchema(namespace = "http://localhost:8080/myNamespace.xsd", elementFormDefault = javax.xml.bind.annotation.XmlNsForm.QUALIFIED)
package com.example.noschema;
