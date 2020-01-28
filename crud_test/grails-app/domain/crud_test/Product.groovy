package crud_test

class Product {
    String name
    String brand
    Float price
    static hasMany = [OrderItems: OrderItem]
    static constraints = {
    }
}
