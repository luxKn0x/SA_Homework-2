@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {

    @Id
    @GeneratedValue
    private Long id;

    private String product;
    private int quantity;
    private double amount;
    private String status;
    private String paymentMethod;
}
