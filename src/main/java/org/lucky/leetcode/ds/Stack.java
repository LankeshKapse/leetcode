package org.lucky.leetcode.ds;

import java.lang.reflect.Array;
import java.util.Objects;

public class Stack<T> {

    private final T[] finite_stack ;
    private int push_pointer=-1;
    private int pop_pointer=-1;

    public Stack(Class<T> clazz, int capacity) {
        this.finite_stack = (T[]) Array.newInstance(clazz, capacity);
    }

    public void push(T item){
        try{
            finite_stack[++push_pointer]=item;
            pop_pointer=push_pointer;
        }catch (ArrayIndexOutOfBoundsException ex){
            throw new StackExceptions("Stack full");
        }


    }

    public T pop(){
        T item = finite_stack[pop_pointer];
        if(Objects.isNull(item))
            throw new StackExceptions("No item left");
        finite_stack[pop_pointer--]=null;
        push_pointer--;
        return item;
    }

    public void print(){
        for(T item: finite_stack){
            if(Objects.isNull(item))
                continue;
            System.out.print(item+",");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Stack stack = new Stack(Integer.class,5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.print();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.pop();
        stack.push(9);
        stack.print();
        stack.push(10);
        stack.print();
    }

}

class StackExceptions extends RuntimeException{
    public StackExceptions(String msg) {
        super(msg);
    }

}
