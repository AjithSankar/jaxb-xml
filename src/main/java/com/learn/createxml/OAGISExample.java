package com.learn.createxml;

import com.learn.createxml.model.*;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static jakarta.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT;

public class OAGISExample {
    public static void main(String[] args) throws JAXBException {
        marshallingExample();
    }

    private static void marshallingExample() throws JAXBException {

        JAXBContext jaxbContext = JAXBContext.newInstance(ProcessPurchaseOrder.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(JAXB_FORMATTED_OUTPUT,true);
        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);

        ProcessPurchaseOrder processPurchaseOrder = new ProcessPurchaseOrder();
        DataArea dataArea = new DataArea();
        PurchaseOrder purchaseOrder = new PurchaseOrder();
        PurchaseOrderHeader purchaseOrderHeader = new PurchaseOrderHeader();
        purchaseOrderHeader.setType("CREDIT");
        purchaseOrderHeader.setTotalAmount("1100");

        Address billToAddress = Address.builder()
                .id("BillTo")
                .addressLine1("No.10 4th street")
                .addressLine2("Washington road")
                .cityName("Washington")
                .countryCode("123")
                .postalCode("7809")
                .build();

        Address shipToAddress = Address.builder()
                .id("ShipTo")
                .addressLine1("No.144 Dubai street")
                .addressLine2("Dubai road")
                .cityName("Dubai")
                .countryCode("987")
                .postalCode("12345")
                .build();

        CustomerParty customerParty = CustomerParty.builder()
                .name("Arthex inc")
                .BillToAddress(billToAddress)
                .contact("arthex@gmail.com")
                .build();

        SupplierParty supplierParty = SupplierParty.builder()
                .name("AdventHealth")
                .shipToAddress(shipToAddress)
                .contact("adventHealth@gmail.com")
                .build();

        RemitToParty remitToParty = RemitToParty.builder()
                .name("Arthex inc")
                .remitToAddress(billToAddress)
                .contact("arthex@gmail.com")
                .build();

        purchaseOrderHeader.setCustomerParty(customerParty);
        purchaseOrderHeader.setSupplierParty(supplierParty);
        purchaseOrderHeader.setRemitToParty(remitToParty);

        List<PurchaseOrderLine> purchaseOrderLineList = new ArrayList<>();

        Quantity quantity = new Quantity();
        quantity.setUom("EA");
        quantity.setQuantity("2");

        Item item = new Item();
        item.setItemId("ABC123");
        item.setDescription("SYRINGE 10MM");
        PurchaseOrderLine purchaseOrderLine1 = PurchaseOrderLine.builder()
                .lineNumber("1")
                .item(item)
                .quantity(quantity)
                .unitPrice("100")
                .extendedAmount("200")
                .userArea("This is sample")
                .build();

        Quantity quantity2 = new Quantity();
        quantity2.setUom("BX");
        quantity2.setQuantity("3");

        Item item2 = new Item();
        item2.setItemId("ABC123");
        item2.setDescription("SYRINGE 10MM");
        PurchaseOrderLine purchaseOrderLine2 = PurchaseOrderLine.builder()
                .lineNumber("2")
                .item(item2)
                .quantity(quantity2)
                .unitPrice("300")
                .extendedAmount("900")
                .userArea("This is another sample")
                .build();

        purchaseOrderLineList.add(purchaseOrderLine1);
        purchaseOrderLineList.add(purchaseOrderLine2);

        purchaseOrder.setPurchaseOrderHeader(purchaseOrderHeader);
        purchaseOrder.setPurchaseOrderLine(purchaseOrderLineList);
        dataArea.setPurchaseOrder(purchaseOrder);
        processPurchaseOrder.setDataArea(dataArea);

        marshaller.marshal(processPurchaseOrder,System.out);
        marshaller.marshal(processPurchaseOrder,new File("OAGIS.xml"));

    }
}
