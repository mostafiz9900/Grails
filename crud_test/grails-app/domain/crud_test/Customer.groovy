package crud_test

class Customer {
    String firstName
    String lastName
    Long phone
    String email
    Integer totalPoint

    static hasMany = [awards: Award, orders: Order]

    static constraints = {
    }
}
