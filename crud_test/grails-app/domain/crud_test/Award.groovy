package crud_test

class Award {
    Date awardDate
    String type
    Integer point

    static belongsTo = [customers: Customer]
    static constraints = {
    }
}
