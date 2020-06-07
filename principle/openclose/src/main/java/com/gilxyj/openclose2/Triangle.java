package com.gilxyj.openclose2;

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
 * @create: 2020-05-23 20:45
 **/
public class Triangle extends Shape {
    public Triangle() {
        super.shapeType=3;
    }

    @Override
    void drawShape() {
        System.out.println("绘制三角形");
    }
}
