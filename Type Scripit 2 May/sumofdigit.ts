   /* 
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        m = s.nextInt();
       */

        
 import * as readline from 'readline';
 let valFromRuntime = readline.createInterface({
    input: process.stdin,
    output: process.stdout
  });
  var m, n, sum = 0;
  valFromRuntime.question('Enter the Number ', function(a) {
 var m = parseInt(a);
   
   while(m)
        {
            
            sum += m % 10;
            m = Math.floor(m / 10);
        } 
        console.log(sum);
        valFromRuntime.close(); 
 });
