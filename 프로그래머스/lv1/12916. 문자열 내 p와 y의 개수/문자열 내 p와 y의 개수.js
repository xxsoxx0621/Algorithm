function solution(s){
    var answer = true;
    
    let str = s.toLowerCase();
    let count =0;
    for(let i =0; i < s.length; i++){
        if(str[i] === "p") count++;
        else if(str[i] === "y") count--
    }
    count === 0 ? answer = true : answer = false;
    return answer;
}