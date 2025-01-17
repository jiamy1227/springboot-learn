package org.jiamy.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.jiamy.entity.BPatientInfo;
import org.jiamy.entity.User;

import java.util.List;

/**
 * @description:
 * @author: jiamy
 * @create: 2024/9/26 15:27
 **/
@Mapper
public interface PatientMapper {

    @Select("select * from B_PATIENT_INFO where id=#{id}")
    User getById(@Param("id") String id);

    @Select("select * from B_PATIENT_INFO where name=#{name}")
    User getByName(@Param("name") String name);

    @Select("select * from B_PATIENT_INFO where deleteflag=0")
    List<BPatientInfo> list();
}
