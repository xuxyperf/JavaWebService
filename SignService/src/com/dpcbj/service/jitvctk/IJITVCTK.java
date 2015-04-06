package com.dpcbj.service.jitvctk;

/**
 * COM Interface 'IJITVCTK'. Generated 2013-4-15 16:12:31
 * from 'C:\JITComVCTK.dll'<P>
 * Generated using com2java Version 2.11 (c) 2010 Intrinsyc Software International, Inc.  All rights reserved.
 * See  <A HREF="http://j-integra.intrinsyc.com/">http://j-integra.intrinsyc.com/</A><P>
 * Description: '<B>IJITVCTK Interface</B>'
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
public interface IJITVCTK extends java.io.Serializable {
  /**
   * setCert. 指定唯一证书
   *
   * @param     bstrCertType The bstrCertType (in)
   * @param     bstrDN The bstrDN (in)
   * @param     bstrSN The bstrSN (in)
   * @param     bstrEmail The bstrEmail (in)
   * @param     bstrDNIssuer The bstrDNIssuer (in)
   * @param     bstrCertBase64 The bstrCertBase64 (in)
   * @return    The pRetVal
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int setCert  (
              String bstrCertType,
              String bstrDN,
              String bstrSN,
              String bstrEmail,
              String bstrDNIssuer,
              String bstrCertBase64) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * setCertChooseType. 设置证书弹出方式
   *
   * @param     nType The nType (in)
   * @return    The pRetVal
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int setCertChooseType  (
              int nType) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getCertInfo. 获取证书信息
   *
   * @param     bstrCertType The bstrCertType (in)
   * @param     lInfoType The lInfoType (in)
   * @param     bstrOID The bstrOID (in)
   * @return    The pRetCerInfo
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getCertInfo  (
              String bstrCertType,
              int lInfoType,
              String bstrOID) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * setAlgorithm. 设置算法
   *
   * @param     bstrSignAlg The bstrSignAlg (in)
   * @param     bstrEncAlg The bstrEncAlg (in)
   * @return    The pRetVal
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int setAlgorithm  (
              String bstrSignAlg,
              String bstrEncAlg) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * attachSign. Attach签名
   *
   * @param     bstrDN The bstrDN (in)
   * @param     pszSrcData An unsigned byte (in)
   * @param     lSrcDataLen The lSrcDataLen (in)
   * @return    The pbstrSignedData
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String attachSign  (
              String bstrDN,
              byte[] pszSrcData,
              int lSrcDataLen) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * attachSignEx. Attach签名(从文件)
   *
   * @param     bstrDN The bstrDN (in)
   * @param     bstrFileName The bstrFileName (in)
   * @param     bstrFileNameOut The bstrFileNameOut (in)
   * @return    The pbstrSignedData
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String attachSignEx  (
              String bstrDN,
              String bstrFileName,
              String bstrFileNameOut) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * verifyAttachedSign. 验证Attach签名
   *
   * @param     bstrSignedData The bstrSignedData (in)
   * @return    The pRetVal
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int verifyAttachedSign  (
              String bstrSignedData) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * verifyAttachedSignEx. 验证Attach签名(从文件)
   *
   * @param     bstrFileNameAttached The bstrFileNameAttached (in)
   * @return    The pRetVal
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int verifyAttachedSignEx  (
              String bstrFileNameAttached) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * detachSign. Detach签名
   *
   * @param     bstrDN The bstrDN (in)
   * @param     pszSrcData An unsigned byte (in)
   * @param     lSrcDataLen The lSrcDataLen (in)
   * @return    The pbstrSignedData
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String detachSign  (
              String bstrDN,
              byte[] pszSrcData,
              int lSrcDataLen) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * detachSignEx. Detach签名(从文件)
   *
   * @param     bstrDN The bstrDN (in)
   * @param     bstrFileName The bstrFileName (in)
   * @param     bstrFileNameOut The bstrFileNameOut (in)
   * @return    The pbstrSignedData
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String detachSignEx  (
              String bstrDN,
              String bstrFileName,
              String bstrFileNameOut) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * verifyDetachedSign. 验证Detach签名
   *
   * @param     bstrSignedData The bstrSignedData (in)
   * @param     pszSrcData An unsigned byte (in)
   * @param     lSrcDataLen The lSrcDataLen (in)
   * @return    The pRetVal
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int verifyDetachedSign  (
              String bstrSignedData,
              byte[] pszSrcData,
              int lSrcDataLen) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * verifyDetachedSignEx. 验证Detach签名(从文件)
   *
   * @param     bstrSignedData The bstrSignedData (in)
   * @param     bstrFileNameDetached The bstrFileNameDetached (in)
   * @param     bstrFileName The bstrFileName (in)
   * @return    The pRetVal
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int verifyDetachedSignEx  (
              String bstrSignedData,
              String bstrFileNameDetached,
              String bstrFileName) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * encryptEnvelop. 制作数字信封
   *
   * @param     bstrDN The bstrDN (in)
   * @param     pszSrcData An unsigned byte (in)
   * @param     lSrcDataLen The lSrcDataLen (in)
   * @return    The pRetValue
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String encryptEnvelop  (
              String bstrDN,
              byte[] pszSrcData,
              int lSrcDataLen) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * encryptEnvelopEx. 制作数字信封(从文件)
   *
   * @param     bstrDN The bstrDN (in)
   * @param     bstrFileName The bstrFileName (in)
   * @param     bstrFileNameOut The bstrFileNameOut (in)
   * @return    The pRetValue
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String encryptEnvelopEx  (
              String bstrDN,
              String bstrFileName,
              String bstrFileNameOut) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * decryptEnvelop. 解密数字信封
   *
   * @param     bstrEnvelop The bstrEnvelop (in)
   * @return    The pRetVal
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int decryptEnvelop  (
              String bstrEnvelop) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * decryptEnvelopEx. 解密数字信封(从文件)
   *
   * @param     bstrFileNameDetached The bstrFileNameDetached (in)
   * @return    The pRetVal
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int decryptEnvelopEx  (
              String bstrFileNameDetached) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * createSignedEnvelop. 制作带签名数字信封
   *
   * @param     bstrSignCertDN The bstrSignCertDN (in)
   * @param     bstrEncCertDN The bstrEncCertDN (in)
   * @param     pszSrcData An unsigned byte (in)
   * @param     lSrcDataLen The lSrcDataLen (in)
   * @return    The pRetValue
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String createSignedEnvelop  (
              String bstrSignCertDN,
              String bstrEncCertDN,
              byte[] pszSrcData,
              int lSrcDataLen) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * createSignedEnvelopEx. 制作带签名数字信封(从文件)
   *
   * @param     bstrSignCertDN The bstrSignCertDN (in)
   * @param     bstrEncCertDN The bstrEncCertDN (in)
   * @param     bstrFileName The bstrFileName (in)
   * @param     bstrFileNameOut The bstrFileNameOut (in)
   * @return    The pRetValue
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String createSignedEnvelopEx  (
              String bstrSignCertDN,
              String bstrEncCertDN,
              String bstrFileName,
              String bstrFileNameOut) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * verifySignedEnvelop. 解密并验证带签名数字信封
   *
   * @param     bstrEnvelop The bstrEnvelop (in)
   * @return    The pRetVal
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int verifySignedEnvelop  (
              String bstrEnvelop) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * verifySignedEnvelopEx. 解密并验证带签名数字信封(从文件)
   *
   * @param     bstrEvpFile The bstrEvpFile (in)
   * @return    The pRetVal
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int verifySignedEnvelopEx  (
              String bstrEvpFile) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getDataEx. 获取原文数据
   *
   * @param     pszSrcData An unsigned byte (out: use single element array)
   * @param     plSrcDataLen The plSrcDataLen (in/out: use single element array)
   * @return    The pRetVal
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int getDataEx  (
              byte[] pszSrcData,
              int[] plSrcDataLen) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getFile. 保存原文到指定路径
   *
   * @param     bstrFileSavePath The bstrFileSavePath (in)
   * @return    The bstrFileName
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getFile  (
              String bstrFileSavePath) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getErrorCode. 获取错误码
   *
   * @return    The pRetVal
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int getErrorCode  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getErrorMessage. 获取错误描述
   *
   * @param     lErrorCode The lErrorCode (in)
   * @return    The pErrorMessage
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getErrorMessage  (
              int lErrorCode) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * setCSP. 设置CSP名称
   *
   * @param     bstrProvider The bstrProvider (in)
   * @return    The pRetVal
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int setCSP  (
              String bstrProvider) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * setPIN. 设置PIN码
   *
   * @param     bstrPIN The bstrPIN (in)
   * @return    The pRetVal
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int setPIN  (
              String bstrPIN) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * jITGetVersion. 获取版本
   *
   * @return    The pbstrVersion
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String jITGetVersion  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getBase64Encode. Base64编码函数
   *
   * @param     pszSrcData An unsigned byte (in)
   * @param     lSrcDataLen The lSrcDataLen (in)
   * @return    The pbstrBase64Data
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getBase64Encode  (
              byte[] pszSrcData,
              int lSrcDataLen) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getBase64Decode. Base64解码函数
   *
   * @param     bstrBase64Data The bstrBase64Data (in)
   * @param     pszSrcData An unsigned byte (out: use single element array)
   * @param     pSrcDataLen The pSrcDataLen (in/out: use single element array)
   * @return    The pRetVal
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int getBase64Decode  (
              String bstrBase64Data,
              byte[] pszSrcData,
              int[] pSrcDataLen) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getData. 获取原文数据
   *
   * @return    The bstrBase64Data
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getData  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * attachSignStr. Attach签名(从字符串)
   *
   * @param     bstrDN The bstrDN (in)
   * @param     bstrSrc The bstrSrc (in)
   * @return    The pbstrSignedData
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String attachSignStr  (
              String bstrDN,
              String bstrSrc) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * detachSignStr. Detach签名(从字符串)
   *
   * @param     bstrDN The bstrDN (in)
   * @param     bstrSrc The bstrSrc (in)
   * @return    The pbstrSignedData
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String detachSignStr  (
              String bstrDN,
              String bstrSrc) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * verifyDetachedSignStr. 验证Detach签名(从字符串)
   *
   * @param     bstrSignedData The bstrSignedData (in)
   * @param     bstrSrc The bstrSrc (in)
   * @return    The pRetVal
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int verifyDetachedSignStr  (
              String bstrSignedData,
              String bstrSrc) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * encryptEnvelopStr. 制作数字信封(从字符串)
   *
   * @param     bstrDN The bstrDN (in)
   * @param     bstrSrc The bstrSrc (in)
   * @return    The pRetValue
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String encryptEnvelopStr  (
              String bstrDN,
              String bstrSrc) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * createSignedEnvelopStr. 制作带签名数字信封(从字符串)
   *
   * @param     bstrSignCertDN The bstrSignCertDN (in)
   * @param     bstrEncCertDN The bstrEncCertDN (in)
   * @param     bstrSrc The bstrSrc (in)
   * @return    The pRetValue
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String createSignedEnvelopStr  (
              String bstrSignCertDN,
              String bstrEncCertDN,
              String bstrSrc) throws java.io.IOException, com.linar.jintegra.AutomationException;


  // Constants to help J-Integra for COM dynamically map DCOM invocations to
  // interface members.  Don't worry, you will never need to explicitly use these constants.
  int IID9cda9b8e_04aa_4070_9375_b1f327c8aa34 = 1;
  /** Dummy reference to interface proxy to make sure it gets compiled */
  int xxDummy = IJITVCTKProxy.xxDummy;
  /** Used internally by J-Integra for COM, please ignore */
  String IID = "9cda9b8e-04aa-4070-9375-b1f327c8aa34";
  String DISPID_1_NAME = "setCert";
  String DISPID_2_NAME = "setCertChooseType";
  String DISPID_3_NAME = "getCertInfo";
  String DISPID_4_NAME = "setAlgorithm";
  String DISPID_5_NAME = "attachSign";
  String DISPID_6_NAME = "attachSignEx";
  String DISPID_7_NAME = "verifyAttachedSign";
  String DISPID_8_NAME = "verifyAttachedSignEx";
  String DISPID_9_NAME = "detachSign";
  String DISPID_10_NAME = "detachSignEx";
  String DISPID_11_NAME = "verifyDetachedSign";
  String DISPID_12_NAME = "verifyDetachedSignEx";
  String DISPID_13_NAME = "encryptEnvelop";
  String DISPID_14_NAME = "encryptEnvelopEx";
  String DISPID_15_NAME = "decryptEnvelop";
  String DISPID_16_NAME = "decryptEnvelopEx";
  String DISPID_17_NAME = "createSignedEnvelop";
  String DISPID_18_NAME = "createSignedEnvelopEx";
  String DISPID_19_NAME = "verifySignedEnvelop";
  String DISPID_20_NAME = "verifySignedEnvelopEx";
  String DISPID_21_NAME = "getDataEx";
  String DISPID_22_NAME = "getFile";
  String DISPID_23_NAME = "getErrorCode";
  String DISPID_24_NAME = "getErrorMessage";
  String DISPID_25_NAME = "setCSP";
  String DISPID_26_NAME = "setPIN";
  String DISPID_27_NAME = "jITGetVersion";
  String DISPID_28_NAME = "getBase64Encode";
  String DISPID_29_NAME = "getBase64Decode";
  String DISPID_30_NAME = "getData";
  String DISPID_31_NAME = "attachSignStr";
  String DISPID_32_NAME = "detachSignStr";
  String DISPID_33_NAME = "verifyDetachedSignStr";
  String DISPID_34_NAME = "encryptEnvelopStr";
  String DISPID_35_NAME = "createSignedEnvelopStr";
}
