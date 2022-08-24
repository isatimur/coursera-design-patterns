package decorator

class AuthorizedWebPage : WebPageDecorator {
    private var page: WebPage;

    constructor(page: WebPage) : super(page) {
        this.page = page
    }

    override fun display() {
        super.display()
        this.authorizeUser()
    }

    fun authorizeUser(){
        println("Authorize")
    }
}