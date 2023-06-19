package Sem5.models;

import Sem5.presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Optional;

public class TableModel implements Model {


    private Collection<Table> tables;

    /**
     * Получение списка всех столиков
     *
     * @return
     */
    public Collection<Table> loadTables() {
        if (tables == null) {
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }
        return tables;
    }

    /**
     * Бронирование столика
     *
     * @param reservationDate Дата бронирования
     * @param tableNo         Номер столика
     * @param name            Имя клиента
     * @return Номер брони
     */
    public int reservationTable(Date reservationDate, int tableNo, String name) {
        for (Table table : tables) {
            if (table.getNo() == tableNo) {
                Reservation reservation = new Reservation(reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        return -1;
    }

    /**
     * TODO: Разработать метод самостоятельно в рамках домашнего задания
     * Поменять бронь столика
     *
     * @return
     */
    public int changeReservationTable(int reservationID, int tableNo) {

        for (Table table : tables) {
            if (table.getNo() == tableNo) {
                Reservation r = null;
                for (Reservation reservation : table.getReservations()) {
                    if (reservation.getId() == reservationID) {
                        r = reservation;
                        break;
                    }
                }
                if (r != null) {
                    table.getReservations().remove(r);
                    break;

                }
            }
        }

//        Optional<Table> table = tables.stream().filter(t -> t.getNo() == tableNO).findFirst();
//        if (table.isPresent()){
//            Optional<Reservation> reservation = table.get().getReservations().stream().filter(r -> r.getId() == reservationID).findFirst();
//            if (reservation.isPresent()){
//                table.get().getReservations().remove(reservation.get());
//            }
//        }


        return 0;
        //TODO: Для создания нового резерва столика стоит воспользоваться уже
        // существующим методом reservationTable
    }

}
