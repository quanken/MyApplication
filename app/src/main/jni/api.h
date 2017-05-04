#ifndef NDKDEMO_API_H
#define NDKDEMO_API_H
#include <jni.h>
#include <string.h>
#include <stdio.h>
jstring getLibName(JNIEnv* env, jobject obj);
jstring result(JNIEnv *env, jobject obj, jint n);
#endif //NDKDEMO_API_H