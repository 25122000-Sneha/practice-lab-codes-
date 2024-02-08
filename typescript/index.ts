var names: string[] = ["Sumi", "Hari"];
var marks: number[] =[89, 92];
 
// Display names and marks using a for loop
for(let i=0; i<names.length; i++){
 console.log(names[i]+":"+marks[i]);
}
console.log(findAvg(marks));
 
// Display the average marks
 
// console.log(`\nAverage Marks:`);
 
// index.ts
export function findAvg(marks: number[]): number {
 //you have to complete logic
 let averageMarks=0,sum=0;
 for(let i=0;i<marks.length;i++){
   sum=sum+marks[i];
   averageMarks = sum/marks.length;
 }
 
   return averageMarks;
}
 