package com.jinwei.ref;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Created by Javen on 2018/9/9.
 */

/**
 * 反射的应用，取得类的结构
 * 通过反射得到类的一个完整结构，就要使用到java.lang.reflect
 * Construct   标识类中的构造方法
 * Filed  标识类中的属性
 * Method  标识类中的方法
 */
public class GetInterfaceDemo {
    public static void main(String args[]){
        Class <?> clas = null;
        try {
            clas  = Class.forName("com.jinwei.ref.Person");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        Class<?> cl2[] = clas.getInterfaces();//取得全部接口实现
        Class<?> cl3 = clas.getSuperclass();//取得父类
        Constructor<?> cons[] = clas.getConstructors();//取得全部的构造方法
        for (int i = 0; i <cl2.length ; i++) {
            //取得实现的全部接口
            System.out.println(cl2[i].getName());
        }
        //取得实现的父类名称
        System.out.println(cl3.getName() + " \n" + cl3.getCanonicalName() + " \n " + cl3.getSimpleName());
        System.out.println("=================  取得所有的构造函数 Construct  ====================");
        for (int i = 0; i <cons.length ; i++) {
            Class<?> parameter[] = cons[i].getParameterTypes();//取得所有构造函数的参数信息
            int prv = cons[i].getModifiers();//权限信息返回是数字，转换为人为识别的权限标识  使用 Modifier
            System.out.print(Modifier.toString(prv) + " " + cons[i].getName());
            System.out.print(" (");
            for (int j = 0; j < parameter.length; j++) {
                System.out.print(parameter[j].getName());
                if (j < parameter.length -1) {
                    System.out.print(", ");
                }
            }
            System.out.println(") {}\n");
        }
        System.out.println("===============  取得所有的方法 Method  =============");
        Method method[] = clas.getMethods();//取得所有的方法
        for (int i = 0; i <method.length ; i++) {
            String modif = Modifier.toString(method[i].getModifiers());//取得方法的返回权限值
            Class<?> retType = method[i].getReturnType();//取得返回值类型
            String retName = method[i].getName();//取得方法的名称
            Class<?> arg[] = method[i].getParameterTypes();
            System.out.print(modif + " " + retType + " " + retName + " (");
            for (int j = 0; j <arg.length ; j++) {
                System.out.print(arg[j].getSimpleName());
                if (j < arg.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print(") {}\n");
        }
        Field field[] = clas.getDeclaredFields();//获取本类属性
        Field fie[] = clas.getFields();//取得父类公共属性
    }
}
