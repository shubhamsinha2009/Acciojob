
// Question Link -- https://leetcode.com/problems/add-two-numbers/

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode tailSum = null;
         ListNode headSum = null;
  
        int carry = 0;
       

      while(l1!= null ||  l2 != null ){ 

          if(l1 == null){
              l1 = new ListNode(); 
          }
          if(l2 == null){
              l2 = new ListNode(); 
          }

          int sum = l1.val + l2.val + carry ; 
            
            carry = sum/10;
            sum %= 10;


          ListNode newNode = new ListNode(sum);

          if(headSum == null){           
              headSum = newNode;
               tailSum  = newNode;
          }else{
            tailSum.next  = newNode;
            tailSum = newNode ; 
          }

       l1 = l1.next ;
       l2 = l2.next ;
      }

      if(carry != 0){
          ListNode newNode = new ListNode(carry);
          tailSum.next = newNode;
      }

   return headSum; 

    }
}
