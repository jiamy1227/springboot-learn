package org.jiamy.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @description: 获取门诊患基本信息
 * @author: jiamy
 * @create: 2024/11/12 15:05
 **/
@RestController
public class MockController4 {

    @PostMapping(value = "/DSYY_HIS_IPPatientInfo",produces = MediaType.TEXT_XML_VALUE)
    public ResponseEntity<String> getMockResponse(HttpServletRequest request) throws IOException {
        // 获取请求体输入流
        InputStream inputStream = request.getInputStream();

        // 使用 BufferedReader 读取输入流
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));

        // 拼接请求体内容
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line).append("\n");
        }
        reader.close();

        System.out.println(stringBuilder.toString());

        String xmlResponse1 = "<?xml version = '1.0'?>\n" +
                "<response>\n" +
                "    <state>\n" +
                "        <runtimebegin>2024-12-10 15:05:12</runtimebegin>\n" +
                "        <runtimeend>2024-12-10 15:05:12</runtimeend>\n" +
                "        <code>0</code>\n" +
                "        <msg></msg>\n" +
                "        <count>1</count>\n" +
                "        <pagecount>1000000000000</pagecount>\n" +
                "        <pages>1</pages>\n" +
                "        <page>1</page>\n" +
                "    </state>\n" +
                "    <ROW num=\"1\">\n" +
                "        <FROWNUM>1</FROWNUM>\n" +
                "        <ZYHM>321071</ZYHM>\n" +
                "        <BRXM>陈细妹</BRXM>\n" +
                "        <BRXB>2</BRXB>\n" +
                "        <CSNY>1949-08-05  00:00:00</CSNY>\n" +
                "        <RYCS>1</RYCS>\n" +
                "        <ZYH>540172</ZYH>\n" +
                "        <BRKS>192</BRKS>\n" +
                "        <BRBQ>1584</BRBQ>\n" +
                "        <BRCH>B0417</BRCH>\n" +
                "        <RYRQ>2023-04-17 10:07:00</RYRQ>\n" +
                "        <CYRQ>2023-04-19 08:36:00</CYRQ>\n" +
                "        <SFZH>44062019490805258X</SFZH>\n" +
                "        <BRID>81340428</BRID>\n" +
                "        <MZHM>81340428</MZHM>\n" +
                "        <BRXZ>11</BRXZ>\n" +
                "        <JZLB>21</JZLB>\n" +
                "        <JTDH>15876876595</JTDH>\n" +
                "        <LXRM>陈细妹</LXRM>\n" +
                "        <LXDH>15876876595</LXDH>\n" +
                "        <MZDM>1</MZDM>\n" +
                "        <ZZYS>14139</ZZYS>\n" +
                "        <SZYS>434</SZYS>\n" +
                "        <JGDM_SQJDNAME>广东省中山市民众街道</JGDM_SQJDNAME>\n" +
                "        <CSD_SQJDNAME>广东省中山市民众街道</CSD_SQJDNAME>\n" +
                "        <XZZ_SQJDNAME>广东省中山市民众街道</XZZ_SQJDNAME>\n" +
                "        <XZZ_QTDZ>多宝村</XZZ_QTDZ>\n" +
                "        <LXRM_SQJDNAME>广东省中山市民众街道</LXRM_SQJDNAME>\n" +
                "        <LXDZ>多宝村</LXDZ>\n" +
                "        <HKDZ_SQJDNAME>广东省中山市民众街道</HKDZ_SQJDNAME>\n" +
                "        <HKDZ_QTDZ>多宝村</HKDZ_QTDZ>\n" +
                "        <ZDMC1>白内障</ZDMC1>\n" +
                "    </ROW>\n" +
                "</response>";

            return ResponseEntity.ok(xmlResponse1);
    }


}
