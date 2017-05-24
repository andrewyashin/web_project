package entity;

import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Request {
    private Long id;
    private Long user_id;
    private Long train_id;

    private String type;

    private Long price;


}
