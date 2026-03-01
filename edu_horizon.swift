// edu_horizon.swift
struct Student {
    let name: String
    let cls: String
    let achievement: String
}

let students = [
    Student(name: "Rohan Kumar", cls: "10th", achievement: "Math Topper"),
    Student(name: "Anjali Singh", cls: "9th", achievement: "Debate Champion")
]

print("Student List:")
for s in students {
    print("\(s.name) | \(s.cls) | \(s.achievement)")
}
