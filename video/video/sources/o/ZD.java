package o;

import java.io.FilterWriter;
import java.io.Writer;

/* loaded from: classes4.dex */
public class ZD extends C10684xK1 {
    @Deprecated
    public ZD(Writer writer) {
        super(writer);
    }

    public static ZD i(Writer writer) {
        return new ZD(writer);
    }

    @Override // o.C10684xK1, java.io.FilterWriter, java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ((FilterWriter) this).out = C7975mE.X;
    }
}
