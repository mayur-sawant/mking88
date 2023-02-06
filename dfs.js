class dfs
{
    constructor(v)
    {
        this.V=v;
        this.adj=new Array(v);
        for(let i=0; i<v; i++)
        {
            this.adj[i]=[];
        }
    }

    addedge(v, w)
    {
        this.adj[v].push(w);
    }

    DFSUtil(v, visited)
    {
        visited[v]=true;
        console.log(v+" ");
        for (let i of this.adj[v].values())
        {
            let n=i;
            if (!visited[n]) this.DFSUtil(n, visited)
        }
    }

    DFS(v)
    {
        let visted= new Array (this.V);
        for(let i=0; i<this.V; i++)
        {
            visted[i]=false;
        }
        this.DFSUtil(v, visted);
    }
}

g= new dfs(6);

g.addedge(0,1);
g.addedge(1,2);
g.addedge(2,3);
g.addedge(3,4);
g.addedge(4,5);
g.addedge(5,0);
g.addedge(2,5);

console.log(
    "following is depth first travelsal" + "(starting from vretex 2)"
);
g.DFS(2);
