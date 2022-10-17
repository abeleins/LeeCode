package org.leecode.算法.两数相加;

/**
 * @Author: abel
 * @Date: 2022/10/17 11:40
 * @Description: 链表两数之和
 */
public class linkAdd {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode headNode = new ListNode(l1.val + l2.val);
        //对应位相加
        ListNode left = headNode;
        while (l1.next != null && l2.next != null){
            l1 = l1.next;
            l2 = l2.next;
            ListNode next = new ListNode(l1.val+l2.val);
            left.next = next;
            left = left.next;
        }
        //较长的链表单处理
        while (l1.next != null &&l2.next ==null){
            l1 = l1.next;
            ListNode next = new ListNode(l1.val);
            left.next = next;
            left = left.next;
        }
        while (l2.next != null && l1.next == null){
            l2 = l2.next;
            ListNode next = new ListNode(l2.val);
            left.next = next;
            left = left.next;
        }
        //链表中大于10的取整
        left = headNode;
        while (headNode != null){
            if (left.val > 10) {
                left.val = left.val % 10;
                if (left.next != null) {
                    left.next.val++;
                }
            }else {
                left.next = new ListNode(1);
            }
            left = left.next;
        }
        return headNode;
    }
}
