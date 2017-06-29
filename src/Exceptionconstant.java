
public class Exceptionconstant  {
		public static enum bulkWritenException {
			MongoBulkWriteException(false), 
			MongoException(false);
			
			boolean tag = false;
			bulkWritenException(boolean flag){
				tag=flag;
			}
			
			public void set(boolean flag){
				tag = flag;
			}		
			
			public boolean get(){
				return tag;
			}
		}
		
	
		public static enum replaceOneException {
			MongoWriteException(false),
			MongoWriteConceptionException(false), 
			MongoException(false);
			
			boolean tag = false;
			replaceOneException(boolean flag){
				tag=flag;
			}
			
			public void set(boolean flag){
				tag = flag;
			}		
			
			public boolean get(){
				return tag;
			}
		}
		
		
		public static enum deleteOneException {
			MongoWriteException(false),
			MongoWriteConceptionException(false), 
			MongoException(false);
			
			boolean tag = false;
			deleteOneException(boolean flag){
				tag=flag;
			}
			
			public void set(boolean flag){
				tag = flag;
			}		
			
			public boolean get(){
				return tag;
			}
		}
}
