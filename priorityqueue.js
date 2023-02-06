class Node {

  constructor() {
    this.data = 0;
    this.priority = 0;
    this.next = null;
  }
}


function newNode(d, p) {
  var temp = new Node();
  temp.data = d;
  temp.priority = p;
  temp.next = null;

  return temp;
}


function push(head, d, p) {
  var start = head;


  var temp = newNode(d, p);

  if (head.priority > p) {
   
    temp.next = head;
    head = temp;
  } else {
   
    while (start.next != null && start.next.priority < p) {
      start = start.next;
    }
 
  }
  return head;
}

var pq = newNode(4, 1);
pq = push(pq, 2, 0);
console.log(JSON.stringify(pq));

