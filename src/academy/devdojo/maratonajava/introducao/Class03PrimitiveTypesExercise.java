package academy.devdojo.maratonajava.introducao;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Currency;
import java.util.Locale;

/*
Practice

Create variables for the fields described between <> and print the following message:

I <name>, living at address <address>,
I confirm that I received the salary of <salary>, on the date <date>
 */
public class Class03PrimitiveTypesExercise {

    public static void main(String[] args) {
        var name = "John";
        var address = "Chelsea, Manhattan, NYC";
        var salary = BigDecimal.valueOf(29980.75);
        var salaryCurrency = Currency.getInstance(Locale.US);
        var receivedIn = LocalDate.of(2022, 5, 1);
        var report = String
                .format("I %s, living at address %s,\nI confirm that I received the salary of %s %s, on the date %s",
                        name, address, salary, salaryCurrency, receivedIn);

        System.out.println(report);
    }
}
