package com.va.baseproject.common.constants;

/**
 * @author anhnv
 * @version 1.0
 */
public class RegexConstant {

  public static final String WHOLE_NUMBERS = "^\\d+$";

  public static final String DECIMAL_NUMBERS = "^\\d*\\.\\d+$";

  public static final String WHOLE_DECIMAL_NUMBERS = "^\\d*(\\.\\d+)?$";

  public static final String NEGATIVE_POSITIVE_WHOLE_DECIMAL_NUMBERS = "^-?\\d*(\\.\\d+)?$";

  public static final String WHOLE_DECIMAL_FRACTIONS =
      "[-]?[0-9]+[,.]?[0-9]*([\\/][0-9]+[,.]?[0-9]*)*";

  public static final String ALPHANUMERIC_WITHOUT_SPACE = "^[a-zA-Z0-9]*$";

  public static final String ALPHANUMERIC_WITH_SPACE = "^[a-zA-Z0-9 ]*$";

  public static final String COMMON_EMAIL = "^([a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6})*$";

  public static final String UNCOMMON_EMAIL =
      "^([a-z0-9_\\.\\+-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$";

  // Should have 1 lowercase letter, 1 uppercase letter, 1 number, 1 special character and be at
  // least 8 characters long
  public static final String PASSWORD_COMPLEX =
      "(?=(.*[0-9]))(?=.*[\\!@#$%^&*()\\\\[\\]{}\\-_+=~`|:;\"'<>,./?])(?=.*[a-z])(?=(.*[A-Z]))(?=(.*)).{8,}";

  // Should have 1 lowercase letter, 1 uppercase letter, 1 number, and be at least 8 characters long
  public static final String PASSWORD_MODERATE =
      "(?=(.*[0-9]))((?=.*[A-Za-z0-9])(?=.*[A-Z])(?=.*[a-z]))^.{8,}$";

  public static final String URL_INCLUDE_PROTOCOL =
      "https?:\\/\\/(www\\.)?[-a-zA-Z0-9@:%._\\+~#=]{2,256}\\.[a-z]{2,6}\\b([-a-zA-Z0-9@:%_\\+.~#()?&//=]*)";

  public static final String URL_PROTOCOL_OPTIONAL =
      "(https?:\\/\\/)?(www\\.)?[-a-zA-Z0-9@:%._\\+~#=]{2,256}\\.[a-z]{2,6}\\b([-a-zA-Z0-9@:%_\\+.~#?&//=]*)";

  public static final String IPV4_ADDRESS =
      "^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$";

  public static final String IPV6_ADDRESS =
      "(([0-9a-fA-F]{1,4}:){7,7}[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,7}:|([0-9a-fA-F]{1,4}:){1,6}:[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,5}(:[0-9a-fA-F]{1,4}){1,2}|([0-9a-fA-F]{1,4}:){1,4}(:[0-9a-fA-F]{1,4}){1,3}|([0-9a-fA-F]{1,4}:){1,3}(:[0-9a-fA-F]{1,4}){1,4}|([0-9a-fA-F]{1,4}:){1,2}(:[0-9a-fA-F]{1,4}){1,5}|[0-9a-fA-F]{1,4}:((:[0-9a-fA-F]{1,4}){1,6})|:((:[0-9a-fA-F]{1,4}){1,7}|:)|fe80:(:[0-9a-fA-F]{0,4}){0,4}%[0-9a-zA-Z]{1,}|::(ffff(:0{1,4}){0,1}:){0,1}((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])\\.){3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])|([0-9a-fA-F]{1,4}:){1,4}:((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])\\.){3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9]))";

  public static final String IPV4_OR_IPV6_ADDRESS =
      "((^\\s*((([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]))\\s*$)|(^\\s*((([0-9A-Fa-f]{1,4}:){7}([0-9A-Fa-f]{1,4}|:))|(([0-9A-Fa-f]{1,4}:){6}(:[0-9A-Fa-f]{1,4}|((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3})|:))|(([0-9A-Fa-f]{1,4}:){5}(((:[0-9A-Fa-f]{1,4}){1,2})|:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3})|:))|(([0-9A-Fa-f]{1,4}:){4}(((:[0-9A-Fa-f]{1,4}){1,3})|((:[0-9A-Fa-f]{1,4})?:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){3}(((:[0-9A-Fa-f]{1,4}){1,4})|((:[0-9A-Fa-f]{1,4}){0,2}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){2}(((:[0-9A-Fa-f]{1,4}){1,5})|((:[0-9A-Fa-f]{1,4}){0,3}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){1}(((:[0-9A-Fa-f]{1,4}){1,6})|((:[0-9A-Fa-f]{1,4}){0,4}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(:(((:[0-9A-Fa-f]{1,4}){1,7})|((:[0-9A-Fa-f]{1,4}){0,5}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:)))(%.+)?\\s*$))";

  public static final String INTERNATIONAL_PHONE_NUMBERS =
      "^(?:(?:\\(?(?:00|\\+)([1-4]\\d\\d|[1-9]\\d?)\\)?)?[\\-\\.\\ \\\\\\/]?)?((?:\\(?\\d{1,}\\)?[\\-\\.\\ \\\\\\/]?){0,})(?:[\\-\\.\\ \\\\\\/]?(?:#|ext\\.?|extension|x)[\\-\\.\\ \\\\\\/]?(\\d+))?$";

  // example 2021-01-31
  public static final String DATE_FORMAT_YYYY_MM_DD =
      "([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))";

  // example 31-01-2021
  public static final String DATE_FORMAT_DD_MM_YYYY =
      "((0[1-9]|[12]\\d|3[01])-(0[1-9]|1[0-2])-[12]\\d{3})";

  // example 01-31-2021
  public static final String DATE_FORMAT_MM_DD_YYYY =
      "((0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01])-[12]\\d{3})";

  // example 01-2021
  public static final String DATE_FORMAT_MM_YYYY = "((0[1-9]|1[0-2])-[12]\\d{3})";

  // example 2021/01/31
  public static final String DATE_FORMAT_YYYY_MM_DD_STROKE =
      "([12]\\d{3}\\/(0[1-9]|1[0-2])\\/(0[1-9]|[12]\\d|3[01]))";

  // example 31/01/2021
  public static final String DATE_FORMAT_DD_MM_YYYY_STROKE =
      "((0[1-9]|[12]\\d|3[01])\\/(0[1-9]|1[0-2])\\/[12]\\d{3})";

  // example 01/31/2021
  public static final String DATE_FORMAT_MM_DD_YYYY_STROKE =
      "((0[1-9]|1[0-2])\\/(0[1-9]|[12]\\d|3[01])\\/[12]\\d{3})";

  // example 01/2021
  public static final String DATE_FORMAT_MM_YYYY_STROKE = "((0[1-9]|1[0-2])\\/[12]\\d{3})";

  // example 23:59
  public static final String TINE_FORMAT_HH_MM_24H = "^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$";

  // example 11:59
  public static final String TINE_FORMAT_HH_MM_12H = "^(0[1-9]|1[0-2]):[0-5][0-9]$";

  // example 11:59:59
  public static final String TINE_FORMAT_HH_MM_SS_12H = "^(0[1-9]|1[0-2]):[0-5][0-9]:[0-5][0-9]$";

  // example 23:59:59
  public static final String TINE_FORMAT_HH_MM_SS_24H =
      "^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]$";

  public static final String PASSPORT = "^[A-PR-WY][1-9]\\d\\s?\\d{4}[1-9]$";

  public static final String VISA = "^4[0-9]{12}(?:[0-9]{3})?$";

  public static final String MASTERCARD =
      "^(?:5[1-5][0-9]{2}|222[1-9]|22[3-9][0-9]|2[3-6][0-9]{2}|27[01][0-9]|2720)[0-9]{12}$";

  public static final String JCB = "^(?:2131|1800|35\\d{3})\\d{11}$";

  private RegexConstant() {
    throw new IllegalStateException("Utility class");
  }
}
