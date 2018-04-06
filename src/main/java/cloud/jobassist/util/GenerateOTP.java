package cloud.jobassist.util;

public class GenerateOTP {
	public static Integer getOTP() {
		return (int) (Math.random() * 9000) + 10000;
	}
}
