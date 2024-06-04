package org.cb.bookings.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.cb.bookings.enums.BookingStatus;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "bookings")
public class BookingBO {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "movie_id")
    private Integer movieId;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "booked_seats", joinColumns = @JoinColumn(name = "idFk"))
    private List<String> seatsSelected;

    @Column(name = "show_date")
    private LocalDate showDate;

    @Column(name = "show_time")
    private LocalTime showTime;

    @Enumerated(EnumType.STRING)
    private BookingStatus bookingStatus;

    @Column(name = "booking_amount")
    private Double bookingAmount;

}
