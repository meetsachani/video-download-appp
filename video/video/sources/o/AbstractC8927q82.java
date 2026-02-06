package o;

import java.io.IOException;
import java.io.Writer;

/* renamed from: o.q82  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8927q82 extends AbstractC5991eB {
    @Override // o.AbstractC5991eB
    public int b(CharSequence charSequence, int i, Writer writer) throws IOException {
        if (i == 0) {
            g(charSequence, writer);
            return Character.codePointCount(charSequence, i, charSequence.length());
        }
        throw new IllegalArgumentException(f() + ".translate(final CharSequence input, final int index, final Writer out) can not handle a non-zero index.");
    }

    public final String f() {
        Class<?> cls = getClass();
        if (cls.isAnonymousClass()) {
            return cls.getName();
        }
        return cls.getSimpleName();
    }

    public abstract void g(CharSequence charSequence, Writer writer) throws IOException;
}
