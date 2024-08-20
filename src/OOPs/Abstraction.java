// Java mein abstraction achieve karne ke liye primarily do tarike hain:

// 1. Abstract Classes ka use karke:
// Abstract classes wo classes hoti hain jisme kuch methods ko define (implement) kiya jata hai aur kuch methods ko sirf declare
//   kiya jata hai (unhe subclass me implement karna hota hai).
// Abstract class ka object nahi bana sakte, lekin usko inherit karke uski subclass bana sakte hain jisme abstract methods ko implement karte hain.
// Example:

abstract class Animal {
    // Abstract method (no implementation)
    abstract void sound();

    // Non-abstract method
    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    // Implementing the abstract method
    void sound() {
        System.out.println("Woof Woof");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();  // Output: Woof Woof
        dog.sleep();  // Output: Sleeping...
    }
}


// 2. Interfaces ka use karke:
// Interface pure abstraction provide karta hai. Isme saare methods abstract hote hain (Java 8 ke baad default aur static methods ke exceptions ke saath).
// Interface me methods sirf declare kiye jate hain, unhe implement karna subclass (jo interface ko implement karegi) ka kaam hota hai.
// Example:

interface Animal {
    void sound();  // Abstract method
}

class Dog implements Animal {
    // Implementing the abstract method
    public void sound() {
        System.out.println("Woof Woof");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();  // Output: Woof Woof
    }
}

// Summary:
// Abstract Class tab use hoti hai jab kuch methods ko define karna ho aur kuch ko sirf declare karna ho.
// Interface tab use hota hai jab sirf methods declare karna ho (pure abstraction chahiye ho).
