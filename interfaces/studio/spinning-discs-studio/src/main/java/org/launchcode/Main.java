package org.launchcode;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        ArrayList<String> getBornContents = new ArrayList<>(
                Arrays.asList("Last Chance",
                        "Are You Gonna Be My Girl",
                        "Rollover DJ",
                        "Look What You've Done")
                );
        CD getBorn = new CD ("Get Born", 500, getBornContents)

        ArrayList<String> findingNemoContents = new ArrayList<>(
                Arrays.AsList("New Parents",
                        "Main Titles",
                        "First Day of School",
                        "Field Trip",
                        "The Drop Off",
                        "Nemo Lost",
                        "Meeting Dory")
        );
        DVD findingNemo = new DVD("Finding Nemo", 4, findingNemoContents);
        // TODO: Call each CD and DVD method to verify that they work as expected.

        getBorn.spinDisc();
        findingNemo.spinDisc();

    }
}