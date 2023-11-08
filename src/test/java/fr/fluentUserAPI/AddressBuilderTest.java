package fr.fluentUserAPI;


import org.fluentUserAPI.builder.AddressBuilder;
import org.fluentUserAPI.model.Address;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class AddressBuilderTest {
    @Test
    public void address_should_be_created() {
        var address = AddressBuilder.create()
                                    .streetNumber(1)
                                    .streetName("Rue de la paix")
                                    .postalCode("75000")
                                    .city("Paris")
                                    .build();
        Assertions.assertEquals(
                Address.of(1, "Rue de la paix", "75000", "Paris"), address);
    }

    @Test
    public void address_streetnumber_should_be_positive() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> AddressBuilder.create()
                .streetNumber(-1)
                .streetName("Rue de la paix")
                .postalCode("75000")
                .city("Paris")
                .build());
    }

    @Test
    public void address_streetnumber_should_not_be_0() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> AddressBuilder.create()
                .streetNumber(0)
                .streetName("Rue de la paix")
                .postalCode("75000")
                .city("Paris")
                .build());
    }

    @Test
    public void address_streetname_should_not_be_null() {
        Assertions.assertThrows(NullPointerException.class, () -> AddressBuilder.create()
                .streetNumber(1)
                .streetName(null)
                .postalCode("75000")
                .city("Paris")
                .build());
    }

    @Test
    public void address_streetname_should_not_be_empty_string() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> AddressBuilder.create()
                .streetNumber(1)
                .streetName("")
                .postalCode("75000")
                .city("Paris")
                .build());
    }

    @Test
    public void address_postalcode_should_not_be_null() {
        Assertions.assertThrows(NullPointerException.class, () -> AddressBuilder.create()
                .streetNumber(1)
                .streetName("Rue de la paix")
                .postalCode(null)
                .city("Paris")
                .build());
    }

    @Test
    public void address_postalcode_should_not_be_empty_string() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> AddressBuilder.create()
                .streetNumber(1)
                .streetName("Rue de la paix")
                .postalCode("")
                .city("Paris")
                .build());
    }

    @Test
    public void address_city_should_not_be_null() {
        Assertions.assertThrows(NullPointerException.class, () -> AddressBuilder.create()
                .streetNumber(1)
                .streetName("Rue de la paix")
                .postalCode("75000")
                .city(null)
                .build());
    }

    @Test
    public void address_city_should_not_be_empty_string() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> AddressBuilder.create()
                .streetNumber(1)
                .streetName("Rue de la paix")
                .postalCode("75000")
                .city("")
                .build());
    }
}
