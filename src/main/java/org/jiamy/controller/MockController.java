package org.jiamy.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;

/**
 * @description:
 * @author: jiamy
 * @create: 2024/11/12 15:05
 **/
@RestController
@RequestMapping("/ESBService.asmx")
public class MockController {

    @PostMapping(produces = MediaType.TEXT_XML_VALUE)
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
                "\t\t<ResultCode>0</ResultCode>\n" +
                "\t\t<ResultContent>成功</ResultContent>\n" +
                "\t\t<Result>\n" +
                "\t\t\t<PidReportMain>\n" +
                "\t\t\t\t<PidInNo>000007</PidInNo>\n" +
                "\t\t\t\t<PidSocialNo>000007</PidSocialNo>\n" +
                "\t\t\t\t<PidAddmissTimes>1</PidAddmissTimes>\n" +
                "\t\t\t\t<RepId>10259202205012</RepId>\n" +
                "\t\t\t\t<RepSid>2</RepSid>\n" +
                "\t\t\t\t<ComId>11251</ComId>\n" +
                "\t\t\t\t<PidComName>降钙素原检测</PidComName>\n" +
                "\t\t\t\t<RepInDate>2024-10-07 08:27:35</RepInDate>\n" +
                "\t\t\t\t<LrName>吴娜娜</LrName>\n" +
                "\t\t\t\t<RepCheckUserName>潘小翠</RepCheckUserName>\n" +
                "\t\t\t\t<RepReportUserName>吴娜娜</RepReportUserName>\n" +
                "\t\t\t\t<RepStatus>4</RepStatus>\n" +
                "\t\t\t\t<RepReportDate>2024-10-07 10:30:27</RepReportDate>\n" +
                "\t\t\t\t<PidDocName>朱瑶瑶</PidDocName>\n" +
                "\t\t\t\t<SignContent> </SignContent>\n" +
                "\t\t\t\t<RepItrId>10259</RepItrId>\n" +
                "\t\t\t\t<RepReportType>gen</RepReportType>\n" +
                "\t\t\t\t<PidSrcId>108</PidSrcId>\n" +
                "\t\t\t\t<SampApplyDate>2024-10-07 09:37:23</SampApplyDate>\n" +
                "\t\t\t\t<PidDeptName>内科病区</PidDeptName>\n" +
                "\t\t\t\t<RepInputId>1340920</RepInputId>\n" +
                "\t\t\t\t<PidIdentityCard> </PidIdentityCard>\n" +
                "\t\t\t\t<PidName>尹香妹</PidName>\n" +
                "\t\t\t\t<PidSex>2</PidSex>\n" +
                "\t\t\t\t<Age>81岁</Age>\n" +
                "\t\t\t\t<RepBarCode>8029577278</RepBarCode>\n" +
                "\t\t\t\t<PidDeptId>66614</PidDeptId>\n" +
                "\t\t\t\t<PidRemark>合格</PidRemark>\n" +
                "\t\t\t\t<PidSamId>10118</PidSamId>\n" +
                "\t\t\t\t<SamName>血清</SamName>\n" +
                "\t\t\t\t<PidDoctorCode> </PidDoctorCode>\n" +
                "\t\t\t\t<OrderCode>1380_255</OrderCode>\n" +
                "\t\t\t\t<RepRemark> </RepRemark>\n" +
                "\t\t\t</PidReportMain></Result>\n" +
                "</Response>";
        String xmlResponse2 = "<Response>\n" +
                "\t\t<ResultCode>0</ResultCode>\n" +
                "\t\t<ResultContent>成功</ResultContent>\n" +
                "\t\t<Result>\n" +
                "\t\t\t<ObrResult>\n" +
                "\t\t\t\t<RepId>10243202205288029581427</RepId>\n" +
                "\t\t\t\t<ObrSn>1469129</ObrSn>\n" +
                "\t\t\t\t<ItmId>14008</ItmId>\n" +
                "\t\t\t\t<ItmName>天门冬氨酸氨基转移酶</ItmName>\n" +
                "\t\t\t\t<ItmEName>AST</ItmEName>\n" +
                "\t\t\t\t<ObrValue>20</ObrValue>\n" +
                "\t\t\t\t<ResTips>test20241113</ResTips>\n" +
                "\t\t\t\t<RefLowerLimit>12</RefLowerLimit>\n" +
                "\t\t\t\t<RefUpperLimit>35</RefUpperLimit>\n" +
                "\t\t\t\t<ResRef>12-35</ResRef>\n" +
                "\t\t\t\t<RefDangerLowerLimit> </RefDangerLowerLimit>\n" +
                "\t\t\t\t<RefDangerUpperLimit> </RefDangerUpperLimit>\n" +
                "\t\t\t\t<ObrUnit>U/L</ObrUnit>\n" +
                "\t\t\t\t<ItmPrtFlag>1</ItmPrtFlag>\n" +
                "\t\t\t\t<ItmContrastCode> </ItmContrastCode>\n" +
                "\t\t\t\t<SamName>血清</SamName>\n" +
                "\t\t\t\t<ComId>11182</ComId>\n" +
                "\t\t\t\t<ComName>肝功一组</ComName>\n" +
                "\t\t\t</ObrResult>\n" +
                "\t\t\t<ObrResult>\n" +
                "\t\t\t\t<RepId>10243202205288029581427</RepId>\n" +
                "\t\t\t\t<ObrSn>1469540</ObrSn>\n" +
                "\t\t\t\t<ItmId>14084</ItmId>\n" +
                "\t\t\t\t<ItmName>白蛋白/球蛋白</ItmName>\n" +
                "\t\t\t\t<ItmEName>A/G</ItmEName>\n" +
                "\t\t\t\t<ObrValue>1.19</ObrValue>\n" +
                "\t\t\t\t<ResTips>test20241113</ResTips>\n" +
                "\t\t\t\t<RefLowerLimit>1.2</RefLowerLimit>\n" +
                "\t\t\t\t<RefUpperLimit>2.4</RefUpperLimit>\n" +
                "\t\t\t\t<ResRef>1.2-2.4</ResRef>\n" +
                "\t\t\t\t<RefDangerLowerLimit> </RefDangerLowerLimit>\n" +
                "\t\t\t\t<RefDangerUpperLimit> </RefDangerUpperLimit>\n" +
                "\t\t\t\t<ObrUnit>Ratio</ObrUnit>\n" +
                "\t\t\t\t<ItmPrtFlag>1</ItmPrtFlag>\n" +
                "\t\t\t\t<ItmContrastCode> </ItmContrastCode>\n" +
                "\t\t\t\t<SamName>血清</SamName>\n" +
                "\t\t\t\t<ComId>11182</ComId>\n" +
                "\t\t\t\t<ComName>肝功一组</ComName>\n" +
                "\t\t\t</ObrResult>\n" +
                "\t\t</Result>\n" +
                "\t</Response>\n" +
                "</string>";


        String xmlResponse3 = "<res>\n" +
                "<resultCode>0</resultCode>\n" +
                "<resultDesc>成功</resultDesc>\n" +
                "<itemList>\n" +
                "<itemInfo/>\n" +
                "<itemInfo>\n" +
                "<itemId>56253624859216433</itemId>\n" +
                "<itemName>胸部正侧位;</itemName>\n" +
                "<executeDate>20241005</executeDate>\n" +
                "<status>1</status>\n" +
                "<appDate>2024-10-07 10:07:40</appDate>\n" +
                "<examTime>2024-10-07 10:07:40</examTime>\n" +
                "<remark>胸部平片未见明显异常。 请结合临床。</remark>\n" +
                "</itemInfo>\n" +
                "</itemList>\n" +
                "</res>\n";

        String xmlResponse4 = "<res>\n" +
                "<resultCode>0</resultCode>\n" +
                "<resultDesc>成功</resultDesc>\n" +
                "<examItemList>\n" +
                "<examItem/><examItem>\n" +
                "<examNo/><PDFReportDir>E:\\report\\RIS\\2022\\7\\12\\00329.pdf</PDFReportDir>\n" +
                "<examName>右髋关节MRI平扫;</examName>\n" +
                "<content> 右股骨大转子周围组织呈条絮状T2信号，结构模糊，累及臀大肌、臀中肌、臀小肌大转子附着处；另臀中肌与臀小肌肌间隙见片状长T2水肿信号影，边界模糊，内见数个结节状长T1短T2信号、较大者径约8mm；大转子层面皮下筋膜层见少许条状水肿信号影。 右髋关节诸骨骨质结构完整，未见明显骨质增生及破坏，未见明显骨折征象；髋关节间隙均匀，关节在位。髋关节腔见少许液性信号影。\n" +
                "</content>\n" +
                "<prompt>1.考虑右髋关节大转子周围滑囊炎。 2.臀中肌与臀小肌肌间隙水肿、散在钙化灶，考虑钙化性肌腱炎。 3.臀大肌、臀中肌、臀小肌（大转子附着处）局部肌纤维拉伤及肌腱损伤。 4.大转子层面少许皮下筋膜水肿。 5.髋关节腔少许积液。\n" +
                "</prompt>\n" +
                "<ClinicDepartment/><PatientName/><ClinicDoctor/><StudyDoctor/></examItem></examItemList></res>\n";

        String xmlResponse6 = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<Result service=\"DSYY_HIS_IPPatientInfo\">\n" +
                "<ExecuteTime>2022-06-09 11:27:06</ExecuteTime> \n" +
                "<Description></Description>\n" +
                "<ResultCode>True</ResultCode> \n" +
                "<Response> \n" +
                "<PATIENTID>001573</PATIENTID> \n" +
                "<NAME>吴贤文</NAME> <PY></PY><SEX>2</SEX><IDTYPE>居民身份证</IDTYPE> <IDCARD>44050419560123162X</IDCARD> \n" +
                "<BIRTHDAY>1956/1/23 0:00:00</BIRTHDAY> \n" +
                "<CURMOBILE>18928942088</CURMOBILE> <CURADDRESS>华标峰湖御景小区J6栋1102</CURADDRESS> <COMPANY></COMPANY> \n" +
                "<PROFESSION>退（离）休人员</PROFESSION> \n" +
                "<COUNTRY>中国</COUNTRY> <NATION>汉族</NATION> <MARRIEDSTATUS>已婚</MARRIEDSTATUS> \n" +
                "<CONTACT_NAME>罗婉纯</CONTACT_NAME> <CONTACT_RELATION>女</CONTACT_RELATION><CONTACT_PHONE_NO>13570302226</CONTACT_PHONE_NO><ADDER>77327</ADDER><ADDDATE>2022/4/20 11:14:11</ADDDATE> <UPDATER>77327</UPDATER> \n" +
                "<UPDATEDATE>2022/4/20 11:14:11</UPDATEDATE> \n" +
                "</Response> \n" +
                "</Result>\n";

        String xmlResponse5 = "<Response> \n" +
                "<PATIENTID>2000269</PATIENTID> <VISITNO>1293047</VISITNO> <INPNO>2000269</INPNO> <NAME>王碧云</NAME> <PY></PY> \n" +
                "<NATIONSEX>2</NATIONSEX> <IDTYPE>居民身份证</IDTYPE> <IDCARD>452123197510061346</IDCARD> <BIRTHDAY>1975/10/6 0:00:00</BIRTHDAY> <CURMOBILE>13411156876</CURMOBILE> \n" +
                "<CURADDRESS>黄埔区开创大道3016号</CURADDRESS> <COMPANY></COMPANY> \n" +
                "<PROFESSION>其他</PROFESSION> \n" +
                "<NATION></NATION> \n" +
                "<CONTACT_NAME></CONTACT_NAME> <CONTACT_RELATION></CONTACT_RELATION> <CONTACT_PHONE_NO></CONTACT_PHONE_NO> \n" +
                "</Response> \n" +
                "<Response> \n" +
                "<PATIENTID>2000424</PATIENTID> <VISITNO>1293308</VISITNO> <INPNO>2000424</INPNO> <NAME>李锐军</NAME> <PY></PY> \n" +
                "<NATIONSEX>1</NATIONSEX> <IDTYPE>居民身份证</IDTYPE> <IDCARD>440102197109220616</IDCARD> \n" +
                "<BIRTHDAY>1971/9/22 0:00:00</BIRTHDAY> \n" +
                "<CURMOBILE>13600486831</CURMOBILE> \n" +
                "<CURADDRESS>总务部</CURADDRESS> \n" +
                "<COMPANY></COMPANY> <PROFESSION></PROFESSION> \n" +
                "<NATION></NATION> \n" +
                "<CONTACT_NAME></CONTACT_NAME> <CONTACT_RELATION></CONTACT_RELATION> <CONTACT_PHONE_NO></CONTACT_PHONE_NO> \n" +
                "</Response> \n";

        if(stringBuilder.toString().contains("DSYY_LIS_GetPatientList")){
            return ResponseEntity.ok(xmlResponse1);
        } else if (stringBuilder.toString().contains("DSYY_LIS_GetRoutineResult")) {
            return ResponseEntity.ok(xmlResponse2);
        } else if (stringBuilder.toString().contains("DSYY_PACS_getReportList")) {
            return ResponseEntity.ok(xmlResponse3);
        } else if (stringBuilder.toString().contains("DSYY_PACS_getExamDetail")) {
            return ResponseEntity.ok(xmlResponse4);
        } else if (stringBuilder.toString().contains("DSYY_HIS_IPPatientInfo")) {
            return ResponseEntity.ok(xmlResponse5);
        } else if (stringBuilder.toString().contains("DSYY_HIS_OPPatientInfo")) {
            return ResponseEntity.ok(xmlResponse6);
        }
        return ResponseEntity.ok("");
    }
}
