package es.uah.matcomp.mp.e1;

    public class CustomerBarney {
        private int id;
        private String name;
        private int discount;

    public CustomerBarney(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getDiscount() {
        return discount;
    }
    public void getDiscount(int discount) {
        this.discount = discount;
    }
    public String toString() {
        return "Customer[id=" + id + ",name=" + name + ",discount=" + discount + "]";
    }

        public void setDiscount(int i) {
        this.discount = i;
        }
    }
