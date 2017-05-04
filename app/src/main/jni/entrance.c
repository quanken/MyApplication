#include <jni.h>
#include <stdio.h>
#include "api.h"
// 各jni函数
static JNINativeMethod jniMethods[] = {
        {"getLibName", "()Ljava/lang/String;", (void*)getLibName},
        {"result", "(I)Ljava/lang/String;", (void*)result}
        // 若有新jni方法，则用逗号分隔，添加新的元素。
};
int JNI_OnLoad(JavaVM *vm, void *reserved)
{
    JNIEnv *env;
    if ((*vm)->GetEnv(vm, (void **)&env, JNI_VERSION_1_4) != JNI_OK) {
        return JNI_ERR;
    }
    jclass cls = (*env)->FindClass(env, "com/example/edao/myapplication/ndktest/NDKUtil");
    if (cls == NULL)
        return JNI_ERR;
    int len = sizeof(jniMethods) / sizeof(jniMethods[0]);
    (*env)->RegisterNatives(env, cls, jniMethods, len);
    return JNI_VERSION_1_4;
}