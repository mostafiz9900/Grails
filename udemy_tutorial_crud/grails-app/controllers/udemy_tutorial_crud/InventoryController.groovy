package udemy_tutorial_crud

class InventoryController {

    def index() {

        render("Here is list everthing")
    }

    def edit() {
        def productName = "Laptop"
        def brandName = "Lenovo"
        [product: productName, brand: brandName]
    }

    def remove() {
        render("this is  remove one")
    }
    def list(){
        def allProducts=Product.list()

        [allProducts:allProducts]
    }
}
