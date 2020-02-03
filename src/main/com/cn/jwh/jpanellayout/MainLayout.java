package main.com.cn.jwh.jpanellayout;

import main.com.cn.jwh.util.TextAreaUtil;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName MainLayout
 * @Auther: JIAWENHAO
 * @Date: 2020/2/1 21:14
 * @Description: 主面板
 */

public class MainLayout {

    private JPanel mainPanel;
    private JTabbedPane tabbedPane;//选项卡
    private JScrollPane jscrollPane0;
    private JTextArea textArea0;


    public MainLayout() {

        initListener();
        initSetting();
        initText();

    }

    public JPanel getContent(){
        return mainPanel;
    }

    /**
    * @Description  监听事件
    * @exception
    * @date        2020/2/2
    * @return
    */
    private void initListener(){
        TextAreaUtil.setJTextAreaEven(textArea0);

    }

    /**
    * @Description  初始化内容
    * @exception
    * @date        2020/2/2
    * @return
    */
    private void initText(){
        TextAreaUtil.setTextAreaContent(textArea0);
    }

    /**
    * @Description  TODO 后期自定义配置 自定义添加标签页  加载配置
    * @exception
    * @date        2020/2/2
    * @return
    */
    private void initSetting(){
        Font font = new Font("宋体",Font.PLAIN,20);
        textArea0.setFont(font);


//        List<ConfigBean> configBeanList = InstanceUtil.getConfigFileJsonInstance().getConfigBeanList();

    }
}
