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
package com.example.withschema;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;

/**
 *
 * Demonstrates that JRE's after 1.8u91 are less lenient.
 * Run this with JRE 1.8u91 and both broken.xml and correct.xml are read
 * Run this with JRE 1.8u101 and newer and broker.xml return null for the id tag
 *
 * @author Klaus Groenbaek
 *         Created 06/03/17.
 */
public class WithSchema {

    public static void main(String[] args) throws Exception {

        loadXML("/broken.xml");
        loadXML("/correct.xml");
        loadXML("/default.xml");
    }

    private static void loadXML(String resource) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance("com.example.withschema");
        InputStream resourceAsStream = WithSchema.class.getResourceAsStream(resource);

        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        JAXBElement<ARoot> instance = (JAXBElement<ARoot>) jaxbUnmarshaller.unmarshal(resourceAsStream);
        ARoot value = instance.getValue();

        System.out.println(String.format("%-12s id:%s", resource,value.id));
    }

}
