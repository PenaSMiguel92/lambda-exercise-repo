public class StaticMethodReference {
public static void main(String[] args) {
BiFunction customFI = 
int sum = customFI.apply(10, 20);
System.out.println(Addition:  + sum);
}

public static int addition(int a, int b) {
return a + b;
} 
