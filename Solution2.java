package io.github.jiangdequan;

public class Solution2 {

    public static void main(String[] args) {

    }

    public String replaceSpace(StringBuffer str) {
        while (true) {
            int index = str.indexOf(" ",i);
            if(index == -1){
                break;
            }
            str.replace(index, index +1, "%20");
        }
        return str.toString();
    }
}