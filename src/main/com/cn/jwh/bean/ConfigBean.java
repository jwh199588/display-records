package main.com.cn.jwh.bean;

/**
 * @ClassName ConfigBean
 * @Auther: JIAWENHAO
 * @Date: 2020/2/2 14:22
 * @Description: 配置文件实体
 */

public class ConfigBean {

    private String name; //组件名称

    private String font; //组件字体

    private String fontColor; //组件字体颜色

    private String size; //字体大小

    private String bgColor; //背景颜色

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFont() {
        return font;
    }

    public void setFont(String font) {
        this.font = font;
    }

    public String getFontColor() {
        return fontColor;
    }

    public void setFontColor(String fontColor) {
        this.fontColor = fontColor;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBgColor() {
        return bgColor;
    }

    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }
}
