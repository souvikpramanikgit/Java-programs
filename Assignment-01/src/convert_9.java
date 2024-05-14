class convert_9 {

    public static void main(String args[]){

        int mile;
        double kilometer;
        try {
            mile = Integer.parseInt(args[0]);
            kilometer =(mile * (1.6));
            System.out.println("Kilometers: " + kilometer);
        }
        catch (Exception e){
            System.out.println("Error occurs");
        }
    }
}