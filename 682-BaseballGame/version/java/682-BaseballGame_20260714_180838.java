// Last updated: 14/07/2026, 18:08:38
1import java.util.*;
2
3class Solution {
4    public int calPoints(String[] operations) {
5        Stack<Integer> stack=new Stack<>();
6        for(int i=0;i<operations.length;i++){
7            if(operations[i].equals("+")){
8                int a=stack.pop();
9                int b=stack.peek();
10                stack.push(a);
11                stack.push(a+b);
12            }else if(operations[i].equals("D")){
13                stack.push(stack.peek()*2);
14            }else if(operations[i].equals("C")){
15                stack.pop();
16            }else{
17                stack.push(Integer.parseInt(operations[i]));
18            }
19        }
20        int sum=0;
21        while(!stack.isEmpty()){
22            sum=sum+stack.pop();
23        }
24        return sum;
25    }
26}