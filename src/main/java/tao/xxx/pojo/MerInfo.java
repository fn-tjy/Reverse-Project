package tao.xxx.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 商户信息表
 * </p>
 *
 * @author tjy
 * @since 2021-04-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class MerInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 进件编号
     */
    @TableId("LOG_NO")
    private String logNo;

    /**
     * 商户ID
     */
    @TableField("MER_ID")
    private String merId;

    /**
     * 商户名称
     */
    @TableField("MER_NAME")
    private String merName;

    /**
     * 所属代理商ID
     */
    @TableField("AGT_ID")
    private String agtId;

    /**
     * 商户进件状态(0:失败 1:成功 3:审核中 )
     */
    @TableField("MER_STATUS")
    private String merStatus;

    /**
     * 原因
     */
    @TableField("MER_REASON")
    private String merReason;

    /**
     * 所属代理商ID
     */
    @TableField("ONE_AGT_ID")
    private String oneAgtId;

    /**
     * 一代平台代理商号
     */
    @TableField("ONE_ORI_AGT_ID")
    private String oneOriAgtId;

    /**
     * 服务商编号
     */
    @TableField("SERVICE_NO")
    private String serviceNo;

    /**
     * 商户邮箱
     */
    @TableField("MER_EMAIL")
    private String merEmail;

    /**
     * 商户类型(0:个体工商户 1:企业单位 2:事业单位 3:政府机关)
     */
    @TableField("MER_TYPE")
    private String merType;

    /**
     * 经营范围
     */
    @TableField("BIZ_SCOPE")
    private String bizScope;

    /**
     * 商户所在省份
     */
    @TableField("MER_PROV")
    private String merProv;

    /**
     * 商户所在城市
     */
    @TableField("MER_CITY")
    private String merCity;

    /**
     * 商户所在区县
     */
    @TableField("MER_AREA")
    private String merArea;

    /**
     * 商户地址
     */
    @TableField("MER_ADDR")
    private String merAddr;

    /**
     * 商户邮编
     */
    @TableField("MER_POST")
    private String merPost;

    /**
     * 商户传真
     */
    @TableField("MER_FAX")
    private String merFax;

    /**
     * 商户电话
     */
    @TableField("MER_PHONE")
    private String merPhone;

    /**
     * 商户手机
     */
    @TableField("MER_MOBILE")
    private String merMobile;

    /**
     * mcc编码
     */
    @TableField("MER_MCC_CODE")
    private String merMccCode;

    /**
     * 注册资金(单位分,左补0补满15位)
     */
    @TableField("REG_FUND")
    private String regFund;

    /**
     * 是否三证合一 0-否 1-是
     */
    @TableField("IS_MERGE")
    private String isMerge;

    /**
     * 营业执照号(商户类型0或1时必填,3证合1用此字段即可,加密存储)
     */
    @TableField("BIZ_LIC")
    private String bizLic;

    /**
     * 组织机构代码(加密存储)
     */
    @TableField("ORG_COD")
    private String orgCod;

    /**
     * 税务登记号(加密存储)
     */
    @TableField("TAX_NO")
    private String taxNo;

    /**
     * 商户法人(Artificial Person)
     */
    @TableField("MER_AP")
    private String merAp;

    /**
     * 法人证件号码(加密存储)
     */
    @TableField("AP_ID")
    private String apId;

    /**
     * 证件类型
     */
    @TableField("ID_TYPE")
    private String idType;

    /**
     * 证件生效期(yyyyMMdd)
     */
    @TableField("ID_EFF_DAT")
    private String idEffDat;

    /**
     * 证件失效期(yyyyMMdd)
     */
    @TableField("ID_EXP_DAT")
    private String idExpDat;

    /**
     * 结算方式(1-T1 0-D0)
     */
    @TableField("STL_TYPE")
    private String stlType;

    /**
     * 借记卡费率
     */
    @TableField("JJK_RATE")
    private String jjkRate;

    /**
     * 借记卡封顶金额
     */
    @TableField("JJK_CAP")
    private String jjkCap;

    /**
     * 贷记卡费率
     */
    @TableField("DJK_RATE")
    private String djkRate;

    /**
     * D0费率
     */
    @TableField("D0_RATE")
    private String d0Rate;

    /**
     * 结算账户类型 0-对公 1-对私
     */
    @TableField("SETTLE_ACCOUNT_TYPE")
    private String settleAccountType;

    /**
     * 结算账户名
     */
    @TableField("STL_NAME")
    private String stlName;

    /**
     * 结算账户账号(加密存储)
     */
    @TableField("STL_AC")
    private String stlAc;

    /**
     * 结算账户省份
     */
    @TableField("STL_PROV")
    private String stlProv;

    /**
     * 结算账户城市
     */
    @TableField("STL_CITY")
    private String stlCity;

    /**
     * 结算账户银行(总行联行号)
     */
    @TableField("STL_BNK")
    private String stlBnk;

    /**
     * 结算账户总行名称
     */
    @TableField("STL_BNK_NAME")
    private String stlBnkName;

    /**
     * 结算账户支行(支行联行号)
     */
    @TableField("STL_CNAPS")
    private String stlCnaps;

    /**
     * 结算账户支行名称
     */
    @TableField("STL_CNAPS_NAME")
    private String stlCnapsName;

    /**
     * 附件1
     */
    @TableField("ATTA_1")
    private String atta1;

    /**
     * 附件2
     */
    @TableField("ATTA_2")
    private String atta2;

    /**
     * 附件3
     */
    @TableField("ATTA_3")
    private String atta3;

    /**
     * 附件4
     */
    @TableField("ATTA_4")
    private String atta4;

    /**
     * 最后更新用户
     */
    @TableField("UPD_USR")
    private String updUsr;

    /**
     * 备用字段
     */
    @TableField("BACKUP_FIELD")
    private String backupField;

    /**
     * 最后更新时间
     */
    @TableField("UPD_TIM")
    private String updTim;

    /**
     * 支付产品01-点pos  02-U米MPOS  03-U米DPOS  04-U米电签  05-电银通  06-拉卡拉
     */
    private String agtPro;

    /**
     * 营业执照开始日期
     */
    @TableField("LICENSE_START_DATE")
    private String licenseStartDate;

    /**
     * 营业执照结束日期
     */
    @TableField("LICENSE_END_DATE")
    private String licenseEndDate;

    /**
     * 机具版本号
     */
    @TableField("PLAT_TYPE")
    private String platType;

    /**
     * 微信费率
     */
    @TableField("WXPAY_FEE")
    private String wxpayFee;

    /**
     * 支付宝费率
     */
    @TableField("ALIPAY_FEE")
    private String alipayFee;

    /**
     * 四要素认证状态：1-已认证，0-未认证
     */
    @TableField("FOUR_AUTH_STS")
    private String fourAuthSts;

    /**
     * 外部流水号
     */
    @TableField("JRN_NO")
    private String jrnNo;

    /**
     * 升级小微状态 -1:审核失败 0:初始 1:审核中 2:审核成功
     */
    @TableField("UP_SMALL_STATUS")
    private String upSmallStatus;

    /**
     * 升级标准状态 -1:审核失败 0:初始 1:审核中 2:审核成功
     */
    @TableField("UP_STANDARD_STATUS")
    private String upStandardStatus;

    /**
     * 绑定状态 0-未绑定 1-已绑定
     */
    @TableField("BIND_STS")
    private String bindSts;

    /**
     * 支付公司
     */
    private String agtBrand;

    /**
     * 激活码
     */
    @TableField("ACTIVATION_CODE")
    private String activationCode;

    /**
     * 拉卡拉白名单,0:未入白名单    1:加入白名单
     */
    @TableField("LKL_WL")
    private String lklWl;

    /**
     * 借记卡优惠费率(%)
     */
    @TableField("JJK_YH")
    private String jjkYh;

    /**
     * 贷记卡优惠费率(%)
     */
    @TableField("DJK_YH")
    private String djkYh;

    /**
     * 入网时间
     */
    @TableField("NET_IN_TIM")
    private String netInTim;

    /**
     * 单笔快提费(元)
     */
    @TableField("QUIC_FEE")
    private String quicFee;

    /**
     * 银联费率(%)
     */
    @TableField("UNI_FEE")
    private String uniFee;


}
