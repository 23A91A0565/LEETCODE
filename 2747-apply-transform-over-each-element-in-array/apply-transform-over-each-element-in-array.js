/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    var i=0;
    for(i=0;i<arr.length;i++){
        arr[i]=fn(arr[i],i);
    }
    return arr;
};