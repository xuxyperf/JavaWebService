package com.dpcbj.service.jitvctk;

/**
 * COM Interface 'IJITDSign'. Generated 2013-4-15 16:12:31
 * from 'C:\JITComVCTK.dll'<P>
 * Generated using com2java Version 2.11 (c) 2010 Intrinsyc Software International, Inc.  All rights reserved.
 * See  <A HREF="http://j-integra.intrinsyc.com/">http://j-integra.intrinsyc.com/</A><P>
 * Description: '<B>IJITDSign Interface</B>'
 *
 * Generator Options:
 *   AwtForOcxs = False
 *   PromptForTypeLibraries = False
 *   RetryOnReject = False
 *   IDispatchOnly = False
 *   GenBeanInfo = False
 *   LowerCaseMemberNames = True
 *   TreatInStarAsIn = False
 *   ArraysAsObjects = False
 *   OmitRestrictedMethods = False
 *   ClashPrefix = zz_
 *   ImplementConflictingInterfaces = False
 *   DontRenameSameMethods = False
 *   RenameConflictingInterfaceMethods = False
 *   ReuseMethods = False
 *
 * Command Line Only Options:
 *   MakeClsidsPublic = False
 *   DontOverwrite = False
 */
public interface IJITDSign extends java.io.Serializable {
  /**
   * getVersion. method GetVersion
   *
   * @return    The bstrResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getVersion  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * setCert. 指定唯一证书
   *
   * @param     lpstrCertType The lpstrCertType (in)
   * @param     lpstrDN The lpstrDN (in)
   * @param     lpstrSN The lpstrSN (in)
   * @param     lpstrEmail The lpstrEmail (in)
   * @param     lpstrDNIssuer The lpstrDNIssuer (in)
   * @param     lpstrCertBase64 The lpstrCertBase64 (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int setCert  (
              String lpstrCertType,
              String lpstrDN,
              String lpstrSN,
              String lpstrEmail,
              String lpstrDNIssuer,
              String lpstrCertBase64) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * setCertChooseType. 设置证书弹出方式
   *
   * @param     lType The lType (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int setCertChooseType  (
              int lType) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getCertInfo. 获取证书信息
   *
   * @param     pszCertType The pszCertType (in)
   * @param     lInfoType The lInfoType (in)
   * @param     pszOID The pszOID (in)
   * @return    The bstrResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getCertInfo  (
              String pszCertType,
              int lInfoType,
              String pszOID) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * setAlgorithm. 设置算法
   *
   * @param     lpstrSignAlgo The lpstrSignAlgo (in)
   * @param     lpstrEncAlgo The lpstrEncAlgo (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int setAlgorithm  (
              String lpstrSignAlgo,
              String lpstrEncAlgo) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * attachSign. Attach签名
   *
   * @param     lpstrDN The lpstrDN (in)
   * @param     pszSrcData The pszSrcData (in)
   * @return    The bstrResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String attachSign  (
              String lpstrDN,
              String pszSrcData) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * attachSignEx. Attach签名(从文件)
   *
   * @param     pszDN The pszDN (in)
   * @param     pszFileName The pszFileName (in)
   * @param     pszFileNameOut The pszFileNameOut (in)
   * @return    The bstrResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String attachSignEx  (
              String pszDN,
              String pszFileName,
              String pszFileNameOut) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * verifyAttachedSign. 验证Attach签名
   *
   * @param     bstrSignedData The bstrSignedData (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int verifyAttachedSign  (
              String bstrSignedData) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * verifyAttachedSignEx. 验证Attach签名(从文件)
   *
   * @param     bstrFileNameAttached The bstrFileNameAttached (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int verifyAttachedSignEx  (
              String bstrFileNameAttached) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * detachSign. Detach签名
   *
   * @param     lpstrDN The lpstrDN (in)
   * @param     pszSrcData The pszSrcData (in)
   * @return    The bstrResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String detachSign  (
              String lpstrDN,
              String pszSrcData) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * detachSignEx. Detach签名(从文件)
   *
   * @param     pszDN The pszDN (in)
   * @param     pszFileName The pszFileName (in)
   * @param     pszFileNameOut The pszFileNameOut (in)
   * @return    The bstrResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String detachSignEx  (
              String pszDN,
              String pszFileName,
              String pszFileNameOut) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * verifyDetachedSign. 验证Detach签名
   *
   * @param     pszSignedData The pszSignedData (in)
   * @param     pszSrcData The pszSrcData (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int verifyDetachedSign  (
              String pszSignedData,
              String pszSrcData) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * verifyDetachedSignEx. 验证Detach签名(从文件)
   *
   * @param     pszSignedData The pszSignedData (in)
   * @param     pszFileNameDetached The pszFileNameDetached (in)
   * @param     pszFileName The pszFileName (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int verifyDetachedSignEx  (
              String pszSignedData,
              String pszFileNameDetached,
              String pszFileName) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * encryptEnvelop. 制作数字信封
   *
   * @param     pszDN The pszDN (in)
   * @param     pszSrcData The pszSrcData (in)
   * @return    The bstrResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String encryptEnvelop  (
              String pszDN,
              String pszSrcData) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * encryptEnvelopEx. 制作数字信封(从文件)
   *
   * @param     pszDN The pszDN (in)
   * @param     pszFileName The pszFileName (in)
   * @param     pszFileNameOut The pszFileNameOut (in)
   * @return    The bstrResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String encryptEnvelopEx  (
              String pszDN,
              String pszFileName,
              String pszFileNameOut) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * decryptEnvelop. 解密数字信封
   *
   * @param     pszEvpContent The pszEvpContent (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int decryptEnvelop  (
              String pszEvpContent) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * decryptEnvelopEx. 解密数字信封(从文件
   *
   * @param     bstrEvpFile The bstrEvpFile (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int decryptEnvelopEx  (
              String bstrEvpFile) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * createSignedEnvelop. 制作带签名数字信封
   *
   * @param     bstrSignCertDN The bstrSignCertDN (in)
   * @param     bstrEncCertDN The bstrEncCertDN (in)
   * @param     pVarSrcData The pVarSrcData (in)
   * @return    The bstrResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String createSignedEnvelop  (
              String bstrSignCertDN,
              String bstrEncCertDN,
              String pVarSrcData) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * createSignedEnvelopEx. 制作带签名数字信封(从文件)
   *
   * @param     bstrSignCertDN The bstrSignCertDN (in)
   * @param     bstrEncCertDN The bstrEncCertDN (in)
   * @param     pbstrFileName The pbstrFileName (in)
   * @param     bstrFileNameOut The bstrFileNameOut (in)
   * @return    The bstrResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String createSignedEnvelopEx  (
              String bstrSignCertDN,
              String bstrEncCertDN,
              String pbstrFileName,
              String bstrFileNameOut) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * verifySignedEnvelop. 解密并验证带签名数字信封
   *
   * @param     bstrEnvelop The bstrEnvelop (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int verifySignedEnvelop  (
              String bstrEnvelop) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * verifySignedEnvelopEx. 解密并验证带签名数字信封(从文件)
   *
   * @param     bstrEvpFile The bstrEvpFile (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int verifySignedEnvelopEx  (
              String bstrEvpFile) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getBase64Encode. Base64编码函数
   *
   * @param     bstrSrcData The bstrSrcData (in)
   * @return    The bstrResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getBase64Encode  (
              String bstrSrcData) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getBase64Decode. Base64解码函数
   *
   * @param     bstrBase64Data The bstrBase64Data (in)
   * @return    The bstrResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getBase64Decode  (
              String bstrBase64Data) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getErrorCode. 获取错误码
   *
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int getErrorCode  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getBase64HashEnCode. ***** 保留接口, 未实现 *****
   *
   * @param     bstrSrcData The bstrSrcData (in)
   * @return    The bstrResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getBase64HashEnCode  (
              String bstrSrcData) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getErrorMessage. 获取错误描述
   *
   * @return    The bstrResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getErrorMessage  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getData. 获取原文数据
   *
   * @return    The bstrResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getData  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getFile. 保存原文到指定路径
   *
   * @param     bstrFileSavePath The bstrFileSavePath (in)
   * @return    The bstrResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getFile  (
              String bstrFileSavePath) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * addData. ***** 保留接口, 未实现 *****
   *
   * @param     bstrSrcData The bstrSrcData (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int addData  (
              String bstrSrcData) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * addFile. ***** 保留接口, 未实现 *****
   *
   * @param     bstrSrcFile The bstrSrcFile (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int addFile  (
              String bstrSrcFile) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * setCSP. 设置CSP名称
   *
   * @param     pszProvider The pszProvider (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int setCSP  (
              String pszProvider) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * setPIN. 设置PIN码
   *
   * @param     pszPIN The pszPIN (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int setPIN  (
              String pszPIN) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getCertList. ***** 保留接口, 未实现 *****
   *
   * @param     lpszType The lpszType (in)
   * @param     lpszDN The lpszDN (in)
   * @param     lpszSN The lpszSN (in)
   * @param     lpszEmail The lpszEmail (in)
   * @param     lpszIssuer The lpszIssuer (in)
   * @param     lInfoType The lInfoType (in)
   * @return    The bstrResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getCertList  (
              String lpszType,
              String lpszDN,
              String lpszSN,
              String lpszEmail,
              String lpszIssuer,
              int lInfoType) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * setErrMsgLanguage. ***** 保留接口, 未实现 *****
   *
   * @param     lpzLangType The lpzLangType (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int setErrMsgLanguage  (
              String lpzLangType) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * clearPIN. ***** 保留接口, 未实现 *****
   *
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int clearPIN  () throws java.io.IOException, com.linar.jintegra.AutomationException;


  // Constants to help J-Integra for COM dynamically map DCOM invocations to
  // interface members.  Don't worry, you will never need to explicitly use these constants.
  int IIDbd6e3733_66b4_4bd8_ada1_64f1f6b508ac = 1;
  /** Dummy reference to interface proxy to make sure it gets compiled */
  int xxDummy = IJITDSignProxy.xxDummy;
  /** Used internally by J-Integra for COM, please ignore */
  String IID = "bd6e3733-66b4-4bd8-ada1-64f1f6b508ac";
  String DISPID_1_NAME = "getVersion";
  String DISPID_2_NAME = "setCert";
  String DISPID_3_NAME = "setCertChooseType";
  String DISPID_4_NAME = "getCertInfo";
  String DISPID_5_NAME = "setAlgorithm";
  String DISPID_6_NAME = "attachSign";
  String DISPID_7_NAME = "attachSignEx";
  String DISPID_8_NAME = "verifyAttachedSign";
  String DISPID_9_NAME = "verifyAttachedSignEx";
  String DISPID_10_NAME = "detachSign";
  String DISPID_11_NAME = "detachSignEx";
  String DISPID_12_NAME = "verifyDetachedSign";
  String DISPID_13_NAME = "verifyDetachedSignEx";
  String DISPID_14_NAME = "encryptEnvelop";
  String DISPID_15_NAME = "encryptEnvelopEx";
  String DISPID_16_NAME = "decryptEnvelop";
  String DISPID_17_NAME = "decryptEnvelopEx";
  String DISPID_18_NAME = "createSignedEnvelop";
  String DISPID_19_NAME = "createSignedEnvelopEx";
  String DISPID_20_NAME = "verifySignedEnvelop";
  String DISPID_21_NAME = "verifySignedEnvelopEx";
  String DISPID_22_NAME = "getBase64Encode";
  String DISPID_23_NAME = "getBase64Decode";
  String DISPID_24_NAME = "getErrorCode";
  String DISPID_25_NAME = "getBase64HashEnCode";
  String DISPID_26_NAME = "getErrorMessage";
  String DISPID_27_NAME = "getData";
  String DISPID_28_NAME = "getFile";
  String DISPID_29_NAME = "addData";
  String DISPID_30_NAME = "addFile";
  String DISPID_31_NAME = "setCSP";
  String DISPID_32_NAME = "setPIN";
  String DISPID_33_NAME = "getCertList";
  String DISPID_34_NAME = "setErrMsgLanguage";
  String DISPID_35_NAME = "clearPIN";
}
