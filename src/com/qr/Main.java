package com.qr;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\java file\\abc.png");
            String content = "Amount to be paid";

            ByteArrayOutputStream out = QRCode.from(content).to(ImageType.PNG).stream();

            FileOutputStream fos = new FileOutputStream(file);
            fos.write(out.toByteArray());
            fos.close();

            System.out.println("Success Vikrant!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
