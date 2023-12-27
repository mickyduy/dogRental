package com.mycompany.dogrent;

public class DogRentalRecord {
    private String nameDog;
    private String dogBreed;
    private int age;
    private Color color;
    private String tenantName;
    private String telephone;
    private int daysRent;

    // Constructor
    public DogRentalRecord(String nameDog, String dogBreed, int age, Color color,
                           String tenantName, String telephone, int daysRent) {
        this.nameDog = nameDog;
        this.dogBreed = dogBreed;
        this.age = age;
        this.color = color;
        this.tenantName = tenantName;
        this.telephone = telephone;
        this.daysRent = daysRent;
    }

    // Getters
    public String getNameDog() {
        return nameDog;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public int getAge() {
        return age;
    }

    public Color getColor() {
        return color;
    }

    public String getTenantName() {
        return tenantName;
    }

    public String getTelephone() {
        return telephone;
    }

    public int getDaysRent() {
        return daysRent;
    }

    // Setters
    public void setNameDog(String nameDog) {
        this.nameDog = nameDog;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setDaysRent(int daysRent) {
        this.daysRent = daysRent;
    }

    // Calculate total price based on color and days rented
    public double calculateTotalPrice() {
        return daysRent * color.getColorType().getRatePerDay();
    }

    // Color Subclass
    public static class Color {
        private ColorType colorType;

        public Color(ColorType colorType) {
            this.colorType = colorType;
        }

        public ColorType getColorType() {
            return colorType;
        }

        public void setColorType(ColorType colorType) {
            this.colorType = colorType;
        }

        @Override
        public String toString() {
            return colorType.toString();
        }

        // Enumeration for color types with pricing
        public enum ColorType {
            WHITE(12.0), DARK(10.0), OTHER_COLORS(8.0);

            private final double ratePerDay;

            ColorType(double ratePerDay) {
                this.ratePerDay = ratePerDay;
            }

            public double getRatePerDay() {
                return ratePerDay;
            }

            @Override
            public String toString() {
                switch (this) {
                    case WHITE:
                        return "White";
                    case DARK:
                        return "Dark";
                    case OTHER_COLORS:
                        return "Other Colors";
                    default:
                        throw new IllegalArgumentException("Unknown color type");
                }
            }
        }
    }
}
