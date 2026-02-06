package o;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;

/* renamed from: o.nv2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8387nv2<T> {

    /* renamed from: o.nv2$b */
    /* loaded from: classes3.dex */
    public final class b extends AbstractC8387nv2<T> {
        public b() {
        }

        @Override // o.AbstractC8387nv2
        public T e(OV0 ov0) throws IOException {
            if (ov0.I() == XV0.NULL) {
                ov0.E();
                return null;
            }
            return (T) AbstractC8387nv2.this.e(ov0);
        }

        @Override // o.AbstractC8387nv2
        public void i(C5589cW0 c5589cW0, T t) throws IOException {
            if (t == null) {
                c5589cW0.u();
            } else {
                AbstractC8387nv2.this.i(c5589cW0, t);
            }
        }

        public String toString() {
            return "NullSafeTypeAdapter[" + AbstractC8387nv2.this + C6566gU0.g;
        }
    }

    public final T a(Reader reader) throws IOException {
        return e(new OV0(reader));
    }

    public final T b(String str) throws IOException {
        return a(new StringReader(str));
    }

    public final T c(DV0 dv0) {
        try {
            return e(new YV0(dv0));
        } catch (IOException e) {
            throw new GV0(e);
        }
    }

    public final AbstractC8387nv2<T> d() {
        if (!(this instanceof b)) {
            return new b();
        }
        return this;
    }

    public abstract T e(OV0 ov0) throws IOException;

    public final String f(T t) {
        StringBuilder sb = new StringBuilder();
        try {
            g(C4690Xd2.c(sb), t);
            return sb.toString();
        } catch (IOException e) {
            throw new GV0(e);
        }
    }

    public final void g(Writer writer, T t) throws IOException {
        i(new C5589cW0(writer), t);
    }

    public final DV0 h(T t) {
        try {
            ZV0 zv0 = new ZV0();
            i(zv0, t);
            return zv0.U();
        } catch (IOException e) {
            throw new GV0(e);
        }
    }

    public abstract void i(C5589cW0 c5589cW0, T t) throws IOException;
}
