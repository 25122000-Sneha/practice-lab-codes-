
let names: string[] = ["Chocolate", "Sweets", "Yoghurt", "Butter", "Milk"];
let prices: number[] = [95.50, 150, 60.25, 70, 85];

for(let i=0; i<names.length; i++)
{
    console.log(`product: ${names[i]}, price: ${prices[i]}`);
}

console.log("Average price : "+findAvg(prices));

function findAvg(prices: number[]) : number 
{
    let avg = 0.0, sum = 0.0;
    for(let i=0; i<prices.length; i++)
    {
        sum += prices[i];
    }
    avg = sum/prices.length;
    return avg;
}

