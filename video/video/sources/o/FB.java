package o;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.function.Supplier;

/* loaded from: classes4.dex */
public final class FB {
    public static /* synthetic */ CharsetEncoder a() {
        return Charset.defaultCharset().newEncoder();
    }

    public static CharsetEncoder b(CharsetEncoder charsetEncoder) {
        return c(charsetEncoder, new Supplier() { // from class: o.EB
            @Override // java.util.function.Supplier
            public final Object get() {
                return FB.a();
            }
        });
    }

    public static CharsetEncoder c(CharsetEncoder charsetEncoder, Supplier<CharsetEncoder> supplier) {
        if (charsetEncoder != null) {
            return charsetEncoder;
        }
        return supplier.get();
    }
}
