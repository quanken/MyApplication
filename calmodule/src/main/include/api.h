#ifndef NDKDEMO_API_H
#define NDKDEMO_API_H
#include <jni.h>
#include <string.h>
#include <stdio.h>
JNIEXPORT jintArray JNICALL Java_com_example_calmodule_CalUtil_result(JNIEnv *env, jobject obj, jint n);
#endif //NDKDEMO_API_H