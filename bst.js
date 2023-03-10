class Node {
    constructor(data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }
  
  class BinarySearchTree {
    constructor() {
      this.root = null;
    }
    insert(data) {
      var newNode = new Node(data); 
      if (this.root === null) {
        this.root = newNode;
      } else {
        this.insertNode(this.root, newNode);
      }
    }
  

  
    insertNode(node, newNode) {
     
      if (newNode.data < node.data) {
        if (node.left === null) {
          node.left = newNode;
        } else {
          this.insertNode(node.left, newNode);
        }
      } else {
        if (node.right === null) {
          node.right = newNode;
        } else {
          this.insertNode(node.right, newNode);
        }
      }
    }
    
    getMinVal() {
        if (this.root === null) {
           throw "Empty tree!";
        }
        let currNode = this.root;
     
        while (currNode.left !== null) {
           currNode = currNode.left;
        }
        return currNode.data;
     }
  
     getMaxVal() {
        if (this.root === null) {
              throw "Empty tree!";
        }
        let currNode = this.root;
        
        while (currNode.right !== null) {
           currNode = currNode.right;
        }
           return currNode.data;
        }

  }
  const BST = new BinarySearchTree();
  BST.insert(1);
  BST.insert(3);
  BST.insert(6);
  BST.insert(11);
  BST.insert(4);
  BST.insert(9);
  BST.insert(10);
  console.log(JSON.stringify(BST));

  console.log(BST.getMinVal());
  console.log(BST.getMaxVal());
 
  
  
