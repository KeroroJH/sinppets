
/* join() 배열 요소를 문자열로 리턴 */
{
    const fruits = ['apple','banana','orange'];
    const result = fruits.join();
    console.log(result);
    //apple,banana,orange
}


/* reverse()  배열 순서 뒤집기 */
{
    const array = [1,2,3,4,5];
    array.reverse();
    console.log(array);
    // [5,4,3,2,1]
}


/* splice() 배열 요소 를 삭제 */
{
    const arr = [1,2,3,4,5];
    arr.splice(0,2);
    console.log(arr);
    // [ 3, 4, 5 ]
}


/* slice() 벼열을 잘라서 새로운 배열 리턴 */
{
    const arr = [1,2,3,4,5];
    const result = arr.slice(2,5);
    console.log(result);
    // [ 3, 4, 5 ]
}


class Student{
    constructor(name,age,isMale,score) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
        this.score = score;
    }
}
const students = [
    new Student("A",13,false,45),
    new Student("B",14,true,50),
    new Student("C",15,false,55),
    new Student("D",16,true,60),
    new Student("E",17,false,65)
];


/*  find()  조건에 맞는 첫번째 요소 를 리턴 */
{
    //score 가 45 인 학생 찾기
    const result = students.find(student => student.score === 45);
    console.log(result);
}


/* filter() 조건에 맞는 요소들을 새로운 배열로 리턴*/
{
    //isMale 이 false 인 학생 모으기
    const result = students.filter(student => !student.isMale);
    console.log(result);
}


/* map() 배열 요소를 재가공 하여 새로운 배열 리턴 */
{
    // score 점수를 2배 곱해서 배열로 만들기
    const result = students.map(student => student.score*2);
    console.log(result);
}


/* some() 배열의 요소중 조건에 맞는 요소가 하나라도 있는면 true 리턴 */
{
    // score 가 50 점 이하의 학생이 한명이라도 있는지 확인
    const result = students.some(student => student.score < 50);
    console.log("some() : ",result);
}


/* every() 배열의 모든 요소가 조건에 맞으면 true */
{
    // score 가  모두 50점 이상인지 확인
    const result = students.every(student => student.score >= 50);
    console.log("every() : ",result);
}


/* reduce() 모든배열을 돌면서 어떤 값을 누적할때 사용
// 첫번째 인자 로 누적된 값을 전달 , 두번째 인자 는 배열의 모든 요소를 한번씩 전달   초기 값을 전달할수도 있음
//reduceRight() 이건 마지막 요소부터 시작
*/
{
    //학생 score 평균을 구하라
    const result = students.reduce((prev,curr) => prev+curr.score ,0);
    const avg = result / students.length;
    console.log("reduce() : ",result,avg);
}
