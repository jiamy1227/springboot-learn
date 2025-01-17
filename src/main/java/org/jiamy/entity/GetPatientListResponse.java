package org.jiamy.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.util.List;

/**
 * 获取检验列表（DSYY_LIS_GetPatientList）响应模型
 */
@Data
@JacksonXmlRootElement(localName = "Response")
public class GetPatientListResponse {


    /** 返回的结果码 */
    @JacksonXmlProperty(localName = "ResultCode")
    private String resultCode;

    /** 返回结果内容 */
    @JacksonXmlProperty(localName = "ResultContent")
    private String resultContent;

    /** 报告信息 */
    @JacksonXmlProperty(localName = "PidReportMain")
    private PidReportMain pidReportMain;

    @Data
    public static class PidReportMain {

        /** 报告ID列表 */
        @JacksonXmlProperty(localName = "RepId")
        @JacksonXmlElementWrapper(useWrapping = false)
        private List<String> repIds;
    }
}
