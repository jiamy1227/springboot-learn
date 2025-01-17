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
public class MockController8 {

    @PostMapping(value = "/DSYY_HIS_IPVisitInfo",produces = MediaType.TEXT_XML_VALUE)
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
                "        <runtimebegin></runtimebegin>\n" +
                "        <runtimeend>2024-12-10 09:58:51</runtimeend>\n" +
                "        <code>0</code>\n" +
                "        <msg></msg>\n" +
                "        <count>1</count>\n" +
                "        <pagecount>1000000000</pagecount>\n" +
                "        <pages>1</pages>\n" +
                "        <page>1</page>\n" +
                "    </state>\n" +
                "    <ROW num=\"1\">\n" +
                "        <FROWNUM>1</FROWNUM>\n" +
                "        <ZYHM>321071</ZYHM>\n" +
                "        <RYCS>1</RYCS>\n" +
                "        <ZYH>540172</ZYH>\n" +
                "        <BAHM>321071</BAHM>\n" +
                "        <BRXM>陈细妹</BRXM>\n" +
                "        <FYLB>中山医保</FYLB>\n" +
                "        <YBBH>44200000000001009818</YBBH>\n" +
                "        <RYRQ>2023-04-17 10:07:00</RYRQ>\n" +
                "        <BRKS>192</BRKS>\n" +
                "        <BRBQ>1584</BRBQ>\n" +
                "        <CYRQ>2023-04-19 08:36:00</CYRQ>\n" +
                "        <BRCH>B0417</BRCH>\n" +
                "        <ZZYS>14139</ZZYS>\n" +
                "        <ZZYSXM>张跃锐</ZZYSXM>\n" +
                "        <ZSYS>434</ZSYS>\n" +
                "        <ZSYSXM>岑志敏</ZSYSXM>\n" +
                "        <CYFS>1</CYFS>\n" +
                "        <ZFY>8470.10</ZFY>\n" +
                "        <CYPB>1</CYPB>\n" +
                "    </ROW>\n" +
                "</response>";

            return ResponseEntity.ok(xmlResponse1);
    }


}
