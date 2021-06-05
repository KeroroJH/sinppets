'use strict';

//입력 받은 두 수의 범위로 배열 리턴
const makeArrAtoB = (startNum, endNum)=>{
   return Array.from({length: endNum - startNum + 1},(_,i)=> startNum+i);
}

class ArrDiv{
    num = 0;
    isDivNonRest = false;
    divNonRestList = [];

    constructor(num) {
        this.num = num;
        this.calculateDivNonRest()
    }

    calculateDivNonRest(){
        for (let i = 1; i <= this.num; i++) {
            let v = this.num % i;
            if(v === 0){
                this.divNonRestList.push(i);
            }
        }
        this.isDivNonRest = this.divNonRestList.length % 2 === 0;
    }
}

let result = 0;

makeArrAtoB(24,27)
    .forEach(o => {
        let ar = new ArrDiv(o);
        if(ar.isDivNonRest)
            result += o;
        else
            result -= o;
    });

console.log(result);



/*

문제 설명
두 정수 left와 right가 매개변수로 주어집니다. left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ left ≤ right ≤ 1,000
입출력 예
left	right	result
13	17	43
24	27	52
입출력 예 설명
입출력 예 #1

다음 표는 13부터 17까지의 수들의 약수를 모두 나타낸 것입니다.
수	약수	약수의 개수
13	1, 13	2
14	1, 2, 7, 14	4
15	1, 3, 5, 15	4
16	1, 2, 4, 8, 16	5
17	1, 17	2
따라서, 13 + 14 + 15 - 16 + 17 = 43을 return 해야 합니다.
입출력 예 #2

다음 표는 24부터 27까지의 수들의 약수를 모두 나타낸 것입니다.
수	약수	약수의 개수
24	1, 2, 3, 4, 6, 8, 12, 24	8
25	1, 5, 25	3
26	1, 2, 13, 26	4
27	1, 3, 9, 27	4
따라서, 24 - 25 + 26 + 27 = 52를 return 해야 합니다.


* */