/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projet.photo;

import java.awt.Image;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author 33627
 */
public class Photo {
    final private File image;
    final private Icon imageIcon; 
    
    public Photo(File file){
        this.image = file; 
        ImageIcon image = new ImageIcon(this.getImage().getAbsolutePath());
        Image img = image.getImage().getScaledInstance(500, 300, Image.SCALE_SMOOTH); 
        this.imageIcon = new ImageIcon(img);
    }
    
    public File getImage(){ return this.image; }
    
    public Icon getImageResized(){ return this.imageIcon; }
}
