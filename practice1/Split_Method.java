package practice1;

import java.util.Arrays;

public class Split_Method {
public static void main(String[] args) {

	String a="My name is shri";
	System.out.println(a);
	String[] s2=a.split(" ",6);
	System.out.println(Arrays.toString(s2));
}

}