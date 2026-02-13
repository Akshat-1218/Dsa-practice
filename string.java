
public class string {
    public static void printLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static boolean ispalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            int n = str.length();
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static float getPath(String path){
        int x = 0, y = 0;
        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            switch (dir) {
                case 'S':
                    y--;
                    break;
                case 'N':
                    y++;
                    break;
                case 'E':
                    x++;
                    break;
                default:
                    x--;
                    break;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2 + y2);
    }
    public static String substring(String s1,int si,int ei){
        String sub = "";
        for(int i=si;i<ei;i++){
            sub += s1.charAt(i);
        }
        return sub;
    }
    public static String toUppercase(String name){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(name.charAt(0));
        sb.append(ch);
        for(int i=1;i<name.length();i++){
            if(name.charAt(i)==' ' && i<name.length()-1){
                sb.append(name.charAt(i));
                i++;
                sb.append(Character.toUpperCase(name.charAt(i)));
            }
            else{
                sb.append(name.charAt(i));
            }
        }
        return sb.toString();
    }
    public static String compress(String str){
        String newStr = "";
        for(int i=0;i<str.length();i++){
            Integer count =1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count>1){
                newStr += count.toString();
            }
        }
        return newStr;
    }

    // practice

    public static boolean palindrome(String str){
        int n = str.length();
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static float getShortestPath(String str){
        int x = 0;
        int y = 0;
        for(int i=0;i<str.length();i++){
            char ans = str.charAt(i);
            if(ans == 'S'){
                y--;
            }
            else if(ans == 'W'){
                x--;
            }
            else if(ans == 'E'){
                x++;
            }
            else if(ans == 'N'){
                y++;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void largestString(String fruits[]){
        String largest = fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest = fruits[i];
            }
        }
        System.out.println("Largest string is :- "+largest);
    }
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' '){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                            sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static String compression(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count.toString());
            }    
            }
            return sb.toString();
        }
    public static void main(String[] args) {
        // char arr[] = {'a','b','c','d'};
        // String str = "abcd";
        // String str1 = new String("xyz123");

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name=sc.nextLine();
        // System.out.println(name);

        // String fullName = "Tony Stark";
        // System.out.println(fullName.length());            // length

        // concatenation

        // String firstName = "Akshat";
        // String lastName = "Pandey";
        // String fullName = firstName + " " + lastName;
        // printLetters(fullName);
        // System.out.println(fullName);
        // System.out.println(fullName.charAt(0));           // character at which index

        // String str = "racecar";
        // System.out.println(ispalindrome(str));

        // String path = "WNEENESENNN";
        // System.out.println(getPath(path));

        // String s1 = "TonyStark";
        // String s2 = new String("Tony");
        // if(s1.equals(s2)){
        //     System.out.println("Strings are equal");
        // }
        // System.out.println(substring(s1, 0, 5));
        // System.out.println(s1.substring(0, 7));

        // String fruits[] = {"apple" , "mango" , "banana"};
        // String largest = fruits[0];
        // for(int i=1;i<fruits.length;i++){
        //     if(largest.compareToIgnoreCase(fruits[i])<0){
        //         largest = fruits[i];
        //     }
        // }
        // System.out.println(largest);

        // StringBuilder sb = new StringBuilder("");
        // for(char ch='a';ch<='z';ch++){
        //     sb.append(ch);
        // }
        // System.out.println(sb);
        // System.out.println(sb.length());

        // String name = "hi, my name is akshat";
        // System.out.println(toUppercase(name));                        to uppercase
        
        String str = "aaabbbccccc";
        String fruits[] = {"apple","mango","banana"};
        // System.out.println(compress(str));
        // System.out.println(palindrome(str));
        // System.out.println(getShortestPath(str));
        // largestString(fruits);
        // System.out.println(toUpperCase(str));
        System.out.println(compression(str));

    }
}