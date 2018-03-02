package ʵ����;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChineseAndEnglish {

    

    // GENERAL_PUNCTUATION �ж����ĵ�"��

    // CJK_SYMBOLS_AND_PUNCTUATION �ж����ĵġ���

    // HALFWIDTH_AND_FULLWIDTH_FORMS �ж����ĵģ���

 

  /**

   * �Ƿ�������

   * @param c

   * @return

   */

   public static boolean isChinese(char c) {

        Character.UnicodeBlock ub = Character.UnicodeBlock.of(c);

        if (ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS

                || ub == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS

                || ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A

                || ub == Character.UnicodeBlock.GENERAL_PUNCTUATION

                || ub == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION

                || ub == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS) {
                

            return true;

        }

        return false;

    }

  /**

   * �Ƿ���Ӣ��

   * @param c

   * @return

   */

   public static boolean isEnglish(String charaString){

      return charaString.matches("^[a-zA-Z]*");

    }

  public static boolean isChinese(String str){

      String regEx = "[\\u4e00-\\u9fa5]+";

      Pattern p = Pattern.compile(regEx);

      Matcher m = p.matcher(str);

     if(m.find())

       return true;

     else

       return false;

   }

  
}