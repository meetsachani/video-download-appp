package o;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.Appendable;

/* renamed from: o.Gd  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3028Gd<T extends Appendable> extends OutputStream {
    public final T X;

    public C3028Gd(T t) {
        this.X = t;
    }

    public T a() {
        return this.X;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.X.append((char) i);
    }
}
