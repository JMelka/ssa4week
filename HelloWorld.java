package com.ironyard.pgf.stack;

import java.util.EmptyStackException;

public class MyStack {
    private int[] stackArr = new int[0];
    
    public void push(int value) {
        int[] tmpArr = new int[(this.stackArr.length + 1)];
        for(int i = 0; i < this.stackArr.length; i++) {
            tmpArr[i] = this.stackArr[i];
        }
        tmpArr[this.stackArr.length] = value;
        this.stackArr = tmpArr;
    }
    
    public int pop() throws SomeOtherException {
        if(stackArr.length == 0) {
            throw new SomeOtherException();
        }
        int rtnValue = stackArr[this.stackArr.length-1];
        int[] tmpArr = new int[this.stackArr.length-1];
        for(int i = 0; i < tmpArr.length; i++) {
            tmpArr[i] = this.stackArr[i];
        }
        this.stackArr = tmpArr;
        return rtnValue;
    }
    
    public void displayInternalStack() {
        System.out.print("Internal Stack=[");
        for(int i = 0; i < stackArr.length; i++) {
            System.out.print(" " + stackArr[i] + ",");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        for(int i = 0; i < args.length; i++) {
            myStack.push(Integer.parseInt(args[i]));
            System.out.println("pushing value " + args[i]);
            myStack.displayInternalStack();
        }
        // pop them off the stack
        for(int i = 0; i < args.length; i++) {
            System.out.println("popping value " + myStack.pop());
            myStack.displayInternalStack();
        }
    }

}











public class HelloWorld extends Object {
    public static void main(String[] args) {

        Animal a = new Animal();
        Animal a2 = a;
        if (a == a2) {

        }

        System.out.println("Hello, world!");      // just type 'sout'
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        System.out.println(3);

    }

    public void bar() throws MyException {
        this.foo();
    }

    public void foo() throws MyException {
        Animal a = new Animal();
        a.sleep(); // throws MyException, checked
    }
}
// stack

public class Stack<T> {
    private T[] store;
    private int len;

    @override
    protected T clone() {
        Stack st = new Stack();
        st.store = this.store.clone();
        st.len = this.len;
        return st;
    }

    public Stack() {
        this.store = new T[10];
        this.len = 0;
    }

    public void push(T a) {
        if (this.len >= this.store.length) {
            int[] arr = new int[this.store.length * 2];
            for (int i = 0; i < this.len; i++) {
                arr[i] = this.store[i];
            }
            this.store = arr;
        }
        this.store[this.len] = a;
        this.len++;
    }

    public T pop() {
        if (this.len == 0) {  // TODO should throw an exception
            return 0;
        }
        T val = this.store[this.len - 1];
        this.len--;
        return val;
    }

    public boolean isEmpty() {
        return this.len == 0;
    }

    /* return value on top of stack, but don't remove it */
    public T peek() {
        if (this.len == 0) {  // TODO should throw an exception
            return 0;
        }
        return this.store[this.len - 1];
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        for (int i = 0; i < 50; i++) {
            st.push(i);
        }

        for (int i = 0; i < 20; i++) {
            System.out.println(st.pop());
        }
    }
}   













