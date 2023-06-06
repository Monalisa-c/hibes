package secondLevelCache;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int bid;
private String bName;
private int bprice;
private String bauthon;
public int getBid() {
	return bid;
}
public void setBid(int bid) {
	this.bid = bid;
}
public String getbName() {
	return bName;
}
public void setbName(String bName) {
	this.bName = bName;
}
public int getBprice() {
	return bprice;
}
public void setBprice(int bprice) {
	this.bprice = bprice;
}
public String getBauthon() {
	return bauthon;
}
public void setBauthon(String bauthon) {
	this.bauthon = bauthon;
}


}
