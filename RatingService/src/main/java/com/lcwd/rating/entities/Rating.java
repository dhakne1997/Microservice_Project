package com.lcwd.rating.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.lcwd.user.service.entities.Hotel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user_ratings")
public class Rating {
    @Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String ratingId;
    private String userId;
    private String hotelId;
    private  int rating;
    private  String feedback;
//    private Hotel hotel;
  
}
