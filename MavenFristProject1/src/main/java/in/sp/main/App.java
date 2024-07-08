package in.sp.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.sp.resources.SpringConfigfile;



public class App 
{
    public static void main( String[] args )
    {
    	
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigfile.class);
        
      JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
      
//      int std_rollno = 103;
//  	  String std_name = "Parkash";
//  	  float std_marks = 99.3f;
//      String insert_sql_query = "Insert into Student value(?,?,?)";
//      
//      int i = jdbcTemplate.update(insert_sql_query, std_rollno, std_name, std_marks);
//      
//      if(i>0)
//      {
//    	  System.out.println("Insertion seccess");
//      }
//      else
//      {
//    	  System.out.println("Insertion not seccess");
//     }
      
//      
//      float marks = 99.0f;
//      int rollno = 102;
//      
//      String update_sql_query = "Update Student set std_marks=? where std_rollno=?";
//      
//      int count = jdbcTemplate.update(update_sql_query,marks,rollno);
//      
//      if(count > 0)
//       {   	  System.out.println("Update seccess");
//      }
//      else
//      {
//    	  System.out.println("Update feiled");
//        
//       }
//      
      
      int rollno = 102;
      
      String delete_sql_query = "Delete from Student where std_rollno=?";
      int count = jdbcTemplate.update(delete_sql_query,rollno);
      
      if(count > 0)
      {
    	  System.out.println("Delete Seccess");
      }
      else
      {
    	  System.out.println("Delete failed");
      }
    }
}
