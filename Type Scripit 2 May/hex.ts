// Write a program which prints the hex-decimal equivalent of a decimal number entered at runtime

import * as readline from 'readline';
var num = readline.createInterface({
    input: process.stdin,
    output: process.stdout

});
num.question(`enter decimal number`, (answer) => {
    function decimalToHexString(number)
{
    if(number<0)
    {
        number = 0xFFFFFFFF + number +1;
    }
return number.toString(16).toUpperCase();
}
console.log(decimalToHexString(parseInt(answer)));
num.close();
});