package arrays;

class LearnArrays{
    public static void main(String[] args) {
        int[] intarray= new int[10];
        double[] doublearray = new double[30];

       for(int i: intarray){
           System.out.println(i);
       } 
       intarray[5]=10;
       intarray[8]=20;
       System.out.println("the new array is");
       for (int i : intarray){
            System.out.println(i);
           
       }

        Friend karenFriend = new Friend( "karen", 5);
        System.out.println("hi "+ karenFriend.name + karenFriend.age);

       //Created arrays of type Friend 
    Friend[] friends= new Friend[2];
    
    Friend nolFriend = new Friend("nolan", 10);
    Friend karFriend = new Friend("karen", 5);

    friends[0]=nolFriend;
    friends[1]=karFriend;

    for (Friend j : friends) {
        
    System.out.println(j.name);
    }
    }

}