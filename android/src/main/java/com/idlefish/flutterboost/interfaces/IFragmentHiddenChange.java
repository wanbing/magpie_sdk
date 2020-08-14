package com.idlefish.flutterboost.interfaces;

/**
 * 手动调用隐藏展示，解决TAB页面先调用展示后调用隐藏引起的bug
 */
public interface IFragmentHiddenChange {

    void onFragmentHiddenChanged(boolean hidden);
}
