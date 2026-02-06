package o;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ZV0 extends C5589cW0 {
    public static final Writer m1 = new a();
    public static final MV0 n1 = new MV0("closed");
    public final List<DV0> j1;
    public String k1;
    public DV0 l1;

    /* loaded from: classes3.dex */
    public class a extends Writer {
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    public ZV0() {
        super(m1);
        this.j1 = new ArrayList();
        this.l1 = HV0.X;
    }

    @Override // o.C5589cW0
    @InterfaceC6181ey
    public C5589cW0 M(double d) throws IOException {
        if (!q() && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
        }
        W(new MV0(Double.valueOf(d)));
        return this;
    }

    @Override // o.C5589cW0
    @InterfaceC6181ey
    public C5589cW0 N(float f) throws IOException {
        if (!q() && (Float.isNaN(f) || Float.isInfinite(f))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + f);
        }
        W(new MV0(Float.valueOf(f)));
        return this;
    }

    @Override // o.C5589cW0
    @InterfaceC6181ey
    public C5589cW0 O(long j) throws IOException {
        W(new MV0(Long.valueOf(j)));
        return this;
    }

    @Override // o.C5589cW0
    @InterfaceC6181ey
    public C5589cW0 P(Boolean bool) throws IOException {
        if (bool == null) {
            return u();
        }
        W(new MV0(bool));
        return this;
    }

    @Override // o.C5589cW0
    @InterfaceC6181ey
    public C5589cW0 Q(Number number) throws IOException {
        if (number == null) {
            return u();
        }
        if (!q()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        W(new MV0(number));
        return this;
    }

    @Override // o.C5589cW0
    @InterfaceC6181ey
    public C5589cW0 R(String str) throws IOException {
        if (str == null) {
            return u();
        }
        W(new MV0(str));
        return this;
    }

    @Override // o.C5589cW0
    @InterfaceC6181ey
    public C5589cW0 S(boolean z) throws IOException {
        W(new MV0(Boolean.valueOf(z)));
        return this;
    }

    public DV0 U() {
        if (this.j1.isEmpty()) {
            return this.l1;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.j1);
    }

    public final DV0 V() {
        List<DV0> list = this.j1;
        return list.get(list.size() - 1);
    }

    public final void W(DV0 dv0) {
        if (this.k1 != null) {
            if (!dv0.L() || n()) {
                ((IV0) V()).U(this.k1, dv0);
            }
            this.k1 = null;
        } else if (this.j1.isEmpty()) {
            this.l1 = dv0;
        } else {
            DV0 V = V();
            if (V instanceof C10237vV0) {
                ((C10237vV0) V).a0(dv0);
                return;
            }
            throw new IllegalStateException();
        }
    }

    @Override // o.C5589cW0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.j1.isEmpty()) {
            this.j1.add(n1);
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // o.C5589cW0
    @InterfaceC6181ey
    public C5589cW0 h() throws IOException {
        C10237vV0 c10237vV0 = new C10237vV0();
        W(c10237vV0);
        this.j1.add(c10237vV0);
        return this;
    }

    @Override // o.C5589cW0
    @InterfaceC6181ey
    public C5589cW0 i() throws IOException {
        IV0 iv0 = new IV0();
        W(iv0);
        this.j1.add(iv0);
        return this;
    }

    @Override // o.C5589cW0
    @InterfaceC6181ey
    public C5589cW0 k() throws IOException {
        if (!this.j1.isEmpty() && this.k1 == null) {
            if (V() instanceof C10237vV0) {
                List<DV0> list = this.j1;
                list.remove(list.size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // o.C5589cW0
    @InterfaceC6181ey
    public C5589cW0 l() throws IOException {
        if (!this.j1.isEmpty() && this.k1 == null) {
            if (V() instanceof IV0) {
                List<DV0> list = this.j1;
                list.remove(list.size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // o.C5589cW0
    public C5589cW0 r(String str) throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // o.C5589cW0
    @InterfaceC6181ey
    public C5589cW0 s(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (!this.j1.isEmpty() && this.k1 == null) {
            if (V() instanceof IV0) {
                this.k1 = str;
                return this;
            }
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        throw new IllegalStateException("Did not expect a name");
    }

    @Override // o.C5589cW0
    @InterfaceC6181ey
    public C5589cW0 u() throws IOException {
        W(HV0.X);
        return this;
    }

    @Override // o.C5589cW0, java.io.Flushable
    public void flush() throws IOException {
    }
}
