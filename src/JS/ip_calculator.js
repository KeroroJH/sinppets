'use strict';

const ipToNum = (ip)=>{
    return Number(
      ip.split(".")
        .map(d => ("000"+d).substr(-3) )
        .join("")
    );
}

const numToIp = (num)=>{
    let i4 = num % 1000;
    let i3 = Math.floor(num / 1000) % 1000;
    let i2 = Math.floor(num / 1000 / 1000) % 1000;
    let i1 = Math.floor(num / 1000 / 1000 / 1000) % 1000;

    return i1+"."+i2+"."+i3+"."+i4;
}

const ipRangeToArray = (ip1,ip2)=>{
    let arr = [];
    let _ip1 = ipToNum(ip1)%1000;
    let _ip2 = ipToNum(ip2)%1000;
    
    let count = _ip2 - _ip1+1;
    let ipStart = ipToNum(ip1);
    for(let i=0; i < count; i++){
        //순차적으로 ip 넣기
        arr.push(numToIp(ipStart+i));
    }
    return arr;
}


const arr_diff = (a1, a2)=>{
    let a = [], diff = [];
    for (var i = 0; i < a1.length; i++) {
        a[a1[i]] = true;
    }
    for (let i = 0; i < a2.length; i++) {
        if (a[a2[i]]) {
            delete a[a2[i]];
        } else {
            // 전체 리스트에 없는 값이 나옴 .. 에러 
            a[a2[i]] = false;
            return false;
        }
    }
    for (let k in a) {
        diff.push(k);
    }
    return diff;
}

let hole = ipRangeToArray("12.16.2.80","12.16.2.99");

let used = [
    '12.16.2.84', '12.16.2.85',
    '12.16.2.86', '12.16.2.87',
    '12.16.2.88', '12.16.2.99'
];   

let re = arr_diff(hole, used);

console.log(re);



let r = ipRangeToArray("12.16.2.80","12.16.2.89");
//console.log(r);