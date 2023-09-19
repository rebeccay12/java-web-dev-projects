package org.launchcode;

public class DVD  extends BaseDisc {

    public DVD(string, title, int storageCapacity, ArrayList<Sring> contents) {
        super(title, storageCapacity, contents, discType "Media DVD");
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    public void readData (ArrayList<String>)

    public void readData(){
        String newLIne = System.lineSeparator();
        System.out.println(this.getTitle() + "contains" + newLine + "MB of storage and contains");
        for (String content: this.getContents()){
            System.out.println(content);
        }
        System.out.println(newLine + "And is of type" + this.getDiscType());
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }

    @Override
    public void playMedia() {
        for (String content : this.getContents()) {
            System.out.println(content);
        }
    }
}
