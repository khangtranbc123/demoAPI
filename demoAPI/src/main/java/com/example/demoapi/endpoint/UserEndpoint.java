package com.example.demoapi.endpoint;


import com.example.demoapi.model.soapFake.gen.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.ArrayList;
import java.util.List;

@Endpoint
public class UserEndpoint {

//    @Autowired
//    private UserService userService;

    @PayloadRoot(namespace = "http://tpb.vn/gen",
            localPart = "GetCustomerInfoReq")
    @ResponsePayload
    public GetCustomerInfoRes getbank(@RequestPayload GetCustomerInfoReq request) {

        GetCustomerInfoRes response = new GetCustomerInfoRes();
        Header header = new Header();
        Common common = new Common();

        common.setMessageId("001");
        common.setMessageTimestamp("1323");
        common.setServiceVersion("1");
        common.setTransactionId("12");
        header.setCommon(common);

        Client client = new Client();
        UserDetail userDetail = new UserDetail();
        userDetail.setUserPassword("bnVsbA==");
        client.setUserDetail(userDetail);
        header.setClient(client);

        ResponseStatus responseStatus = new ResponseStatus();
        responseStatus.setStatus("");
        responseStatus.setErrorInfo("");
        responseStatus.setGlobalErrorDescription("00");
        responseStatus.setGlobalErrorDescription("no one");
        BodyResponse bodyResponse = new BodyResponse();
        ListCustInfo info = new ListCustInfo();

        List<ListCustInfo> infoList = new ArrayList<>();
        infoList.add(info);
        bodyResponse.setListCustInfo(infoList);
        Party party = new Party();
        Party.PartyInfo partyInfo = new Party.PartyInfo();
        party.setPartyInfo(partyInfo);
        Party.PartyInfo.PersonalPartyInfo personalPartyInfo = new Party.PartyInfo.PersonalPartyInfo();
        personalPartyInfo.setCIFNo("1312");
        personalPartyInfo.setFullName("cif783");
        ContactInfo contactInfo = new ContactInfo();
        AddressInfo addressInfo = new AddressInfo();
        addressInfo.setAddress("HN");
        contactInfo.setAddressInfo(addressInfo);
        MailAddress mailAddress = new MailAddress();
        mailAddress.setName("hnaggmia.ocm");
        contactInfo.setMailAddress(mailAddress);
        personalPartyInfo.setContactInfo(contactInfo);
        partyInfo.setPersonalPartyInfo(personalPartyInfo);
        info.setParty(party);

        CustInfo custInfo = new CustInfo();
        custInfo.setCustomerType("0");
        custInfo.setCorporateTaxIdentNumb("");
        info.setCustInfo(custInfo);

        AccInfo accInfo = new AccInfo();
        AccInfo.AdditionInformation additionInformation = new AccInfo.AdditionInformation();
        NameValuePairs nameValuePairs = new NameValuePairs();
        nameValuePairs.setName("AU_TH");
        nameValuePairs.setValue("A");
        List<NameValuePairs> nameValuePairsList = new ArrayList<>();
        nameValuePairsList.add(nameValuePairs);
        additionInformation.setNameValuePairs(nameValuePairsList);

        accInfo.setAdditionInformation(additionInformation);
        info.setAccInfo(accInfo);

        response.setBodyResponse(bodyResponse);
        response.setResponseStatus(responseStatus);
        response.setHeader(header);
        return response;

    }
}
