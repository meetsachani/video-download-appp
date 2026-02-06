package o;

import java.io.IOException;
import java.io.Writer;

/* loaded from: classes4.dex */
public class Zz2 extends HE {
    @Override // o.HE
    public boolean f(int i, Writer writer) throws IOException {
        if (i >= 55296 && i <= 57343) {
            return true;
        }
        return false;
    }
}
