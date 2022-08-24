package decorator

import kotlin.jvm.JvmStatic

object Client {
    @JvmStatic
    fun main(args: Array<String>) {
        var page = BasicWebPage("html", "css", "js");
        AuthenticatedWebPage(AuthorizedWebPage(page))
    }
}

fun main() {
    var page = BasicWebPage("html", "css", "js");
    AuthenticatedWebPage(AuthorizedWebPage(page))
    page.display();

}