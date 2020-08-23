package com.plugin.jniecho;

public class EchoJni {

    /**
     * 一个native方法，对应echo_jni库中的 Java_com_plugin_jniecho_EchoJni_getABI 方法
     */
    public static native String  getABI();
    /*
     * 应用启动时加载 'echo_jni' 库
     */
    static {
        System.loadLibrary("echo_jni");
    }
}