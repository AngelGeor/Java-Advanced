package DefiningClasses_Lab.BankAccountInfo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer,BankAccount> accounts = new HashMap<>(); //Pazim ID -> accounts

        String[] lineData = scanner.nextLine().split("\\s+");

        String command = lineData[0];

        while(!command.equals("End")){

            String result = "";

            switch (command) {
                case "Create":
                    BankAccount bankAccount = new BankAccount();
                    accounts.put(bankAccount.getId(), bankAccount);
                    result = String.format("Account ID%d created", bankAccount.getId());
                    break;
                case "Deposit":
                    int accountID = Integer.parseInt(lineData[1]);
                    double money = Double.parseDouble(lineData[2]);

                if (accounts.containsKey(accountID)){
                    BankAccount bankAccountFromMap = accounts.get(accountID);
                    bankAccountFromMap.deposit(money);
                    accounts.put(accountID, bankAccountFromMap);
                    result = String.format("Deposited %.0f to ID%d",money,accountID);
                }else {
                    result = "Account does not exist";
                }
                    break;
                case "SetInterest":
                    double interestRate = Double.parseDouble(lineData[1]);
                    BankAccount.setInterestRate(interestRate);
                    break;
                case "GetInterest":
                    int accountId = Integer.parseInt(lineData[1]);
                    int years = Integer.parseInt(lineData[2]);

                    if(accounts.containsKey(accountId)){
                        BankAccount bankAccount2 = accounts.get(accountId);
                        double totalInterest =  bankAccount2.getInterest(years);
                        result = String.format("%.2f",totalInterest);
                    }else {
                        result = "Account does not exist";
                    }
                    break;
            }
            if(!result.isEmpty()) {
                System.out.println(result);
            }
            lineData = scanner.nextLine().split("\\s+");
            command = lineData[0];

        }

    }
}
