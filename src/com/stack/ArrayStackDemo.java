package com.stack;

import java.util.Scanner;

public class ArrayStackDemo {
    public static void main(String[] args) {
        ArrayStack stack=new ArrayStack(4);
        String key="";
        boolean loop=true;
        Scanner scanner=new Scanner(System.in);
        while (loop){
            System.out.println("------------------------");
            System.out.println("show");
            System.out.println("exit");
            System.out.println("push");
            System.out.println("pop");
            System.out.println("------------------------");
            key=scanner.next();
            switch (key){
                case "show":
                    stack.list();
                    break;
                case "push":
                    System.out.println("请输入：");
                    int value=scanner.nextInt();
                    stack.push(value);
                    break;
                case "pop":
                    try{
                        int res=stack.pop();
                        System.out.println(res);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case "exit":
                    scanner.close();
                    loop=false;
                    return;
                default:
                    break;
            }
        }
        System.out.println("程序结束");
    }

}
class ArrayStack{
    private int maxSize;
    private int[] stack;
    private int top=-1;
    public ArrayStack(int maxSize){
        this.maxSize=maxSize;
        stack=new int[this.maxSize];
    }
    public boolean isFull(){
        return top==maxSize-1;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public void push(int value){
        if(isFull()){
            System.out.println("full");
            return;
        }
        top++;
        stack[top]=value;
    }
    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("empty");
        }
        int value=stack[top];
        top--;
        return value;
    }
    public void list(){
        if(isEmpty()){
            System.out.println("empty");
            return;
        }
        for (int i = top; i>=0; i--) {
            System.out.printf("stack[%d]=%d",i,stack[i]);
        }
    }
}