// learning_forge.rs
#[derive(Debug)]
struct Student {
    name: String,
    class: String,
    achievement: String,
}

fn main() {
    let students = vec![
        Student {
            name: String::from("Rohan Kumar"),
            class: String::from("10th"),
            achievement: String::from("Math Topper"),
        },
        Student {
            name: String::from("Anjali Singh"),
            class: String::from("9th"),
            achievement: String::from("Debate Champion"),
        },
    ];

    println!("Student List:");
    for s in students {
        println!("{} | {} | {}", s.name, s.class, s.achievement);
    }

    // Transport simulation
    let transport_routes = vec!["City Center -> School", "Station -> School", "Residential Area -> School"];
    println!("\nTransport Routes:");
    for route in transport_routes {
        println!("{}", route);
    }
}
