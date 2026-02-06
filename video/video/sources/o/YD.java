package o;

import java.io.FilterReader;
import java.io.Reader;

/* loaded from: classes4.dex */
public class YD extends AbstractC10195vK1 {
    @Deprecated
    public YD(Reader reader) {
        super(reader);
    }

    public static YD h(Reader reader) {
        return new YD(reader);
    }

    @Override // o.AbstractC10195vK1, java.io.FilterReader, java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ((FilterReader) this).in = C7228jE.X;
    }
}
