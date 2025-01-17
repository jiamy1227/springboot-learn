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
public class MockController7 {

    @PostMapping(value = "/DSYY_PACS_getReportList",produces = MediaType.TEXT_XML_VALUE)
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
                "    <resultDesc>成功</resultDesc>\n" +
                "    <itemList>\n" +
                "        <itemInfo>\n" +
                "            <RepId>220</RepId>\n" +
                "            <ApplyId>21879125</ApplyId>\n" +
                "            <examSeqCode>DX412490</examSeqCode>\n" +
                "            <Source>1</Source>\n" +
                "            <SystemType>2</SystemType>\n" +
                "            <itemId/>\n" +
                "            <itemName>胸部</itemName>\n" +
                "            <examTime>2024-10-07 15:19:05</examTime>\n" +
                "            <executeDate>2024-10-07</executeDate>\n" +
                "            <status>报告已审核</status>\n" +
                "            <appDate>2024-10-07 15:19:05</appDate>\n" +
                "            <feature>    胸廓对称，气管、纵隔居中。两肺纹理增粗、模糊，两中、下肺野内带见斑点状高密度影，边界模糊。两肺门影未见明显增大。心脏及纵隔影未见异常改变。两膈面光整，两肋膈角锐利。\n" +
                "</feature>\n" +
                "            <remark>符合双侧支气管肺炎改变，请结合临床。\n" +
                "</remark>\n" +
                "        </itemInfo>\n" +
                "        <itemInfo>\n" +
                "            <RepId>220</RepId>\n" +
                "            <ApplyId>3058992</ApplyId>\n" +
                "            <examSeqCode>US927310</examSeqCode>\n" +
                "            <Source>0</Source>\n" +
                "            <SystemType>1</SystemType>\n" +
                "            <itemId>10479</itemId>\n" +
                "            <itemName>胃肠道彩超</itemName>\n" +
                "            <examTime>2024-09-09 23:54:54</examTime>\n" +
                "            <executeDate>2024-09-10</executeDate>\n" +
                "            <status>报告已审核</status>\n" +
                "            <appDate>2024-09-09 23:54:54</appDate>\n" +
                "            <feature>急诊超声检查受检查仪器条件、时限及患者自身状态的限制，只能尽可能对应危急症状作针对性检查，非急症病变可能存在漏诊、误诊。\n" +
                "腹腔内未见明显肠管扩张及肠壁增厚。未见肠间积液。未见明显同心圆征。未见明显肿大淋巴结。</feature>\n" +
                "            <remark>腹腔未见明显异常声像。</remark>\n" +
                "        </itemInfo>\n" +
                "    </itemList>\n" +
                "</Response>";

            return ResponseEntity.ok(xmlResponse1);
    }


}
