package _05_vault;

public class VaultRunner {
public static void main(String[] args) {
	Vault vault = new Vault();
	Spy spy = new Spy("James Bond");
	int code =spy.findCode(vault);
	System.out.println(code);
}
}
