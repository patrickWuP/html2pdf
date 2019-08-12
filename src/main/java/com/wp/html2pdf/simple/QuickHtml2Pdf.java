package com.wp.html2pdf.simple;

import com.itextpdf.kernel.pdf.PdfWriter;
import com.wp.html2pdf.tool.Html2PdfTool;

import java.io.*;

public class QuickHtml2Pdf {
    
    /**
     * @Description    ：最简单的html转换为pdf示例 
     */
     private void html2Pdf(){
         Html2PdfTool.html2Pdf("simple/simple.html","simple/simple.pdf");
     }

    /**
     * @Description    ：将String格式的HTML元素转换为PDF
     */
     private void htmlStr2Pdf(){
         String htmlStr = Html2PdfTool.html2Str("simple/simple.html");
         Html2PdfTool.htmlStr2Pdf(htmlStr,"simple/simple2.pdf");
     }
     
     /**
      * @Description    ：将String格式的HTML元素转换为PDF方式二
      *  
      */
     private void htmlStr2Pdf2(){
         String htmlStr = Html2PdfTool.html2Str("simple/simple.html");
         File simplePdf = new File(Html2PdfTool.PATH + "simple/simple2.pdf");
         try (OutputStream outputStream = new FileOutputStream(simplePdf);
              PdfWriter pdfWriter = new PdfWriter(outputStream)){
             Html2PdfTool.htmlStr2Pdf(htmlStr,pdfWriter);
         } catch (FileNotFoundException e) {
             e.printStackTrace();
         } catch (IOException e) {
             e.printStackTrace();
         }
     }
     
    public static void main(String[] args) {
//        new QuickHtml2Pdf().html2Pdf();
        new QuickHtml2Pdf().htmlStr2Pdf();
    }
}
