package cooper;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Table
@Data
public class User {
    public User(long id, String username, String repoName,
    		Date creationDate, int rating) {
		this.id = id;
		this.username = username;
		this.repoName = repoName;
		this.creationDate = creationDate;
		this.rating = rating;
	}
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String username;

    private String repoName;
    private Date creationDate;
    private Integer rating;
}