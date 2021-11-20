package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        List<String> list = new ArrayList<>(Arrays.asList(playList));
        int counterUp = 0;
        int counterDown = 0;
        int compare = 0;

        for (int i = startIndex; i <= list.size() - 1; i++) {
            if (!selection.equals(list.get(i))) {
                counterUp++;
            }
        }

        for (int i = startIndex; i <= list.size() - 1; i++) {
            counterDown++;

            if (selection.equals(list.get(list.size() - 1 - i))) {
                break;
            }
        }

        if (counterUp < counterDown) {
            compare = counterUp;
        }

        if (counterDown < counterUp) {
            compare = counterDown;
        }

        if (counterDown == counterUp) {
            compare = counterDown;
        }

        return compare;
    }
}
