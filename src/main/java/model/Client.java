package model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class Client {

    private Long idClient;
    private String nameClient;
    private String cpfClient;

}
