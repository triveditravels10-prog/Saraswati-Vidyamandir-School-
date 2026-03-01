// knowledge_portal.ts
interface Student {
    name: string;
    cls: string;
    achievement: string;
}

const students: Student[] = [
    { name: "Rohan Kumar", cls: "10th", achievement: "Math Topper" },
    { name: "Anjali Singh", cls: "9th", achievement: "Debate Champion" }
];

console.log("Student List:");
students.forEach(s => console.log(`${s.name} | ${s.cls} | ${s.achievement}`));
