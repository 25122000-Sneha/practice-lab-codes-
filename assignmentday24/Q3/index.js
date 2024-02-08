var Student = /** @class */ (function () {
    function Student(id, name, enrollmentDate, enrolledCourses) {
        this.id = id;
        this.name = name;
        this.enrollmentDate = enrollmentDate;
        this.enrolledCourses = enrolledCourses;
    }
    Student.prototype.showDetails = function () {
        console.log("Student details: ID-".concat(this.id, ", Name-").concat(this.name, ", Enrollment Date-").concat(this.enrollmentDate, ", Enrolled Courses-").concat(this.enrolledCourses));
    };
    return Student;
}());
var Instructor = /** @class */ (function () {
    function Instructor(id, name, hireDate, coursesTaught) {
        this.id = id;
        this.name = name;
        this.hireDate = hireDate;
        this.cousesTaught = coursesTaught;
    }
    Instructor.prototype.showDetails = function () {
        console.log("Instructor Details: ID-".concat(this.id, ", Name-").concat(this.name, ", Hire date-").concat(this.hireDate, ", Courses taught-").concat(this.cousesTaught));
    };
    return Instructor;
}());
var student = new Student(1, "Sumithra", "19-09-2024", "GK");
var ins = new Instructor(2, "Hari", "8-08-16", "Gymnastics");
student.showDetails();
ins.showDetails();
