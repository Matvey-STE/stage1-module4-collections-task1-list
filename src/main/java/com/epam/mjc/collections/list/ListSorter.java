package com.epam.mjc.collections.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int aValue = Integer.parseInt(a);
        int bValue = Integer.parseInt(b);
        int aResult = 5*((aValue)*(aValue))+3;
        int bResult = 5*((bValue)*(bValue))+3;

        int result = aResult - bResult;

        if (result == 0){
            return -1;
        }
        return result;
    }
}
