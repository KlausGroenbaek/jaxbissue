# jaxbissue
Demonstrates the leniency issue with JAXB

Oracle made a change to the JRE with regards to JAXB. JRE 1.8u91 and previous versions was lenient, 
and parsed invalidly namespaced XML. 1.8u101 and newer does not allow this type of invalid XML.
