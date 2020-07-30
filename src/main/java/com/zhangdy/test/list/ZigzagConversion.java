package com.zhangdy.test.list;

public class ZigzagConversion {

    public static void main(String[] args) {

        System.out.println(convert("LEETCODEISHIRING", 3));

    }


    public static String convert(String s, int numRows){
        if(numRows>s.length()||numRows==1)
            return s;
        int length = s.length();
        int count = numRows*2-2;
        int next = 0;
        String result = "";
        for(int i = 0;i < numRows;i++){
            for(int j = i;j < length;){
                result = result + s.charAt(j);
                next = j + count - 2 * i;
                if(i!=0&&i!=numRows-1&&next<length){
                    //第一行和最后一行竖排中的数加上固定值和这个数字在等差数列的下一个值相等
                    //所以这两行不管它
                    result = result + s.charAt(next);
                }
                j = j + count;
            }
        }
        return result;
    }






}
