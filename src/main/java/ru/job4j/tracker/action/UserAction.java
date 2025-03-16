package ru.job4j.tracker.action;

import ru.job4j.tracker.*;
import ru.job4j.tracker.input.*;
import java.sql.*;

public interface UserAction {
    String name();

    boolean execute(Input input, Store tracker) throws SQLException;
}
