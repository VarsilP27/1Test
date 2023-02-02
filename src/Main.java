import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        class Closet
        {
            private double getValue;
            private String getClothesWithColour;
            private String getNumOfClothesByDescription;
        }
        class Clothing
        {
            private String brand;
            private String description;
            private double price;
            private String colour;

                public Clothing(String brand, String description, double price, String colour) {
                    this.setBrand(brand);
                    this.setDescription(description);
                    this.setPrice(price);
                    this.setColour(colour);
                }

                public void setBrand(String brand) {
                    this.brand = brand;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public void setPrice(double price) {
                    this.price = price;
                }

                public void setColour(String colour) {
                    this.colour = colour;
                }
            }


        }
    }




