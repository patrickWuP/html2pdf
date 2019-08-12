package com.wp.html2pdf.freemarker;

import com.wp.html2pdf.tool.Html2PdfTool;
import freemarker.cache.StringTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

public class DynamicHtml {
    
    /**
     * @Description    ：使用freemarker对页面参数进行动态赋值 
     */
    public void dynamicHtml(){
        //读取需要进行动态赋值的模板
        String content = Html2PdfTool.html2Str("freemarker/freemarker.html");
        
        StringWriter writer = new StringWriter();
        Configuration configuration = new Configuration(Configuration.DEFAULT_INCOMPATIBLE_IMPROVEMENTS);
        StringTemplateLoader stringTemplateLoader = new StringTemplateLoader();
        
        stringTemplateLoader.putTemplate("contract",content);
        configuration.setTemplateLoader(stringTemplateLoader);

        try {
            Template template = configuration.getTemplate("contract","utf-8");
            Map<String,Object> root = new HashMap<>(32);
            //任一一个参数未赋值，将抛出异常，导致整个赋值失败
            root.put("name","张三");
            root.put("age","88");
            template.process(root, writer);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TemplateException e) {
            e.printStackTrace();
        }
        String result = writer.toString();
        //生成pdf
        Html2PdfTool.htmlStr2Pdf(result,"freemarker/freemarker.pdf",Html2PdfTool.getCnConverterProperties());
    }

    public static void main(String[] args) {
        new DynamicHtml().dynamicHtml();
    }
}
