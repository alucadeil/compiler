// program Test2_st compiled on Fri May 08 16:03:59 MSK 2020
package result;
public class Main {
private static void log(Element data){
System.out.println(data);
}
public static void main(String[]args) throws Exception{
Set st = new Set("test set");
Set e2 = new Set("test set2");
Element e1 = new Element("e1");
Element e3 = new Element("2");
st.add(e1).add(e2).add(e3);
for (Element el : st.getElements()){
log(el);
}
}
}
