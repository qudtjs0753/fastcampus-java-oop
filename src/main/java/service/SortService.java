package service;

import logic.Sort;

import java.util.List;

/**
 * @Author: kbs
 */
public class SortService {

    private Sort<String> sort;

    public SortService(Sort<String> sort){
        this.sort = sort;
        System.out.println("implements: " + sort.getClass().getName());
    }

    public List<String> doSort(List<String> list){
        return sort.sort(list);
    }
}
