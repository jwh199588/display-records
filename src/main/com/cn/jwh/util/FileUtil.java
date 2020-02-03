package main.com.cn.jwh.util;

import main.com.cn.jwh.Constant;

import java.io.*;

/**
 * @ClassName FileUtil
 * @Auther: JIAWENHAO
 * @Date: 2020/2/2 12:45
 * @Description: 文件工具
 */

public class FileUtil {



    /**
    * @Description  解析文本文件
    * @exception
    * @date        2020/2/2
    * @return
    */
    public static StringBuilder readTextFile(String fileName){
        StringBuilder stringBuilder = new StringBuilder();
        try{
            String encoding="UTF-8";
            File file=new File(Constant.filePath + fileName);
            if(file.isFile() && file.exists()){ //判断文件是否存在
                InputStreamReader read = new InputStreamReader(new FileInputStream(file),encoding);//考虑到编码格式
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;
                while((lineTxt = bufferedReader.readLine()) != null){
                    stringBuilder.append(lineTxt+"\r\n");
                }
                read.close();
            }
        }catch(Exception e) {
            System.out.println("读取文件内容出错");
            e.printStackTrace();
        }finally {
            return stringBuilder;
        }
    }

    public static void writeTextFile(String fileName,String text){
        try {
            BufferedWriter bufferWritter = new BufferedWriter (
                    new OutputStreamWriter (new FileOutputStream (Constant.filePath + fileName,false),"UTF-8"));
           bufferWritter.write(text);
           bufferWritter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
