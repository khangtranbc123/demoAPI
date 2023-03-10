package com.example.demoapi.model.CicResponse;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@XmlRootElement(name = "INFO")
public class Info {

    @JacksonXmlProperty(localName = "API_KEY")
    String API_KEY;

    @JacksonXmlProperty(localName = "API_SOURCEAPPID")
    String API_SOURCEAPPID;

    @JacksonXmlProperty(localName = "API_USERID")
    String API_USERID;

    @JacksonXmlProperty(localName = "API_USERPASSWORD")
    String API_USERPASSWORD;


}
