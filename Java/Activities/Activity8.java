public class Activity8 {
    public static void main(String[] args) {
        
        try{
            Activity8.exceptionTest("String is not empty");
            Activity8.exceptionTest(null);
            
        }
        catch(CustomException CE){
System.out.println("Catch block : "+CE.getMessage());
        }
    }   
        public static void exceptionTest(String str) throws CustomException{
            if(str==null){
                throw new CustomException("String value is null");
            }
            else{
                System.out.println(str);
            }
    }

}
class CustomException extends Exception{
    private String message;
    public CustomException(String message){
        this.message=message;
    }
    @Override
public String getMessage() {
    return message;
}
}
