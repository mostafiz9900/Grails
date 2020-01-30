package crudai


class HelloController {
    static scaffold = Hello

    def index() {}

    def helloList() {
        def helloList = Hello.list()
        [hellelist: helloList]
    }
}
