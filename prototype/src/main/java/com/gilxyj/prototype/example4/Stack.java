package com.gilxyj.prototype.example4;

import java.io.*;
import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * @program: javaDesignPatterns
 * @description:
 * @作者 飞码录
 * @微信公众号 飞码录
 * @网站 http://www.codesboy.cn
 * @国际站 http://www.codesboy.com
 * @微信 gilbertxy
 * @GitHub https://github.com/GilbertXiao
 * @Gitee https://gitee.com/gilbertxiao
 * @create: 2020-07-19 14:47
 **/
public class Stack implements Serializable {

    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    private void ensureCapacity(){
        if (elements.length==size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }

    public void push(Object obj){
        ensureCapacity();
        elements[size++] = obj;
    }
    public Object pop(){
        if (size==0) {
            throw new EmptyStackException();
        }
        Object element = elements[--size];
        elements[size] = null;
        return element;
    }

    public Stack deepClone(){

        //创建流对象

        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        Stack stack = null;
        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            //当前对象以对象流的方式输出
            oos.writeObject(this);

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);

            Stack o = (Stack)ois.readObject();


        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

        return stack;
    }


}
