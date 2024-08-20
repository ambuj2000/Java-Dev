String s1 = "Hello"; // Stored in String Pool
String s2 = "Hello"; // Points to the same "Hello" in String Pool

String s3 = new String("Hello"); // Stored in Heap
String s4 = s3.intern(); // s4 now refers to the String Pool version of "Hello"
