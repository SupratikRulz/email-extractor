package com.emailextractor.controller;
/**
 * Created by supra on 9/17/2017.
 */
public class MainDriver {
    public static void main(String[] args) {
        FileFinder fileFinderObj1 = new FileFinder("D:/test");
        FileFinder fileFinderObj = new FileFinder();
        String[] names = fileFinderObj1.getFileList();
        for(int i=0;i<names.length;++i){
            System.out.println(names[i]);
        }
        String[] contents = fileFinderObj1.extractEmailFromListOfFiles(names);
        for(int i=0;i<contents.length;++i){
            System.out.println(contents[i]);
        }
    }
}
