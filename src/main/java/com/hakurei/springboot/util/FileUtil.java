package com.hakurei.springboot.util;

import java.io.File;
import java.io.FileOutputStream;

/**
 * @ClassName FileUtil
 * @Description TODO
 * @Author hakurei
 * @Date 2018/11/3
 * @Version 1.0
 */
public class FileUtil {
    public static void uploadFile(byte[] file, String filePath, String fileName) throws Exception{

        File targetFile = new File(filePath);
        if(!targetFile.exists()){
            targetFile.mkdirs();
        }
        FileOutputStream out = new FileOutputStream(filePath+fileName);
        out.write(file);
        out.flush();
        out.close();
    }
}
