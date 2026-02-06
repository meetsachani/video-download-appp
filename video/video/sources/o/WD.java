package o;

import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes4.dex */
public class WD extends AbstractC8244nK1 {
    @Deprecated
    public WD(InputStream inputStream) {
        super(inputStream);
    }

    public static InputStream k(InputStream inputStream) {
        if (inputStream == System.in) {
            return l(inputStream);
        }
        return inputStream;
    }

    public static WD l(InputStream inputStream) {
        return new WD(inputStream);
    }

    @Override // o.AbstractC8244nK1, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ((FilterInputStream) this).in = C6501gE.X;
    }
}
