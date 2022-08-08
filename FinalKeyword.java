class another {
     final int id;
     another(){
         id = 104;
     }
     int get(){
         return id;
     }
}

class FinalKeyword{
    
    public static void main(String[] args) {
        
         another ob = new another();
         System.out.println(ob.get());
        
    }
}
