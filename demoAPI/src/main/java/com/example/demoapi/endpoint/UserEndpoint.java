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
        common.setMessageId("3333bfa2-0358-4f74-a55d-1d745689a019");
        common.setMessageTimestamp("2022-10-03T09:20:16");
        common.setServiceVersion("1");
        common.setTransactionId("286243d3-3d13-4371-b4da-1b75527a3f27");
        header.setCommon(common);
        Client client = new Client();
        UserDetail userDetail = new UserDetail();
        userDetail.setUserPassword("bnVsbA==");
        client.setUserDetail(userDetail);
        header.setClient(client);
        ResponseStatus responseStatus = new ResponseStatus();
        responseStatus.setStatus("0");
        responseStatus.setErrorInfo("00");
        responseStatus.setGlobalErrorDescription("SUCCESS");
        BodyResponse bodyResponse = new BodyResponse();
        ListCustInfo info = new ListCustInfo();
        ListCustInfo info2 = new ListCustInfo();
        List<ListCustInfo> infoList = new ArrayList<>();
        infoList.add(info);
        infoList.add(info2);
        bodyResponse.setListCustInfo(infoList);
        Party party = new Party();
        Party.PartyInfo partyInfo = new Party.PartyInfo();
        Party.PartyInfo.PersonalPartyInfo personalPartyInfo = new Party.PartyInfo.PersonalPartyInfo();
        personalPartyInfo.setCIFNo("29092005");
        personalPartyInfo.setFullName("CUSTOMER29092005");
        ContactInfo contactInfo = new ContactInfo();
        AddressInfo addressInfo = new AddressInfo();
        addressInfo.setAddress("ADDRESS_1_29092005 ADDRESS_2_29092005 ADDRESS_3_29092005 ADDRESS_4_29092005");
        contactInfo.setAddressInfo(addressInfo);
        MailAddress mailAddress = new MailAddress();
        mailAddress.setName("hueht32@test.com.vn");
        contactInfo.setMailAddress(mailAddress);
        personalPartyInfo.setContactInfo(contactInfo);
        partyInfo.setPersonalPartyInfo(personalPartyInfo);
        info.setParty(party);
        party.setPartyInfo(partyInfo);
        CustInfo custInfo = new CustInfo();
        custInfo.setCustomerType("I");
        custInfo.setCorporateTaxIdentNumb("01791798");
        info.setCustInfo(custInfo);
        AccInfo accInfo = new AccInfo();
        AccInfo.AdditionInformation additionInformation = new AccInfo.AdditionInformation();
        NameValuePairs nameValuePairs = new NameValuePairs();
        nameValuePairs.setName("AUTH_STAT");
        nameValuePairs.setValue("A");
        NameValuePairs nameValuePairs2 = new NameValuePairs();
        nameValuePairs2.setName("RECORD_STAT");
        nameValuePairs2.setValue("0");
        NameValuePairs nameValuePairs3 = new NameValuePairs();
        nameValuePairs3.setName("DKKD");
        nameValuePairs3.setValue("000000000769*2324");
        NameValuePairs nameValuePairs4 = new NameValuePairs();
        nameValuePairs4.setName("FIELD1");
        nameValuePairs4.setValue("");
        NameValuePairs nameValuePairs5 = new NameValuePairs();
        nameValuePairs4.setName("FIELD2");
        nameValuePairs4.setValue("");
        List<NameValuePairs> nameValuePairsList = new ArrayList<>();
        nameValuePairsList.add(nameValuePairs);
        nameValuePairsList.add(nameValuePairs2);
        nameValuePairsList.add(nameValuePairs3);
        nameValuePairsList.add(nameValuePairs4);
        nameValuePairsList.add(nameValuePairs5);
        additionInformation.setNameValuePairs(nameValuePairsList);
        accInfo.setAdditionInformation(additionInformation);
        info.setAccInfo(accInfo);
        response.setBodyResponse(bodyResponse);
        response.setResponseStatus(responseStatus);
        response.setHeader(header);

        // repose 2

        GetCustomerInfoRes response2 = new GetCustomerInfoRes();
        Header header2 = new Header();
        Common common2 = new Common();
        common2.setMessageId("3333bfa2-0358-4f74-a55d-1d745689a019");
        common2.setMessageTimestamp("2022-10-03T09:20:16");
        common2.setServiceVersion("1");
        common2.setTransactionId("286243d3-3d13-4371-b4da-1b75527a3f27");
        header2.setCommon(common2);
        Client client2 = new Client();
        UserDetail userDetail2 = new UserDetail();
        userDetail2.setUserPassword("bnVsbA==");
        client2.setUserDetail(userDetail2);
        header2.setClient(client2);
        ResponseStatus responseStatus2 = new ResponseStatus();
        responseStatus2.setStatus("1");
        responseStatus2.setErrorInfo("01");
        responseStatus2.setGlobalErrorDescription("UNSUCCESS");
        BodyResponse bodyResponse2 = new BodyResponse();
        ListCustInfo info22 = new ListCustInfo();
        List<ListCustInfo> infoList2 = new ArrayList<>();
        infoList.add(info22);
        response2.setBodyResponse(bodyResponse2);
        response2.setResponseStatus(responseStatus2);
        response2.setHeader(header2);



        System.out.println(request.getBodyRequest().getAccInfo().getCIFNo());
//      System.out.println(request.getBodyRequest().getAccInfo().getAdditionInformation().getNameValuePairs());
        int check = 0;
        for(NameValuePairs x : request.getBodyRequest().getAccInfo().getAdditionInformation().getNameValuePairs() ) {
            System.out.println(x.getName());
            if(x.getName().equals("MST") && x.getValue().equals("0102100740")) {
                check = 1;
            }
            if(check == 1 && x.getName().equals("DKKD") && x.getValue().equals("040051000013")){
                check = 2;
            }
        }
        if(check == 2 && request.getBodyRequest().getAccInfo().getCIFNo().equals("29092005")) {
            return response;
        }else {
            return response2;
        }
    }
}
