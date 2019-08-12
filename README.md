# html2pdf
环境说明，JDK1.8.0——77   idea    win10

simple：
快速将html转换为pdf的几种方式
cn：
将带有中文的html转换为pdf
img：
在中文html基础上，html中的图片转换到pdf的两种方式


中文html转换为pdf注意事项：
1.ttf文件，该例子中从电脑系统文件中获取，该例子中使用两种字体是需要分别支持粗细两种字体；
2.maven开启filter为true时，会导致ttf文件发生改变导致转换中文失败；

html图片转换为pdf注意事项：
1.支持相对路径和绝对路径两种方式，详细见img.html;
2.尽量保持img为第一级，确保转换pdf时被识别为img标签，避免图片转换失败；

其他问题：
Html文件中别出现具体width，pdf合同页面尺寸会发生改变。如果想解决这个问题，先把width去掉转换为pdf看下效果。

