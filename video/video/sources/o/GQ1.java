package o;

import java.util.Objects;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class GQ1 implements InterfaceC5999eD {
    public final Pattern a;

    public GQ1(Pattern pattern) {
        Objects.requireNonNull(pattern, "pattern");
        this.a = pattern;
    }

    @Override // o.InterfaceC5999eD
    public boolean a(String str) {
        return this.a.matcher(str).matches();
    }

    public GQ1(String str) {
        this(Pattern.compile(str));
    }
}
