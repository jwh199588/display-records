package main.com.cn.jwh.util;

import main.com.cn.jwh.config.ConfigFileJson;
import main.com.cn.jwh.jpanellayout.MainLayout;

import javax.swing.*;

/**
 * @ClassName InstanceUtil
 * @Auther: JIAWENHAO
 * @Date: 2020/2/2 15:42
 * @Description: 实例
 */

public class InstanceUtil {


    private InstanceUtil (){}

    //面板实例
    public static JPanel getJPanelInstance() {
        return new MainLayout().getContent();
    }

    //配置文件实例
    public static ConfigFileJson getConfigFileJsonInstance() {
        return new ConfigFileJson();
    }
}
