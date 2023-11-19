class program78{
    public static void main(String args[]){
        String str = "Hello World!";
        System.out.println("Original string: "+str);
        
        char ch = 'o';
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c != ch){
                sb.append(c);
            }         
        }
        String result=sb.toString().trim();
        System.out.print("New string after removing "+result);
    }
}