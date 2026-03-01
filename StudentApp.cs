using System;
using System.Collections.Generic;
class Student { public string Name, Class, Achievement; public Student(string n,string c,string a){Name=n;Class=c;Achievement=a;} }
class Program { static void Main(){
    List<Student> students = new List<Student>{ new Student("Rohan","10th","Math Topper"), new Student("Anjali","9th","Debate Champion") };
    foreach(var s in students) Console.WriteLine($"{s.Name} | {s.Class} | {s.Achievement}");
}}
