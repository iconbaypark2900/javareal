package com.example;

package com.example;

public class Sandwich {
    private String Breadtype;
    private double totalPrice;
    private int Size;
    private String topping;

    public Sandwich(String Breadtype, int Size, String topping){
        this.Breadtype = Breadtype;
        this.Size = Size;
        this.topping = topping;
    }

    public String getBreadtype() {
        return Breadtype;
    }

    public void setBreadtype(String breadtype) {
        Breadtype = breadtype;
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int size) {
        Size = size;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }
}

/* efficient way of solving the extra
whether to make it another class

 */
