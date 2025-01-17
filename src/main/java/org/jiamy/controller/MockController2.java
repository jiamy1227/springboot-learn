package org.jiamy.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
public class MockController2 {

    @GetMapping(value = "/DSYY_HIS_OPPatientInfo",produces = MediaType.TEXT_XML_VALUE)
    public ResponseEntity<String> getMockResponse(HttpServletRequest request, HttpServletResponse response) throws IOException {
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
                "        <runtimeend>2024-12-14 15:23:24</runtimeend>\n" +
                "        <code>0</code>\n" +
                "        <msg></msg>\n" +
                "        <count>1</count>\n" +
                "        <pagecount>100</pagecount>\n" +
                "        <pages>1</pages>\n" +
                "        <page>1</page>\n" +
                "    </state>\n" +
                "    <ROW num=\"1\">\n" +
                "        <FROWNUM>1</FROWNUM>\n" +
                "        <MZHM>7027016</MZHM>\n" +
                "        <BRID>145015</BRID>\n" +
                "        <BRXM>冼沛根</BRXM>\n" +
                "        <BRXB>1</BRXB>\n" +
                "        <SFZH>442000197101102336</SFZH>\n" +
                "        <ZJLX>0</ZJLX>\n" +
                "        <ZJHM> </ZJHM>\n" +
                "        <CSNY>1971-01-10</CSNY>\n" +
                "        <JTDH>15913314245</JTDH>\n" +
                "        <XZZ_QTDZ>广东省中山市-</XZZ_QTDZ>\n" +
                "        <DWMC> </DWMC>\n" +
                "        <ZYDM>90</ZYDM>\n" +
                "        <MZDM>1</MZDM>\n" +
                "        <LXDH>15913314245</LXDH>\n" +
                "    </ROW>\n" +
                "</response>";

        response.addHeader("Access-Control-Allow-Origin", "*");
            return ResponseEntity.ok(xmlResponse1);
    }


}
