package decorator

class AuthenticatedWebPage : WebPageDecorator {
    private var page: WebPage;

    constructor(page: WebPage) : super(page) {
        this.page = page
    }

    override fun display()  {
        super.display()
        this.authenticateUser()
    }

    fun authenticateUser(){
        println("Authenticate")
    }
}