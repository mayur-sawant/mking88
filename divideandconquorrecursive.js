function binarysearch(arr,l,r,x)
{
    if(r>=l)
    {
        var mid=Math.floor((l+r)/2);
        if (arr[mid]==x)
        {
            return mid;
        }
        if(arr[mid]>x){
            return binarysearch(arr,l,mid-1,x);
        }
        else{
            return binarysearch(arr,mid+1,r,x);
        }
    }
    return -1;
}
let arr=[1,3,5,7,8,9]
let x=8;
console.log(binarysearch(arr,0,arr.length-1,x));

