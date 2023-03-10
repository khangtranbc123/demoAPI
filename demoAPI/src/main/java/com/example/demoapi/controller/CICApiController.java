package com.example.demoapi.controller;

import com.example.demoapi.model.CIC;
import com.example.demoapi.model.CicResponse.*;
import com.example.demoapi.model.Model;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/gateway/CIC_CheckCIC_NoiBo")
public class CICApiController {
    @PostMapping
    public ResponseEntity<String> getDetail(@RequestBody CIC cic) throws JsonProcessingException {
        TTPHAPLY ttphaply = new TTPHAPLY();
        ttphaply.setMACIC(null);
        ttphaply.setTENKH("NGUYÊ~N HA` NAM");
        ttphaply.setDIACHI_TRUSOCHINH("HN");
        ttphaply.setCMND_HC("968257413589");
        ttphaply.setGIAYTOKHAC("");
        ttphaply.setDKKD("");
        ttphaply.setMST("");
        ttphaply.setTGD_GD("");
        ttphaply.setNGUOI_DAIDIENPL("");

        NOIDUNG noidung = new NOIDUNG();
        noidung.setTTPHAPLY(ttphaply);

        TT_NGUOITRACUU tt_nguoitracuu = new TT_NGUOITRACUU();
        tt_nguoitracuu.setDONVITRACUU("Ngân hàng TMCP Tiên Phong");
        tt_nguoitracuu.setDIACHI("Tòa nhà TPbank, s? 57, ph? Lý Thu?ng Ki?t, phu?ng Tr?n Hung Ð?o, qu?n Hoàn Ki?m, Thành ph? Hà N?i, Vi?t Nam");
        tt_nguoitracuu.setTENTRUYCAP("h01358001hang2");
        tt_nguoitracuu.setDTHOAI("");
        tt_nguoitracuu.setMSPHIEU("TPB220722.0004.CC06");
        tt_nguoitracuu.setTHOIGIANYC("20220722 08:35");
        tt_nguoitracuu.setTHOIGIANTL("20220722 08:36");
        tt_nguoitracuu.setTT_TRALOI("0");

        NOIDUNG_BANTLTIN noidung_bantltin = new NOIDUNG_BANTLTIN();
        noidung_bantltin.setNOIDUNG(noidung);
        noidung_bantltin.setTT_NGUOITRACUU(tt_nguoitracuu);

        XML xml = new XML();
        xml.setNOIDUNG_BANTLTIN(noidung_bantltin);

        ITEM item = new ITEM();
        item.setCUSTOMERNAME("Nguyễn Văn 3317");
        item.setCUSTOMER_ID("010003317");
        item.setTYPE("04");
        item.setXML(xml);

        ITEM item2 = new ITEM();
        item2.setCUSTOMERNAME("NGUyễn Minh");
        item2.setCUSTOMER_ID("01023123");
        item2.setTYPE("04");
        item2.setXML(xml);

        Items items = new Items();
        List<ITEM> list = new ArrayList<>();
        list.add(item2);
        list.add(item);
        items.setList_ITEM(list);

        RESP resp = new RESP();
        resp.setCODE("000");
        resp.setDESC("Thành công!");

        Data dataResp = new Data();
        dataResp.setItems(items);
        dataResp.setRESP(resp);

        Cic cicResp = new Cic();
        cicResp.setDATA(dataResp);
        cicResp.setRESP_CODE("000");
        cicResp.setRESP_DESC("Thành công.");
        cicResp.setTRANS_ID("0580adbb-e148-46df-8536-67c80697c70d");

        ObjectMapper xmlMapper = new XmlMapper();
        String response = xmlMapper.writeValueAsString(cicResp);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_XML);


        if(cic.getINFO().getAPI_KEY().equals("")||
                cic.getINFO().getAPI_USERID().equals("")||
                cic.getINFO().getAPI_USERPASSWORD().equals("")){
            return new ResponseEntity<>(data001, HttpStatus.BAD_REQUEST);
        }
        String key = "WS-APICIC:APICIC#2021";
        if(!cic.getINFO().getAPI_KEY().equals(key)){
            System.out.println(cic.getINFO().getAPI_KEY());
            return new ResponseEntity<>(data002, HttpStatus.BAD_REQUEST);
        }
        if(cic.getINFO().getAPI_KEY().equals("")||
                cic.getINFO().getAPI_USERID().equals("")||
                cic.getINFO().getAPI_USERPASSWORD().equals("")||
                cic.getINFO().getAPI_SOURCEAPPID().equals("")||
                cic.getDATA().getCMND_DKKD().equals("")||
                cic.getDATA().getLOAI_KH().equals("")||
                cic.getDATA().getLOAI_YC().equals("")||
                cic.getDATA().getSRC_SYSTEM().equals("")){
            return new ResponseEntity<>(data003, HttpStatus.BAD_REQUEST);
        }
        if(!cic.getDATA().getLOAI_YC().equals("04")){
            return new ResponseEntity<>(data004, HttpStatus.BAD_REQUEST);
        }
        if (!cic.getINFO().getAPI_USERID().equals("EBANKIT") || !cic.getINFO().getAPI_USERPASSWORD().equals("RVNCMQ==")){
            return new ResponseEntity<>(data006, HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>(response, HttpStatus.OK);
    }



    @GetMapping("/xml/name")
    public ResponseEntity<String> getName(@RequestBody Model model){
        String checkName = "<CIC>\n" +
                "    <DATA>\n" +
                "        <ITEMS>\n" +
                "            <ITEM>\n" +
                "                <CUSTOMER_ID>010003317</CUSTOMER_ID>\n" +
                "                <CUSTOMERNAME>Nguyễn Văn 3317</CUSTOMERNAME>\n" +
                "                <TYPE>04</TYPE>\n" +
                "                <XML>\n" +
                "                    <NOIDUNG_BANTLTIN>\n" +
                "                        <TT_NGUOITRACUU>\n" +
                "                            <DONVITRACUU>Ngân hàng TMCP Tiên Phong</DONVITRACUU>\n" +
                "                            <DIACHI>Tòa nhà TPbank, số 57, phố Lý thường Ki?t, phu?ng Tr?n Hung Ð?o, qu?n Hoàn Ki?m, Thành ph? Hà N?i, Vi?t Nam</DIACHI>\n" +
                "                            <TENTRUYCAP>h01358001hang2</TENTRUYCAP>\n" +
                "                            <DTHOAI></DTHOAI>\n" +
                "                            <MSPHIEU>TPB220722.0004.CC06</MSPHIEU>\n" +
                "                            <THOIGIANYC>20220722 08:35</THOIGIANYC>\n" +
                "                            <THOIGIANTL>20220722 08:36</THOIGIANTL>\n" +
                "                            <TT_TRALOI>0</TT_TRALOI>\n" +
                "                        </TT_NGUOITRACUU>\n" +
                "                        <NOIDUNG>\n" +
                "                            <TTPHAPLY>\n" +
                "                                <MACIC></MACIC>\n" +
                "                                <TENKH>NGUYÊ~N HA` NAM</TENKH>\n" +
                "                                <DIACHI_TRUSOCHINH>HN</DIACHI_TRUSOCHINH>\n" +
                "                                <CMND_HC>968257413589</CMND_HC>\n" +
                "                                <GIAYTOKHAC></GIAYTOKHAC>\n" +
                "                                <DKKD></DKKD>\n" +
                "                                <MST></MST>\n" +
                "                                <TGD_GD></TGD_GD>\n" +
                "                                <NGUOI_DAIDIENPL></NGUOI_DAIDIENPL>\n" +
                "                            </TTPHAPLY>\n" +
                "                        </NOIDUNG>\n" +
                "                    </NOIDUNG_BANTLTIN>\n" +
                "                </XML>\n" +
                "            </ITEM>\n" +
                "            <ITEM>\n" +
                "                <CUSTOMER_ID>010003317</CUSTOMER_ID>\n" +
                "                <CUSTOMERNAME>Nguyễn Văn 3317</CUSTOMERNAME>\n" +
                "                <TYPE>21</TYPE>\n" +
                "                <XML>\n" +
                "                    <NOIDUNG_BANTLTIN>\n" +
                "                        <TT_NGUOITRACUU>\n" +
                "                            <DONVITRACUU>Ngân hàng TMCP Tiên Phong</DONVITRACUU>\n" +
                "                            <DIACHI>Tòa nhà TPbank, s? 57, ph? Lý Thu?ng Ki?t, phu?ng Tr?n Hung Ð?o, qu?n Hoàn Ki?m, Thành ph? Hà N?i, Vi?t Nam</DIACHI>\n" +
                "                            <TENTRUYCAP>h01358001hang2</TENTRUYCAP>\n" +
                "                            <DTHOAI></DTHOAI>\n" +
                "                            <MSPHIEU>TPB220722.0004.CC06</MSPHIEU>\n" +
                "                            <THOIGIANYC>20220722 08:35</THOIGIANYC>\n" +
                "                            <THOIGIANTL>20220722 08:36</THOIGIANTL>\n" +
                "                            <TT_TRALOI>0</TT_TRALOI>\n" +
                "                        </TT_NGUOITRACUU>\n" +
                "                        <NOIDUNG>\n" +
                "                            <TTPHAPLY>\n" +
                "                                <MACIC></MACIC>\n" +
                "                                <TENKH>NGUYÊ~N HA` NAM</TENKH>\n" +
                "                                <DIACHI_TRUSOCHINH>HN</DIACHI_TRUSOCHINH>\n" +
                "                                <CMND_HC>968257413589</CMND_HC>\n" +
                "                                <GIAYTOKHAC></GIAYTOKHAC>\n" +
                "                                <DKKD></DKKD>\n" +
                "                                <MST></MST>\n" +
                "                                <TGD_GD></TGD_GD>\n" +
                "                                <NGUOI_DAIDIENPL></NGUOI_DAIDIENPL>\n" +
                "                            </TTPHAPLY>\n" +
                "                        </NOIDUNG>\n" +
                "                    </NOIDUNG_BANTLTIN>\n" +
                "                </XML>\n" +
                "            </ITEM>\n" +
                "        </ITEMS>\n" +
                "        <RESP>\n" +
                "            <CODE>000</CODE>\n" +
                "            <DESC>Thành Công!</DESC>\n" +
                "        </RESP>\n" +
                "    </DATA>\n" +
                "    <RESP_CODE>000</RESP_CODE>\n" +
                "    <RESP_DESC>Thành công.</RESP_DESC>\n" +
                "    <TRANS_ID>0580adbb-e148-46df-8536-67c80697c70d</TRANS_ID>\n" +
                "</CIC>\n";
        String name = model.getName();
        String id = model.getId();
        System.out.println(name +" "+ id);
        return new ResponseEntity<>(checkName, HttpStatus.OK);

    }
    String data = "<CIC>\n" +
            "    <DATA>\n" +
            "        <ITEMS>\n" +
            "            <ITEM>\n" +
            "                <CUSTOMER_ID>010003317</CUSTOMER_ID>\n" +
            "                <CUSTOMERNAME>Nguyễn Văn 3317</CUSTOMERNAME>\n" +
            "                <TYPE>04</TYPE>\n" +
            "                <XML>\n" +
            "                    <NOIDUNG_BANTLTIN>\n" +
            "                        <TT_NGUOITRACUU>\n" +
            "                            <DONVITRACUU>Ngân hàng TMCP Tiên Phong</DONVITRACUU>\n" +
            "                            <DIACHI>Tòa nhà TPbank, số 57, phố Lý thường Ki?t, phu?ng Tr?n Hung Ð?o, qu?n Hoàn Ki?m, Thành ph? Hà N?i, Vi?t Nam</DIACHI>\n" +
            "                            <TENTRUYCAP>h01358001hang2</TENTRUYCAP>\n" +
            "                            <DTHOAI></DTHOAI>\n" +
            "                            <MSPHIEU>TPB220722.0004.CC06</MSPHIEU>\n" +
            "                            <THOIGIANYC>20220722 08:35</THOIGIANYC>\n" +
            "                            <THOIGIANTL>20220722 08:36</THOIGIANTL>\n" +
            "                            <TT_TRALOI>0</TT_TRALOI>\n" +
            "                        </TT_NGUOITRACUU>\n" +
            "                        <NOIDUNG>\n" +
            "                            <TTPHAPLY>\n" +
            "                                <MACIC></MACIC>\n" +
            "                                <TENKH>NGUYÊ~N HA` NAM</TENKH>\n" +
            "                                <DIACHI_TRUSOCHINH>HN</DIACHI_TRUSOCHINH>\n" +
            "                                <CMND_HC>968257413589</CMND_HC>\n" +
            "                                <GIAYTOKHAC></GIAYTOKHAC>\n" +
            "                                <DKKD></DKKD>\n" +
            "                                <MST></MST>\n" +
            "                                <TGD_GD></TGD_GD>\n" +
            "                                <NGUOI_DAIDIENPL></NGUOI_DAIDIENPL>\n" +
            "                            </TTPHAPLY>\n" +
            "                        </NOIDUNG>\n" +
            "                    </NOIDUNG_BANTLTIN>\n" +
            "                </XML>\n" +
            "            </ITEM>\n" +
            "            <ITEM>\n" +
            "                <CUSTOMER_ID>010003317</CUSTOMER_ID>\n" +
            "                <CUSTOMERNAME>Nguyễn Văn 3317</CUSTOMERNAME>\n" +
            "                <TYPE>21</TYPE>\n" +
            "                <XML>\n" +
            "                    <NOIDUNG_BANTLTIN>\n" +
            "                        <TT_NGUOITRACUU>\n" +
            "                            <DONVITRACUU>Ngân hàng TMCP Tiên Phong</DONVITRACUU>\n" +
            "                            <DIACHI>Tòa nhà TPbank, s? 57, ph? Lý Thu?ng Ki?t, phu?ng Tr?n Hung Ð?o, qu?n Hoàn Ki?m, Thành ph? Hà N?i, Vi?t Nam</DIACHI>\n" +
            "                            <TENTRUYCAP>h01358001hang2</TENTRUYCAP>\n" +
            "                            <DTHOAI></DTHOAI>\n" +
            "                            <MSPHIEU>TPB220722.0004.CC06</MSPHIEU>\n" +
            "                            <THOIGIANYC>20220722 08:35</THOIGIANYC>\n" +
            "                            <THOIGIANTL>20220722 08:36</THOIGIANTL>\n" +
            "                            <TT_TRALOI>0</TT_TRALOI>\n" +
            "                        </TT_NGUOITRACUU>\n" +
            "                        <NOIDUNG>\n" +
            "                            <TTPHAPLY>\n" +
            "                                <MACIC></MACIC>\n" +
            "                                <TENKH>NGUYÊ~N HA` NAM</TENKH>\n" +
            "                                <DIACHI_TRUSOCHINH>HN</DIACHI_TRUSOCHINH>\n" +
            "                                <CMND_HC>968257413589</CMND_HC>\n" +
            "                                <GIAYTOKHAC></GIAYTOKHAC>\n" +
            "                                <DKKD></DKKD>\n" +
            "                                <MST></MST>\n" +
            "                                <TGD_GD></TGD_GD>\n" +
            "                                <NGUOI_DAIDIENPL></NGUOI_DAIDIENPL>\n" +
            "                            </TTPHAPLY>\n" +
            "                        </NOIDUNG>\n" +
            "                    </NOIDUNG_BANTLTIN>\n" +
            "                </XML>\n" +
            "            </ITEM>\n" +
            "        </ITEMS>\n" +
            "        <RESP>\n" +
            "            <CODE>000</CODE>\n" +
            "            <DESC>Thành Công!</DESC>\n" +
            "        </RESP>\n" +
            "    </DATA>\n" +
            "    <RESP_CODE>000</RESP_CODE>\n" +
            "    <RESP_DESC>Thành công.</RESP_DESC>\n" +
            "    <TRANS_ID>0580adbb-e148-46df-8536-67c80697c70d</TRANS_ID>\n" +
            "</CIC>\n";
    String data001 = "<CIC>\n" +
            "              <DATA/>\n" +
            "              <RESP_CODE>001</RESP_CODE>\n" +
            "              <RESP_DESC>KEY hoặc USERID hoặc USERPASSWORD không được để trống!</RESP_DESC>\n" +
            "              <TRANS_ID>0580adbb-e148-46df-8536-67c80697c70d</TRANS_ID>\n" +
            "         </CIC>\n";


    String data002 = "<CIC>\n" +
            "            <DATA/>\n" +
            "                <RESP_CODE>002</RESP_CODE>\n" +
            "               <RESP_DESC>Thông tin key sai!</RESP_DESC>\n" +
            "               <TRANS_ID>0580adbb-e148-46df-8536-67c80697c70d</TRANS_ID>\n" +
            "          </CIC>\n";
    String data003 = "<CIC>\n" +
            "            <DATA/>\n" +
            "                <RESP_CODE>003</RESP_CODE>\n" +
            "                <RESP_DESC>Các thông tin bắt buộc không được để trống!</RESP_DESC>\n" +
            "            <TRANS_ID>0580adbb-e148-46df-8536-67c80697c70d</TRANS_ID>\n" +
            "          </CIC>\n";

    String data004 = "<CIC>\n" +
            "            <DATA/>\n" +
            "                <RESP_CODE>004</RESP_CODE>\n" +
            "               <RESP_DESC>Không đúng loại yêu cầu!</RESP_DESC>\n" +
            "          <TRANS_ID>0580adbb-e148-46df-8536-67c80697c70d</TRANS_ID>\n" +
            "          </CIC>\n";

    String data005 = "<CIC>\n" +
            "           <DATA/>\n" +
            "               <RESP_CODE>005</RESP_CODE>\n" +
            "                <RESP_DESC>Sai định dạng giới tính!</RESP_DESC>\n" +
            "            <TRANS_ID>0580adbb-e148-46df-8536-67c80697c70d</TRANS_ID>\n" +
            "          </CIC>\n";

    String data006 = "<CIC>\n" +
            "            <DATA/>\n" +
            "                <RESP_CODE>006</RESP_CODE>\n" +
            "                <RESP_DESC>User không tồn tại trong hệ thống!</RESP_DESC>\n" +
            "          <TRANS_ID>0580adbb-e148-46df-8536-67c80697c70d</TRANS_ID>\n" +
            "          </CIC>\n";

    String data007 = "<CIC>\n" +
            "               </DATA>\n" +
            "               <RESP_CODE>007</RESP_CODE>\n" +
            "               <RESP_DESC>Số lượng request vượt quá giới hạn trong 1 phút!</RESP_DESC>\n" +
            "             <TRANS_ID>0580adbb-e148-46df-8536-67c80697c70d</TRANS_ID>\n" +
            "          </CIC>\n";




}
