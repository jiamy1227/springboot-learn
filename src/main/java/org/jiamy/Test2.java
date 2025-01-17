package org.jiamy;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.jiamy.entity.GetPatientListResponse;

public class Test2 {
    public static void main(String[] args) throws Exception {
        String xmlData = "<Response>\n" +
                "    <ResultCode>0</ResultCode>\n" +
                "    <ResultContent>成功</ResultContent>\n" +
                "    <PidReportMain>\n" +
                "        <PidInNo>321071</PidInNo>\n" +
                "        <PidAddmissTimes/>\n" +
                "        <RepId>10149202304175000108221</RepId>\n" +
                "        <PidComName>急查肌钙蛋白T测定</PidComName>\n" +
                "        <RepInDate>04 17 20</RepInDate>\n" +
                "        <reporterCode>1271</reporterCode>\n" +
                "        <RepReportUserName>黄彩云</RepReportUserName>\n" +
                "        <diagnosis>右眼皮质型老年性白内障</diagnosis>\n" +
                "        <RepReportDate>04 17 20</RepReportDate>\n" +
                "        <RepSid>5000108221</RepSid>\n" +
                "        <ComId>610</ComId>\n" +
                "        <LrName>苏小杰</LrName>\n" +
                "        <RepCheckUserCode>969</RepCheckUserCode>\n" +
                "        <RepCheckUserName>04 17 2023  8:13PM</RepCheckUserName>\n" +
                "        <RepStatus>1</RepStatus>\n" +
                "        <PidDocName>张跃锐</PidDocName>\n" +
                "        <SignContent/>\n" +
                "        <RepItrId>10149</RepItrId>\n" +
                "        <RepReportType>gen</RepReportType>\n" +
                "        <PidSrcId>108</PidSrcId>\n" +
                "        <Samp_Apply_Date>04 17 20</Samp_Apply_Date>\n" +
                "        <Pid_Doc_Name>张跃锐</Pid_Doc_Name>\n" +
                "        <Pid_Dept_Name>眼科</Pid_Dept_Name>\n" +
                "        <PidIdentityCard>44062019490805258X</PidIdentityCard>\n" +
                "        <PidNam>陈细妹</PidNam>\n" +
                "        <PidSex>2</PidSex>\n" +
                "        <Age>73岁  月  天  时  分</Age>\n" +
                "        <RepBarCode>5000108221</RepBarCode>\n" +
                "        <PidDeptId>192</PidDeptId>\n" +
                "        <PidRemark>合格</PidRemark>\n" +
                "        <PidSamId>10053</PidSamId>\n" +
                "        <SamName>静脉血</SamName>\n" +
                "        <PidDoctorCode>14139</PidDoctorCode>\n" +
                "        <OrderCode/>\n" +
                "        <PidInNo>321071</PidInNo>\n" +
                "        <PidAddmissTimes/>\n" +
                "        <RepId>10139202304172000310393</RepId>\n" +
                "        <PidComName>感染四项（乙肝+梅毒+HIV+HCV定量）</PidComName>\n" +
                "        <RepInDate>04 17 20</RepInDate>\n" +
                "        <reporterCode>964</reporterCode>\n" +
                "        <RepReportUserName>谢远强</RepReportUserName>\n" +
                "        <RepReportDate>04 17 20</RepReportDate>\n" +
                "        <RepSid>2000310393</RepSid>\n" +
                "        <ComId>589</ComId>\n" +
                "        <LrName>陈莹</LrName>\n" +
                "        <RepCheckUserCode>1243</RepCheckUserCode>\n" +
                "        <RepCheckUserName>04 17 2023  2:25PM</RepCheckUserName>\n" +
                "        <RepStatus>1</RepStatus>\n" +
                "        <PidDocName>张跃锐</PidDocName>\n" +
                "        <SignContent/>\n" +
                "        <RepItrId>10139</RepItrId>\n" +
                "        <RepReportType>gen</RepReportType>\n" +
                "        <PidSrcId>108</PidSrcId>\n" +
                "        <Samp_Apply_Date>04 17 20</Samp_Apply_Date>\n" +
                "        <Pid_Doc_Name>张跃锐</Pid_Doc_Name>\n" +
                "        <Pid_Dept_Name>眼科</Pid_Dept_Name>\n" +
                "        <PidIdentityCard>44062019490805258X</PidIdentityCard>\n" +
                "        <PidNam>陈细妹</PidNam>\n" +
                "        <PidSex>2</PidSex>\n" +
                "        <Age>73岁  月  天  时  分</Age>\n" +
                "        <RepBarCode>2000310393</RepBarCode>\n" +
                "        <PidDeptId>192</PidDeptId>\n" +
                "        <PidRemark>合格</PidRemark>\n" +
                "        <PidSamId>10053</PidSamId>\n" +
                "        <SamName>静脉血</SamName>\n" +
                "        <PidDoctorCode>14139</PidDoctorCode>\n" +
                "        <OrderCode/>\n" +
                "        <PidInNo>321071</PidInNo>\n" +
                "        <PidAddmissTimes/>\n" +
                "        <RepId>10001202304182000310297</RepId>\n" +
                "        <PidComName>肾功四项 + 空腹血糖 + 肝功八项</PidComName>\n" +
                "        <RepInDate>04 18 20</RepInDate>\n" +
                "        <reporterCode>1502</reporterCode>\n" +
                "        <RepReportUserName>林晓蕾</RepReportUserName>\n" +
                "        <RepReportDate>04 18 20</RepReportDate>\n" +
                "        <RepSid>2000310297</RepSid>\n" +
                "        <ComId>38 + 48 + 213</ComId>\n" +
                "        <LrName>李付奋</LrName>\n" +
                "        <RepCheckUserCode>14148</RepCheckUserCode>\n" +
                "        <RepCheckUserName>04 18 2023  7:32AM</RepCheckUserName>\n" +
                "        <RepStatus>1</RepStatus>\n" +
                "        <PidDocName>张跃锐</PidDocName>\n" +
                "        <SignContent/>\n" +
                "        <RepItrId>10001</RepItrId>\n" +
                "        <RepReportType>gen</RepReportType>\n" +
                "        <PidSrcId>108</PidSrcId>\n" +
                "        <Samp_Apply_Date>04 17 20</Samp_Apply_Date>\n" +
                "        <Pid_Doc_Name>张跃锐</Pid_Doc_Name>\n" +
                "        <Pid_Dept_Name>眼科</Pid_Dept_Name>\n" +
                "        <PidIdentityCard>44062019490805258X</PidIdentityCard>\n" +
                "        <PidNam>陈细妹</PidNam>\n" +
                "        <PidSex>2</PidSex>\n" +
                "        <Age>73岁  月  天  时  分</Age>\n" +
                "        <RepBarCode>2000310297</RepBarCode>\n" +
                "        <PidDeptId>192</PidDeptId>\n" +
                "        <PidRemark>合格</PidRemark>\n" +
                "        <PidSamId>10053</PidSamId>\n" +
                "        <SamName>静脉血</SamName>\n" +
                "        <PidDoctorCode>14139</PidDoctorCode>\n" +
                "        <OrderCode/>\n" +
                "        <PidInNo>321071</PidInNo>\n" +
                "        <PidAddmissTimes/>\n" +
                "        <RepId>10001202304175000108281</RepId>\n" +
                "        <PidComName>急查心酶五项 + 急查电解质六项</PidComName>\n" +
                "        <RepInDate>04 17 20</RepInDate>\n" +
                "        <reporterCode>1271</reporterCode>\n" +
                "        <RepReportUserName>黄彩云</RepReportUserName>\n" +
                "        <diagnosis>右眼皮质型老年性白内障</diagnosis>\n" +
                "        <RepReportDate>04 17 20</RepReportDate>\n" +
                "        <RepSid>5000108281</RepSid>\n" +
                "        <ComId>606 + 607</ComId>\n" +
                "        <LrName>苏小杰</LrName>\n" +
                "        <RepCheckUserCode>969</RepCheckUserCode>\n" +
                "        <RepCheckUserName>04 17 2023  8:12PM</RepCheckUserName>\n" +
                "        <RepStatus>1</RepStatus>\n" +
                "        <PidDocName>张跃锐</PidDocName>\n" +
                "        <SignContent/>\n" +
                "        <RepItrId>10001</RepItrId>\n" +
                "        <RepReportType>gen</RepReportType>\n" +
                "        <PidSrcId>108</PidSrcId>\n" +
                "        <Samp_Apply_Date>04 17 20</Samp_Apply_Date>\n" +
                "        <Pid_Doc_Name>张跃锐</Pid_Doc_Name>\n" +
                "        <Pid_Dept_Name>眼科</Pid_Dept_Name>\n" +
                "        <PidIdentityCard>44062019490805258X</PidIdentityCard>\n" +
                "        <PidNam>陈细妹</PidNam>\n" +
                "        <PidSex>2</PidSex>\n" +
                "        <Age>73岁  月  天  时  分</Age>\n" +
                "        <RepBarCode>5000108281</RepBarCode>\n" +
                "        <PidDeptId>192</PidDeptId>\n" +
                "        <PidRemark>合格</PidRemark>\n" +
                "        <PidSamId>10053</PidSamId>\n" +
                "        <SamName>静脉血</SamName>\n" +
                "        <PidDoctorCode>14139</PidDoctorCode>\n" +
                "        <OrderCode/>\n" +
                "        <PidInNo>321071</PidInNo>\n" +
                "        <PidAddmissTimes/>\n" +
                "        <PidComName>尿常规(干化学)</PidComName>\n" +
                "        <RepInDate>04 18 20</RepInDate>\n" +
                "        <reporterCode>1495</reporterCode>\n" +
                "        <RepReportUserName>张艳</RepReportUserName>\n" +
                "        <RepReportDate>04 18 20</RepReportDate>\n" +
                "        <RepSid>232</RepSid>\n" +
                "        <ComId>95172</ComId>\n" +
                "        <LrName>张艳</LrName>\n" +
                "        <RepCheckUserCode>1495</RepCheckUserCode>\n" +
                "        <RepCheckUserName>04 18 2023  2:13PM</RepCheckUserName>\n" +
                "        <RepStatus>1</RepStatus>\n" +
                "        <PidDocName>张跃锐</PidDocName>\n" +
                "        <SignContent/>\n" +
                "        <RepItrId>10138</RepItrId>\n" +
                "        <RepReportType>gen</RepReportType>\n" +
                "        <PidSrcId>108</PidSrcId>\n" +
                "        <Samp_Apply_Date>04 17 20</Samp_Apply_Date>\n" +
                "        <Pid_Doc_Name>张跃锐</Pid_Doc_Name>\n" +
                "        <Pid_Dept_Name>眼科</Pid_Dept_Name>\n" +
                "        <PidIdentityCard>44062019490805258X</PidIdentityCard>\n" +
                "        <PidNam>陈细妹</PidNam>\n" +
                "        <PidSex>2</PidSex>\n" +
                "        <Age>73岁  月  天  时  分</Age>\n" +
                "        <RepBarCode>9000118944</RepBarCode>\n" +
                "        <PidDeptId>192</PidDeptId>\n" +
                "        <PidRemark>合格</PidRemark>\n" +
                "        <PidSamId>10052</PidSamId>\n" +
                "        <SamName>尿液</SamName>\n" +
                "        <PidDoctorCode>14139</PidDoctorCode>\n" +
                "        <OrderCode/>\n" +
                "    </PidReportMain>\n" +
                "</Response>";// 将提供的 XML 内容粘贴到这里

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
        xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        GetPatientListResponse response = xmlMapper.readValue(xmlData, GetPatientListResponse.class);

        System.out.println("Result Code: " + response.getResultCode());
        System.out.println("Result Content: " + response.getResultContent());
        System.out.println("Report IDs: " + response.getPidReportMain().getRepIds());
    }
}

