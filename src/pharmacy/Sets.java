package pharmacy;

public class Sets {
    String medicine_name,company_name,manufacture_date,expiry_date;
    int Id,quantity;
    public Sets(int Id,String medicine_name, String company_name,int quantity,String manufacture_date,String expiry_date){
        this.medicine_name = medicine_name;
        this.Id = Id;
        this.company_name = company_name;
        this.quantity = quantity;
        this.manufacture_date = manufacture_date;
        this.expiry_date = expiry_date;
}
    
    public int getId(){
    return Id;
    }
    
    public String getmedicine_name(){
    return medicine_name;
    }
    
     public String getcompany_name(){
    return company_name;
    }
       
      public int getquantity(){
    return quantity;
    }
          
       public String getmanufacture_date(){
    return manufacture_date;
    }
         
        public String getexpiry_date(){
    return expiry_date;
    }
               
    }   
