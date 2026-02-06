package o;

import java.io.IOException;
import java.io.Writer;

@Deprecated
/* loaded from: classes4.dex */
public abstract class IE extends AbstractC6234fB {
    @Override // o.AbstractC6234fB
    public final int b(CharSequence charSequence, int i, Writer writer) throws IOException {
        return f(Character.codePointAt(charSequence, i), writer) ? 1 : 0;
    }

    public abstract boolean f(int i, Writer writer) throws IOException;
}
