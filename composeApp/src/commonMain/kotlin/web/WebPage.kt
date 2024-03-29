package web

import com.fleeksoft.ksoup.nodes.Document

class WebPage(val document: Document?) {
    fun title(): String? {
        return document?.title()
    }

    companion object {
        fun fromUrl(url: String): WebPage {
            return WebPage(UrlDocumentGenerator(url).document())
        }

        fun fromResource(resourcePath: String): WebPage {
            return WebPage(ResourceDocumentGenerator(resourcePath).document())
        }
    }
}
