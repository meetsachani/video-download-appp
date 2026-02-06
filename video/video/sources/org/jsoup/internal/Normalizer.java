package org.jsoup.internal;

import java.util.Locale;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;

/* loaded from: classes4.dex */
public final class Normalizer {
    public static String a(String str) {
        if (str != null) {
            return str.toLowerCase(Locale.ROOT);
        }
        return "";
    }

    public static String b(String str) {
        return a(str).trim();
    }

    @Deprecated
    public static String c(String str, boolean z) {
        if (z) {
            return a(str);
        }
        return b(str);
    }

    public static String d(String str) {
        return Attribute.e(str, Document.OutputSettings.Syntax.xml);
    }
}
