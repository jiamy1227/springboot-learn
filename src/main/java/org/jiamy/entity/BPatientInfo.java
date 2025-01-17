//******************************************************************************
// 版权所有(c) 2021，科大国创软件股份有限公司，保留所有权利。
//******************************************************************************

package org.jiamy.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class BPatientInfo {
    /**
     * Name (B_PATIENT_INFO.Name)
     */
    private String name;

    /**
     * Kana (B_PATIENT_INFO.Kana)
     */
    private String kana;

    /**
     * CardType (B_PATIENT_INFO.CardType)
     */
    private String cardtype;

    /**
     * CardNo (B_PATIENT_INFO.CardNo)
     */
    private String cardno;

    /**
     * Sex (B_PATIENT_INFO.Sex)
     */
    private String sex;

    /**
     * Mobile (B_PATIENT_INFO.Mobile)
     */
    private String mobile;

    /**
     * Address (B_PATIENT_INFO.Address)
     */
    private String address;

    /**
     * Birthday (B_PATIENT_INFO.Birthday)
     */
    private Date birthday;

    /**
     * Blood (B_PATIENT_INFO.Blood)
     */
    private String blood;

    /**
     * Rh (B_PATIENT_INFO.Rh)
     */
    private String rh;

    /**
     * Picture (B_PATIENT_INFO.Picture)
     */
    private String picture;

    /**
     * GroupCode (B_PATIENT_INFO.GroupCode)
     */
    private String groupcode;

    /**
     * Height (B_PATIENT_INFO.Height)
     */
    private BigDecimal height;

    /**
     * Weight (B_PATIENT_INFO.Weight)
     */
    private BigDecimal weight;

    /**
     * DryWeight (B_PATIENT_INFO.DryWeight)
     */
    private BigDecimal dryweight;

    /**
     * InsuranceType (B_PATIENT_INFO.InsuranceType)
     */
    private String insurancetype;

    /**
     * InsuranceNo (B_PATIENT_INFO.InsuranceNo)
     */
    private String insuranceno;

    /**
     * ContactName1 (B_PATIENT_INFO.ContactName1)
     */
    private String contactname1;

    /**
     * ContactName2 (B_PATIENT_INFO.ContactName2)
     */
    private String contactname2;

    /**
     * ContactFax1 (B_PATIENT_INFO.ContactFax1)
     */
    private String contactfax1;

    /**
     * ContactFax2 (B_PATIENT_INFO.ContactFax2)
     */
    private String contactfax2;

    /**
     * MedicalRecordNo (B_PATIENT_INFO.MedicalRecordNo)
     */
    private String medicalrecordno;

    /**
     * DialysisID (B_PATIENT_INFO.DialysisID)
     */
    private String dialysisid;

    /**
     * CardId (B_PATIENT_INFO.CardId)
     */
    private String cardid;

    /**
     * IoFlag (B_PATIENT_INFO.IoFlag)
     */
    private String ioflag;

    /**
     * JobCode (B_PATIENT_INFO.JobCode)
     */
    private String jobcode;

    /**
     * OfficeAddr (B_PATIENT_INFO.OfficeAddr)
     */
    private String officeaddr;

    /**
     * OfficeName (B_PATIENT_INFO.OfficeName)
     */
    private String officename;

    /**
     * OfficeKana (B_PATIENT_INFO.OfficeKana)
     */
    private String officekana;

    /**
     * OfficeTel (B_PATIENT_INFO.OfficeTel)
     */
    private String officetel;

    /**
     * FirstDialysisDate (B_PATIENT_INFO.FirstDialysisDate)
     */
    private Date firstdialysisdate;

    /**
     * FirstTreatmentDate (B_PATIENT_INFO.FirstTreatmentDate)
     */
    private Date firsttreatmentdate;

    /**
     * DeptCode (B_PATIENT_INFO.DeptCode)
     */
    private String deptcode;

    /**
     * DrCode (B_PATIENT_INFO.DrCode)
     */
    private String drcode;

    /**
     * StatusFlag (B_PATIENT_INFO.StatusFlag)
     */
    private String statusflag;

    /**
     * Diagnosis (B_PATIENT_INFO.Diagnosis)
     */
    private String diagnosis;

    /**
     * MedicalHistory (B_PATIENT_INFO.MedicalHistory)
     */
    private String medicalhistory;

    /**
     * ReportDate (B_PATIENT_INFO.ReportDate)
     */
    private Date reportdate;

    /**
     * RID (B_PATIENT_INFO.RID)
     */
    private String rid;

    /**
     * RchildID (B_PATIENT_INFO.RchildID)
     */
    private String rchildid;

    /**
     * WardNo (B_PATIENT_INFO.WardNo)
     */
    private String wardno;

    /**
     * WardBlock (B_PATIENT_INFO.WardBlock)
     */
    private String wardblock;

    /**
     * WardBedNo (B_PATIENT_INFO.WardBedNo)
     */
    private String wardbedno;

    /**
     * DiagnosisFlag (B_PATIENT_INFO.DiagnosisFlag)
     */
    private String diagnosisflag;

    /**
     * LockStatus (B_PATIENT_INFO.LockStatus)
     */
    private String lockstatus;

    /**
     * DeleteFlag (B_PATIENT_INFO.DeleteFlag)
     */
    private String deleteflag;

    /**
     * EntryId (B_PATIENT_INFO.EntryId)
     */
    private String entryid;

    /**
     * EntryDate (B_PATIENT_INFO.EntryDate)
     */
    private Date entrydate;

    /**
     * ModifyId (B_PATIENT_INFO.ModifyId)
     */
    private String modifyid;

    /**
     * ModifyDate (B_PATIENT_INFO.ModifyDate)
     */
    private Date modifydate;

    /**
     * Others (B_PATIENT_INFO.Others)
     */
    private String others;

    /**
     * CenterID (B_PATIENT_INFO.CenterID)
     */
    private String centerid;

    /**
     * AttendingDrCode (B_PATIENT_INFO.AttendingDrCode)
     */
    private String attendingdrcode;

    /**
     * MaritalStatus (B_PATIENT_INFO.MaritalStatus)
     */
    private String maritalstatus;

    /**
     * Race (B_PATIENT_INFO.Race)
     */
    private String race;

    /**
     * EducationCode (B_PATIENT_INFO.EducationCode)
     */
    private String educationcode;

    /**
     * PatientType (B_PATIENT_INFO.PatientType)
     */
    private String patienttype;

    /**
     * ChiefComplaint (B_PATIENT_INFO.ChiefComplaint)
     */
    private String chiefcomplaint;

    /**
     * PhysicalExamination (B_PATIENT_INFO.PhysicalExamination)
     */
    private String physicalexamination;

    /**
     * SupplementaryExamination (B_PATIENT_INFO.SupplementaryExamination)
     */
    private String supplementaryexamination;

    /**
     * AssessmentPlan (B_PATIENT_INFO.AssessmentPlan)
     */
    private String assessmentplan;

    /**
     * TreatMentType (B_PATIENT_INFO.TreatMentType)
     */
    private String treatmenttype;

    /**
     * BarCode (B_PATIENT_INFO.BarCode)
     */
    private String barcode;

    /**
     * NativePlace (B_PATIENT_INFO.NativePlace)
     */
    private String nativeplace;

    /**
     * RetireFlag (B_PATIENT_INFO.RetireFlag)
     */
    private String retireflag;

    /**
     * FertCircumst (B_PATIENT_INFO.FertCircumst)
     */
    private String fertcircumst;

    /**
     * AddrPostcode (B_PATIENT_INFO.AddrPostcode)
     */
    private String addrpostcode;

    /**
     * AddrDistance (B_PATIENT_INFO.AddrDistance)
     */
    private BigDecimal addrdistance;

    /**
     * TakeTime (B_PATIENT_INFO.TakeTime)
     */
    private BigDecimal taketime;

    /**
     * Vehicle (B_PATIENT_INFO.Vehicle)
     */
    private String vehicle;

    /**
     * Relationship1 (B_PATIENT_INFO.Relationship1)
     */
    private String relationship1;

    /**
     * Relationship2 (B_PATIENT_INFO.Relationship2)
     */
    private String relationship2;

    /**
     * LiveplaceProperty (B_PATIENT_INFO.LiveplaceProperty)
     */
    private String liveplaceproperty;

    /**
     * OtherAddress (B_PATIENT_INFO.OtherAddress)
     */
    private String otheraddress;

    /**
     * OtherAddrPostcode (B_PATIENT_INFO.OtherAddrPostcode)
     */
    private String otheraddrpostcode;

    /**
     * HomePhone (B_PATIENT_INFO.HomePhone)
     */
    private String homephone;

    /**
     * Nation (B_PATIENT_INFO.Nation)
     */
    private String nation;

    /**
     * outpatientNum (B_PATIENT_INFO.outpatientNum)
     */
    private String outpatientnum;

    /**
     * PastHistory (B_PATIENT_INFO.PastHistory)
     */
    private String pasthistory;

    /**
     * PersonalHistory (B_PATIENT_INFO.PersonalHistory)
     */
    private String personalhistory;

    /**
     * MarriageHistory (B_PATIENT_INFO.MarriageHistory)
     */
    private String marriagehistory;

    /**
     * FamilyHistory (B_PATIENT_INFO.FamilyHistory)
     */
    private String familyhistory;

    /**
     * SpecialityCheck (B_PATIENT_INFO.SpecialityCheck)
     */
    private String specialitycheck;

    /**
     * RemindDay (B_PATIENT_INFO.RemindDay)
     */
    private Integer remindday;

    /**
     * Vip (B_PATIENT_INFO.Vip)
     */
    private String vip;

    /**
     * LiveStyle (B_PATIENT_INFO.LiveStyle)
     */
    private String livestyle;

    /**
     * UrineAmount (B_PATIENT_INFO.UrineAmount)
     */
    private BigDecimal urineamount;

    /**
     * RecordDate (B_PATIENT_INFO.RecordDate)
     */
    private Date recorddate;

    /**
     * BloodFlow (B_PATIENT_INFO.BloodFlow)
     */
    private BigDecimal bloodflow;

    /**
     * RegistrationNo (B_PATIENT_INFO.RegistrationNo)
     */
    private String registrationno;

    /**
     * HisPatientID (B_PATIENT_INFO.HisPatientID)
     */
    private String hispatientid;

    /**
     * WardBlockNo (B_PATIENT_INFO.WardBlockNo)
     */
    private String wardblockno;

    /**
     * province (B_PATIENT_INFO.province)
     */
    private String province;

    /**
     * city (B_PATIENT_INFO.city)
     */
    private String city;

    /**
     * county (B_PATIENT_INFO.county)
     */
    private String county;

    /**
     * LocalFirstDialysisDate (B_PATIENT_INFO.LocalFirstDialysisDate)
     */
    private Date localfirstdialysisdate;

    /**
     * IsMaintenanceDialysis (B_PATIENT_INFO.IsMaintenanceDialysis)
     */
    private String ismaintenancedialysis;

    /**
     * ChargeNurse (B_PATIENT_INFO.ChargeNurse)
     */
    private String chargenurse;

    /**
     * DialysisManage (B_PATIENT_INFO.DialysisManage)
     */
    private String dialysismanage;

    /**
     * SlowNo (B_PATIENT_INFO.SlowNo)
     */
    private String slowno;

    /**
     * SelfPayNo (B_PATIENT_INFO.SelfPayNo)
     */
    private String selfpayno;

    /**
     * SlowCharge (B_PATIENT_INFO.SlowCharge)
     */
    private String slowcharge;

    /**
     * SelfPayCharge (B_PATIENT_INFO.SelfPayCharge)
     */
    private String selfpaycharge;

    /**
     * ResidualRenal (B_PATIENT_INFO.ResidualRenal)
     */
    private String residualrenal;

    /**
     * SecondaryDiagnosis (B_PATIENT_INFO.SecondaryDiagnosis)
     */
    private String secondarydiagnosis;

    /**
     * DialysisRule (B_PATIENT_INFO.DialysisRule)
     */
    private String dialysisrule;

    /**
     * ScreenId (B_PATIENT_INFO.ScreenId)
     */
    private String screenid;

    /**
     * RecordDoctor (B_PATIENT_INFO.RecordDoctor)
     */
    private String recorddoctor;

    /**
     * Recordtime (B_PATIENT_INFO.Recordtime)
     */
    private Date recordtime;

    /**
     * Isthyroid (B_PATIENT_INFO.Isthyroid)
     */
    private String isthyroid;

    /**
     * OperationDate (B_PATIENT_INFO.OperationDate)
     */
    private Date operationdate;

    /**
     * OperationWays (B_PATIENT_INFO.OperationWays)
     */
    private String operationways;

    /**
     * VisitTime (B_PATIENT_INFO.VisitTime)
     */
    private Date visittime;

    /**
     * FirstTreatDate (B_PATIENT_INFO.FirstTreatDate)
     */
    private Date firsttreatdate;

    /**
     * 更新标记.
     */ 
    protected final Map<String, Boolean> _selectiveMark = new HashMap<String, Boolean>();

    /**
     * 取得：Name (B_PATIENT_INFO.Name)
     *
     * @return name String
     */
    public String getName() {
        return name;
    }

    /**
     * 设定：Name (B_PATIENT_INFO.Name)
     *
     * @param name String
     */
    public void setName(String name) {
        this.name = name;
        this._selectiveMark.put("name", true);
    }

    /**
     * 取得：Kana (B_PATIENT_INFO.Kana)
     *
     * @return kana String
     */
    public String getKana() {
        return kana;
    }

    /**
     * 设定：Kana (B_PATIENT_INFO.Kana)
     *
     * @param kana String
     */
    public void setKana(String kana) {
        this.kana = kana;
        this._selectiveMark.put("kana", true);
    }

    /**
     * 取得：CardType (B_PATIENT_INFO.CardType)
     *
     * @return cardtype String
     */
    public String getCardtype() {
        return cardtype;
    }

    /**
     * 设定：CardType (B_PATIENT_INFO.CardType)
     *
     * @param cardtype String
     */
    public void setCardtype(String cardtype) {
        this.cardtype = cardtype;
        this._selectiveMark.put("cardtype", true);
    }

    /**
     * 取得：CardNo (B_PATIENT_INFO.CardNo)
     *
     * @return cardno String
     */
    public String getCardno() {
        return cardno;
    }

    /**
     * 设定：CardNo (B_PATIENT_INFO.CardNo)
     *
     * @param cardno String
     */
    public void setCardno(String cardno) {
        this.cardno = cardno;
        this._selectiveMark.put("cardno", true);
    }

    /**
     * 取得：Sex (B_PATIENT_INFO.Sex)
     *
     * @return sex String
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设定：Sex (B_PATIENT_INFO.Sex)
     *
     * @param sex String
     */
    public void setSex(String sex) {
        this.sex = sex;
        this._selectiveMark.put("sex", true);
    }

    /**
     * 取得：Mobile (B_PATIENT_INFO.Mobile)
     *
     * @return mobile String
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设定：Mobile (B_PATIENT_INFO.Mobile)
     *
     * @param mobile String
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
        this._selectiveMark.put("mobile", true);
    }

    /**
     * 取得：Address (B_PATIENT_INFO.Address)
     *
     * @return address String
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设定：Address (B_PATIENT_INFO.Address)
     *
     * @param address String
     */
    public void setAddress(String address) {
        this.address = address;
        this._selectiveMark.put("address", true);
    }

    /**
     * 取得：Birthday (B_PATIENT_INFO.Birthday)
     *
     * @return birthday Date
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设定：Birthday (B_PATIENT_INFO.Birthday)
     *
     * @param birthday Date
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
        this._selectiveMark.put("birthday", true);
    }

    /**
     * 取得：Blood (B_PATIENT_INFO.Blood)
     *
     * @return blood String
     */
    public String getBlood() {
        return blood;
    }

    /**
     * 设定：Blood (B_PATIENT_INFO.Blood)
     *
     * @param blood String
     */
    public void setBlood(String blood) {
        this.blood = blood;
        this._selectiveMark.put("blood", true);
    }

    /**
     * 取得：Rh (B_PATIENT_INFO.Rh)
     *
     * @return rh String
     */
    public String getRh() {
        return rh;
    }

    /**
     * 设定：Rh (B_PATIENT_INFO.Rh)
     *
     * @param rh String
     */
    public void setRh(String rh) {
        this.rh = rh;
        this._selectiveMark.put("rh", true);
    }

    /**
     * 取得：Picture (B_PATIENT_INFO.Picture)
     *
     * @return picture String
     */
    public String getPicture() {
        return picture;
    }

    /**
     * 设定：Picture (B_PATIENT_INFO.Picture)
     *
     * @param picture String
     */
    public void setPicture(String picture) {
        this.picture = picture;
        this._selectiveMark.put("picture", true);
    }

    /**
     * 取得：GroupCode (B_PATIENT_INFO.GroupCode)
     *
     * @return groupcode String
     */
    public String getGroupcode() {
        return groupcode;
    }

    /**
     * 设定：GroupCode (B_PATIENT_INFO.GroupCode)
     *
     * @param groupcode String
     */
    public void setGroupcode(String groupcode) {
        this.groupcode = groupcode;
        this._selectiveMark.put("groupcode", true);
    }

    /**
     * 取得：Height (B_PATIENT_INFO.Height)
     *
     * @return height BigDecimal
     */
    public BigDecimal getHeight() {
        return height;
    }

    /**
     * 设定：Height (B_PATIENT_INFO.Height)
     *
     * @param height BigDecimal
     */
    public void setHeight(BigDecimal height) {
        this.height = height;
        this._selectiveMark.put("height", true);
    }

    /**
     * 取得：Weight (B_PATIENT_INFO.Weight)
     *
     * @return weight BigDecimal
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * 设定：Weight (B_PATIENT_INFO.Weight)
     *
     * @param weight BigDecimal
     */
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
        this._selectiveMark.put("weight", true);
    }

    /**
     * 取得：DryWeight (B_PATIENT_INFO.DryWeight)
     *
     * @return dryweight BigDecimal
     */
    public BigDecimal getDryweight() {
        return dryweight;
    }

    /**
     * 设定：DryWeight (B_PATIENT_INFO.DryWeight)
     *
     * @param dryweight BigDecimal
     */
    public void setDryweight(BigDecimal dryweight) {
        this.dryweight = dryweight;
        this._selectiveMark.put("dryweight", true);
    }

    /**
     * 取得：InsuranceType (B_PATIENT_INFO.InsuranceType)
     *
     * @return insurancetype String
     */
    public String getInsurancetype() {
        return insurancetype;
    }

    /**
     * 设定：InsuranceType (B_PATIENT_INFO.InsuranceType)
     *
     * @param insurancetype String
     */
    public void setInsurancetype(String insurancetype) {
        this.insurancetype = insurancetype;
        this._selectiveMark.put("insurancetype", true);
    }

    /**
     * 取得：InsuranceNo (B_PATIENT_INFO.InsuranceNo)
     *
     * @return insuranceno String
     */
    public String getInsuranceno() {
        return insuranceno;
    }

    /**
     * 设定：InsuranceNo (B_PATIENT_INFO.InsuranceNo)
     *
     * @param insuranceno String
     */
    public void setInsuranceno(String insuranceno) {
        this.insuranceno = insuranceno;
        this._selectiveMark.put("insuranceno", true);
    }

    /**
     * 取得：ContactName1 (B_PATIENT_INFO.ContactName1)
     *
     * @return contactname1 String
     */
    public String getContactname1() {
        return contactname1;
    }

    /**
     * 设定：ContactName1 (B_PATIENT_INFO.ContactName1)
     *
     * @param contactname1 String
     */
    public void setContactname1(String contactname1) {
        this.contactname1 = contactname1;
        this._selectiveMark.put("contactname1", true);
    }

    /**
     * 取得：ContactName2 (B_PATIENT_INFO.ContactName2)
     *
     * @return contactname2 String
     */
    public String getContactname2() {
        return contactname2;
    }

    /**
     * 设定：ContactName2 (B_PATIENT_INFO.ContactName2)
     *
     * @param contactname2 String
     */
    public void setContactname2(String contactname2) {
        this.contactname2 = contactname2;
        this._selectiveMark.put("contactname2", true);
    }

    /**
     * 取得：ContactFax1 (B_PATIENT_INFO.ContactFax1)
     *
     * @return contactfax1 String
     */
    public String getContactfax1() {
        return contactfax1;
    }

    /**
     * 设定：ContactFax1 (B_PATIENT_INFO.ContactFax1)
     *
     * @param contactfax1 String
     */
    public void setContactfax1(String contactfax1) {
        this.contactfax1 = contactfax1;
        this._selectiveMark.put("contactfax1", true);
    }

    /**
     * 取得：ContactFax2 (B_PATIENT_INFO.ContactFax2)
     *
     * @return contactfax2 String
     */
    public String getContactfax2() {
        return contactfax2;
    }

    /**
     * 设定：ContactFax2 (B_PATIENT_INFO.ContactFax2)
     *
     * @param contactfax2 String
     */
    public void setContactfax2(String contactfax2) {
        this.contactfax2 = contactfax2;
        this._selectiveMark.put("contactfax2", true);
    }

    /**
     * 取得：MedicalRecordNo (B_PATIENT_INFO.MedicalRecordNo)
     *
     * @return medicalrecordno String
     */
    public String getMedicalrecordno() {
        return medicalrecordno;
    }

    /**
     * 设定：MedicalRecordNo (B_PATIENT_INFO.MedicalRecordNo)
     *
     * @param medicalrecordno String
     */
    public void setMedicalrecordno(String medicalrecordno) {
        this.medicalrecordno = medicalrecordno;
        this._selectiveMark.put("medicalrecordno", true);
    }

    /**
     * 取得：DialysisID (B_PATIENT_INFO.DialysisID)
     *
     * @return dialysisid String
     */
    public String getDialysisid() {
        return dialysisid;
    }

    /**
     * 设定：DialysisID (B_PATIENT_INFO.DialysisID)
     *
     * @param dialysisid String
     */
    public void setDialysisid(String dialysisid) {
        this.dialysisid = dialysisid;
        this._selectiveMark.put("dialysisid", true);
    }

    /**
     * 取得：CardId (B_PATIENT_INFO.CardId)
     *
     * @return cardid String
     */
    public String getCardid() {
        return cardid;
    }

    /**
     * 设定：CardId (B_PATIENT_INFO.CardId)
     *
     * @param cardid String
     */
    public void setCardid(String cardid) {
        this.cardid = cardid;
        this._selectiveMark.put("cardid", true);
    }

    /**
     * 取得：IoFlag (B_PATIENT_INFO.IoFlag)
     *
     * @return ioflag String
     */
    public String getIoflag() {
        return ioflag;
    }

    /**
     * 设定：IoFlag (B_PATIENT_INFO.IoFlag)
     *
     * @param ioflag String
     */
    public void setIoflag(String ioflag) {
        this.ioflag = ioflag;
        this._selectiveMark.put("ioflag", true);
    }

    /**
     * 取得：JobCode (B_PATIENT_INFO.JobCode)
     *
     * @return jobcode String
     */
    public String getJobcode() {
        return jobcode;
    }

    /**
     * 设定：JobCode (B_PATIENT_INFO.JobCode)
     *
     * @param jobcode String
     */
    public void setJobcode(String jobcode) {
        this.jobcode = jobcode;
        this._selectiveMark.put("jobcode", true);
    }

    /**
     * 取得：OfficeAddr (B_PATIENT_INFO.OfficeAddr)
     *
     * @return officeaddr String
     */
    public String getOfficeaddr() {
        return officeaddr;
    }

    /**
     * 设定：OfficeAddr (B_PATIENT_INFO.OfficeAddr)
     *
     * @param officeaddr String
     */
    public void setOfficeaddr(String officeaddr) {
        this.officeaddr = officeaddr;
        this._selectiveMark.put("officeaddr", true);
    }

    /**
     * 取得：OfficeName (B_PATIENT_INFO.OfficeName)
     *
     * @return officename String
     */
    public String getOfficename() {
        return officename;
    }

    /**
     * 设定：OfficeName (B_PATIENT_INFO.OfficeName)
     *
     * @param officename String
     */
    public void setOfficename(String officename) {
        this.officename = officename;
        this._selectiveMark.put("officename", true);
    }

    /**
     * 取得：OfficeKana (B_PATIENT_INFO.OfficeKana)
     *
     * @return officekana String
     */
    public String getOfficekana() {
        return officekana;
    }

    /**
     * 设定：OfficeKana (B_PATIENT_INFO.OfficeKana)
     *
     * @param officekana String
     */
    public void setOfficekana(String officekana) {
        this.officekana = officekana;
        this._selectiveMark.put("officekana", true);
    }

    /**
     * 取得：OfficeTel (B_PATIENT_INFO.OfficeTel)
     *
     * @return officetel String
     */
    public String getOfficetel() {
        return officetel;
    }

    /**
     * 设定：OfficeTel (B_PATIENT_INFO.OfficeTel)
     *
     * @param officetel String
     */
    public void setOfficetel(String officetel) {
        this.officetel = officetel;
        this._selectiveMark.put("officetel", true);
    }

    /**
     * 取得：FirstDialysisDate (B_PATIENT_INFO.FirstDialysisDate)
     *
     * @return firstdialysisdate Date
     */
    public Date getFirstdialysisdate() {
        return firstdialysisdate;
    }

    /**
     * 设定：FirstDialysisDate (B_PATIENT_INFO.FirstDialysisDate)
     *
     * @param firstdialysisdate Date
     */
    public void setFirstdialysisdate(Date firstdialysisdate) {
        this.firstdialysisdate = firstdialysisdate;
        this._selectiveMark.put("firstdialysisdate", true);
    }

    /**
     * 取得：FirstTreatmentDate (B_PATIENT_INFO.FirstTreatmentDate)
     *
     * @return firsttreatmentdate Date
     */
    public Date getFirsttreatmentdate() {
        return firsttreatmentdate;
    }

    /**
     * 设定：FirstTreatmentDate (B_PATIENT_INFO.FirstTreatmentDate)
     *
     * @param firsttreatmentdate Date
     */
    public void setFirsttreatmentdate(Date firsttreatmentdate) {
        this.firsttreatmentdate = firsttreatmentdate;
        this._selectiveMark.put("firsttreatmentdate", true);
    }

    /**
     * 取得：DeptCode (B_PATIENT_INFO.DeptCode)
     *
     * @return deptcode String
     */
    public String getDeptcode() {
        return deptcode;
    }

    /**
     * 设定：DeptCode (B_PATIENT_INFO.DeptCode)
     *
     * @param deptcode String
     */
    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode;
        this._selectiveMark.put("deptcode", true);
    }

    /**
     * 取得：DrCode (B_PATIENT_INFO.DrCode)
     *
     * @return drcode String
     */
    public String getDrcode() {
        return drcode;
    }

    /**
     * 设定：DrCode (B_PATIENT_INFO.DrCode)
     *
     * @param drcode String
     */
    public void setDrcode(String drcode) {
        this.drcode = drcode;
        this._selectiveMark.put("drcode", true);
    }

    /**
     * 取得：StatusFlag (B_PATIENT_INFO.StatusFlag)
     *
     * @return statusflag String
     */
    public String getStatusflag() {
        return statusflag;
    }

    /**
     * 设定：StatusFlag (B_PATIENT_INFO.StatusFlag)
     *
     * @param statusflag String
     */
    public void setStatusflag(String statusflag) {
        this.statusflag = statusflag;
        this._selectiveMark.put("statusflag", true);
    }

    /**
     * 取得：Diagnosis (B_PATIENT_INFO.Diagnosis)
     *
     * @return diagnosis String
     */
    public String getDiagnosis() {
        return diagnosis;
    }

    /**
     * 设定：Diagnosis (B_PATIENT_INFO.Diagnosis)
     *
     * @param diagnosis String
     */
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
        this._selectiveMark.put("diagnosis", true);
    }

    /**
     * 取得：MedicalHistory (B_PATIENT_INFO.MedicalHistory)
     *
     * @return medicalhistory String
     */
    public String getMedicalhistory() {
        return medicalhistory;
    }

    /**
     * 设定：MedicalHistory (B_PATIENT_INFO.MedicalHistory)
     *
     * @param medicalhistory String
     */
    public void setMedicalhistory(String medicalhistory) {
        this.medicalhistory = medicalhistory;
        this._selectiveMark.put("medicalhistory", true);
    }

    /**
     * 取得：ReportDate (B_PATIENT_INFO.ReportDate)
     *
     * @return reportdate Date
     */
    public Date getReportdate() {
        return reportdate;
    }

    /**
     * 设定：ReportDate (B_PATIENT_INFO.ReportDate)
     *
     * @param reportdate Date
     */
    public void setReportdate(Date reportdate) {
        this.reportdate = reportdate;
        this._selectiveMark.put("reportdate", true);
    }

    /**
     * 取得：RID (B_PATIENT_INFO.RID)
     *
     * @return rid String
     */
    public String getRid() {
        return rid;
    }

    /**
     * 设定：RID (B_PATIENT_INFO.RID)
     *
     * @param rid String
     */
    public void setRid(String rid) {
        this.rid = rid;
        this._selectiveMark.put("rid", true);
    }

    /**
     * 取得：RchildID (B_PATIENT_INFO.RchildID)
     *
     * @return rchildid String
     */
    public String getRchildid() {
        return rchildid;
    }

    /**
     * 设定：RchildID (B_PATIENT_INFO.RchildID)
     *
     * @param rchildid String
     */
    public void setRchildid(String rchildid) {
        this.rchildid = rchildid;
        this._selectiveMark.put("rchildid", true);
    }

    /**
     * 取得：WardNo (B_PATIENT_INFO.WardNo)
     *
     * @return wardno String
     */
    public String getWardno() {
        return wardno;
    }

    /**
     * 设定：WardNo (B_PATIENT_INFO.WardNo)
     *
     * @param wardno String
     */
    public void setWardno(String wardno) {
        this.wardno = wardno;
        this._selectiveMark.put("wardno", true);
    }

    /**
     * 取得：WardBlock (B_PATIENT_INFO.WardBlock)
     *
     * @return wardblock String
     */
    public String getWardblock() {
        return wardblock;
    }

    /**
     * 设定：WardBlock (B_PATIENT_INFO.WardBlock)
     *
     * @param wardblock String
     */
    public void setWardblock(String wardblock) {
        this.wardblock = wardblock;
        this._selectiveMark.put("wardblock", true);
    }

    /**
     * 取得：WardBedNo (B_PATIENT_INFO.WardBedNo)
     *
     * @return wardbedno String
     */
    public String getWardbedno() {
        return wardbedno;
    }

    /**
     * 设定：WardBedNo (B_PATIENT_INFO.WardBedNo)
     *
     * @param wardbedno String
     */
    public void setWardbedno(String wardbedno) {
        this.wardbedno = wardbedno;
        this._selectiveMark.put("wardbedno", true);
    }

    /**
     * 取得：DiagnosisFlag (B_PATIENT_INFO.DiagnosisFlag)
     *
     * @return diagnosisflag String
     */
    public String getDiagnosisflag() {
        return diagnosisflag;
    }

    /**
     * 设定：DiagnosisFlag (B_PATIENT_INFO.DiagnosisFlag)
     *
     * @param diagnosisflag String
     */
    public void setDiagnosisflag(String diagnosisflag) {
        this.diagnosisflag = diagnosisflag;
        this._selectiveMark.put("diagnosisflag", true);
    }

    /**
     * 取得：LockStatus (B_PATIENT_INFO.LockStatus)
     *
     * @return lockstatus String
     */
    public String getLockstatus() {
        return lockstatus;
    }

    /**
     * 设定：LockStatus (B_PATIENT_INFO.LockStatus)
     *
     * @param lockstatus String
     */
    public void setLockstatus(String lockstatus) {
        this.lockstatus = lockstatus;
        this._selectiveMark.put("lockstatus", true);
    }

    /**
     * 取得：DeleteFlag (B_PATIENT_INFO.DeleteFlag)
     *
     * @return deleteflag String
     */
    public String getDeleteflag() {
        return deleteflag;
    }

    /**
     * 设定：DeleteFlag (B_PATIENT_INFO.DeleteFlag)
     *
     * @param deleteflag String
     */
    public void setDeleteflag(String deleteflag) {
        this.deleteflag = deleteflag;
        this._selectiveMark.put("deleteflag", true);
    }

    /**
     * 取得：EntryId (B_PATIENT_INFO.EntryId)
     *
     * @return entryid String
     */
    public String getEntryid() {
        return entryid;
    }

    /**
     * 设定：EntryId (B_PATIENT_INFO.EntryId)
     *
     * @param entryid String
     */
    public void setEntryid(String entryid) {
        this.entryid = entryid;
        this._selectiveMark.put("entryid", true);
    }

    /**
     * 取得：EntryDate (B_PATIENT_INFO.EntryDate)
     *
     * @return entrydate Date
     */
    public Date getEntrydate() {
        return entrydate;
    }

    /**
     * 设定：EntryDate (B_PATIENT_INFO.EntryDate)
     *
     * @param entrydate Date
     */
    public void setEntrydate(Date entrydate) {
        this.entrydate = entrydate;
        this._selectiveMark.put("entrydate", true);
    }

    /**
     * 取得：ModifyId (B_PATIENT_INFO.ModifyId)
     *
     * @return modifyid String
     */
    public String getModifyid() {
        return modifyid;
    }

    /**
     * 设定：ModifyId (B_PATIENT_INFO.ModifyId)
     *
     * @param modifyid String
     */
    public void setModifyid(String modifyid) {
        this.modifyid = modifyid;
        this._selectiveMark.put("modifyid", true);
    }

    /**
     * 取得：ModifyDate (B_PATIENT_INFO.ModifyDate)
     *
     * @return modifydate Date
     */
    public Date getModifydate() {
        return modifydate;
    }

    /**
     * 设定：ModifyDate (B_PATIENT_INFO.ModifyDate)
     *
     * @param modifydate Date
     */
    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
        this._selectiveMark.put("modifydate", true);
    }

    /**
     * 取得：Others (B_PATIENT_INFO.Others)
     *
     * @return others String
     */
    public String getOthers() {
        return others;
    }

    /**
     * 设定：Others (B_PATIENT_INFO.Others)
     *
     * @param others String
     */
    public void setOthers(String others) {
        this.others = others;
        this._selectiveMark.put("others", true);
    }

    /**
     * 取得：CenterID (B_PATIENT_INFO.CenterID)
     *
     * @return centerid String
     */
    public String getCenterid() {
        return centerid;
    }

    /**
     * 设定：CenterID (B_PATIENT_INFO.CenterID)
     *
     * @param centerid String
     */
    public void setCenterid(String centerid) {
        this.centerid = centerid;
        this._selectiveMark.put("centerid", true);
    }

    /**
     * 取得：AttendingDrCode (B_PATIENT_INFO.AttendingDrCode)
     *
     * @return attendingdrcode String
     */
    public String getAttendingdrcode() {
        return attendingdrcode;
    }

    /**
     * 设定：AttendingDrCode (B_PATIENT_INFO.AttendingDrCode)
     *
     * @param attendingdrcode String
     */
    public void setAttendingdrcode(String attendingdrcode) {
        this.attendingdrcode = attendingdrcode;
        this._selectiveMark.put("attendingdrcode", true);
    }

    /**
     * 取得：MaritalStatus (B_PATIENT_INFO.MaritalStatus)
     *
     * @return maritalstatus String
     */
    public String getMaritalstatus() {
        return maritalstatus;
    }

    /**
     * 设定：MaritalStatus (B_PATIENT_INFO.MaritalStatus)
     *
     * @param maritalstatus String
     */
    public void setMaritalstatus(String maritalstatus) {
        this.maritalstatus = maritalstatus;
        this._selectiveMark.put("maritalstatus", true);
    }

    /**
     * 取得：Race (B_PATIENT_INFO.Race)
     *
     * @return race String
     */
    public String getRace() {
        return race;
    }

    /**
     * 设定：Race (B_PATIENT_INFO.Race)
     *
     * @param race String
     */
    public void setRace(String race) {
        this.race = race;
        this._selectiveMark.put("race", true);
    }

    /**
     * 取得：EducationCode (B_PATIENT_INFO.EducationCode)
     *
     * @return educationcode String
     */
    public String getEducationcode() {
        return educationcode;
    }

    /**
     * 设定：EducationCode (B_PATIENT_INFO.EducationCode)
     *
     * @param educationcode String
     */
    public void setEducationcode(String educationcode) {
        this.educationcode = educationcode;
        this._selectiveMark.put("educationcode", true);
    }

    /**
     * 取得：PatientType (B_PATIENT_INFO.PatientType)
     *
     * @return patienttype String
     */
    public String getPatienttype() {
        return patienttype;
    }

    /**
     * 设定：PatientType (B_PATIENT_INFO.PatientType)
     *
     * @param patienttype String
     */
    public void setPatienttype(String patienttype) {
        this.patienttype = patienttype;
        this._selectiveMark.put("patienttype", true);
    }

    /**
     * 取得：ChiefComplaint (B_PATIENT_INFO.ChiefComplaint)
     *
     * @return chiefcomplaint String
     */
    public String getChiefcomplaint() {
        return chiefcomplaint;
    }

    /**
     * 设定：ChiefComplaint (B_PATIENT_INFO.ChiefComplaint)
     *
     * @param chiefcomplaint String
     */
    public void setChiefcomplaint(String chiefcomplaint) {
        this.chiefcomplaint = chiefcomplaint;
        this._selectiveMark.put("chiefcomplaint", true);
    }

    /**
     * 取得：PhysicalExamination (B_PATIENT_INFO.PhysicalExamination)
     *
     * @return physicalexamination String
     */
    public String getPhysicalexamination() {
        return physicalexamination;
    }

    /**
     * 设定：PhysicalExamination (B_PATIENT_INFO.PhysicalExamination)
     *
     * @param physicalexamination String
     */
    public void setPhysicalexamination(String physicalexamination) {
        this.physicalexamination = physicalexamination;
        this._selectiveMark.put("physicalexamination", true);
    }

    /**
     * 取得：SupplementaryExamination (B_PATIENT_INFO.SupplementaryExamination)
     *
     * @return supplementaryexamination String
     */
    public String getSupplementaryexamination() {
        return supplementaryexamination;
    }

    /**
     * 设定：SupplementaryExamination (B_PATIENT_INFO.SupplementaryExamination)
     *
     * @param supplementaryexamination String
     */
    public void setSupplementaryexamination(String supplementaryexamination) {
        this.supplementaryexamination = supplementaryexamination;
        this._selectiveMark.put("supplementaryexamination", true);
    }

    /**
     * 取得：AssessmentPlan (B_PATIENT_INFO.AssessmentPlan)
     *
     * @return assessmentplan String
     */
    public String getAssessmentplan() {
        return assessmentplan;
    }

    /**
     * 设定：AssessmentPlan (B_PATIENT_INFO.AssessmentPlan)
     *
     * @param assessmentplan String
     */
    public void setAssessmentplan(String assessmentplan) {
        this.assessmentplan = assessmentplan;
        this._selectiveMark.put("assessmentplan", true);
    }

    /**
     * 取得：TreatMentType (B_PATIENT_INFO.TreatMentType)
     *
     * @return treatmenttype String
     */
    public String getTreatmenttype() {
        return treatmenttype;
    }

    /**
     * 设定：TreatMentType (B_PATIENT_INFO.TreatMentType)
     *
     * @param treatmenttype String
     */
    public void setTreatmenttype(String treatmenttype) {
        this.treatmenttype = treatmenttype;
        this._selectiveMark.put("treatmenttype", true);
    }

    /**
     * 取得：BarCode (B_PATIENT_INFO.BarCode)
     *
     * @return barcode String
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * 设定：BarCode (B_PATIENT_INFO.BarCode)
     *
     * @param barcode String
     */
    public void setBarcode(String barcode) {
        this.barcode = barcode;
        this._selectiveMark.put("barcode", true);
    }

    /**
     * 取得：NativePlace (B_PATIENT_INFO.NativePlace)
     *
     * @return nativeplace String
     */
    public String getNativeplace() {
        return nativeplace;
    }

    /**
     * 设定：NativePlace (B_PATIENT_INFO.NativePlace)
     *
     * @param nativeplace String
     */
    public void setNativeplace(String nativeplace) {
        this.nativeplace = nativeplace;
        this._selectiveMark.put("nativeplace", true);
    }

    /**
     * 取得：RetireFlag (B_PATIENT_INFO.RetireFlag)
     *
     * @return retireflag String
     */
    public String getRetireflag() {
        return retireflag;
    }

    /**
     * 设定：RetireFlag (B_PATIENT_INFO.RetireFlag)
     *
     * @param retireflag String
     */
    public void setRetireflag(String retireflag) {
        this.retireflag = retireflag;
        this._selectiveMark.put("retireflag", true);
    }

    /**
     * 取得：FertCircumst (B_PATIENT_INFO.FertCircumst)
     *
     * @return fertcircumst String
     */
    public String getFertcircumst() {
        return fertcircumst;
    }

    /**
     * 设定：FertCircumst (B_PATIENT_INFO.FertCircumst)
     *
     * @param fertcircumst String
     */
    public void setFertcircumst(String fertcircumst) {
        this.fertcircumst = fertcircumst;
        this._selectiveMark.put("fertcircumst", true);
    }

    /**
     * 取得：AddrPostcode (B_PATIENT_INFO.AddrPostcode)
     *
     * @return addrpostcode String
     */
    public String getAddrpostcode() {
        return addrpostcode;
    }

    /**
     * 设定：AddrPostcode (B_PATIENT_INFO.AddrPostcode)
     *
     * @param addrpostcode String
     */
    public void setAddrpostcode(String addrpostcode) {
        this.addrpostcode = addrpostcode;
        this._selectiveMark.put("addrpostcode", true);
    }

    /**
     * 取得：AddrDistance (B_PATIENT_INFO.AddrDistance)
     *
     * @return addrdistance BigDecimal
     */
    public BigDecimal getAddrdistance() {
        return addrdistance;
    }

    /**
     * 设定：AddrDistance (B_PATIENT_INFO.AddrDistance)
     *
     * @param addrdistance BigDecimal
     */
    public void setAddrdistance(BigDecimal addrdistance) {
        this.addrdistance = addrdistance;
        this._selectiveMark.put("addrdistance", true);
    }

    /**
     * 取得：TakeTime (B_PATIENT_INFO.TakeTime)
     *
     * @return taketime BigDecimal
     */
    public BigDecimal getTaketime() {
        return taketime;
    }

    /**
     * 设定：TakeTime (B_PATIENT_INFO.TakeTime)
     *
     * @param taketime BigDecimal
     */
    public void setTaketime(BigDecimal taketime) {
        this.taketime = taketime;
        this._selectiveMark.put("taketime", true);
    }

    /**
     * 取得：Vehicle (B_PATIENT_INFO.Vehicle)
     *
     * @return vehicle String
     */
    public String getVehicle() {
        return vehicle;
    }

    /**
     * 设定：Vehicle (B_PATIENT_INFO.Vehicle)
     *
     * @param vehicle String
     */
    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
        this._selectiveMark.put("vehicle", true);
    }

    /**
     * 取得：Relationship1 (B_PATIENT_INFO.Relationship1)
     *
     * @return relationship1 String
     */
    public String getRelationship1() {
        return relationship1;
    }

    /**
     * 设定：Relationship1 (B_PATIENT_INFO.Relationship1)
     *
     * @param relationship1 String
     */
    public void setRelationship1(String relationship1) {
        this.relationship1 = relationship1;
        this._selectiveMark.put("relationship1", true);
    }

    /**
     * 取得：Relationship2 (B_PATIENT_INFO.Relationship2)
     *
     * @return relationship2 String
     */
    public String getRelationship2() {
        return relationship2;
    }

    /**
     * 设定：Relationship2 (B_PATIENT_INFO.Relationship2)
     *
     * @param relationship2 String
     */
    public void setRelationship2(String relationship2) {
        this.relationship2 = relationship2;
        this._selectiveMark.put("relationship2", true);
    }

    /**
     * 取得：LiveplaceProperty (B_PATIENT_INFO.LiveplaceProperty)
     *
     * @return liveplaceproperty String
     */
    public String getLiveplaceproperty() {
        return liveplaceproperty;
    }

    /**
     * 设定：LiveplaceProperty (B_PATIENT_INFO.LiveplaceProperty)
     *
     * @param liveplaceproperty String
     */
    public void setLiveplaceproperty(String liveplaceproperty) {
        this.liveplaceproperty = liveplaceproperty;
        this._selectiveMark.put("liveplaceproperty", true);
    }

    /**
     * 取得：OtherAddress (B_PATIENT_INFO.OtherAddress)
     *
     * @return otheraddress String
     */
    public String getOtheraddress() {
        return otheraddress;
    }

    /**
     * 设定：OtherAddress (B_PATIENT_INFO.OtherAddress)
     *
     * @param otheraddress String
     */
    public void setOtheraddress(String otheraddress) {
        this.otheraddress = otheraddress;
        this._selectiveMark.put("otheraddress", true);
    }

    /**
     * 取得：OtherAddrPostcode (B_PATIENT_INFO.OtherAddrPostcode)
     *
     * @return otheraddrpostcode String
     */
    public String getOtheraddrpostcode() {
        return otheraddrpostcode;
    }

    /**
     * 设定：OtherAddrPostcode (B_PATIENT_INFO.OtherAddrPostcode)
     *
     * @param otheraddrpostcode String
     */
    public void setOtheraddrpostcode(String otheraddrpostcode) {
        this.otheraddrpostcode = otheraddrpostcode;
        this._selectiveMark.put("otheraddrpostcode", true);
    }

    /**
     * 取得：HomePhone (B_PATIENT_INFO.HomePhone)
     *
     * @return homephone String
     */
    public String getHomephone() {
        return homephone;
    }

    /**
     * 设定：HomePhone (B_PATIENT_INFO.HomePhone)
     *
     * @param homephone String
     */
    public void setHomephone(String homephone) {
        this.homephone = homephone;
        this._selectiveMark.put("homephone", true);
    }

    /**
     * 取得：Nation (B_PATIENT_INFO.Nation)
     *
     * @return nation String
     */
    public String getNation() {
        return nation;
    }

    /**
     * 设定：Nation (B_PATIENT_INFO.Nation)
     *
     * @param nation String
     */
    public void setNation(String nation) {
        this.nation = nation;
        this._selectiveMark.put("nation", true);
    }

    /**
     * 取得：outpatientNum (B_PATIENT_INFO.outpatientNum)
     *
     * @return outpatientnum String
     */
    public String getOutpatientnum() {
        return outpatientnum;
    }

    /**
     * 设定：outpatientNum (B_PATIENT_INFO.outpatientNum)
     *
     * @param outpatientnum String
     */
    public void setOutpatientnum(String outpatientnum) {
        this.outpatientnum = outpatientnum;
        this._selectiveMark.put("outpatientnum", true);
    }

    /**
     * 取得：PastHistory (B_PATIENT_INFO.PastHistory)
     *
     * @return pasthistory String
     */
    public String getPasthistory() {
        return pasthistory;
    }

    /**
     * 设定：PastHistory (B_PATIENT_INFO.PastHistory)
     *
     * @param pasthistory String
     */
    public void setPasthistory(String pasthistory) {
        this.pasthistory = pasthistory;
        this._selectiveMark.put("pasthistory", true);
    }

    /**
     * 取得：PersonalHistory (B_PATIENT_INFO.PersonalHistory)
     *
     * @return personalhistory String
     */
    public String getPersonalhistory() {
        return personalhistory;
    }

    /**
     * 设定：PersonalHistory (B_PATIENT_INFO.PersonalHistory)
     *
     * @param personalhistory String
     */
    public void setPersonalhistory(String personalhistory) {
        this.personalhistory = personalhistory;
        this._selectiveMark.put("personalhistory", true);
    }

    /**
     * 取得：MarriageHistory (B_PATIENT_INFO.MarriageHistory)
     *
     * @return marriagehistory String
     */
    public String getMarriagehistory() {
        return marriagehistory;
    }

    /**
     * 设定：MarriageHistory (B_PATIENT_INFO.MarriageHistory)
     *
     * @param marriagehistory String
     */
    public void setMarriagehistory(String marriagehistory) {
        this.marriagehistory = marriagehistory;
        this._selectiveMark.put("marriagehistory", true);
    }

    /**
     * 取得：FamilyHistory (B_PATIENT_INFO.FamilyHistory)
     *
     * @return familyhistory String
     */
    public String getFamilyhistory() {
        return familyhistory;
    }

    /**
     * 设定：FamilyHistory (B_PATIENT_INFO.FamilyHistory)
     *
     * @param familyhistory String
     */
    public void setFamilyhistory(String familyhistory) {
        this.familyhistory = familyhistory;
        this._selectiveMark.put("familyhistory", true);
    }

    /**
     * 取得：SpecialityCheck (B_PATIENT_INFO.SpecialityCheck)
     *
     * @return specialitycheck String
     */
    public String getSpecialitycheck() {
        return specialitycheck;
    }

    /**
     * 设定：SpecialityCheck (B_PATIENT_INFO.SpecialityCheck)
     *
     * @param specialitycheck String
     */
    public void setSpecialitycheck(String specialitycheck) {
        this.specialitycheck = specialitycheck;
        this._selectiveMark.put("specialitycheck", true);
    }

    /**
     * 取得：RemindDay (B_PATIENT_INFO.RemindDay)
     *
     * @return remindday Integer
     */
    public Integer getRemindday() {
        return remindday;
    }

    /**
     * 设定：RemindDay (B_PATIENT_INFO.RemindDay)
     *
     * @param remindday Integer
     */
    public void setRemindday(Integer remindday) {
        this.remindday = remindday;
        this._selectiveMark.put("remindday", true);
    }

    /**
     * 取得：Vip (B_PATIENT_INFO.Vip)
     *
     * @return vip String
     */
    public String getVip() {
        return vip;
    }

    /**
     * 设定：Vip (B_PATIENT_INFO.Vip)
     *
     * @param vip String
     */
    public void setVip(String vip) {
        this.vip = vip;
        this._selectiveMark.put("vip", true);
    }

    /**
     * 取得：LiveStyle (B_PATIENT_INFO.LiveStyle)
     *
     * @return livestyle String
     */
    public String getLivestyle() {
        return livestyle;
    }

    /**
     * 设定：LiveStyle (B_PATIENT_INFO.LiveStyle)
     *
     * @param livestyle String
     */
    public void setLivestyle(String livestyle) {
        this.livestyle = livestyle;
        this._selectiveMark.put("livestyle", true);
    }

    /**
     * 取得：UrineAmount (B_PATIENT_INFO.UrineAmount)
     *
     * @return urineamount BigDecimal
     */
    public BigDecimal getUrineamount() {
        return urineamount;
    }

    /**
     * 设定：UrineAmount (B_PATIENT_INFO.UrineAmount)
     *
     * @param urineamount BigDecimal
     */
    public void setUrineamount(BigDecimal urineamount) {
        this.urineamount = urineamount;
        this._selectiveMark.put("urineamount", true);
    }

    /**
     * 取得：RecordDate (B_PATIENT_INFO.RecordDate)
     *
     * @return recorddate Date
     */
    public Date getRecorddate() {
        return recorddate;
    }

    /**
     * 设定：RecordDate (B_PATIENT_INFO.RecordDate)
     *
     * @param recorddate Date
     */
    public void setRecorddate(Date recorddate) {
        this.recorddate = recorddate;
        this._selectiveMark.put("recorddate", true);
    }

    /**
     * 取得：BloodFlow (B_PATIENT_INFO.BloodFlow)
     *
     * @return bloodflow BigDecimal
     */
    public BigDecimal getBloodflow() {
        return bloodflow;
    }

    /**
     * 设定：BloodFlow (B_PATIENT_INFO.BloodFlow)
     *
     * @param bloodflow BigDecimal
     */
    public void setBloodflow(BigDecimal bloodflow) {
        this.bloodflow = bloodflow;
        this._selectiveMark.put("bloodflow", true);
    }

    /**
     * 取得：RegistrationNo (B_PATIENT_INFO.RegistrationNo)
     *
     * @return registrationno String
     */
    public String getRegistrationno() {
        return registrationno;
    }

    /**
     * 设定：RegistrationNo (B_PATIENT_INFO.RegistrationNo)
     *
     * @param registrationno String
     */
    public void setRegistrationno(String registrationno) {
        this.registrationno = registrationno;
        this._selectiveMark.put("registrationno", true);
    }

    /**
     * 取得：HisPatientID (B_PATIENT_INFO.HisPatientID)
     *
     * @return hispatientid String
     */
    public String getHispatientid() {
        return hispatientid;
    }

    /**
     * 设定：HisPatientID (B_PATIENT_INFO.HisPatientID)
     *
     * @param hispatientid String
     */
    public void setHispatientid(String hispatientid) {
        this.hispatientid = hispatientid;
        this._selectiveMark.put("hispatientid", true);
    }

    /**
     * 取得：WardBlockNo (B_PATIENT_INFO.WardBlockNo)
     *
     * @return wardblockno String
     */
    public String getWardblockno() {
        return wardblockno;
    }

    /**
     * 设定：WardBlockNo (B_PATIENT_INFO.WardBlockNo)
     *
     * @param wardblockno String
     */
    public void setWardblockno(String wardblockno) {
        this.wardblockno = wardblockno;
        this._selectiveMark.put("wardblockno", true);
    }

    /**
     * 取得：province (B_PATIENT_INFO.province)
     *
     * @return province String
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设定：province (B_PATIENT_INFO.province)
     *
     * @param province String
     */
    public void setProvince(String province) {
        this.province = province;
        this._selectiveMark.put("province", true);
    }

    /**
     * 取得：city (B_PATIENT_INFO.city)
     *
     * @return city String
     */
    public String getCity() {
        return city;
    }

    /**
     * 设定：city (B_PATIENT_INFO.city)
     *
     * @param city String
     */
    public void setCity(String city) {
        this.city = city;
        this._selectiveMark.put("city", true);
    }

    /**
     * 取得：county (B_PATIENT_INFO.county)
     *
     * @return county String
     */
    public String getCounty() {
        return county;
    }

    /**
     * 设定：county (B_PATIENT_INFO.county)
     *
     * @param county String
     */
    public void setCounty(String county) {
        this.county = county;
        this._selectiveMark.put("county", true);
    }

    /**
     * 取得：LocalFirstDialysisDate (B_PATIENT_INFO.LocalFirstDialysisDate)
     *
     * @return localfirstdialysisdate Date
     */
    public Date getLocalfirstdialysisdate() {
        return localfirstdialysisdate;
    }

    /**
     * 设定：LocalFirstDialysisDate (B_PATIENT_INFO.LocalFirstDialysisDate)
     *
     * @param localfirstdialysisdate Date
     */
    public void setLocalfirstdialysisdate(Date localfirstdialysisdate) {
        this.localfirstdialysisdate = localfirstdialysisdate;
        this._selectiveMark.put("localfirstdialysisdate", true);
    }

    /**
     * 取得：IsMaintenanceDialysis (B_PATIENT_INFO.IsMaintenanceDialysis)
     *
     * @return ismaintenancedialysis String
     */
    public String getIsmaintenancedialysis() {
        return ismaintenancedialysis;
    }

    /**
     * 设定：IsMaintenanceDialysis (B_PATIENT_INFO.IsMaintenanceDialysis)
     *
     * @param ismaintenancedialysis String
     */
    public void setIsmaintenancedialysis(String ismaintenancedialysis) {
        this.ismaintenancedialysis = ismaintenancedialysis;
        this._selectiveMark.put("ismaintenancedialysis", true);
    }

    /**
     * 取得：ChargeNurse (B_PATIENT_INFO.ChargeNurse)
     *
     * @return chargenurse String
     */
    public String getChargenurse() {
        return chargenurse;
    }

    /**
     * 设定：ChargeNurse (B_PATIENT_INFO.ChargeNurse)
     *
     * @param chargenurse String
     */
    public void setChargenurse(String chargenurse) {
        this.chargenurse = chargenurse;
        this._selectiveMark.put("chargenurse", true);
    }

    /**
     * 取得：DialysisManage (B_PATIENT_INFO.DialysisManage)
     *
     * @return dialysismanage String
     */
    public String getDialysismanage() {
        return dialysismanage;
    }

    /**
     * 设定：DialysisManage (B_PATIENT_INFO.DialysisManage)
     *
     * @param dialysismanage String
     */
    public void setDialysismanage(String dialysismanage) {
        this.dialysismanage = dialysismanage;
        this._selectiveMark.put("dialysismanage", true);
    }

    /**
     * 取得：SlowNo (B_PATIENT_INFO.SlowNo)
     *
     * @return slowno String
     */
    public String getSlowno() {
        return slowno;
    }

    /**
     * 设定：SlowNo (B_PATIENT_INFO.SlowNo)
     *
     * @param slowno String
     */
    public void setSlowno(String slowno) {
        this.slowno = slowno;
        this._selectiveMark.put("slowno", true);
    }

    /**
     * 取得：SelfPayNo (B_PATIENT_INFO.SelfPayNo)
     *
     * @return selfpayno String
     */
    public String getSelfpayno() {
        return selfpayno;
    }

    /**
     * 设定：SelfPayNo (B_PATIENT_INFO.SelfPayNo)
     *
     * @param selfpayno String
     */
    public void setSelfpayno(String selfpayno) {
        this.selfpayno = selfpayno;
        this._selectiveMark.put("selfpayno", true);
    }

    /**
     * 取得：SlowCharge (B_PATIENT_INFO.SlowCharge)
     *
     * @return slowcharge String
     */
    public String getSlowcharge() {
        return slowcharge;
    }

    /**
     * 设定：SlowCharge (B_PATIENT_INFO.SlowCharge)
     *
     * @param slowcharge String
     */
    public void setSlowcharge(String slowcharge) {
        this.slowcharge = slowcharge;
        this._selectiveMark.put("slowcharge", true);
    }

    /**
     * 取得：SelfPayCharge (B_PATIENT_INFO.SelfPayCharge)
     *
     * @return selfpaycharge String
     */
    public String getSelfpaycharge() {
        return selfpaycharge;
    }

    /**
     * 设定：SelfPayCharge (B_PATIENT_INFO.SelfPayCharge)
     *
     * @param selfpaycharge String
     */
    public void setSelfpaycharge(String selfpaycharge) {
        this.selfpaycharge = selfpaycharge;
        this._selectiveMark.put("selfpaycharge", true);
    }

    /**
     * 取得：ResidualRenal (B_PATIENT_INFO.ResidualRenal)
     *
     * @return residualrenal String
     */
    public String getResidualrenal() {
        return residualrenal;
    }

    /**
     * 设定：ResidualRenal (B_PATIENT_INFO.ResidualRenal)
     *
     * @param residualrenal String
     */
    public void setResidualrenal(String residualrenal) {
        this.residualrenal = residualrenal;
        this._selectiveMark.put("residualrenal", true);
    }

    /**
     * 取得：SecondaryDiagnosis (B_PATIENT_INFO.SecondaryDiagnosis)
     *
     * @return secondarydiagnosis String
     */
    public String getSecondarydiagnosis() {
        return secondarydiagnosis;
    }

    /**
     * 设定：SecondaryDiagnosis (B_PATIENT_INFO.SecondaryDiagnosis)
     *
     * @param secondarydiagnosis String
     */
    public void setSecondarydiagnosis(String secondarydiagnosis) {
        this.secondarydiagnosis = secondarydiagnosis;
        this._selectiveMark.put("secondarydiagnosis", true);
    }

    /**
     * 取得：DialysisRule (B_PATIENT_INFO.DialysisRule)
     *
     * @return dialysisrule String
     */
    public String getDialysisrule() {
        return dialysisrule;
    }

    /**
     * 设定：DialysisRule (B_PATIENT_INFO.DialysisRule)
     *
     * @param dialysisrule String
     */
    public void setDialysisrule(String dialysisrule) {
        this.dialysisrule = dialysisrule;
        this._selectiveMark.put("dialysisrule", true);
    }

    /**
     * 取得：ScreenId (B_PATIENT_INFO.ScreenId)
     *
     * @return screenid String
     */
    public String getScreenid() {
        return screenid;
    }

    /**
     * 设定：ScreenId (B_PATIENT_INFO.ScreenId)
     *
     * @param screenid String
     */
    public void setScreenid(String screenid) {
        this.screenid = screenid;
        this._selectiveMark.put("screenid", true);
    }

    /**
     * 取得：RecordDoctor (B_PATIENT_INFO.RecordDoctor)
     *
     * @return recorddoctor String
     */
    public String getRecorddoctor() {
        return recorddoctor;
    }

    /**
     * 设定：RecordDoctor (B_PATIENT_INFO.RecordDoctor)
     *
     * @param recorddoctor String
     */
    public void setRecorddoctor(String recorddoctor) {
        this.recorddoctor = recorddoctor;
        this._selectiveMark.put("recorddoctor", true);
    }

    /**
     * 取得：Recordtime (B_PATIENT_INFO.Recordtime)
     *
     * @return recordtime Date
     */
    public Date getRecordtime() {
        return recordtime;
    }

    /**
     * 设定：Recordtime (B_PATIENT_INFO.Recordtime)
     *
     * @param recordtime Date
     */
    public void setRecordtime(Date recordtime) {
        this.recordtime = recordtime;
        this._selectiveMark.put("recordtime", true);
    }

    /**
     * 取得：Isthyroid (B_PATIENT_INFO.Isthyroid)
     *
     * @return isthyroid String
     */
    public String getIsthyroid() {
        return isthyroid;
    }

    /**
     * 设定：Isthyroid (B_PATIENT_INFO.Isthyroid)
     *
     * @param isthyroid String
     */
    public void setIsthyroid(String isthyroid) {
        this.isthyroid = isthyroid;
        this._selectiveMark.put("isthyroid", true);
    }

    /**
     * 取得：OperationDate (B_PATIENT_INFO.OperationDate)
     *
     * @return operationdate Date
     */
    public Date getOperationdate() {
        return operationdate;
    }

    /**
     * 设定：OperationDate (B_PATIENT_INFO.OperationDate)
     *
     * @param operationdate Date
     */
    public void setOperationdate(Date operationdate) {
        this.operationdate = operationdate;
        this._selectiveMark.put("operationdate", true);
    }

    /**
     * 取得：OperationWays (B_PATIENT_INFO.OperationWays)
     *
     * @return operationways String
     */
    public String getOperationways() {
        return operationways;
    }

    /**
     * 设定：OperationWays (B_PATIENT_INFO.OperationWays)
     *
     * @param operationways String
     */
    public void setOperationways(String operationways) {
        this.operationways = operationways;
        this._selectiveMark.put("operationways", true);
    }

    /**
     * 取得：VisitTime (B_PATIENT_INFO.VisitTime)
     *
     * @return visittime Date
     */
    public Date getVisittime() {
        return visittime;
    }

    /**
     * 设定：VisitTime (B_PATIENT_INFO.VisitTime)
     *
     * @param visittime Date
     */
    public void setVisittime(Date visittime) {
        this.visittime = visittime;
        this._selectiveMark.put("visittime", true);
    }

    /**
     * 取得：FirstTreatDate (B_PATIENT_INFO.FirstTreatDate)
     *
     * @return firsttreatdate Date
     */
    public Date getFirsttreatdate() {
        return firsttreatdate;
    }

    /**
     * 设定：FirstTreatDate (B_PATIENT_INFO.FirstTreatDate)
     *
     * @param firsttreatdate Date
     */
    public void setFirsttreatdate(Date firsttreatdate) {
        this.firsttreatdate = firsttreatdate;
        this._selectiveMark.put("firsttreatdate", true);
    }

    /**
     * 更新标记.
     * @return MAP 
     */ 
    public Map<String, Boolean> get_selectiveMark() {
        return this._selectiveMark;
    }
}