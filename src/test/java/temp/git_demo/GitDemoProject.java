package temp.git_demo;

public class GitDemoProject {
	
	public void addData(String data) {
		System.out.println("data = "+data);
		
		if(data.equals(Constant.DATA_TYPE)) {
			System.out.println("Welcome");
		}
	}

	public static void main(String[] args) {
		System.out.println("hello world");

	}

}
