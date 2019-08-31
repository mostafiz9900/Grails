package crud_test

class StudentController {

    def index() {
        render(view: "/student/index2")
    }
    def remove(){
        render("grails is best framwork in java laungruage")
    }
    def edit(){
        def name="mostafizur"
        def sub="marketing"
        [name :name, sub:sub]
    }
}
