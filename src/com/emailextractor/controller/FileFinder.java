package com.emailextractor.controller;

import java.io.File;

/**
 * Created by supra on 9/17/2017.
 */
public class FileFinder {

    private String path;

    public FileFinder(String path){
        this.path = path;
    }

    public FileFinder(){
        this.path = ".";
    }

    public String[] getFileList(){

        File folder = new File(this.path);
        File[] listOfFiles = folder.listFiles();
        String[] listOfFilesName = new String[listOfFiles.length];

        for (int i =0; i < listOfFiles.length; ++i){
            listOfFilesName[i] = listOfFiles[i].getName();
        }

        return listOfFilesName;
    }

    public String[] extractEmailFromListOfFiles(String[] fileNameList){

    }
}
