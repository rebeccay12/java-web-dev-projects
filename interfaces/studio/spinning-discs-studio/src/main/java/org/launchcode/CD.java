package org.launchcode;

import java.util.ArrayList;

public class CD extends BaseDisc {

    public CD(String title, int storageCapacity, ArrayList<String> contents) {
        super(title, storageCapacity, contents, "Audio CD");
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.


    public void readData(){
        String newLine = System.lineSeparator();
        System.out.println(this.getTitle() + "contains" + newLine + "MB of storage and contains");
        for (String content: this.getContents()){
            System.out.println(content);
        }
        System.out.println(newLine + "And is of type" + this.getDiscType());
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200-500 rpm");
    }

    @Override
    public void playMedia() {
        for (String content : this.getContents()) {
            System.out.println(content);
        }
    }

}
