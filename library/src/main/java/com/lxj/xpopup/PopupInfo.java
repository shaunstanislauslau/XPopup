package com.lxj.xpopup;

import android.view.View;

import com.lxj.xpopup.enums.PopupType;

/**
 * Description: PopupView的属性封装
 * Create by dance, at 2018/12/8
 */
public class PopupInfo {
    public PopupType popupType = PopupType.Center; //窗体的类型
    public Boolean isDismissOnBackPressed = true;  //按返回键是否消失
    public Boolean isDismissOnTouchOutside = true; //点击外部消失
    public Boolean hasShadowBg = true; // 是否有半透明的背景
    private View atView = null; // 依附于那个View显示

    public View getAtView() {
        return atView;
    }
    public void setAtView(View atView) {
        this.atView = atView;
        this.popupType = PopupType.Custom;
    }

    @Override
    public String toString() {
        return "PopupInfo{" +
                "popupType=" + popupType +
                ", isDismissOnBackPressed=" + isDismissOnBackPressed +
                ", isDismissOnTouchOutside=" + isDismissOnTouchOutside +
                ", hasShadowBg=" + hasShadowBg +
                ", atView=" + atView +
                '}';
    }
}