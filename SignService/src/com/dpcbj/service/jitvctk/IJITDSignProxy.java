package com.dpcbj.service.jitvctk;

import com.linar.jintegra.*;
/**
 * Proxy for COM Interface 'IJITDSign'. Generated 2013-4-15 16:12:31
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
public class IJITDSignProxy extends com.linar.jintegra.Dispatch implements com.dpcbj.service.jitvctk.IJITDSign, java.io.Serializable {

  protected String getJintegraVersion() { return "2.11"; }

  static { com.dpcbj.service.jitvctk.JIntegraInit.init(); }

  public static final Class targetClass = IJITDSign.class;

  public IJITDSignProxy(String CLSID, String host, AuthInfo authInfo) throws java.net.UnknownHostException, java.io.IOException{
    super(CLSID, IJITDSign.IID, host, authInfo);
  }

  /** For internal use only */
  public IJITDSignProxy() {}

  public IJITDSignProxy(Object obj) throws java.io.IOException {
    super(obj, IJITDSign.IID);
  }

  protected IJITDSignProxy(Object obj, String iid) throws java.io.IOException {
    super(obj, iid);
  }

  protected IJITDSignProxy(String CLSID, String iid, String host, AuthInfo authInfo) throws java.io.IOException {
    super(CLSID, iid, host, authInfo);
  }

  public void addListener(String iidStr, Object theListener, Object theSource) throws java.io.IOException {
    super.addListener(iidStr, theListener, theSource);
  }

  public void removeListener(String iidStr, Object theListener) throws java.io.IOException {
    super.removeListener(iidStr, theListener);
  }

  /**
   * getPropertyByName. Get the value of a property dynamically at run-time, based on its name
   *
   * @return    The value of the property.
   * @param     name The name of the property to get.
   * @exception java.lang.NoSuchFieldException If the property does not exit.
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public Object getPropertyByName(String name) throws NoSuchFieldException, java.io.IOException, com.linar.jintegra.AutomationException {
    com.linar.jintegra.Variant parameters[] = {};
    return super.invoke(name, super.getDispatchIdOfName(name), 2, parameters).getVARIANT();
  }

  /**
   * getPropertyByName. Get the value of a property dynamically at run-time, based on its name and a parameter value
   *
   * @return    The value of the property.
   * @param     name The name of the property to get.
   * @param     rhs Parameter used when getting the property.
   * @exception java.lang.NoSuchFieldException If the property does not exit.
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public Object getPropertyByName(String name, Object rhs) throws NoSuchFieldException, java.io.IOException, com.linar.jintegra.AutomationException {
    com.linar.jintegra.Variant parameters[] = {rhs == null ? new Variant("rhs", 10, 0x80020004L) : new Variant("rhs", 12, rhs)};
    return super.invoke(name, super.getDispatchIdOfName(name), 2, parameters).getVARIANT();
  }

  /**
   * invokeMethodByName. Invoke a method dynamically at run-time
   *
   * @return    The value returned by the method (null if none).
   * @param     name The name of the method to be invoked
   * @param     parameters One element for each parameter.  Use primitive type wrappers
   *            to pass primitive types (eg Integer to pass an int).
   * @exception java.lang.NoSuchMethodException If the method does not exit.
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public Object invokeMethodByName(String name, Object[] parameters) throws NoSuchMethodException, java.io.IOException, com.linar.jintegra.AutomationException {
    com.linar.jintegra.Variant variantParameters[] = new com.linar.jintegra.Variant[parameters.length];
    for(int i = 0; i < parameters.length; i++) {
      variantParameters[i] = parameters[i] == null ? new Variant("p" + i, 10, 0x80020004L) :
	                                                   new Variant("p" + i, 12, parameters[i]);
    }
    try {
      return super.invoke(name, super.getDispatchIdOfName(name), 1, variantParameters).getVARIANT();
    } catch(NoSuchFieldException nsfe) {
      throw new NoSuchMethodException("There is no method called " + name);
    }
  }

  /**
   * invokeMethodByName. Invoke a method dynamically at run-time
   *
   * @return    The value returned by the method (null if none).
   * @param     name The name of the method to be invoked
   * @exception java.lang.NoSuchMethodException If the method does not exit.
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public Object invokeMethodByName(String name) throws NoSuchMethodException, java.io.IOException, com.linar.jintegra.AutomationException {
      return invokeMethodByName(name, new Object[]{});
  }

  /**
   * getVersion. method GetVersion
   *
   * @return    The bstrResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getVersion  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    String zz_retVal[] = { null };
    Object zz_parameters[] = { zz_retVal };
    vtblInvoke("getVersion", 7, zz_parameters);
    return (String)zz_retVal[0];
  }

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
              String lpstrCertBase64) throws java.io.IOException, com.linar.jintegra.AutomationException{
    int zz_retVal[] = { 0 };
    Object zz_parameters[] = { lpstrCertType, lpstrDN, lpstrSN, lpstrEmail, lpstrDNIssuer, lpstrCertBase64, zz_retVal };
    vtblInvoke("setCert", 8, zz_parameters);
    return zz_retVal[0];
  }

  /**
   * setCertChooseType. 设置证书弹出方式
   *
   * @param     lType The lType (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int setCertChooseType  (
              int lType) throws java.io.IOException, com.linar.jintegra.AutomationException{
    int zz_retVal[] = { 0 };
    Object zz_parameters[] = { new Integer(lType), zz_retVal };
    vtblInvoke("setCertChooseType", 9, zz_parameters);
    return zz_retVal[0];
  }

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
              String pszOID) throws java.io.IOException, com.linar.jintegra.AutomationException{
    String zz_retVal[] = { null };
    Object zz_parameters[] = { pszCertType, new Integer(lInfoType), pszOID, zz_retVal };
    vtblInvoke("getCertInfo", 10, zz_parameters);
    return (String)zz_retVal[0];
  }

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
              String lpstrEncAlgo) throws java.io.IOException, com.linar.jintegra.AutomationException{
    int zz_retVal[] = { 0 };
    Object zz_parameters[] = { lpstrSignAlgo, lpstrEncAlgo, zz_retVal };
    vtblInvoke("setAlgorithm", 11, zz_parameters);
    return zz_retVal[0];
  }

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
              String pszSrcData) throws java.io.IOException, com.linar.jintegra.AutomationException{
    String zz_retVal[] = { null };
    Object zz_parameters[] = { lpstrDN, pszSrcData, zz_retVal };
    vtblInvoke("attachSign", 12, zz_parameters);
    return (String)zz_retVal[0];
  }

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
              String pszFileNameOut) throws java.io.IOException, com.linar.jintegra.AutomationException{
    String zz_retVal[] = { null };
    Object zz_parameters[] = { pszDN, pszFileName, pszFileNameOut, zz_retVal };
    vtblInvoke("attachSignEx", 13, zz_parameters);
    return (String)zz_retVal[0];
  }

  /**
   * verifyAttachedSign. 验证Attach签名
   *
   * @param     bstrSignedData The bstrSignedData (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int verifyAttachedSign  (
              String bstrSignedData) throws java.io.IOException, com.linar.jintegra.AutomationException{
    int zz_retVal[] = { 0 };
    Object zz_parameters[] = { bstrSignedData, zz_retVal };
    vtblInvoke("verifyAttachedSign", 14, zz_parameters);
    return zz_retVal[0];
  }

  /**
   * verifyAttachedSignEx. 验证Attach签名(从文件)
   *
   * @param     bstrFileNameAttached The bstrFileNameAttached (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int verifyAttachedSignEx  (
              String bstrFileNameAttached) throws java.io.IOException, com.linar.jintegra.AutomationException{
    int zz_retVal[] = { 0 };
    Object zz_parameters[] = { bstrFileNameAttached, zz_retVal };
    vtblInvoke("verifyAttachedSignEx", 15, zz_parameters);
    return zz_retVal[0];
  }

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
              String pszSrcData) throws java.io.IOException, com.linar.jintegra.AutomationException{
    String zz_retVal[] = { null };
    Object zz_parameters[] = { lpstrDN, pszSrcData, zz_retVal };
    vtblInvoke("detachSign", 16, zz_parameters);
    return (String)zz_retVal[0];
  }

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
              String pszFileNameOut) throws java.io.IOException, com.linar.jintegra.AutomationException{
    String zz_retVal[] = { null };
    Object zz_parameters[] = { pszDN, pszFileName, pszFileNameOut, zz_retVal };
    vtblInvoke("detachSignEx", 17, zz_parameters);
    return (String)zz_retVal[0];
  }

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
              String pszSrcData) throws java.io.IOException, com.linar.jintegra.AutomationException{
    int zz_retVal[] = { 0 };
    Object zz_parameters[] = { pszSignedData, pszSrcData, zz_retVal };
    vtblInvoke("verifyDetachedSign", 18, zz_parameters);
    return zz_retVal[0];
  }

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
              String pszFileName) throws java.io.IOException, com.linar.jintegra.AutomationException{
    int zz_retVal[] = { 0 };
    Object zz_parameters[] = { pszSignedData, pszFileNameDetached, pszFileName, zz_retVal };
    vtblInvoke("verifyDetachedSignEx", 19, zz_parameters);
    return zz_retVal[0];
  }

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
              String pszSrcData) throws java.io.IOException, com.linar.jintegra.AutomationException{
    String zz_retVal[] = { null };
    Object zz_parameters[] = { pszDN, pszSrcData, zz_retVal };
    vtblInvoke("encryptEnvelop", 20, zz_parameters);
    return (String)zz_retVal[0];
  }

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
              String pszFileNameOut) throws java.io.IOException, com.linar.jintegra.AutomationException{
    String zz_retVal[] = { null };
    Object zz_parameters[] = { pszDN, pszFileName, pszFileNameOut, zz_retVal };
    vtblInvoke("encryptEnvelopEx", 21, zz_parameters);
    return (String)zz_retVal[0];
  }

  /**
   * decryptEnvelop. 解密数字信封
   *
   * @param     pszEvpContent The pszEvpContent (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int decryptEnvelop  (
              String pszEvpContent) throws java.io.IOException, com.linar.jintegra.AutomationException{
    int zz_retVal[] = { 0 };
    Object zz_parameters[] = { pszEvpContent, zz_retVal };
    vtblInvoke("decryptEnvelop", 22, zz_parameters);
    return zz_retVal[0];
  }

  /**
   * decryptEnvelopEx. 解密数字信封(从文件
   *
   * @param     bstrEvpFile The bstrEvpFile (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int decryptEnvelopEx  (
              String bstrEvpFile) throws java.io.IOException, com.linar.jintegra.AutomationException{
    int zz_retVal[] = { 0 };
    Object zz_parameters[] = { bstrEvpFile, zz_retVal };
    vtblInvoke("decryptEnvelopEx", 23, zz_parameters);
    return zz_retVal[0];
  }

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
              String pVarSrcData) throws java.io.IOException, com.linar.jintegra.AutomationException{
    String zz_retVal[] = { null };
    Object zz_parameters[] = { bstrSignCertDN, bstrEncCertDN, pVarSrcData, zz_retVal };
    vtblInvoke("createSignedEnvelop", 24, zz_parameters);
    return (String)zz_retVal[0];
  }

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
              String bstrFileNameOut) throws java.io.IOException, com.linar.jintegra.AutomationException{
    String zz_retVal[] = { null };
    Object zz_parameters[] = { bstrSignCertDN, bstrEncCertDN, pbstrFileName, bstrFileNameOut, zz_retVal };
    vtblInvoke("createSignedEnvelopEx", 25, zz_parameters);
    return (String)zz_retVal[0];
  }

  /**
   * verifySignedEnvelop. 解密并验证带签名数字信封
   *
   * @param     bstrEnvelop The bstrEnvelop (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int verifySignedEnvelop  (
              String bstrEnvelop) throws java.io.IOException, com.linar.jintegra.AutomationException{
    int zz_retVal[] = { 0 };
    Object zz_parameters[] = { bstrEnvelop, zz_retVal };
    vtblInvoke("verifySignedEnvelop", 26, zz_parameters);
    return zz_retVal[0];
  }

  /**
   * verifySignedEnvelopEx. 解密并验证带签名数字信封(从文件)
   *
   * @param     bstrEvpFile The bstrEvpFile (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int verifySignedEnvelopEx  (
              String bstrEvpFile) throws java.io.IOException, com.linar.jintegra.AutomationException{
    int zz_retVal[] = { 0 };
    Object zz_parameters[] = { bstrEvpFile, zz_retVal };
    vtblInvoke("verifySignedEnvelopEx", 27, zz_parameters);
    return zz_retVal[0];
  }

  /**
   * getBase64Encode. Base64编码函数
   *
   * @param     bstrSrcData The bstrSrcData (in)
   * @return    The bstrResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getBase64Encode  (
              String bstrSrcData) throws java.io.IOException, com.linar.jintegra.AutomationException{
    String zz_retVal[] = { null };
    Object zz_parameters[] = { bstrSrcData, zz_retVal };
    vtblInvoke("getBase64Encode", 28, zz_parameters);
    return (String)zz_retVal[0];
  }

  /**
   * getBase64Decode. Base64解码函数
   *
   * @param     bstrBase64Data The bstrBase64Data (in)
   * @return    The bstrResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getBase64Decode  (
              String bstrBase64Data) throws java.io.IOException, com.linar.jintegra.AutomationException{
    String zz_retVal[] = { null };
    Object zz_parameters[] = { bstrBase64Data, zz_retVal };
    vtblInvoke("getBase64Decode", 29, zz_parameters);
    return (String)zz_retVal[0];
  }

  /**
   * getErrorCode. 获取错误码
   *
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int getErrorCode  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    int zz_retVal[] = { 0 };
    Object zz_parameters[] = { zz_retVal };
    vtblInvoke("getErrorCode", 30, zz_parameters);
    return zz_retVal[0];
  }

  /**
   * getBase64HashEnCode. ***** 保留接口, 未实现 *****
   *
   * @param     bstrSrcData The bstrSrcData (in)
   * @return    The bstrResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getBase64HashEnCode  (
              String bstrSrcData) throws java.io.IOException, com.linar.jintegra.AutomationException{
    String zz_retVal[] = { null };
    Object zz_parameters[] = { bstrSrcData, zz_retVal };
    vtblInvoke("getBase64HashEnCode", 31, zz_parameters);
    return (String)zz_retVal[0];
  }

  /**
   * getErrorMessage. 获取错误描述
   *
   * @return    The bstrResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getErrorMessage  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    String zz_retVal[] = { null };
    Object zz_parameters[] = { zz_retVal };
    vtblInvoke("getErrorMessage", 32, zz_parameters);
    return (String)zz_retVal[0];
  }

  /**
   * getData. 获取原文数据
   *
   * @return    The bstrResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getData  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    String zz_retVal[] = { null };
    Object zz_parameters[] = { zz_retVal };
    vtblInvoke("getData", 33, zz_parameters);
    return (String)zz_retVal[0];
  }

  /**
   * getFile. 保存原文到指定路径
   *
   * @param     bstrFileSavePath The bstrFileSavePath (in)
   * @return    The bstrResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public String getFile  (
              String bstrFileSavePath) throws java.io.IOException, com.linar.jintegra.AutomationException{
    String zz_retVal[] = { null };
    Object zz_parameters[] = { bstrFileSavePath, zz_retVal };
    vtblInvoke("getFile", 34, zz_parameters);
    return (String)zz_retVal[0];
  }

  /**
   * addData. ***** 保留接口, 未实现 *****
   *
   * @param     bstrSrcData The bstrSrcData (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int addData  (
              String bstrSrcData) throws java.io.IOException, com.linar.jintegra.AutomationException{
    int zz_retVal[] = { 0 };
    Object zz_parameters[] = { bstrSrcData, zz_retVal };
    vtblInvoke("addData", 35, zz_parameters);
    return zz_retVal[0];
  }

  /**
   * addFile. ***** 保留接口, 未实现 *****
   *
   * @param     bstrSrcFile The bstrSrcFile (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int addFile  (
              String bstrSrcFile) throws java.io.IOException, com.linar.jintegra.AutomationException{
    int zz_retVal[] = { 0 };
    Object zz_parameters[] = { bstrSrcFile, zz_retVal };
    vtblInvoke("addFile", 36, zz_parameters);
    return zz_retVal[0];
  }

  /**
   * setCSP. 设置CSP名称
   *
   * @param     pszProvider The pszProvider (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int setCSP  (
              String pszProvider) throws java.io.IOException, com.linar.jintegra.AutomationException{
    int zz_retVal[] = { 0 };
    Object zz_parameters[] = { pszProvider, zz_retVal };
    vtblInvoke("setCSP", 37, zz_parameters);
    return zz_retVal[0];
  }

  /**
   * setPIN. 设置PIN码
   *
   * @param     pszPIN The pszPIN (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int setPIN  (
              String pszPIN) throws java.io.IOException, com.linar.jintegra.AutomationException{
    int zz_retVal[] = { 0 };
    Object zz_parameters[] = { pszPIN, zz_retVal };
    vtblInvoke("setPIN", 38, zz_parameters);
    return zz_retVal[0];
  }

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
              int lInfoType) throws java.io.IOException, com.linar.jintegra.AutomationException{
    String zz_retVal[] = { null };
    Object zz_parameters[] = { lpszType, lpszDN, lpszSN, lpszEmail, lpszIssuer, new Integer(lInfoType), zz_retVal };
    vtblInvoke("getCertList", 39, zz_parameters);
    return (String)zz_retVal[0];
  }

  /**
   * setErrMsgLanguage. ***** 保留接口, 未实现 *****
   *
   * @param     lpzLangType The lpzLangType (in)
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int setErrMsgLanguage  (
              String lpzLangType) throws java.io.IOException, com.linar.jintegra.AutomationException{
    int zz_retVal[] = { 0 };
    Object zz_parameters[] = { lpzLangType, zz_retVal };
    vtblInvoke("setErrMsgLanguage", 40, zz_parameters);
    return zz_retVal[0];
  }

  /**
   * clearPIN. ***** 保留接口, 未实现 *****
   *
   * @return    The lResult
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int clearPIN  () throws java.io.IOException, com.linar.jintegra.AutomationException{
    int zz_retVal[] = { 0 };
    Object zz_parameters[] = { zz_retVal };
    vtblInvoke("clearPIN", 41, zz_parameters);
    return zz_retVal[0];
  }

  /** Dummy reference from interface to proxy to make sure proxy gets compiled */
  static final int xxDummy = 0;

  static {
    com.linar.jintegra.InterfaceDesc.add("bd6e3733-66b4-4bd8-ada1-64f1f6b508ac", com.dpcbj.service.jitvctk.IJITDSignProxy.class, null, 7, new com.linar.jintegra.MemberDesc[] {
        new com.linar.jintegra.MemberDesc("getVersion",
            new Class[] { },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("bstrResult", 8, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("setCert",
            new Class[] { String.class, String.class, String.class, String.class, String.class, String.class, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("lpstrCertType", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("lpstrDN", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("lpstrSN", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("lpstrEmail", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("lpstrDNIssuer", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("lpstrCertBase64", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("lResult", 3, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("setCertChooseType",
            new Class[] { Integer.TYPE, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("lType", 3, 2, 8, null, null), 
              new com.linar.jintegra.Param("lResult", 3, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("getCertInfo",
            new Class[] { String.class, Integer.TYPE, String.class, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("pszCertType", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("lInfoType", 3, 2, 8, null, null), 
              new com.linar.jintegra.Param("pszOID", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("bstrResult", 8, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("setAlgorithm",
            new Class[] { String.class, String.class, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("lpstrSignAlgo", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("lpstrEncAlgo", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("lResult", 3, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("attachSign",
            new Class[] { String.class, String.class, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("lpstrDN", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("pszSrcData", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("bstrResult", 8, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("attachSignEx",
            new Class[] { String.class, String.class, String.class, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("pszDN", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("pszFileName", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("pszFileNameOut", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("bstrResult", 8, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("verifyAttachedSign",
            new Class[] { String.class, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("bstrSignedData", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("lResult", 3, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("verifyAttachedSignEx",
            new Class[] { String.class, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("bstrFileNameAttached", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("lResult", 3, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("detachSign",
            new Class[] { String.class, String.class, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("lpstrDN", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("pszSrcData", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("bstrResult", 8, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("detachSignEx",
            new Class[] { String.class, String.class, String.class, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("pszDN", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("pszFileName", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("pszFileNameOut", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("bstrResult", 8, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("verifyDetachedSign",
            new Class[] { String.class, String.class, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("pszSignedData", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("pszSrcData", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("lResult", 3, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("verifyDetachedSignEx",
            new Class[] { String.class, String.class, String.class, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("pszSignedData", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("pszFileNameDetached", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("pszFileName", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("lResult", 3, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("encryptEnvelop",
            new Class[] { String.class, String.class, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("pszDN", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("pszSrcData", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("bstrResult", 8, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("encryptEnvelopEx",
            new Class[] { String.class, String.class, String.class, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("pszDN", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("pszFileName", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("pszFileNameOut", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("bstrResult", 8, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("decryptEnvelop",
            new Class[] { String.class, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("pszEvpContent", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("lResult", 3, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("decryptEnvelopEx",
            new Class[] { String.class, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("bstrEvpFile", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("lResult", 3, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("createSignedEnvelop",
            new Class[] { String.class, String.class, String.class, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("bstrSignCertDN", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("bstrEncCertDN", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("pVarSrcData", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("bstrResult", 8, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("createSignedEnvelopEx",
            new Class[] { String.class, String.class, String.class, String.class, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("bstrSignCertDN", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("bstrEncCertDN", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("pbstrFileName", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("bstrFileNameOut", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("bstrResult", 8, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("verifySignedEnvelop",
            new Class[] { String.class, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("bstrEnvelop", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("lResult", 3, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("verifySignedEnvelopEx",
            new Class[] { String.class, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("bstrEvpFile", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("lResult", 3, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("getBase64Encode",
            new Class[] { String.class, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("bstrSrcData", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("bstrResult", 8, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("getBase64Decode",
            new Class[] { String.class, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("bstrBase64Data", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("bstrResult", 8, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("getErrorCode",
            new Class[] { },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("lResult", 3, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("getBase64HashEnCode",
            new Class[] { String.class, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("bstrSrcData", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("bstrResult", 8, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("getErrorMessage",
            new Class[] { },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("bstrResult", 8, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("getData",
            new Class[] { },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("bstrResult", 8, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("getFile",
            new Class[] { String.class, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("bstrFileSavePath", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("bstrResult", 8, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("addData",
            new Class[] { String.class, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("bstrSrcData", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("lResult", 3, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("addFile",
            new Class[] { String.class, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("bstrSrcFile", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("lResult", 3, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("setCSP",
            new Class[] { String.class, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("pszProvider", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("lResult", 3, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("setPIN",
            new Class[] { String.class, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("pszPIN", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("lResult", 3, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("getCertList",
            new Class[] { String.class, String.class, String.class, String.class, String.class, Integer.TYPE, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("lpszType", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("lpszDN", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("lpszSN", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("lpszEmail", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("lpszIssuer", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("lInfoType", 3, 2, 8, null, null), 
              new com.linar.jintegra.Param("bstrResult", 8, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("setErrMsgLanguage",
            new Class[] { String.class, },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("lpzLangType", 8, 2, 8, null, null), 
              new com.linar.jintegra.Param("lResult", 3, 20, 8, null, null) }),
        new com.linar.jintegra.MemberDesc("clearPIN",
            new Class[] { },
            new com.linar.jintegra.Param[] { 
              new com.linar.jintegra.Param("lResult", 3, 20, 8, null, null) }),
});  }
}
