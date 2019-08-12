package com.wp.html2pdf.cn;

import com.itextpdf.html2pdf.ConverterProperties;
import com.itextpdf.layout.font.FontProvider;
import com.wp.html2pdf.tool.Html2PdfTool;

public class Html2PdfCn {
    
    /**
     * @Description    ：将中文的html转换为pdf 
     */
    private void html2Pdf(){
        ConverterProperties converterProperties = new ConverterProperties();
        //设置中文字体，ttf文件夹下SimSum-01和Dengb分别支持细字体和粗字体，缺一不可
        FontProvider fontProvider = new FontProvider();
        fontProvider.addDirectory(Html2PdfTool.PATH + "ttf/");
        converterProperties.setFontProvider(fontProvider);
        //html文件转换为pdf文件
        Html2PdfTool.html2Pdf("cn/chinese.html","cn/chinese.pdf",converterProperties);
        //htmlStr转换为pdf文件
        Html2PdfTool.htmlStr2Pdf(Html2PdfTool.html2Str("cn/chinese.html"),"cn/chinese2.pdf",converterProperties);
    }

    public static void main(String[] args) {
        new Html2PdfCn().html2Pdf();
    }
}
