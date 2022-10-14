'use strict';

/**
 *  주어진 배열을 정렬하고 , 주어진 count 로 도달 할수 있는 배열A 최대 index 를 구하라
 *  ex) count 10  // A =  [3,5,6,2,1,9]
 *  - [1,2,3,5,6,9]  최대index 3
 */

const arrayValue = [3,5,6,2,1,9];
const countValue = 10;

const solution = (arr , count) => {
    arr.sort((a,b)=> a-b);

    for (let i = 0; i < arr.length; i++) {
        count -= arr[i];
        if(count < 0)
            return i;
    }
    return arr.length;
}

console.log(solution(arrayValue,countValue));
//pull_check
console.log(solution(arrayValue));

