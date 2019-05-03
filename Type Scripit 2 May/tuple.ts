//- Write a program which take a key from user at runtime and then checks whether it exists in the tuple. If it is found, prints it's corresponding value

import * as readline from 'readline';
let val = readline.createInterface ({
input: process.stdin,
output: process.stdout
});
var tup =[[0,"a"],[1,"b"]];
val.question('Enter a value', (answer)=>
{
  console.log(answer);
    var index;
    var ans=parseInt(answer);
  var len = tup.length;
  var flag=0;
  var temp;
  for (index in tup) {
    if (tup[index][0]==ans) 
    {
        flag=1;
        temp=index;
    }
    }
    if (flag==1) {
        console.log(`The value for given key is ${tup[temp][1]}`);
        
    } 
    else {
        console.log(`Key does not exist`);
    }
  val.close();

});