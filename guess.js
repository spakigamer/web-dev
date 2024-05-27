let y=prompt("enter the max");
console.log(y);
let ran=Math.floor(Math.random()*y)+1;
let r=prompt("enter the guess");
while(true){
    if(r==ran){
        console.log("guess is right you won!")
        break;
    }
    if(r=='quit'){
        break;
    }
    else{
        if(r<ran){
            r=prompt("guess is wrong enter a greater no. then before");
        }
        else{
            r=prompt("guess is wrong enter a smaller no. then before");
        }
    }
}