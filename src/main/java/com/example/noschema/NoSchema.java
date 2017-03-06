/* Copyright (c) 2011 Danish Maritime Authority.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.noschema;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;

/**
 *
* When you don't have a package-info.java which defines a @XmlSchema, 1.8u101 will parse xml where elements are not correctly
 * namespaced, but not elements that are correctly namespaced
 *
 * @author Klaus Groenbaek
 *         Created 06/03/17.
 */
public class NoSchema {

    public static void main(String[] args) throws Exception {

        loadXML("/broken.xml");
        loadXML("/correct.xml");
        loadXML("/default.xml");

    }

    private static void loadXML(String resource) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance("com.example.noschema");
        InputStream resourceAsStream = NoSchema.class.getResourceAsStream(resource);

        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        JAXBElement<ARoot> instance = (JAXBElement<ARoot>) jaxbUnmarshaller.unmarshal(resourceAsStream);
        ARoot value = instance.getValue();

        System.out.println(String.format("%-12s id:%s", resource,value.id));
    }

}
