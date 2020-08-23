LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)
LOCAL_MODULE := echo_jni
LOCAL_SRC_FILES := echo_jni.c

include $(BUILD_SHARED_LIBRARY)