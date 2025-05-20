package test.interview.Demo.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {

    private String email;
    private int customerNumber;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
    

}