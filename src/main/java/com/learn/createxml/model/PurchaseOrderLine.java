package com.learn.createxml.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name = "PurchaseOrderLine")
@XmlAccessorType(XmlAccessType.FIELD)
public class PurchaseOrderLine {

    @XmlElement(name = "LineNumber")
    private String lineNumber;

    @XmlElement(name = "Item")
    private Item item;

    @XmlElement(name = "Quantity")
    private Quantity quantity;

    @XmlElement(name = "UnitPrice")
    private String unitPrice;

    @XmlElement(name = "ExtendedAmount")
    private String extendedAmount;

    @XmlElement(name = "UserArea")
    private String userArea;

    @XmlElement(name = "Tax")
    private Tax tax;
}
