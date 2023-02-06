class Node {
    constructor(data) {
      this.data = data;
      this.next = null;
    }
}

class Stack {
    constructor() {
        this.head = null;
    }

    push(data) {
        if (this.head) {
            const newNode = new Node(data);
            newNode.next = this.head;
            this.head = newNode;
        } else {
            this.head = new Node(data);
        }
    }

    pop() {
        if (this.head) {
            const data = this.head.data;
            this.head = this.head.next;
            return data;
        } else {
            throw "Stack underflow";
        }
    }

    peek() {
        if (this.head) {
            return this.head.data;
        } else {
            throw "Stack underflow";
        }
    }
    
        reverse() {  
    
           let reverseArray = (stack) => {
            //If the length is 0 
            //then return an empty array
            if(n == 0){
               return [];
            }
            
            //Call the function recursively with one index less and so on.
            return [arr[n-1]].concat(reverseArray(stack));
          }

        }

}

const stack = new Stack();
stack.push(5);
stack.push(9);
stack.push(7);
stack.push(6);
stack.push(8);
console.log(JSON.stringify(stack));
stack.pop();
console.log(JSON.stringify(stack));
console.log(stack.peek());
//stack.reverse();
console.log(JSON.stringify(stack.reverse()));
