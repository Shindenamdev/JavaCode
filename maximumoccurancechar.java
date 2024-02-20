class maximumoccurancechar {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String s="namdevpatil";
        char occur='n';
        char[] cha=s.toCharArray();
        int count=0;
        for(int i=0;i<cha.length;i++){
            if(occur == cha[i]){
                count++;
            }
            
        }
        System.out.print("the maximum occurance;"+count);
    }
}
