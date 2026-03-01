# backend.py
from flask import Flask, request, jsonify

app = Flask(__name__)

students = [
    {"name":"Rohan Kumar","class":"10th","achievement":"Topper in Math"},
    {"name":"Anjali Singh","class":"9th","achievement":"Debate Champion"}
]

faculty = [
    {"name":"Mr. Sharma","subject":"Physics","experience":"10 years"},
    {"name":"Ms. Verma","subject":"English","experience":"8 years"}
]

@app.route("/get_students")
def get_students():
    return jsonify(students)

@app.route("/get_faculty")
def get_faculty():
    return jsonify(faculty)

@app.route("/contact", methods=["POST"])
def contact():
    data = request.json
    print(f"New message from {data['name']}: {data['message']}")
    return jsonify({"status":"success","message":"Message received!"})

if __name__ == "__main__":
    app.run(debug=True)
