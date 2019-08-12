package com.wp.html2pdf.img;

import com.itextpdf.html2pdf.ConverterProperties;
import com.wp.html2pdf.tool.Html2PdfTool;

public class Html2PdfImg {

    /**
     * @Description    ：将中文带图片的html转换为pdf 
     */
    private void html2Pdf(){
        ConverterProperties converterProperties = Html2PdfTool.getCnConverterProperties();
        //指定目录，支持将html相对路径的图片转换到pdf，注意pom文件需要配置将img文件加入到编译后的项目中
        converterProperties.setBaseUri(Html2PdfTool.PATH + "img/");
        //html文件转换为pdf文件
        Html2PdfTool.html2Pdf("img/img.html","img/img.pdf",converterProperties);
    }

    public static void main(String[] args) {
        new Html2PdfImg().html2Pdf();
    }
}
