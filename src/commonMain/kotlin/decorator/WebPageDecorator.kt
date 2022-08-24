package decorator

abstract class WebPageDecorator : WebPage {
    private var page: WebPage;

    constructor(page: WebPage) {
        this.page = page
    }

    override fun display() {
        this.page.display()
    }

}