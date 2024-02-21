package ru.job4j.stream;

import java.util.*;
import java.util.stream.*;

public class Profiles {
    public static List<Address> collect(List<Profile> profiles) {
        return profiles.stream()
                .map(Profile::getAddress)
                .collect(Collectors.toList());
    }
}
