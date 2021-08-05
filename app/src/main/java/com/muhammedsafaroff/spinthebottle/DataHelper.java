package com.muhammedsafaroff.spinthebottle;

import android.content.Context;
import android.content.SharedPreferences;

public class DataHelper {

    private static Context context;

   public DataHelper(Context context){
       this.context = context;
   }

   public void saveDataInt(String key, int value){
       SharedPreferences ayarlar = context.getSharedPreferences("Dosya",Context.MODE_PRIVATE);
       SharedPreferences.Editor editor = ayarlar.edit();
       editor.putInt(key,value);
       editor.commit();
   }

    public int receiveDataInt(String key,int defaultD){
        SharedPreferences ayarlar = context.getSharedPreferences("Dosya",Context.MODE_PRIVATE);
       int deyer = ayarlar.getInt(key,defaultD);
       return deyer;
    }

    public void saveDataString(String key, String value){
        SharedPreferences ayarlar = context.getSharedPreferences("Dosya",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = ayarlar.edit();
        editor.putString(key,value);
        editor.commit();
    }

    public String receiveDataString(String key,String defaultD){
        SharedPreferences ayarlar = context.getSharedPreferences("Dosya",Context.MODE_PRIVATE);
        String deyer = ayarlar.getString(key,defaultD);
        return deyer;
    }

    public void saveDataBoolean(String key, boolean value){
        SharedPreferences ayarlar = context.getSharedPreferences("Dosya",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = ayarlar.edit();
        editor.putBoolean(key,value);
        editor.commit();
    }

    public boolean receiveDataBoolean(String key,boolean defaultD){
        SharedPreferences ayarlar = context.getSharedPreferences("Dosya",Context.MODE_PRIVATE);
        boolean deyer = ayarlar.getBoolean(key,defaultD);
        return deyer;
    }


}
