using Microsoft.Data.SqlClient;
using System.Data;
using System.Transactions;

namespace Databases
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Menu();
            
        }
        static void Menu()
        {
            int choice;
            do { 
            Console.WriteLine("1.Insert   2.Update    3.Delete   4.Select");
            Console.WriteLine("Select option: ");
            choice = Int32.Parse(Console.ReadLine());
                switch (choice)
                {
                    case 1:
                        Console.WriteLine("Enter RollNo: ");
                        int rn = Int32.Parse(Console.ReadLine());
                        Console.WriteLine("Enter Name: ");
                        string name = Console.ReadLine();
                        Console.WriteLine("Enter Div: ");
                        string div = Console.ReadLine();

                        Student st = new Student() { RollNo = rn, Name = name, Div = div };
                        AddStudent(st);

                        break;
                    case 2:
                        Console.WriteLine("Enter RollNo of student to Update Record: ");
                        rn = Int32.Parse(Console.ReadLine());
                        Console.WriteLine("Enter Name: ");
                        name = Console.ReadLine();
                        Console.WriteLine("Enter Div: ");
                        div = Console.ReadLine();

                        st = new Student() { RollNo = rn, Name = name, Div = div };
                        UpdateStudent(st);
                        break;
                    case 3:
                        Console.WriteLine("Enter RollNo of Student to Delete: ");
                        rn = Int32.Parse(Console.ReadLine());
                        DeleteStudent(rn);
                        break;
                    case 4:
                        ViewData();
                        break;
                }
            }while (choice <= 4) ;

            
        }

        static void AddStudent(Student obj)
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = "Data Source=(localdb)\\ProjectModels;Initial Catalog=JkJan23;Integrated Security=True;";
            try
            {
                cn.Open();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = cn;
                cmd.CommandType = CommandType.StoredProcedure;
                cmd.CommandText = "AddStudent";
                cmd.Parameters.AddWithValue("@RollNo",obj.RollNo);
                cmd.Parameters.AddWithValue("@Name",obj.Name);
                cmd.Parameters.AddWithValue("@Div", obj.Div);

                int i = cmd.ExecuteNonQuery();
                Console.WriteLine(i+" student inserted in database");

            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }
            finally
            {
                cn.Close();
            }
        }

        static void UpdateStudent(Student obj)
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = "Data Source=(localdb)\\ProjectModels;Initial Catalog=JkJan23;Integrated Security=True;";
            try
            {
                cn.Open();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = cn;
                cmd.CommandType = CommandType.Text;
                cmd.CommandText = "update Student set Name=@Name,Div=@Div where RollNo=@ROllNo";
                cmd.Parameters.AddWithValue("@Name",obj.Name);
                cmd.Parameters.AddWithValue("@RollNo",obj.RollNo);
                cmd.Parameters.AddWithValue("@Div",obj.Div);

                int i = cmd.ExecuteNonQuery();
                Console.WriteLine(i + " student Upadated");
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }
            finally
            {
                cn.Close();
            }
        }

        static void DeleteStudent(int RollNo)
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = "Data Source=(localdb)\\ProjectModels;Initial Catalog=JkJan23;Integrated Security=True;";
            try
            {
                cn.Open();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = cn;
                cmd.CommandType = CommandType.Text;
                cmd.CommandText = "delete from Student where RollNo = @RollNo";
                cmd.Parameters.AddWithValue("@ROllNo",RollNo);

                int i = cmd.ExecuteNonQuery();
                Console.WriteLine(i+" student deleted");

            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }
            finally
            {
                cn.Close();
            }
        }

        static void ViewData()
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = "Data Source=(localdb)\\ProjectModels;Initial Catalog=JkJan23;Integrated Security=True;";
            try
            {
                cn.Open();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = cn;
                cmd.CommandType = CommandType.Text;
                cmd.CommandText = "select * from Student";

                SqlDataReader dr = cmd.ExecuteReader();
                while (dr.Read())
                {
                    Console.WriteLine(dr[0] + "\t" + dr[1] + "\t" + dr[2]);
                }
                dr.Close();
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }
            finally
            {
                cn.Close();
            }
        }
    }

    public class Student
    {
        public int RollNo { get; set; }
        public string Name { get; set; }
        public string Div { get; set; }

    }
}