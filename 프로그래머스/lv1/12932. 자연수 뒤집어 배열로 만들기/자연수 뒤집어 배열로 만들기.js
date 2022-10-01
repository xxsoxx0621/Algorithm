function solution(n) {
    var answer = [];
    var reverseN  = n.toString();
    for(var i=0; i< reverseN.length; i++){
        var n = reverseN.substring(i,i+1);
        answer.push(parseInt(n));
    }
    answer.reverse();
    return answer;
}