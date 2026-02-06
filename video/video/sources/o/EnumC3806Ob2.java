package o;

import java.nio.charset.Charset;
import java.util.Objects;

/* renamed from: o.Ob2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC3806Ob2 {
    CR("\r"),
    CRLF(VI0.D),
    LF("\n");
    
    public final String X;

    EnumC3806Ob2(String str) {
        Objects.requireNonNull(str, "lineSeparator");
        this.X = str;
    }

    public byte[] g(Charset charset) {
        return this.X.getBytes(charset);
    }

    public String h() {
        return this.X;
    }
}
