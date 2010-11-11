package org.sitemesh.tagprocessor;

import java.io.StringWriter;

/**
 * This TokenHandler will buffer the content processed to ensure the content is successfully
 * consumed.
 * @author Richard L. Burton III - SmartCode LLC
 */
public class BufferTokenHandler implements TagTokenizer.TokenHandler {
    
    private StringWriter writer = new StringWriter();

    public boolean shouldProcessTag(String name) {
        return true;
    }

    public void tag(Tag tag) {
        writer.write(tag.toString());
    }

    public void text(CharSequence text) {
        writer.write(text.toString());
    }

    public void warning(String message, int line, int column) {
    }

    public String toString() {
        return writer.toString();
    }

}
