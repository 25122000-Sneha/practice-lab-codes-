"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.findAvg = void 0;
var names = ["Sumi", "Hari"];
var marks = [89, 92];
// Display names and marks using a for loop
for (var i = 0; i < names.length; i++) {
    console.log(names[i] + ":" + marks[i]);
}
console.log(findAvg(marks));
// Display the average marks
// console.log(`\nAverage Marks:`);
// index.ts
function findAvg(marks) {
    //you have to complete logic
    var averageMarks = 0, sum = 0;
    for (var i = 0; i < marks.length; i++) {
        sum = sum + marks[i];
        averageMarks = sum / marks.length;
    }
    return averageMarks;
}
exports.findAvg = findAvg;
