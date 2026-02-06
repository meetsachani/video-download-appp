package o;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

/* loaded from: classes4.dex */
public final class VC2 extends AbstractC9882u3 {
    public static final VC2 c = new VC2();

    public String g(String str, String str2) throws UnsupportedEncodingException {
        return URLEncoder.encode(str, str2);
    }

    @Override // o.InterfaceC10759xe2
    public String lookup(String str) {
        if (str == null) {
            return null;
        }
        String name = StandardCharsets.UTF_8.name();
        try {
            return g(str, name);
        } catch (UnsupportedEncodingException e) {
            throw C6036eM0.b(e, "%s: source=%s, encoding=%s", e, str, name);
        }
    }
}
