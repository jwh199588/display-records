package main.com.cn.jwh.config;

import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import main.com.cn.jwh.bean.ConfigBean;
import main.com.cn.jwh.util.FileUtil;

import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName ConfigFile
 * @Auther: JIAWENHAO
 * @Date: 2020/2/2 14:15
 * @Description: 读取配置文件
 */

public class ConfigFileJson {

    private static String configJson = "D:\\project\\plugin\\text\\config.json";

    /**
    * @Description  读取配置文件
    * @exception
    * @date        2020/2/2
    * @return
    */
    public List<ConfigBean> getConfigBeanList(){
       return readConfigJson();
    }

    public void setConfig(ConfigBean configBean){
        List<ConfigBean> configBeans = readConfigJson();
        JSONArray objects = JSONUtil.parseArray(configBeans);
        System.out.println(objects);

    }

    /**
    * @Description   读取配置文件
    * @exception
    * @date        2020/2/2
    * @return
    */
    private  List<ConfigBean> readConfigJson(){

        JSONArray jsonArray  = JSONUtil.readJSONArray(new File(configJson), Charset.forName("utf-8"));

        return JSONUtil.toList(jsonArray, ConfigBean.class);
    }
}
