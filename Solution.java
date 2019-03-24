package io.github.jiangdequan;
import java.util.ArrayList;

public class Solution {
    private static ArrayList<Integer> list = new ArrayList<>();

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (null != listNode && null != listNode.next) {
            printListFromTailToHead(listNode.next);
            list.add(listNode.next.val);
        }
        return list;
    }

    public static void main(String[] args) {
        printListFromTailToHead(null);
    }

    public class ListNode {
        int val; 
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}