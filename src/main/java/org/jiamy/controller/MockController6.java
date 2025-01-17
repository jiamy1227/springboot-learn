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
public class MockController6 {

    @PostMapping(value = "/DSYY_LIS_GetRoutineResult",produces = MediaType.TEXT_XML_VALUE)
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

        String xmlResponse1 = "<Response>\n" +
                "    <ResultCode>0</ResultCode>\n" +
                "    <ResultContent>成功</ResultContent>\n" +
                "    <Result>\n" +
                "        <ObrResult>\n" +
                "            <RepId>10138202305011</RepId>\n" +
                "            <ItmId>10969</ItmId>\n" +
                "            <ItmName>潜血</ItmName>\n" +
                "            <ObrValue>-</ObrValue>\n" +
                "            <ResTips/>\n" +
                "            <RefLowerLimit>阴性</RefLowerLimit>\n" +
                "            <ResRef>阴性</ResRef>\n" +
                "            <RefDangerLowerLimit/>\n" +
                "            <RefDangerUpperLimit/>\n" +
                "            <ObrUnit/>\n" +
                "            <ItmPrtFlag>0</ItmPrtFlag>\n" +
                "            <ItmContrastCode/>\n" +
                "            <ComId>455</ComId>\n" +
                "            <ComName>尿沉渣定量+尿液分析(尿常规)</ComName>\n" +
                "            <RepItrId>10138</RepItrId>\n" +
                "            <ObrDate>2024-05-01 00:21:37</ObrDate>\n" +
                "        </ObrResult>\n" +
                "        <ObrResult>\n" +
                "            <RepId>10138202305011</RepId>\n" +
                "            <ItmId>10967</ItmId>\n" +
                "            <ItmName>尿胆原</ItmName>\n" +
                "            <ObrValue>Normal</ObrValue>\n" +
                "            <ResTips/>\n" +
                "            <RefLowerLimit/>\n" +
                "            <RefUpperLimit/>\n" +
                "            <ResRef/>\n" +
                "            <RefDangerLowerLimit/>\n" +
                "            <RefDangerUpperLimit/>\n" +
                "            <ObrUnit>Eμ/dl</ObrUnit>\n" +
                "            <ItmPrtFlag>0</ItmPrtFlag>\n" +
                "            <ItmContrastCode/>\n" +
                "            <ComId>455</ComId>\n" +
                "            <ComName>尿沉渣定量+尿液分析(尿常规)</ComName>\n" +
                "            <RepItrId>10138</RepItrId>\n" +
                "            <ObrDate>2024-05-01 00:21:37</ObrDate>\n" +
                "        </ObrResult>\n" +
                "        <ObrResult>\n" +
                "            <RepId>10138202305011</RepId>\n" +
                "            <ItmId>11148</ItmId>\n" +
                "            <ItmName>颜色</ItmName>\n" +
                "            <ObrValue>淡黄色</ObrValue>\n" +
                "            <ResTips/>\n" +
                "            <RefLowerLimit>淡黄色</RefLowerLimit>\n" +
                "            <ResRef>淡黄色</ResRef>\n" +
                "            <RefDangerLowerLimit/>\n" +
                "            <RefDangerUpperLimit/>\n" +
                "            <ItmPrtFlag>0</ItmPrtFlag>\n" +
                "            <ItmContrastCode/>\n" +
                "            <ComId>455</ComId>\n" +
                "            <ComName>尿沉渣定量+尿液分析(尿常规)</ComName>\n" +
                "            <RepItrId>10138</RepItrId>\n" +
                "            <ObrDate>2024-05-01 00:21:37</ObrDate>\n" +
                "        </ObrResult>\n" +
                "        <ObrResult>\n" +
                "            <RepId>10138202305011</RepId>\n" +
                "            <ItmId>11190</ItmId>\n" +
                "            <ItmName>酵母样菌</ItmName>\n" +
                "            <ObrValue>0</ObrValue>\n" +
                "            <ResTips/>\n" +
                "            <RefLowerLimit>0</RefLowerLimit>\n" +
                "            <RefUpperLimit>3</RefUpperLimit>\n" +
                "            <ResRef>0-3</ResRef>\n" +
                "            <RefDangerLowerLimit/>\n" +
                "            <RefDangerUpperLimit/>\n" +
                "            <ObrUnit>p/μL</ObrUnit>\n" +
                "            <ItmPrtFlag>0</ItmPrtFlag>\n" +
                "            <ItmContrastCode/>\n" +
                "            <ComId>455</ComId>\n" +
                "            <ComName>尿沉渣定量+尿液分析(尿常规)</ComName>\n" +
                "            <RepItrId>10138</RepItrId>\n" +
                "            <ObrDate>2024-05-01 00:21:37</ObrDate>\n" +
                "        </ObrResult>\n" +
                "        <ObrResult>\n" +
                "            <RepId>10138202305011</RepId>\n" +
                "            <ItmId>11182</ItmId>\n" +
                "            <ItmName>红细胞</ItmName>\n" +
                "            <ObrValue>8</ObrValue>\n" +
                "            <ResTips/>\n" +
                "            <RefLowerLimit>0</RefLowerLimit>\n" +
                "            <RefUpperLimit>17</RefUpperLimit>\n" +
                "            <ResRef>0-17</ResRef>\n" +
                "            <RefDangerLowerLimit/>\n" +
                "            <RefDangerUpperLimit/>\n" +
                "            <ObrUnit>p/μL</ObrUnit>\n" +
                "            <ItmPrtFlag>0</ItmPrtFlag>\n" +
                "            <ItmContrastCode/>\n" +
                "            <ComId>455</ComId>\n" +
                "            <ComName>尿沉渣定量+尿液分析(尿常规)</ComName>\n" +
                "            <RepItrId>10138</RepItrId>\n" +
                "            <ObrDate>2024-05-01 00:21:37</ObrDate>\n" +
                "        </ObrResult>\n" +
                "        <ObrResult>\n" +
                "            <RepId>10138202305011</RepId>\n" +
                "            <ItmId>10974</ItmId>\n" +
                "            <ItmName>维生素C</ItmName>\n" +
                "            <ObrValue>1.4</ObrValue>\n" +
                "            <ResTips/>\n" +
                "            <RefLowerLimit/>\n" +
                "            <RefUpperLimit/>\n" +
                "            <ResRef/>\n" +
                "            <RefDangerLowerLimit/>\n" +
                "            <RefDangerUpperLimit/>\n" +
                "            <ObrUnit>mmol/L</ObrUnit>\n" +
                "            <ItmPrtFlag>0</ItmPrtFlag>\n" +
                "            <ItmContrastCode/>\n" +
                "            <ComId>455</ComId>\n" +
                "            <ComName>尿沉渣定量+尿液分析(尿常规)</ComName>\n" +
                "            <RepItrId>10138</RepItrId>\n" +
                "            <ObrDate>2024-05-01 00:21:37</ObrDate>\n" +
                "        </ObrResult>\n" +
                "        <ObrResult>\n" +
                "            <RepId>10138202305011</RepId>\n" +
                "            <ItmId>10968</ItmId>\n" +
                "            <ItmName>亚硝酸盐</ItmName>\n" +
                "            <ObrValue>-</ObrValue>\n" +
                "            <ResTips/>\n" +
                "            <RefLowerLimit>阴性</RefLowerLimit>\n" +
                "            <ResRef>阴性</ResRef>\n" +
                "            <RefDangerLowerLimit/>\n" +
                "            <RefDangerUpperLimit/>\n" +
                "            <ObrUnit/>\n" +
                "            <ItmPrtFlag>0</ItmPrtFlag>\n" +
                "            <ItmContrastCode/>\n" +
                "            <ComId>455</ComId>\n" +
                "            <ComName>尿沉渣定量+尿液分析(尿常规)</ComName>\n" +
                "            <RepItrId>10138</RepItrId>\n" +
                "            <ObrDate>2024-05-01 00:21:37</ObrDate>\n" +
                "        </ObrResult>\n" +
                "        <ObrResult>\n" +
                "            <RepId>10138202305011</RepId>\n" +
                "            <ItmId>11187</ItmId>\n" +
                "            <ItmName>非鳞状上皮细胞</ItmName>\n" +
                "            <ObrValue>0</ObrValue>\n" +
                "            <ResTips/>\n" +
                "            <RefLowerLimit>0</RefLowerLimit>\n" +
                "            <RefUpperLimit>6</RefUpperLimit>\n" +
                "            <ResRef>0-6</ResRef>\n" +
                "            <RefDangerLowerLimit/>\n" +
                "            <RefDangerUpperLimit/>\n" +
                "            <ObrUnit>p/μL</ObrUnit>\n" +
                "            <ItmPrtFlag>0</ItmPrtFlag>\n" +
                "            <ItmContrastCode/>\n" +
                "            <ComId>455</ComId>\n" +
                "            <ComName>尿沉渣定量+尿液分析(尿常规)</ComName>\n" +
                "            <RepItrId>10138</RepItrId>\n" +
                "            <ObrDate>2024-05-01 00:21:37</ObrDate>\n" +
                "        </ObrResult>\n" +
                "        <ObrResult>\n" +
                "            <RepId>10138202305011</RepId>\n" +
                "            <ItmId>10962</ItmId>\n" +
                "            <ItmName>胆红素</ItmName>\n" +
                "            <ObrValue>-</ObrValue>\n" +
                "            <ResTips/>\n" +
                "            <RefLowerLimit>阴性</RefLowerLimit>\n" +
                "            <ResRef>阴性</ResRef>\n" +
                "            <RefDangerLowerLimit/>\n" +
                "            <RefDangerUpperLimit/>\n" +
                "            <ObrUnit/>\n" +
                "            <ItmPrtFlag>0</ItmPrtFlag>\n" +
                "            <ItmContrastCode/>\n" +
                "            <ComId>455</ComId>\n" +
                "            <ComName>尿沉渣定量+尿液分析(尿常规)</ComName>\n" +
                "            <RepItrId>10138</RepItrId>\n" +
                "            <ObrDate>2024-05-01 00:21:37</ObrDate>\n" +
                "        </ObrResult>\n" +
                "        <ObrResult>\n" +
                "            <RepId>10138202305011</RepId>\n" +
                "            <ItmId>10970</ItmId>\n" +
                "            <ItmName>白细胞</ItmName>\n" +
                "            <ObrValue>3+</ObrValue>\n" +
                "            <ResTips>*</ResTips>\n" +
                "            <RefLowerLimit>阴性</RefLowerLimit>\n" +
                "            <ResRef>阴性</ResRef>\n" +
                "            <RefDangerLowerLimit/>\n" +
                "            <RefDangerUpperLimit/>\n" +
                "            <ObrUnit/>\n" +
                "            <ItmPrtFlag>0</ItmPrtFlag>\n" +
                "            <ItmContrastCode/>\n" +
                "            <ComId>455</ComId>\n" +
                "            <ComName>尿沉渣定量+尿液分析(尿常规)</ComName>\n" +
                "            <RepItrId>10138</RepItrId>\n" +
                "            <ObrDate>2024-05-01 00:21:37</ObrDate>\n" +
                "        </ObrResult>\n" +
                "        <ObrResult>\n" +
                "            <RepId>10138202305011</RepId>\n" +
                "            <ItmId>11185</ItmId>\n" +
                "            <ItmName>病理管型</ItmName>\n" +
                "            <ObrValue>0</ObrValue>\n" +
                "            <ResTips/>\n" +
                "            <RefLowerLimit>0</RefLowerLimit>\n" +
                "            <RefUpperLimit>1.5</RefUpperLimit>\n" +
                "            <ResRef>0-1.5</ResRef>\n" +
                "            <RefDangerLowerLimit/>\n" +
                "            <RefDangerUpperLimit/>\n" +
                "            <ObrUnit>p/μL</ObrUnit>\n" +
                "            <ItmPrtFlag>0</ItmPrtFlag>\n" +
                "            <ItmContrastCode/>\n" +
                "            <ComId>455</ComId>\n" +
                "            <ComName>尿沉渣定量+尿液分析(尿常规)</ComName>\n" +
                "            <RepItrId>10138</RepItrId>\n" +
                "            <ObrDate>2024-05-01 00:21:37</ObrDate>\n" +
                "        </ObrResult>\n" +
                "        <ObrResult>\n" +
                "            <RepId>10138202305011</RepId>\n" +
                "            <ItmId>10964</ItmId>\n" +
                "            <ItmName>尿比重</ItmName>\n" +
                "            <ObrValue>1.010</ObrValue>\n" +
                "            <ResTips/>\n" +
                "            <RefLowerLimit>1.003</RefLowerLimit>\n" +
                "            <RefUpperLimit>1.030</RefUpperLimit>\n" +
                "            <ResRef>1.003-1.030</ResRef>\n" +
                "            <RefDangerLowerLimit/>\n" +
                "            <RefDangerUpperLimit/>\n" +
                "            <ObrUnit/>\n" +
                "            <ItmPrtFlag>0</ItmPrtFlag>\n" +
                "            <ItmContrastCode/>\n" +
                "            <ComId>455</ComId>\n" +
                "            <ComName>尿沉渣定量+尿液分析(尿常规)</ComName>\n" +
                "            <RepItrId>10138</RepItrId>\n" +
                "            <ObrDate>2024-05-01 00:21:37</ObrDate>\n" +
                "        </ObrResult>\n" +
                "        <ObrResult>\n" +
                "            <RepId>10138202305011</RepId>\n" +
                "            <ItmId>10963</ItmId>\n" +
                "            <ItmName>尿酮体</ItmName>\n" +
                "            <ObrValue>-</ObrValue>\n" +
                "            <ResTips/>\n" +
                "            <RefLowerLimit>阴性</RefLowerLimit>\n" +
                "            <ResRef>阴性</ResRef>\n" +
                "            <RefDangerLowerLimit/>\n" +
                "            <RefDangerUpperLimit/>\n" +
                "            <ObrUnit/>\n" +
                "            <ItmPrtFlag>0</ItmPrtFlag>\n" +
                "            <ItmContrastCode/>\n" +
                "            <ComId>455</ComId>\n" +
                "            <ComName>尿沉渣定量+尿液分析(尿常规)</ComName>\n" +
                "            <RepItrId>10138</RepItrId>\n" +
                "            <ObrDate>2024-05-01 00:21:37</ObrDate>\n" +
                "        </ObrResult>\n" +
                "        <ObrResult>\n" +
                "            <RepId>10138202305011</RepId>\n" +
                "            <ItmId>12728</ItmId>\n" +
                "            <ItmName>粘液丝</ItmName>\n" +
                "            <ObrValue>102</ObrValue>\n" +
                "            <ResTips>↑</ResTips>\n" +
                "            <RefLowerLimit>0</RefLowerLimit>\n" +
                "            <RefUpperLimit>28</RefUpperLimit>\n" +
                "            <ResRef>0-28</ResRef>\n" +
                "            <RefDangerLowerLimit/>\n" +
                "            <RefDangerUpperLimit/>\n" +
                "            <ObrUnit>p/μL</ObrUnit>\n" +
                "            <ItmPrtFlag>0</ItmPrtFlag>\n" +
                "            <ItmContrastCode/>\n" +
                "            <ComId>455</ComId>\n" +
                "            <ComName>尿沉渣定量+尿液分析(尿常规)</ComName>\n" +
                "            <RepItrId>10138</RepItrId>\n" +
                "            <ObrDate>2024-05-01 00:21:37</ObrDate>\n" +
                "        </ObrResult>\n" +
                "        <ObrResult>\n" +
                "            <RepId>10138202305011</RepId>\n" +
                "            <ItmId>11184</ItmId>\n" +
                "            <ItmName>透明管型</ItmName>\n" +
                "            <ObrValue>0</ObrValue>\n" +
                "            <ResTips/>\n" +
                "            <RefLowerLimit>0</RefLowerLimit>\n" +
                "            <RefUpperLimit>2</RefUpperLimit>\n" +
                "            <ResRef>0-2</ResRef>\n" +
                "            <RefDangerLowerLimit/>\n" +
                "            <RefDangerUpperLimit/>\n" +
                "            <ObrUnit>p/μL</ObrUnit>\n" +
                "            <ItmPrtFlag>0</ItmPrtFlag>\n" +
                "            <ItmContrastCode/>\n" +
                "            <ComId>455</ComId>\n" +
                "            <ComName>尿沉渣定量+尿液分析(尿常规)</ComName>\n" +
                "            <RepItrId>10138</RepItrId>\n" +
                "            <ObrDate>2024-05-01 00:21:37</ObrDate>\n" +
                "        </ObrResult>\n" +
                "        <ObrResult>\n" +
                "            <RepId>10138202305011</RepId>\n" +
                "            <ItmId>11188</ItmId>\n" +
                "            <ItmName>细菌</ItmName>\n" +
                "            <ObrValue>336</ObrValue>\n" +
                "            <ResTips>↑</ResTips>\n" +
                "            <RefLowerLimit>0</RefLowerLimit>\n" +
                "            <RefUpperLimit>7</RefUpperLimit>\n" +
                "            <ResRef>0-7</ResRef>\n" +
                "            <RefDangerLowerLimit/>\n" +
                "            <RefDangerUpperLimit/>\n" +
                "            <ObrUnit>p/μL</ObrUnit>\n" +
                "            <ItmPrtFlag>0</ItmPrtFlag>\n" +
                "            <ItmContrastCode/>\n" +
                "            <ComId>455</ComId>\n" +
                "            <ComName>尿沉渣定量+尿液分析(尿常规)</ComName>\n" +
                "            <RepItrId>10138</RepItrId>\n" +
                "            <ObrDate>2024-05-01 00:21:37</ObrDate>\n" +
                "        </ObrResult>\n" +
                "        <ObrResult>\n" +
                "            <RepId>10138202305011</RepId>\n" +
                "            <ItmId>10961</ItmId>\n" +
                "            <ItmName>尿糖</ItmName>\n" +
                "            <ObrValue>-</ObrValue>\n" +
                "            <ResTips/>\n" +
                "            <RefLowerLimit>阴性</RefLowerLimit>\n" +
                "            <RefUpperLimit/>\n" +
                "            <ResRef>阴性</ResRef>\n" +
                "            <RefDangerLowerLimit/>\n" +
                "            <RefDangerUpperLimit/>\n" +
                "            <ObrUnit/>\n" +
                "            <ItmPrtFlag>0</ItmPrtFlag>\n" +
                "            <ItmContrastCode/>\n" +
                "            <ComId>455</ComId>\n" +
                "            <ComName>尿沉渣定量+尿液分析(尿常规)</ComName>\n" +
                "            <RepItrId>10138</RepItrId>\n" +
                "            <ObrDate>2024-05-01 00:21:37</ObrDate>\n" +
                "        </ObrResult>\n" +
                "        <ObrResult>\n" +
                "            <RepId>10138202305011</RepId>\n" +
                "            <ItmId>11186</ItmId>\n" +
                "            <ItmName>鳞状上皮细胞</ItmName>\n" +
                "            <ObrValue>63</ObrValue>\n" +
                "            <ResTips>↑</ResTips>\n" +
                "            <RefLowerLimit>0</RefLowerLimit>\n" +
                "            <RefUpperLimit>28</RefUpperLimit>\n" +
                "            <ResRef>0-28</ResRef>\n" +
                "            <RefDangerLowerLimit/>\n" +
                "            <RefDangerUpperLimit/>\n" +
                "            <ObrUnit>p/μL</ObrUnit>\n" +
                "            <ItmPrtFlag>0</ItmPrtFlag>\n" +
                "            <ItmContrastCode/>\n" +
                "            <ComId>455</ComId>\n" +
                "            <ComName>尿沉渣定量+尿液分析(尿常规)</ComName>\n" +
                "            <RepItrId>10138</RepItrId>\n" +
                "            <ObrDate>2024-05-01 00:21:37</ObrDate>\n" +
                "        </ObrResult>\n" +
                "        <ObrResult>\n" +
                "            <RepId>10138202305011</RepId>\n" +
                "            <ItmId>10966</ItmId>\n" +
                "            <ItmName>尿蛋白</ItmName>\n" +
                "            <ObrValue>-</ObrValue>\n" +
                "            <ResTips/>\n" +
                "            <RefLowerLimit>阴性</RefLowerLimit>\n" +
                "            <ResRef>阴性</ResRef>\n" +
                "            <RefDangerLowerLimit/>\n" +
                "            <RefDangerUpperLimit/>\n" +
                "            <ObrUnit/>\n" +
                "            <ItmPrtFlag>0</ItmPrtFlag>\n" +
                "            <ItmContrastCode/>\n" +
                "            <ComId>455</ComId>\n" +
                "            <ComName>尿沉渣定量+尿液分析(尿常规)</ComName>\n" +
                "            <RepItrId>10138</RepItrId>\n" +
                "            <ObrDate>2024-05-01 00:21:37</ObrDate>\n" +
                "        </ObrResult>\n" +
                "        <ObrResult>\n" +
                "            <RepId>10138202305011</RepId>\n" +
                "            <ItmId>10965</ItmId>\n" +
                "            <ItmName>酸碱度</ItmName>\n" +
                "            <ObrValue>7.5</ObrValue>\n" +
                "            <ResTips/>\n" +
                "            <RefLowerLimit>4.50</RefLowerLimit>\n" +
                "            <RefUpperLimit>8.00</RefUpperLimit>\n" +
                "            <ResRef>4.50-8.00</ResRef>\n" +
                "            <RefDangerLowerLimit/>\n" +
                "            <RefDangerUpperLimit/>\n" +
                "            <ItmPrtFlag>0</ItmPrtFlag>\n" +
                "            <ItmContrastCode/>\n" +
                "            <ComId>455</ComId>\n" +
                "            <ComName>尿沉渣定量+尿液分析(尿常规)</ComName>\n" +
                "            <RepItrId>10138</RepItrId>\n" +
                "            <ObrDate>2024-05-01 00:21:37</ObrDate>\n" +
                "        </ObrResult>\n" +
                "        <ObrResult>\n" +
                "            <RepId>10138202305011</RepId>\n" +
                "            <ItmId>11178</ItmId>\n" +
                "            <ItmName>总晶体</ItmName>\n" +
                "            <ObrValue>0</ObrValue>\n" +
                "            <ResTips/>\n" +
                "            <RefLowerLimit>0</RefLowerLimit>\n" +
                "            <RefUpperLimit>28</RefUpperLimit>\n" +
                "            <ResRef>0-28</ResRef>\n" +
                "            <RefDangerLowerLimit/>\n" +
                "            <RefDangerUpperLimit/>\n" +
                "            <ObrUnit>p/μL</ObrUnit>\n" +
                "            <ItmPrtFlag>0</ItmPrtFlag>\n" +
                "            <ItmContrastCode/>\n" +
                "            <ComId>455</ComId>\n" +
                "            <ComName>尿沉渣定量+尿液分析(尿常规)</ComName>\n" +
                "            <RepItrId>10138</RepItrId>\n" +
                "            <ObrDate>2024-05-01 00:21:37</ObrDate>\n" +
                "        </ObrResult>\n" +
                "        <ObrResult>\n" +
                "            <RepId>10138202305011</RepId>\n" +
                "            <ItmId>10960</ItmId>\n" +
                "            <ItmName>透明度</ItmName>\n" +
                "            <ObrValue>轻度浑浊</ObrValue>\n" +
                "            <ResTips/>\n" +
                "            <RefLowerLimit>清晰透明</RefLowerLimit>\n" +
                "            <ResRef>清晰透明</ResRef>\n" +
                "            <RefDangerLowerLimit/>\n" +
                "            <RefDangerUpperLimit/>\n" +
                "            <ObrUnit/>\n" +
                "            <ItmPrtFlag>0</ItmPrtFlag>\n" +
                "            <ItmContrastCode/>\n" +
                "            <ComId>455</ComId>\n" +
                "            <ComName>尿沉渣定量+尿液分析(尿常规)</ComName>\n" +
                "            <RepItrId>10138</RepItrId>\n" +
                "            <ObrDate>2024-05-01 00:21:37</ObrDate>\n" +
                "        </ObrResult>\n" +
                "        <ObrResult>\n" +
                "            <RepId>10138202305011</RepId>\n" +
                "            <ItmId>11180</ItmId>\n" +
                "            <ItmName>白细胞</ItmName>\n" +
                "            <ObrValue>76</ObrValue>\n" +
                "            <ResTips>↑</ResTips>\n" +
                "            <RefLowerLimit>0</RefLowerLimit>\n" +
                "            <RefUpperLimit>28</RefUpperLimit>\n" +
                "            <ResRef>0-28</ResRef>\n" +
                "            <RefDangerLowerLimit/>\n" +
                "            <RefDangerUpperLimit/>\n" +
                "            <ObrUnit>p/μL</ObrUnit>\n" +
                "            <ItmPrtFlag>0</ItmPrtFlag>\n" +
                "            <ItmContrastCode/>\n" +
                "            <ComId>455</ComId>\n" +
                "            <ComName>尿沉渣定量+尿液分析(尿常规)</ComName>\n" +
                "            <RepItrId>10138</RepItrId>\n" +
                "            <ObrDate>2024-05-01 00:21:37</ObrDate>\n" +
                "        </ObrResult>\n" +
                "    </Result>\n" +
                "</Response>";

            return ResponseEntity.ok(xmlResponse1);
    }


}
