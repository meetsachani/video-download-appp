package o;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: o.v81  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10147v81 extends AbstractC8244nK1 {
    public C10147v81(InputStream inputStream) {
        super(inputStream);
    }

    @Override // o.AbstractC8244nK1, java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // o.AbstractC8244nK1, java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw C5756dC2.c();
    }

    @Override // o.AbstractC8244nK1, java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
    }
}
