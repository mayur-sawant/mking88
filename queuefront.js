class QNode
{
    constructor(key)
    {
        this.key = key;
        this.next = null;
    }
}
 
let front = null, rear = null;
 
function enqueue(key)
{
        let temp = new QNode(key);
        if (rear == null) {
            front = rear = temp;
            return;
        }
        rear.next = temp;
        rear = temp;
}
 
function dequeue()
{
        if (front == null)
            return;
        let temp = front;
        front = front.next;
        if (front == null)
            rear = null;
}

 
enqueue(10);
enqueue(20);
dequeue();
dequeue();
enqueue(30);
enqueue(40);
enqueue(50);
dequeue();
console.log("Queue Front : " +  ((front != null) ? (front).key : -1));
console.log("Queue Rear : " +  ((rear != null) ? (rear).key : -1) );
