package o;

import java.io.IOException;
import java.io.Writer;

/* loaded from: classes4.dex */
public abstract class HE extends AbstractC5991eB {
    @Override // o.AbstractC5991eB
    public final int b(CharSequence charSequence, int i, Writer writer) throws IOException {
        return f(Character.codePointAt(charSequence, i), writer) ? 1 : 0;
    }

    public abstract boolean f(int i, Writer writer) throws IOException;
}
