package com.wp.html2pdf.cn;

import com.itextpdf.html2pdf.ConverterProperties;
import com.wp.html2pdf.tool.Html2PdfTool;

public class Html2PdfCn {
    
    /**
     * @Description    ：将中文的html转换为pdf 
     */
    private void html2Pdf(){
        ConverterProperties converterProperties = Html2PdfTool.getCnConverterProperties();
        //html文件转换为pdf文件
        Html2PdfTool.html2Pdf("cn/chinese.html","cn/chinese.pdf",converterProperties);
        //htmlStr转换为pdf文件
        Html2PdfTool.htmlStr2Pdf(Html2PdfTool.html2Str("cn/chinese.html"),"cn/chinese2.pdf",converterProperties);
    }

    public static void main(String[] args) {
        new Html2PdfCn().html2Pdf();
    }
}
