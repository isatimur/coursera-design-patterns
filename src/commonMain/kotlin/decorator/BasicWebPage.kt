package decorator

class BasicWebPage : WebPage {
    private var html: String;
    private var styleSheet: String;
    private var scripts: String;

    constructor(html: String, styleSheet: String, scripts: String) {
        this.html = html
        this.styleSheet = styleSheet
        this.scripts = scripts
    }

    override fun display() {
        println(html)
        println(styleSheet)
        println(scripts)
    }
}