package main.com.cn.jwh.toolwindow;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import main.com.cn.jwh.util.InstanceUtil;
import org.jetbrains.annotations.NotNull;

/**
 * @ClassName GuiToolWindowBar
 * @Auther: JIAWENHAO
 * @Date: 2020/2/1 14:07
 * @Description: 展示一个窗口，并且展示在右侧
 */

public class GuiToolWindowBar implements ToolWindowFactory {

    public GuiToolWindowBar() {}

    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {

        ContentFactory contentFactory = ContentFactory.SERVICE.getInstance();
        Content content = contentFactory.createContent(InstanceUtil.getJPanelInstance(), "", false);
        toolWindow.getContentManager().addContent(content);
    }
}
