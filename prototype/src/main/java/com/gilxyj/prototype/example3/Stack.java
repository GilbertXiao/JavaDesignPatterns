package com.gilxyj.prototype.example3;

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
public class Stack implements Cloneable{

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

    @Override
    public Stack clone()  {
        try {
            Stack result = (Stack)super.clone();
            //《Effective Java》 数组是clone方法唯一吸引人的用法。
            result.elements = elements.clone();
            return result;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new AssertionError();
        }
    }
}
