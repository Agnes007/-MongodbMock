
public class ExceptionTest {
	
	
	
	public static void getCollection(){
		
		if(Exceptionconstant.deleteOneException.MongoException.get()==true){
			//throw MongoException
		}
		
	}
	
	
	
	
	public static void deleteOne(){
			
		if(Exceptionconstant.deleteOneException.MongoException.get()==true){
				//throw MongoException
		}
	}
		
		
	public static void main(String[] args){
			
		Exceptionconstant.deleteOneException.MongoException.set(true);
		System.out.println(Exceptionconstant.deleteOneException.MongoWriteConceptionException.get());
		System.out.println(Exceptionconstant.deleteOneException.MongoException.get());
		System.out.println(Exceptionconstant.deleteOneException.MongoWriteException.get());
			
	}
		
		
}
