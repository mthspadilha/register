package model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long idClient;
    private String nameClient;
    private String cpfClient;

    //Foreign Keys
    @ManyToOne
    @JoinColumn(name="id_city")
    private City city;

    @OneToMany(mappedBy = "client")
    private Set<Adress> adresses = new HashSet<>();

    @OneToMany(mappedBy ="client")
    private Set<Phone> phones = new HashSet<>();
    //--------------

    public Client(){}

    public Client(String nameClient, String cpfClient, City city, Adress adress, Phone phone){
        this.nameClient = nameClient;
        this.cpfClient = cpfClient;
        this.city = city;
    }
}
