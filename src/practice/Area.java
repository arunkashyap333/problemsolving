package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Area {
	
	int length;
	int width;
	
	void setDim(int length, int width) {
		this.length = length;
		this.width = width;
	}
	int getArea() {
		return length * width;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader ips = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ips);
		int length = Integer.parseInt(br.readLine());
		int width = Integer.parseInt(br.readLine());
		
		Area area = new Area();
		area.setDim(length, width);
		System.out.println(area.getArea());
		
	}

}
