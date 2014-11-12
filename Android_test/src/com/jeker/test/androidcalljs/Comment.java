package com.jeker.test.androidcalljs;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import android.content.Context;

public class Comment {
    
    
    
    public  static  final String HTML_HEAD1=" <!DOCTYPE html PUBLIC \"-//WAPFORUM//DTD XHTML Mobile 1.0//EN\" \"http://www.wapforum.org/DTD/xhtml-mobile10.dtd \">";
    public  static  final String HTML_HEAD2="<html xmlns=\"http://www.w3.org/1999/xhtml \">";
    public  static  final String HTML_HEAD3="<head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />";
    public  static  final String HTML_HEAD4="<script language=\"javascript\" type=\"text/javascript\">";
    
    public  static  final String HTML_BODY="function AndroidCallJs(str1,str2){var result = execute(str1,str2);send2Android(result);} function send2Android(str){window.myjs.runOnAndroidJavaScript(str);}  ";
    
//    public  static  final String HTML_BODY="function AndroidCallJs(str1,str2){var result = execute(str1,str2);send2Android(result);}function send2Android(str){window.myjs.runOnAndroidJavaScript(str);}  function execute(str1,str2){var result=str1+str2;return result; }";

     
    
    public  static  final String HTML_HEAD5="</script></head></html>";
    
    
//    public  static  final String JS_FUNCTION="function execute_0_0() {\r\n\tvar input = arguments[0];\r\n\tvar array = new Array('101','109');\r\n\tfunction contains(list, item) {\r\n\t\tvar x;\r\n\t\tfor (x in list) {\r\n\t\t\tif (list[x] === item) {\r\n\t\t\t\treturn true;\r\n\t\t\t}\r\n\t\t}\r\n\t\tif (item.length > 3) {\r\n\t\t\treturn contains(list, item.substring(0, item.length-3));\r\n\t\t}\r\n\t\treturn false;\r\n\t}\r\n\treturn contains(array, input);\r\n}\nfunction execute_0_1() {\r\n\treturn 5;\r\n}\nfunction execute_0_2() {\r\n\treturn 0.0;\r\n}\nfunction execute_0() {\r\n\treturn execute_0_0.apply(this, arguments) ? execute_0_1.apply(this, arguments) : execute_0_2.apply(this, arguments);\r\n}\nfunction execute_1_0() {\r\n\tvar input = arguments[0];\r\n\tvar array = new Array('103');\r\n\tfunction contains(list, item) {\r\n\t\tvar x;\r\n\t\tfor (x in list) {\r\n\t\t\tif (list[x] === item) {\r\n\t\t\t\treturn true;\r\n\t\t\t}\r\n\t\t}\r\n\t\tif (item.length > 3) {\r\n\t\t\treturn contains(list, item.substring(0, item.length-3));\r\n\t\t}\r\n\t\treturn false;\r\n\t}\r\n\treturn contains(array, input);\r\n}\nfunction execute_1_1() {\r\n\tvar result, input = arguments[1];\r\n\twith(Math) {\r\n\t\tresult = round((0.06 * input)*pow(10,2))\/pow(10,2);\r\n\t}\r\n\treturn result;\r\n}\nfunction execute_1_2() {\r\n\treturn 0.0;\r\n}\nfunction execute_1() {\r\n\treturn execute_1_0.apply(this, arguments) ? execute_1_1.apply(this, arguments) : execute_1_2.apply(this, arguments);\r\n}\nfunction execute_2_0() {\r\n\tvar input = arguments[0];\r\n\tvar array = new Array('104111');\r\n\tfunction contains(list, item) {\r\n\t\tvar x;\r\n\t\tfor (x in list) {\r\n\t\t\tif (list[x] === item) {\r\n\t\t\t\treturn true;\r\n\t\t\t}\r\n\t\t}\r\n\t\tif (item.length > 3) {\r\n\t\t\treturn contains(list, item.substring(0, item.length-3));\r\n\t\t}\r\n\t\treturn false;\r\n\t}\r\n\treturn contains(array, input);\r\n}\nfunction execute_2_1() {\r\n\tvar input = arguments[1], result = 0;\r\n\tif ((input + 0) >= 300) {\r\n\t\tresult = 50;\r\n\t} else if ((input + 0) >= 200) {\r\n\t\tresult = 30;\r\n\t} else if ((input + 0) >= 100) {\r\n\t\tresult = 10;\r\n\t}\r\n\treturn result;\r\n}\nfunction execute_2_2() {\r\n\treturn 0.0;\r\n}\nfunction execute_2() {\r\n\treturn execute_2_0.apply(this, arguments) ? execute_2_1.apply(this, arguments) : execute_2_2.apply(this, arguments);\r\n}\nfunction execute_3_0_0() {\r\n\tvar input = arguments[0];\r\n\tvar array = new Array('105111','105112');\r\n\tfunction contains(list, item) {\r\n\t\tvar x;\r\n\t\tfor (x in list) {\r\n\t\t\tif (list[x] === item) {\r\n\t\t\t\treturn true;\r\n\t\t\t}\r\n\t\t}\r\n\t\tif (item.length > 3) {\r\n\t\t\treturn contains(list, item.substring(0, item.length-3));\r\n\t\t}\r\n\t\treturn false;\r\n\t}\r\n\treturn contains(array, input);\r\n}\nfunction execute_3_0_1() {\r\n\tvar input = 0;\r\n\treturn (input + 0) === 0;\r\n}\nfunction execute_3_0() {\r\n\treturn execute_3_0_0.apply(this, arguments) && execute_3_0_1.apply(this, arguments);\r\n}\nfunction execute_3_1() {\r\n\treturn 10;\r\n}\nfunction execute_3_2() {\r\n\treturn 0.0;\r\n}\nfunction execute_3() {\r\n\treturn execute_3_0.apply(this, arguments) ? execute_3_1.apply(this, arguments) : execute_3_2.apply(this, arguments);\r\n}\nfunction execute_4_0_0() {\r\n\tvar input = arguments[0];\r\n\tvar array = new Array('105113');\r\n\tfunction contains(list, item) {\r\n\t\tvar x;\r\n\t\tfor (x in list) {\r\n\t\t\tif (list[x] === item) {\r\n\t\t\t\treturn true;\r\n\t\t\t}\r\n\t\t}\r\n\t\tif (item.length > 3) {\r\n\t\t\treturn contains(list, item.substring(0, item.length-3));\r\n\t\t}\r\n\t\treturn false;\r\n\t}\r\n\treturn contains(array, input);\r\n}\nfunction execute_4_0_1() {\r\n\tvar input = 0;\r\n\treturn (input + 0) === 0;\r\n}\nfunction execute_4_0() {\r\n\treturn execute_4_0_0.apply(this, arguments) && execute_4_0_1.apply(this, arguments);\r\n}\nfunction execute_4_1() {\r\n\tvar result, input = arguments[1];\r\n\twith(Math) {\r\n\t\tresult = round((0.08 * input)*pow(10,2))\/pow(10,2);\r\n\t}\r\n\treturn result;\r\n}\nfunction execute_4_2() {\r\n\treturn 0.0;\r\n}\nfunction execute_4() {\r\n\treturn execute_4_0.apply(this, arguments) ? execute_4_1.apply(this, arguments) : execute_4_2.apply(this, arguments);\r\n}\nfunction execute_5_0_0() {\r\n\tvar input = arguments[0];\r\n\tvar array = new Array('104114');\r\n\tfunction contains(list, item) {\r\n\t\tvar x;\r\n\t\tfor (x in list) {\r\n\t\t\tif (list[x] === item) {\r\n\t\t\t\treturn true;\r\n\t\t\t}\r\n\t\t}\r\n\t\tif (item.length > 3) {\r\n\t\t\treturn contains(list, item.substring(0, item.length-3));\r\n\t\t}\r\n\t\treturn false;\r\n\t}\r\n\treturn contains(array, input);\r\n}\nfunction execute_5_0_1() {\r\n\tvar input = 0;\r\n\treturn (input + 0) === 0;\r\n}\nfunction execute_5_0() {\r\n\treturn execute_5_0_0.apply(this, arguments) && execute_5_0_1.apply(this, arguments);\r\n}\nfunction execute_5_1() {\r\n\tvar input = arguments[1], result = 0;\r\n\tif ((input + 0) >= 150) {\r\n\t\tresult = 50;\r\n\t} else if ((input + 0) >= 100) {\r\n\t\tresult = 30;\r\n\t} else if ((input + 0) >= 50) {\r\n\t\tresult = 10;\r\n\t}\r\n\treturn result;\r\n}\nfunction execute_5_2() {\r\n\treturn 0.0;\r\n}\nfunction execute_5() {\r\n\treturn execute_5_0.apply(this, arguments) ? execute_5_1.apply(this, arguments) : execute_5_2.apply(this, arguments);\r\n}\nfunction execute_6_0() {\r\n\tvar input = arguments[0];\r\n\tvar array = new Array('108');\r\n\tfunction contains(list, item) {\r\n\t\tvar x;\r\n\t\tfor (x in list) {\r\n\t\t\tif (list[x] === item) {\r\n\t\t\t\treturn true;\r\n\t\t\t}\r\n\t\t}\r\n\t\tif (item.length > 3) {\r\n\t\t\treturn contains(list, item.substring(0, item.length-3));\r\n\t\t}\r\n\t\treturn false;\r\n\t}\r\n\treturn contains(array, input);\r\n}\nfunction execute_6_1() {\r\n\tvar input = arguments[1], result = 0;\r\n\tinput += 0;\r\n\tif (input >= 150) {\r\n\t\tresult = 30;\r\n\t} else if (input >= 100) {\r\n\t\tresult = 13;\r\n\t} else if (input >= 50) {\r\n\t\tresult = 5;\r\n\t}\r\n\treturn result;\r\n}\nfunction execute_6_2() {\r\n\treturn 0.0;\r\n}\nfunction execute_6() {\r\n\treturn execute_6_0.apply(this, arguments) ? execute_6_1.apply(this, arguments) : execute_6_2.apply(this, arguments);\r\n}\nfunction execute_7_0_0() {\r\n\tvar input = arguments[0];\r\n\tvar array = new Array('107');\r\n\tfunction contains(list, item) {\r\n\t\tvar x;\r\n\t\tfor (x in list) {\r\n\t\t\tif (list[x] === item) {\r\n\t\t\t\treturn true;\r\n\t\t\t}\r\n\t\t}\r\n\t\tif (item.length > 3) {\r\n\t\t\treturn contains(list, item.substring(0, item.length-3));\r\n\t\t}\r\n\t\treturn false;\r\n\t}\r\n\treturn contains(array, input);\r\n}\nfunction execute_7_0_1() {\r\n\tvar input = 0;\r\n\treturn (input + 0) < 100;\r\n}\nfunction execute_7_0() {\r\n\treturn execute_7_0_0.apply(this, arguments) && execute_7_0_1.apply(this, arguments);\r\n}\nfunction execute_7_1() {\r\n\treturn 20;\r\n}\nfunction execute_7_2() {\r\n\treturn 0.0;\r\n}\nfunction execute_7() {\r\n\treturn execute_7_0.apply(this, arguments) ? execute_7_1.apply(this, arguments) : execute_7_2.apply(this, arguments);\r\n}\nfunction execute_8_0_0() {\r\n\tvar input = arguments[0];\r\n\tvar array = new Array('105115');\r\n\tfunction contains(list, item) {\r\n\t\tvar x;\r\n\t\tfor (x in list) {\r\n\t\t\tif (list[x] === item) {\r\n\t\t\t\treturn true;\r\n\t\t\t}\r\n\t\t}\r\n\t\tif (item.length > 3) {\r\n\t\t\treturn contains(list, item.substring(0, item.length-3));\r\n\t\t}\r\n\t\treturn false;\r\n\t}\r\n\treturn contains(array, input);\r\n}\nfunction execute_8_0_1() {\r\n\tvar input = 0;\r\n\treturn (input + 0) < 100;\r\n}\nfunction execute_8_0() {\r\n\treturn execute_8_0_0.apply(this, arguments) && execute_8_0_1.apply(this, arguments);\r\n}\nfunction execute_8_1() {\r\n\tvar result, input = arguments[1];\r\n\twith(Math) {\r\n\t\tresult = round((0.2 * input)*pow(10,2))\/pow(10,2);\r\n\t}\r\n\treturn result;\r\n}\nfunction execute_8_2() {\r\n\treturn 0.0;\r\n}\nfunction execute_8() {\r\n\treturn execute_8_0.apply(this, arguments) ? execute_8_1.apply(this, arguments) : execute_8_2.apply(this, arguments);\r\n}\nfunction execute_9_0_0() {\r\n\tvar input = arguments[0];\r\n\tvar array = new Array('105116');\r\n\tfunction contains(list, item) {\r\n\t\tvar x;\r\n\t\tfor (x in list) {\r\n\t\t\tif (list[x] === item) {\r\n\t\t\t\treturn true;\r\n\t\t\t}\r\n\t\t}\r\n\t\tif (item.length > 3) {\r\n\t\t\treturn contains(list, item.substring(0, item.length-3));\r\n\t\t}\r\n\t\treturn false;\r\n\t}\r\n\treturn contains(array, input);\r\n}\nfunction execute_9_0_1() {\r\n\tvar input = 0;\r\n\treturn (input + 0) < 100;\r\n}\nfunction execute_9_0() {\r\n\treturn execute_9_0_0.apply(this, arguments) && execute_9_0_1.apply(this, arguments);\r\n}\nfunction execute_9_1() {\r\n\tvar input = arguments[1], result = 0;\r\n\tif ((input + 0) >= 150) {\r\n\t\tresult = 30;\r\n\t} else if ((input + 0) >= 100) {\r\n\t\tresult = 10;\r\n\t} else if ((input + 0) >= 50) {\r\n\t\tresult = 5;\r\n\t}\r\n\treturn result;\r\n}\nfunction execute_9_2() {\r\n\treturn 0.0;\r\n}\nfunction execute_9() {\r\n\treturn execute_9_0.apply(this, arguments) ? execute_9_1.apply(this, arguments) : execute_9_2.apply(this, arguments);\r\n}\nfunction execute() {\r\n\tvar result = execute_0.apply(this, arguments) + execute_1.apply(this, arguments) + execute_2.apply(this, arguments) + execute_3.apply(this, arguments) + execute_4.apply(this, arguments) + execute_5.apply(this, arguments) + execute_6.apply(this, arguments) + execute_7.apply(this, arguments) + execute_8.apply(this, arguments) + execute_9.apply(this, arguments);\r\n\treturn result;\r\n}";
    
    
    
    
    
    
    
    
    
    
    
    public static String getFromAssets(Context context,String fileName) {
        try {
            InputStreamReader inputReader = new InputStreamReader(
                    context.getResources().getAssets().open(fileName));

            BufferedReader bufReader = new BufferedReader(inputReader);

            String line = "";
            String Result = "";

            while ((line = bufReader.readLine()) != null)
                Result += line;
            if (bufReader != null)
                bufReader.close();
            if (inputReader != null)
                inputReader.close();
            return Result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    
    
    
    
}





//<!DOCTYPE html PUBLIC "-//WAPFORUM//DTD XHTML Mobile 1.0//EN" "http://www.wapforum.org/DTD/xhtml-mobile10.dtd ">
//<html xmlns="http://www.w3.org/1999/xhtml ">
//<head>
//<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
//<script language="javascript" type="text/javascript">

//
//</script>
//</head>
//</html>
