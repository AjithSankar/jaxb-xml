package com.learn.createxml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.StringWriter;

public class GenerateXml {

    public static void main(String[] args) throws ParserConfigurationException, TransformerException {
        createXml();
    }

    public static void createXml() throws ParserConfigurationException, TransformerException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.newDocument();

        Node node = null;

        Element processPurchaseOrder = document.createElement("ProcessPurchaseOrder");
        Element dataArea = document.createElement("DataArea");
        Element purchaseOrder = document.createElement("PurchaseOrder");
        Element purchaseOrderHeader = document.createElement("PurchaseOrderHeader");
        Element purchaseOrderLine = document.createElement("PurchaseOrderLine");
        document.appendChild(processPurchaseOrder);
        processPurchaseOrder.appendChild(dataArea);
        dataArea.appendChild(purchaseOrder);
        purchaseOrder.appendChild(purchaseOrderHeader);
        purchaseOrder.appendChild(purchaseOrderLine);

        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = tf.newTransformer();
        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION,"Yes");

        StringWriter stringWriter = new StringWriter();
        transformer.transform(new DOMSource(document),new StreamResult(stringWriter));
        String xmlString = stringWriter.getBuffer().toString();
        System.out.println(xmlString);

    }
}
