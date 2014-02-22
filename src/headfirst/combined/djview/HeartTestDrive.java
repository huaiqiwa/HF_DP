package headfirst.combined.djview;
import java.util.*;
  
public class HeartTestDrive {
	
	public void test() {
		statictest();
	}
	
	private static void statictest() {
		ArrayList<Integer>[] a = (ArrayList<Integer>[]) new ArrayList[5];
	}

    public static void main (String[] args) {
		HeartModel heartModel = new HeartModel();
        ControllerInterface model = new HeartController(heartModel);
    }
}
