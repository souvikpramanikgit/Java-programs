class argument_4 {
    public static void main(String args[]){
        int num,i,max;
        try {
            max = Integer.parseInt(args[0]);
            for (i = 1; i < args.length; i++) {
                num = Integer.parseInt(args[i]);
                if (max < num) {
                    max = num;
                }
            }
                System.out.println("Largest= " + max);
        }
        catch(Exception e) {
            System.out.println("Error occured");
        }
    }
}
