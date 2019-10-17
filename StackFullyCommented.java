public class Stack
{
    private class listnode 
    {
        int data;           // each node stores an integer 
        listNode node;      // each node carries reference to next node
    }

    listNode top = null;    // initialize as empty stack

    void push(int arg)
    {
        
        listNode node = new listNode(); // create new node to push data into stack
        node.data = arg;                // write data to new node
        node.next = top;                // top currently points to "2nd from top" node in stack, so link the new node
        top = node;                     // set top to be new node
    }

    Integer pop()
    {
        if (top == null) return null;   // empty stack, return null
        Integer data = top.data;        // extract integer data
        top = top.next;                 // set top to be next node in stack
        return data;                    // return the data
    }
}