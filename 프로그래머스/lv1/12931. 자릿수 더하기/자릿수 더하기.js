function solution(n)
{
    var answer = 0;
    var temp = n.toString();
    for(let i=0; i < temp.length; i++){
           answer += Number(temp.slice(i,i+1))
    }
    // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    console.log(temp.slice(0,1))

    return answer;
}