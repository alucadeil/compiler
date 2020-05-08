# Set language compiler

# How to install
  - download this repo
  - open this project in your favorite IDE with installed ANTLR v4 module
  
# How to run
  - run Main.java 

It parse test1.st file into java program
The generated file will be located (project_directory)/compiled/scr/result/Main.java
It will be accompanied with "Set" and "Element" classes


# Grammar
Grammar file located: (project_directory)/scr/main/java/compiler/grammar/setGrammar.g4

# Demo

## Test1.st: 
```
    main {
    set st = "test set"
    integer a = 3
    switch(a) {
    case 3: 
    	print a
    case 2:
    	print 2
    default:
    }
    element e1 = "test e1"
    element e2 = "test e2"
    element e3 = "2"
    element e4 = e3
    st <- e1, e2, e3, e4

    if (st <?> e1){
        print "set st contains e1"
    }
}
```
## Generated Main.java: 
```java
package result;
public class Main {
public static void main(String[]args) throws Exception{
Set st = new Set("test set");
Integer a = new Integer(3);
switch (a) { 
	case 3: 
		System.out.println(a);
		break;
	case 2: 
		System.out.println(2);
		break;
	default: 
		break;
}
Element e1 = new Element("test e1");
Element e2 = new Element("test e2");
Element e3 = new Element("2");
Element e4 = e3;
st.add(e1).add(e2).add(e3).add(e4);
if (st.contains(e1)){
System.out.println("set st contains e1");
}
}
}

```

# Enjoy!
