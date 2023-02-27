class HashTable {
  constructor() {
    this.table = new Array(137);
  }

  hash(data) {
    let total = 0;
    for (let i = 0; i < data.length; i++) {
      total += data.charCodeAt(i);
    }
    return total % this.table.length;
  }
  set(key, value) {
    const index = this.hash(key);
    if (this.table[index] === undefined) {
      this.table[index] = [[key, value]];
    } else {
      let found = false;
      for (let i = 0; i < this.table[index].length; i++) {
        if (this.table[index][i][0] === key) {
          this.table[index][i][1] = value;
          found = true;
          break;
        }
      }
      if (!found) {
        this.table[index].push([key, value]);
      }
    }
  }
  get(key) {
    const index = this.hash(key);
    if (this.table[index] === undefined) {
      return undefined;
    } else {
      for (let i = 0; i < this.table[index].length; i++) {
        if (this.table[index][i][0] === key) {
          return this.table[index][i][1];
        }
      }
      return undefined;
    }
  }
  remove(key) {
    const index = this.hash(key);
    if (this.table[index] === undefined) {
      return false;
    } else {
      for (let i = 0; i < this.table[index].length; i++) {
        if (this.table[index][i][0] === key) {
          this.table[index].splice(i, 1);
          if (this.table[index].length === 0) {
            this.table[index] = undefined;
          }
          return true;
        }
      }
      return false;
    }
  }
  display() {
    for (let i = 0; i < this.table.length; i++) {
      if (this.table[i] !== undefined) {
        console.log(`${i}: ${JSON.stringify(this.table[i])}`);
      }
    }
  }
}
const table = new HashTable();
table.set('apple', 1);
table.set('banana', 2);
table.set('cherry', 3);
console.log(table.get('apple'));
console.log(table.get('banana')); 
console.log(table.get('cherry')); 
table.remove('banana');
console.log(table.get('banana')); 
table.display();
