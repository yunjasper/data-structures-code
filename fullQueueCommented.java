public class Queue
{
    private class listNode
    {
        int data;               // each node stores an integer
        listNode node;          // each node has pointer to the next node
    }

    listNode front = null;      // initialize the queue as empty
    listNode rear = null;

    void enqueue(int arg)
    {
        // when we enqueue, we make new nodes, so create new node
        listNode node = new listNode();

        // we have to write the data to the node
        node.data = arg;

        // since we add the new node to the end of the queue, the 
        // new node points to null
        node.next = null;

        // if queue is not empty, rear currently points to the soon-to-be second-last node
        // so we let the "next" node from the POV of second-last node be the new node
        if(rear != null) rear.next = node;
        
        // if queue is empty, we need to set front and rear to point to the new node
        else front = node;
        
        // we always move the rear to be the new node
        rear = node;
    }

    Integer dequeue() 
    {
        // empty queue, we return null
        if (front == null) return null;

        // non empty queue
        else 
        {
            // if there is only one entry in the queue, then we need to set rear to null
            // since we're taking off the only entry in the queue
            if (front == rear) rear = null;

            // extract data from the front of the queue
            Integer data = front.data;
            
            // move the front pointer to the next node
            front.next = front;

            // return the integer data
            return data;
        }
    }
}