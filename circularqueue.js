class Circularqueue {
  constructor(maxcapacity) {
    this.data = Array(maxcapacity); 
    this.capacity = maxcapacity; 
    this.currentlength = 0; 
    this.front = -1; 
    this.rear = -1;
  }
  isFull() {
    return this.currentLength === this.capacity;
  }
  isEmpty() {
    return this.currentLength === 0;
  }
  enqueue(data) {
    if (!this.isFull()) {
      this.rear = (this.rear + 1) % this.capacity;   
      this.data[this.rear] = data; 
      this.currentlength++;
      if (this.front === -1) {
        this.front = this.rear;
      }
    }

    return data;
  }
  dequeue() {
    if (this.isEmpty()) {
      return null;
    }
    let temp = this.data[this.front]; 
    this.data[this.front] = null; 
    this.front = (this.front + 1) % this.capacity; 
    this.currentlength - 1;
    if (this.isEmpty()) {
      this.front = -1;
      this.rear = -1;
    }
    return temp;
  }
  peek() {
    if (!this.isEmpty()) {
      return this.items[this.front];
    }
    return null;
  }
}

const circular = new Circularqueue(7);
circular.enqueue(3);
circular.enqueue(4);
circular.enqueue(5);
circular.enqueue(6);
circular.enqueue(7);
circular.enqueue(8);
circular.enqueue(9);
console.log(JSON.stringify(circular));
circular.dequeue();
console.log(JSON.stringify(circular));

