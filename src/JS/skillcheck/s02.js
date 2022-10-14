'use strict';

const make10to3 = (num)=>{
    if(num < 3)
        return num;
    let arr = [];
    let _num = num;
    while(_num > 3){
        let e = _num % 3;
        arr.push(e);
        _num = Math.floor(_num / 3);
    }
    arr.push(_num);
    return arr.reverse();
}

const make3to10 = (num)=>{
    let numArr = Array.from(num.toString()).map(Number);
    let result = 0;
    for (let i = 0; i < numArr.length; i++) {
        let q = numArr.length-1 - i;
            if(q > 0) {
                result += Math.pow(3,q) * numArr[i];
            }else{
                result += numArr[i];
            }
    }
    return result;
}


let init_v = 42;
//10진수 3진수로 변환
let v1 = make10to3(init_v);
console.log("10=>3 ",init_v," and ",v1.join("") );
//pull_check
console.log("10=>3 ",init_v," and ",v1.join("") );

