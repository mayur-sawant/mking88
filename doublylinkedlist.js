class node {
    constructor(value) {
      this.value = value;
      this.pre = null;
      this.next = null;
    }
  }
  class Doublylinkedlist {
    constructor(value) {
      const newnode = new node(value);
      //initialize head and tail
      this.head = newnode;
      this.tail = newnode;
      this.length = 1;
    }
  pop(value)
  {
    if(!this.length) return undefined;
    let temp = this.tail;
    if(this.length==1){
      this.head=null;
      this.tail=null;
    }
    else{
      temp.pre.next=null;
      this.tail=temp.pre;
      temp.pre=null;
    }
    this.length--;
    return temp;
  }
    push(value) {
      const newnode = new node(value);
      // adding a node to an empty linkedlist
      if (!this.length) {
        this.head = newnode;
        this.tail = newnode;
      } else {
        this.tail.next = newnode;
        newnode.pre = this.tail;
        this.tail = newnode;
      }
      this.length++;
      return this;
    }
  } 
const dl = new Doublylinkedlist(10);
console.log(dl);
dl.push(20);
dl.push(5);
dl.push(6);
dl.push(7);
dl.push(12);
dl.push(34);
console.log(dl);
dl.pop();
console.log(dl);




