interface Person{
    id: number;
    name: string;
    showDetails():void;
}

class Student implements Person{
    id: number;
    name: string;
    enrollmentDate : string;
    enrolledCourses: string;

    constructor(id: number, name: string, enrollmentDate: string, enrolledCourses: string)
    {
        this.id = id;
        this.name = name;
        this.enrollmentDate = enrollmentDate;
        this.enrolledCourses = enrolledCourses;
    }

    showDetails(): void {
        console.log(`Student details: ID-${this.id}, Name-${this.name}, Enrollment Date-${this.enrollmentDate}, Enrolled Courses-${this.enrolledCourses}`);

    }

}

class Instructor implements Person 
{
    id: number;
    name: string;
    hireDate: string;
    cousesTaught: string;

    constructor(id: number, name: string, hireDate: string, coursesTaught: string)
    {
        this.id = id;
        this.name = name;
        this.hireDate = hireDate;
        this.cousesTaught = coursesTaught;
    }

    showDetails(): void {
        console.log(`Instructor Details: ID-${this.id}, Name-${this.name}, Hire date-${this.hireDate}, Courses taught-${this.cousesTaught}`);
    }
}


let student = new Student(1, "Sumithra", "19-09-2024", "GK");
let ins = new Instructor(2, "Hari", "8-08-16", "Gymnastics");

student.showDetails();
ins.showDetails();