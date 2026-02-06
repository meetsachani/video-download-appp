package o;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public class XD extends C9952uK1 {
    @Deprecated
    public XD(OutputStream outputStream) {
        super(outputStream);
    }

    public static XD m(OutputStream outputStream) {
        return new XD(outputStream);
    }

    @Override // o.C9952uK1, java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ((FilterOutputStream) this).out = C6744hE.X;
    }
}
