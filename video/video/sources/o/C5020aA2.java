package o;

import java.io.IOException;
import java.io.Writer;

@Deprecated
/* renamed from: o.aA2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5020aA2 extends IE {
    @Override // o.IE
    public boolean f(int i, Writer writer) throws IOException {
        if (i >= 55296 && i <= 57343) {
            return true;
        }
        return false;
    }
}
