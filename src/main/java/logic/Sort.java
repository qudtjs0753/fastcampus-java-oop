package logic;

import java.util.List;

/**
 * @Author: kbs
 */
public interface Sort <T extends Comparable<T>>{
    List<T> sort(List<T> list);
}