package Persons;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.With;

@AllArgsConstructor
@Getter @With
public class Person {
    private final String name;
    private final String lastName;
    private final String userName;
    private final String PermanentAddress;
    private final String CurrentAddress;
    private final String email;
    private final String phoneNumber;
    private final int age;
}
