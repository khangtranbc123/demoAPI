package com.example.demoapi.model.CicResponse;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Data
@XmlRootElement(name = "ITEMS")
public class Items {
    @JacksonXmlProperty(localName = "ITEM")
    List<ITEM> List_ITEM;

}
