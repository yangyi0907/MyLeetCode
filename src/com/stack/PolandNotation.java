package com.stack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author YANGYI
 * @create 2021/7/30
 */
public class PolandNotation {
    public static void main(String[] args) {
        String suffixExpression="3 4 + 5 * 6 -";
    }
    public static List<String> getListString(String suffixExpression){
        String[] spt=suffixExpression.split(" ");
        List<String> list=new ArrayList<>();
        for (String i :
                spt) {
            list.add(i);
        }
        return list;
    }

}
