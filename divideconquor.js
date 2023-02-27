function BinarySearchIterative(arr,x,l,r)
{
    while(l<=r)
    {
        let mid=Math.floor((l+r)/2)
        if(arr[mid]===x)
        {
            return mid;
        }
        else if(arr[mid]<x)
        {
            l=mid+1;
        }
        else{
            r=mid+1;
        }
    }
    return false;
}
let arr=[1,3,5,7,8,9];
let x=5;
var index=BinarySearchIterative(arr,x,0,arr.length-1);
if(index){
    console.log("Element ",x," Found at index ",index);
}
else{
    console.log("Element ",x," Not Found");
}
