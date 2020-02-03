package main.com.cn.jwh.util;

import cn.hutool.core.util.StrUtil;

import javax.swing.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 * @ClassName TextAreaUtil
 * @Auther: JIAWENHAO
 * @Date: 2020/2/2 12:32
 * @Description: 文本域监听工具
 */

public class TextAreaUtil {

    /**
    * @param jTextArea 
    * @Description   监听文本域，添加保存文件事件
    * @exception
    * @date        2020/2/2
    * @return
    */
    public static void setJTextAreaEven(JTextArea jTextArea){
        jTextArea.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
            }


            @Override
            public void focusLost(FocusEvent e) {
                String text = jTextArea.getText();
                //TODO 后期根据当前textarea 名称设置文件
                FileUtil.writeTextFile("1.txt",text);
            }
        });
    }

    /**
    * @param jTextArea 
    * @Description
    * @exception   
    * @date        2020/2/2 
    * @return      
    */
    public static void setTextAreaContent(JTextArea jTextArea){
        StringBuilder stringBuilder = FileUtil.readTextFile("1.txt");
        jTextArea.setText(stringBuilder.toString());
    }
}
