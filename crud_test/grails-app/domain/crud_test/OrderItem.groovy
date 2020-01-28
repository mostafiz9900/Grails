package crud_test

class OrderItem {
    Integer qty
    Float total

    static belongsTo = [orders:Order, products:Product]

    static constraints = {
    }
}
