package com.coral.tesseract;

import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

/**
 * 训练自己的OCR字体识别
 * http://blog.csdn.net/why200981317/article/details/48265621
 *
 * Created by coral on 2017/2/27.
 */
public class OcrHello {

    public static void main(String[] args){
        File imageFile = new File("D:\\projects-coral\\tesseract-sample\\images\\test4.jpg");
        ITesseract instance = new Tesseract();  // JNA Interface Mapping
        instance.setDatapath("D:\\dev-servers\\Tess4J");
        instance.setLanguage("coral");
        try {
            String result = instance.doOCR(imageFile);
            System.out.println(result);
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
        /*File imageFile = new File("D:\\projects-ccc\\training-sampler\\training-ocr\\src\\main\\resources\\timg.jpg");
        ITesseract instance = new Tesseract();
        instance.setDatapath("D:\\dev_server\\tessdata");
        // 默认是英文（识别字母和数字），如果要识别中文(数字 + 中文），需要制定语言包
        instance.setLanguage("chi_sim");
        try{
            String result = instance.doOCR(imageFile);
            System.out.println(result);
        }catch(TesseractException e){
            System.out.println(e.getMessage());
        }*/
    }

}
