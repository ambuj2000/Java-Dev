package Collections;

import java.util.HashMap;

public class Hashmap_Internals {

//    Bilkul! Main hashmap ke internal workings ko Hinglish mein samjhaata hoon:
//
//    HashMap Kya Hai?
//    HashMap ek collection class hai Java mein jo key-value pairs ko store karta hai.
//    Matlab, har ek value ko ek unique key se associated kiya jata hai. Jab hume koi value
//    chahiye hoti hai, toh hum uski key ko use karke easily retrieve kar sakte hain.
//
//    Kaise Kaam Karta Hai HashMap?
//    Hash Function:
//    Jab aap koi key insert karte ho hashmap mein, toh sabse pehle us key ka hash code calculate
//    kiya jata hai. Hash code ek integer value hoti hai jo key se associated hoti hai.
//    Hash function ko use karke, yeh hash code compute kiya jata hai.
//
//    Index Calculation:
//    Hash code ke baad, ek index calculate kiya jata hai jo array (bucket array) mein us
//    key-value pair ko store karne ke liye use hota hai. Yeh index hash code ko array ki
//    length se mod karke nikalta hai.

//    index = hashCode % arrayLength;

//    Buckets:
//    HashMap internally ek array of nodes (buckets) use karta hai. Har ek index pe ek bucket
//    hoti hai jisme multiple entries store ho sakti hain. Agar do keys ka hash code same aata
//    hai (collision), toh wo entries ek hi bucket mein linked list ke form mein store hoti hain.
//
//    Collision Handling:
//    Jab collision hota hai (do keys ka same index hota hai), toh entries ko linked list ke form mein
//    store kiya jata hai. Java 8 se pehle, yeh simple linked list hoti thi. Java 8 ke baad, agar
//    entries ka number ek threshold se zyada ho jata hai, toh linked list ko balanced tree
//    (like Red-Black Tree) mein convert kar diya jata hai, taaki performance achhi rahe.
//
//    Insertion:
//    Jab aap koi key-value pair insert karte ho:
//
//    Hash code calculate hota hai.
//    Index nikalta hai.
//    Agar us index pe koi entry nahi hai, toh nayi entry wahan insert hoti hai.
//    Agar wahan pehle se koi entry hai, toh collision handling technique (linked list/tree) use hoti hai.
//    Retrieval:
//    Jab aap koi value retrieve karte ho key ko use karke:
//
//    Hash code calculate hota hai key ka.
//    Index nikalta hai.
//    Us index pe jaake, linked list/tree traverse karke sahi key match hone par value return ki jati hai.

//    Rehashing:
//    Jab hashmap ka load factor (entries ka number / bucket array ki length) ek certain threshold se
//    zyada ho jata hai, toh hashmap apni size ko double kar leta hai aur sabhi entries ko naye array mein
//    rehash kar leta hai. Is process ko rehashing bolte hain.
//
//    Example Code
//    Yeh ek simple example hai hashmap ke use ka:

        public static void main(String[] args) {
            HashMap<String, Integer> map = new HashMap<>();

            // Insert key-value pairs
            map.put("apple", 1);
            map.put("banana", 2);
            map.put("cherry", 3);

            // Retrieve value using key
            int value = map.get("banana");
            System.out.println("Value for 'banana': " + value);

            // Check if a key exists
            boolean hasApple = map.containsKey("apple");
            System.out.println("Has 'apple': " + hasApple);
        }
    }
