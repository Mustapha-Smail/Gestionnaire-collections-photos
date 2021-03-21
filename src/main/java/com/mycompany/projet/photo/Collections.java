/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projet.photo;

import java.io.File;
import java.io.FileFilter;

/**
 *
 * @author 33627
 */
public class Collections {
    private final File rep; 
    
    public Collections(){ 
        File f = new File(System.getProperty("user.dir"), "collections"); 
        if(!f.exists() || !f.isDirectory()){ f.mkdir(); }
        this.rep = f; 
    }
    
    public File getRep(){ return this.rep; }
    
    public void addCollection(String collectionName){
        new File(this.getRep(), collectionName).mkdir(); 
    }
    
    public File[] getCollections(){
        FileFilter directoryFilter = (File file) -> file.isDirectory();

        File[] collections = this.rep.listFiles(directoryFilter);

        return collections;  
    }
    
    public Photo[] getPhotos(File collection) {
        if(!collection.isDirectory()){ return null; }
        // "jpg", "png", "gif", "bmp"
        File[] collectionPhotos = collection.listFiles(
            (File dir, String name) -> 
                    name.endsWith("jpg") || name.endsWith("png") || name.endsWith("gif") || name.endsWith("bmp")
        );
        int len = collectionPhotos.length;  
        
        if(len > 0){
            Photo[] photos = new Photo[len];
            for (int i = 0; i < len; i++) {
                photos[i] = new Photo(collectionPhotos[i]); 
            }
            return photos; 
        }
        
        return null; 
    }
   
    
}
