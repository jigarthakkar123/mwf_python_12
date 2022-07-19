import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student1 implements Serializable
{
	int rno;
	String sname;
	double per;
	public Student1(int rno, String sname, double per) {
		this.rno = rno;
		this.sname = sname;
		this.per = per;
	}
	public String toString() {
		return "Roll No : "+rno+"\nStudent Name : "+sname+"\nPercentage : "+per;
	}
}
public class SerializationDemo {

	public static void main(String[] args) throws Exception {
		Student1 s1=new Student1(1, "Jigar", 78.78);
		FileOutputStream fos=new FileOutputStream("ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.flush();
		oos.close();
		System.out.println("Object Written Successfully");
		
		FileInputStream fis=new FileInputStream("ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Student1 s2=(Student1) ois.readObject();
		ois.close();
		System.out.println(s2);
	}
}
