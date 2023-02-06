class Graph
{
    constructor()
    {
        this.adjancylist={};
    }
    addvertex(vertex)
    {
        if(!this.adjancylist[vertex])
        {
            this.adjancylist[vertex]=new Set();
        }
    }
   
    removeedge(vertex1, vertex2)
    {
        this.adjancylist[vertex1].delete(vertex2);
        this.adjancylist[vertex2].delete(vertex1);

    }
    addedge(vertex1, vertex2)
    {
        if(!this.adjancylist[vertex1])
        {
            this.addvertex(vertex1);
        }
        if(!this.adjancylist[vertex2])
        {
            this.addvertex(vertex2)
        }
        this.adjancylist[vertex1].add(vertex2);
        this.adjancylist[vertex2].add(vertex1);
    }

    display()
    {
        for(let vert in this.adjancylist)
        {
            console.log(vert+">"+[...this.adjancylist[vert]]);
        }
    }

    hasedge(vertex1, vertex2)
    {
        return (this.adjancylist[vertex1].has(vertex2)&&this.adjancylist[vertex2].has(vertex1));
    }

    deletevertex(vertex)
    {
        if(!this.adjancylist[vertex])
        {
            return null;
        }
        for(let adjvertex in this.adjancylist)
        {
            this.removeedge(vertex, adjvertex);
        }
        delete(this.adjancylist[vertex]);
    }
}
const g=new Graph();
g.addvertex("a");
g.addvertex("b");
g.addvertex("c");
g.addedge("a","b");
console.log(JSON.stringify(g));
g.addvertex("d");
g.addvertex("e");
g.addedge("d","e");
g.addedge("a","e");
console.log(JSON.stringify(g));
console.log(g.hasedge("a","e"));
g.display();
g.removeedge("a","b");
g.deletevertex("a");
console.log(JSON.stringify(g));
