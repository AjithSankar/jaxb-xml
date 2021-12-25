package com.learn.createxml;

import com.learn.createxml.model.Fruit;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;

import static jakarta.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT;

public class JaxbExample {
    public static void main(String[] args) throws JAXBException {

        marshallingExample();
        unMarshallingExample();
    }

    private static void unMarshallingExample() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Fruit.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        Fruit fruit = (Fruit)jaxbUnmarshaller.unmarshal(new File("fruits.xml"));
        System.out.println("Unmarshalling Fruit from xml file");
        System.out.println("Fruit : "+fruit);
    }

    private static void marshallingExample() throws JAXBException {

        JAXBContext jaxbContext = JAXBContext.newInstance(Fruit.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(JAXB_FORMATTED_OUTPUT,true);
        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
        //marshaller.setProperty(JAXB_NO_NAMESPACE_SCHEMA_LOCATION,true);

        Fruit fruit = new Fruit();
        fruit.setId(1);
        fruit.setName("Banana");
        fruit.setPrice("100");

        marshaller.marshal(fruit,System.out);
        marshaller.marshal(fruit,new File("fruits.xml"));

    }
}
