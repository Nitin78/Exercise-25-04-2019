import * as readline from 'readline';
 let valFromRuntime = readline.createInterface({
    input: process.stdin,
    output: process.stdout
  });
  valFromRuntime.question('Enter the Number ', function(answer) {
    var n = parseInt(answer);
  
var i,fact=1;
for(i=1;i<=n;i++)
fact=fact*i;
console.log(fact);
valFromRuntime.close();
  });