#include "api.h"
//JNIEXPORT 返回类型 JNICALL Java_{packageName_className}_{functionName}(jni参数列表);

JNIEXPORT jintArray JNICALL Java_com_example_bc_lib_BeerCalculator_calc(JNIEnv *env, jobject obj, jint n){

        int drinkBealNum = 0;//喝酒的数量
        int lMoney = 0;//剩余钱数量
        int lBottle = 0;//剩余空瓶数量
        int lBottleCap = 0;//剩余瓶盖数量

        if(n < 0){
            drinkBealNum = -1;
            lMoney = -1;
            lBottle = -1;
            lBottleCap = -1;
        } else{
            lMoney = n % 2;
            drinkBealNum = n / 2;
            lBottle = n / 2;
            lBottleCap = n / 2;


            while(1){
                if(lBottle >= 2){
                    lBottleCap += lBottle / 2;
                    drinkBealNum += lBottle / 2;
                    lBottle =  lBottle / 2 + lBottle % 2;

                }
                else if(lBottleCap >= 4){
                    lBottle += lBottleCap / 4;
                    drinkBealNum += lBottleCap / 4;
                    lBottleCap = lBottleCap / 4 + lBottleCap % 4;
                }
                else{
                    break;
                }
            }
        }

        jint arr[4];
        arr[0] = drinkBealNum;
        arr[1] = lMoney;
        arr[2] = lBottle;
        arr[3] = lBottleCap;

        jintArray array;//定义数组对象
        array = (*env)-> NewIntArray(env, 4);
        (*env)->SetIntArrayRegion(env, array, 0, 4, arr);

        return array;
//        //jstring str = (*env)->NewStringUTF(env, "d%元钱能喝d%瓶酒，剩余d%元钱，剩余d%个空瓶，剩余d%个瓶盖", n , drinkBealNum, lMoney, lBottle, lBottleCap);
//        //char* s = string.format("d%元钱能喝d%瓶酒，剩余d%元钱，剩余d%个空瓶，剩余d%个瓶盖", n , drinkBealNum, lMoney, lBottle, lBottleCap);
//        char str[100];
//        int l = sprintf(str, "%d yuan，drink %d beel，%d yuan left, %d bottle left，%d bottlegap left", n , drinkBealNum, lMoney, lBottle, lBottleCap);
//        jstring jstr = (*env)->NewStringUTF(env, str);
//        // (*env)->ReleaseStringUTFChars(env, jstr, null);
//       return jstr;

        /*
        jstring rtn = 0;
        int slen = strlen(str);
        unsigned short * buffer = 0;
        if( slen == 0 )
            rtn = (env)->NewStringUTF(str );
        else
        {
            int length = MultiByteToWideChar( CP_ACP, 0, (LPCSTR)str, slen, NULL, 0 );
            buffer = (unsigned short *)malloc( length*2 + 1 );
            if( MultiByteToWideChar( CP_ACP, 0, (LPCSTR)str, slen, (LPWSTR)buffer, length )>0 )
            rtn = (env)->NewString( (jchar*)buffer, length );
        }
        if( buffer )
        free( buffer );
        return rtn;
        */
}