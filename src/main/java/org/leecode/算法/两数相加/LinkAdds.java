package org.leecode.算法.两数相加;

/**
 * @Author: abel
 * @Date: 2022/10/17 12:43
 * @Description:
 */
public class LinkAdds {
     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         ListNode root = new ListNode(0);
         ListNode cursor = root;
         int carry = 0;
         while(l1 != null || l2 != null || carry != 0) {
             int l1Val = l1 != null ? l1.val : 0;
             int l2Val = l2 != null ? l2.val : 0;
             int sumVal = l1Val + l2Val + carry;
             carry = sumVal / 10;

             ListNode sumNode = new ListNode(sumVal % 10);
             cursor.next = sumNode;
             cursor = sumNode;

             if(l1 != null) l1 = l1.next;
             if(l2 != null) l2 = l2.next;
         }
         return root.next;
     }


}
