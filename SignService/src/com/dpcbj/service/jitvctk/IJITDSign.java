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
   * setCert. ָ��Ψһ֤��
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
   * setCertChooseType. ����֤�鵯����ʽ
   *
   * @param     lType The lType (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int setCertChooseType  (
              int lType) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getCertInfo. ��ȡ֤����Ϣ
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
   * setAlgorithm. �����㷨
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
   * attachSign. Attachǩ��
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
   * attachSignEx. Attachǩ��(���ļ�)
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
   * verifyAttachedSign. ��֤Attachǩ��
   *
   * @param     bstrSignedData The bstrSignedData (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int verifyAttachedSign  (
              String bstrSignedData) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * verifyAttachedSignEx. ��֤Attachǩ��(���ļ�)
   *
   * @param     bstrFileNameAttached The bstrFileNameAttached (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int verifyAttachedSignEx  (
              String bstrFileNameAttached) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * detachSign. Detachǩ��
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
   * detachSignEx. Detachǩ��(���ļ�)
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
   * verifyDetachedSign. ��֤Detachǩ��
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
   * verifyDetachedSignEx. ��֤Detachǩ��(���ļ�)
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
   * encryptEnvelop. ���������ŷ�
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
   * encryptEnvelopEx. ���������ŷ�(���ļ�)
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
   * decryptEnvelop. ���������ŷ�
   *
   * @param     pszEvpContent The pszEvpContent (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int decryptEnvelop  (
              String pszEvpContent) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * decryptEnvelopEx. ���������ŷ�(���ļ�
   *
   * @param     bstrEvpFile The bstrEvpFile (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int decryptEnvelopEx  (
              String bstrEvpFile) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * createSignedEnvelop. ������ǩ�������ŷ�
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
   * createSignedEnvelopEx. ������ǩ�������ŷ�(���ļ�)
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
   * verifySignedEnvelop. ���ܲ���֤��ǩ�������ŷ�
   *
   * @param     bstrEnvelop The bstrEnvelop (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int verifySignedEnvelop  (
              String bstrEnvelop) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * verifySignedEnvelopEx. ���ܲ���֤��ǩ�������ŷ�(���ļ�)
   *
   * @param     bstrEvpFile The bstrEvpFile (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int verifySignedEnvelopEx  (
              String bstrEvpFile) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getBase64Encode. Base64���뺯��
   *
   * @param     bstrSrcData The bstrSrcData (in)
   * @return    The bstrResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getBase64Encode  (
              String bstrSrcData) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getBase64Decode. Base64���뺯��
   *
   * @param     bstrBase64Data The bstrBase64Data (in)
   * @return    The bstrResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getBase64Decode  (
              String bstrBase64Data) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getErrorCode. ��ȡ������
   *
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int getErrorCode  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getBase64HashEnCode. ***** �����ӿ�, δʵ�� *****
   *
   * @param     bstrSrcData The bstrSrcData (in)
   * @return    The bstrResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getBase64HashEnCode  (
              String bstrSrcData) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getErrorMessage. ��ȡ��������
   *
   * @return    The bstrResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getErrorMessage  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getData. ��ȡԭ������
   *
   * @return    The bstrResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getData  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getFile. ����ԭ�ĵ�ָ��·��
   *
   * @param     bstrFileSavePath The bstrFileSavePath (in)
   * @return    The bstrResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getFile  (
              String bstrFileSavePath) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * addData. ***** �����ӿ�, δʵ�� *****
   *
   * @param     bstrSrcData The bstrSrcData (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int addData  (
              String bstrSrcData) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * addFile. ***** �����ӿ�, δʵ�� *****
   *
   * @param     bstrSrcFile The bstrSrcFile (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int addFile  (
              String bstrSrcFile) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * setCSP. ����CSP����
   *
   * @param     pszProvider The pszProvider (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int setCSP  (
              String pszProvider) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * setPIN. ����PIN��
   *
   * @param     pszPIN The pszPIN (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int setPIN  (
              String pszPIN) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getCertList. ***** �����ӿ�, δʵ�� *****
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
   * setErrMsgLanguage. ***** �����ӿ�, δʵ�� *****
   *
   * @param     lpzLangType The lpzLangType (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int setErrMsgLanguage  (
              String lpzLangType) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * clearPIN. ***** �����ӿ�, δʵ�� *****
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
