package com.gilxyj.reverse2;

/**
 * @program: principle
 * @description:
 * @作者 飞码录
 * @微信公众号 飞码录
 * @网站 http://www.codesboy.cn
 * @国际站 http://www.codesboy.com
 * @微信 gilbertxy
 * @GitHub https://github.com/GilbertXiao
 * @Gitee https://gitee.com/gilbertxiao
 * @create: 2020-05-20 01:56
 **/
public class Mobile {
    public void receiveMsg(IMsg sms){
        System.out.println(sms.getMsg());
    }
}
