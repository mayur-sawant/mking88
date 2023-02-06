class Node {
    constructor(value) {
      if (value == null || value == undefined)
        throw new Error("Initialise node with a 'valid' value");
      this.value = value;
      this.next = null;
    }
  }
  
  // FIFO
  class Queue {
    constructor(value) {
        const newNode = new Node(value);
        this.front = newNode;
        this.rear = this.front;
        this.length = 1;
      }
      enqueue(value) {
        const newNode = new Node(value);
        if (!this.length) {
          this.front = newNode;
          this.rear = this.front; ///(rear)20<---next|10(front)
        } else {
          this.rear.next = newNode;
          this.rear = newNode;
        }
        this.length++;
        return this;
      }
      dequeue(){
        if(!this.first) return null
        const temp=this.first;
        if(this.first===this.last){
            this.last=null;
        }
        this.first=this.first.next;
        this.size--;
        return temp.val
      }
    }
    const myqueue = new Queue(10);
    console.log(JSON.stringify(myqueue));
    myqueue.enqueue(20);
    myqueue.enqueue(30);
    console.log(JSON.stringify(myqueue));
    myqueue.dequeue();
    console.log(JSON.stringify(myqueue));
