package test.interview.Demo.domain;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Data
@Builder
public class BillingRecord implements Core {

    private UUID id;
    private Date createdTime;
    private BigDecimal price;
    private User user;

    public UUID getId() {
        return id;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
    

}

