package reserveticket.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import reserveticket.domain.*;
import reserveticket.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Canceledticket extends AbstractEvent {

    private Long id;
    private String name;
    private String userid;
    private Integer qty;
    private Double amount;
    private Long customer;
    private Long ticketid;

    public Canceledticket(Reservation aggregate) {
        super(aggregate);
    }

    public Canceledticket() {
        super();
    }
}
//>>> DDD / Domain Event
