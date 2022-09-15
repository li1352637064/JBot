package site.liqinghao;

import com.melloware.jintellitype.JIntellitype;

public class Main {
    private static final JIntellitype HOTKEY = JIntellitype.getInstance();
    private static final int mouseDownId = 1;
    private static final int mouseUpId = 2;

    public static void main(String[] args) {
        //注册热键
        HOTKEY.registerHotKey(mouseDownId, "CTRL+SHIFT+ALT+P");
        //注册热键 alt+p
        HOTKEY.registerHotKey(mouseUpId, JIntellitype.MOD_ALT, (int) 'P');

        //全局热键监听
        HOTKEY.addHotKeyListener(id -> {
            //按下了 CTRL+SHIFT+ALT+P
            if (mouseDownId == id) {
                System.out.printf("你按下了热键: %s, 热键ID为: %d, 触发事件: %s\n",
                                  "CTRL+SHIFT+ALT+P",
                                  mouseDownId,
                                  "鼠标按下");
            }

            //按下alt+p
            if (mouseUpId == id) {
                System.out.printf("你按下了热键: %s, 热键ID为: %d, 触发事件: %s\n", "ALT+P", mouseUpId, "鼠标抬起");
            }
        });

    }
}