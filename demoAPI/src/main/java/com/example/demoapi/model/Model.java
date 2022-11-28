package com.example.demoapi.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@Getter
@Setter
public class Model {
    String name;
    String id;
    public Model( String name, String id) {
        this.name = name;
        this.id  = id;
    }

    public Model() {
    }
}
