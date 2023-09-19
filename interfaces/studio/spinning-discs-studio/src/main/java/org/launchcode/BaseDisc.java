package org.launchcode;

import java.util.ArrayList;

public class BaseDisc {
    private String title;
    private int storageCapacity;
    private ArrayList<String> contents;
    private String discType;

    public BaseDisc(String title, int storageCapacity, ArrayList<String> contents, String discType) {
        this.title = title;
        this.storageCapacity = storageCapacity;
        this.contents = contents;
        this.discType = discType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public ArrayList<String> getContents() {
        return contents;
    }

    public void setContents(ArrayList<String> contents) {
        this.contents = contents;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    void writeData(ArrayList<String> data){
        this.contents = data;
    }

    public void readData(ArrayList<String> contents){
        String newLine = System.lineSeparator();
        for (String content: contents){
            System.out.println(content);
        }
    }
    public void clearData(){
        this.contents = null;
    }
}
