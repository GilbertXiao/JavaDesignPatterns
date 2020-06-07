package com.gilxyj.openclose1;

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
 * @create: 2020-05-23 19:02
 **/
//这是一个用于绘图的类【使用方】
public class GraphicEditor {

    public void drawShape(Shape s){
        if (s.shapeType==1) {
            drawRectangle(s);
        }else if (s.shapeType==2){
            drawCircle(s);
        } else if (s.shapeType == 3) {
            drawTriangle(s);
        }
    }

    private void drawTriangle(Shape s) {
        System.out.println("绘制三角形");
    }

    private void drawCircle(Shape s) {
        System.out.println("绘制圆形");
    }

    private void drawRectangle(Shape s) {
        System.out.println("绘制矩形");
    }
}
