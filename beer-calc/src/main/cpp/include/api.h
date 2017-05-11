#ifndef NDKDEMO_API_H
#define NDKDEMO_API_H
#include <jni.h>
#include <string.h>
#include <stdio.h>
JNIEXPORT jintArray JNICALL Java_com_example_bc_lib_BeerCalculator_calc(JNIEnv *env, jobject obj, jint n);
#endif //NDKDEMO_API_H