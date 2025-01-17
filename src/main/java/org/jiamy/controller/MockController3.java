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
public class MockController3 {

    @PostMapping(value = "/DSYY_HIS_IPPatientList",produces = MediaType.TEXT_XML_VALUE)
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
                "        <runtimebegin>2024-12-11 09:24:32</runtimebegin>\n" +
                "        <runtimeend>2024-12-11 09:24:32</runtimeend>\n" +
                "        <code>0</code>\n" +
                "        <msg></msg>\n" +
                "        <count>2</count>\n" +
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
                "        <RYCS>2</RYCS>\n" +
                "        <ZYH>574361</ZYH>\n" +
                "        <BRKS>192</BRKS>\n" +
                "        <BRBQ>1584</BRBQ>\n" +
                "        <RYRQ>2023-02-11 09:08:58</RYRQ>\n" +
                "    </ROW>\n" +
                "    <ROW num=\"2\">\n" +
                "        <FROWNUM>2</FROWNUM>\n" +
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
                "    </ROW>\n" +
                "</response>";

            return ResponseEntity.ok(xmlResponse1);
    }


}
