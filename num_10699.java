package print;
import java.text.SimpleDateFormat;
import java.util.Date;

public class num_10699 {
	public static void main(String[] args) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String time = format.format(date);
		System.out.println(time);
	}
}