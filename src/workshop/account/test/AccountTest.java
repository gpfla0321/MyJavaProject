package workshop.account.test;

import workshop.account.entity.Account;
import workshop.account.exception.InsufficientBalanceException;

public class AccountTest {
	public static void main(String[] args) {
		//Account ��ü
		Account account = new Account("A110", "221-22-3477", 100000);
		System.out.println(account);	//account.toString()
		System.out.println("������ȣ: "+account.getCustId());
		System.out.println("���¹�ȣ: "+account.getAcctId());
		System.out.println("�ܾ�: "+account.getBalance());
		
		System.out.println("10000�� �Ա�");
		account.deposit(10000);
		System.out.println("�ܾ�: "+account.getBalance());
		
		System.out.println("20000�� ���");
		try {
			account.wihdraw(20000);
			System.out.println("�ܾ�: "+account.getBalance());
			
			account.wihdraw(100000);
			System.out.println("�ܾ�: "+account.getBalance());
			
		} catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
