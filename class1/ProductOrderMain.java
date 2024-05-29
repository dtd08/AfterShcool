package class1;

import java.util.Arrays;
import java.util.Scanner;

public class ProductOrderMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = 3;
		
		ProductOrder[] pos = new ProductOrder[N];
		
		for(int i=0; i<N; i++) {
			pos[i] = new ProductOrder();
			pos[i].productName = sc.next();
			pos[i].price = sc.nextInt();
			pos[i].quantity = sc.nextInt();
		}
		
		int sum = 0;
		for(ProductOrder po : pos) {
			System.out.printf("상품명: %s, 가격: %d, 수량: %d\n", po.productName, po.price, po.quantity);
			sum += po.price * po.quantity;
		}
		System.out.println("총 결제 금액: " + sum);
		
	}
}
