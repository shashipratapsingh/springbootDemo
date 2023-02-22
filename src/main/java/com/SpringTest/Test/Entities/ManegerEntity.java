package com.SpringTest.Test.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ManagerDetails")
public class ManegerEntity {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int manegerId;
        private String manegerName;
        private String manegerAddress;
}
