LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)
LOCAL_MODULE := nativecode
#LOCAL_C_INCLUDES := $(NDK_PROJECT_PATH)
LOCAL_C_INCLUDES := \
    api.h
LOCAL_SRC_FILES := \
    entrance.c \
     api.c
include $(BUILD_SHARED_LIBRARY)