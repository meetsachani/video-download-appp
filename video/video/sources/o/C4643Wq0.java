package o;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Objects;

/* renamed from: o.Wq0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4643Wq0 extends C10684xK1 {

    /* renamed from: o.Wq0$b */
    /* loaded from: classes4.dex */
    public static class b extends AbstractC9396s3<C4643Wq0, b> {
        public boolean l;
        public CharsetEncoder m = super.P().newEncoder();

        public final File m0() {
            return d().i();
        }

        @Override // o.XK0
        /* renamed from: n0 */
        public C4643Wq0 get() throws IOException {
            return new C4643Wq0(this);
        }

        public final Object o0() {
            if (this.m != null && P() != null && !this.m.charset().equals(P())) {
                throw new IllegalStateException(String.format("Mismatched Charset(%s) and CharsetEncoder(%s)", P(), this.m.charset()));
            }
            CharsetEncoder charsetEncoder = this.m;
            if (charsetEncoder != null) {
                return charsetEncoder;
            }
            return P();
        }

        public b p0(boolean z) {
            this.l = z;
            return this;
        }

        public b q0(CharsetEncoder charsetEncoder) {
            this.m = charsetEncoder;
            return this;
        }
    }

    public static b i() {
        return new b();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static OutputStreamWriter j(File file, Object obj, boolean z) throws IOException {
        Objects.requireNonNull(file, "file");
        boolean exists = file.exists();
        try {
            OutputStream u1 = C3961Pq0.u1(file, z);
            if (obj != null && !(obj instanceof Charset)) {
                if (obj instanceof CharsetEncoder) {
                    return new OutputStreamWriter(u1, (CharsetEncoder) obj);
                }
                return new OutputStreamWriter(u1, (String) obj);
            }
            return new OutputStreamWriter(u1, IB.g((Charset) obj));
        } catch (IOException e) {
            e = e;
            try {
                C7743lL0.v(null);
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            if (!exists) {
                C3961Pq0.h0(file);
            }
            throw e;
        } catch (RuntimeException e3) {
            e = e3;
            C7743lL0.v(null);
            if (!exists) {
            }
            throw e;
        }
    }

    public C4643Wq0(b bVar) throws IOException {
        super(j(bVar.m0(), bVar.o0(), bVar.l));
    }

    @Deprecated
    public C4643Wq0(File file, Charset charset) throws IOException {
        this(file, charset, false);
    }

    @Deprecated
    public C4643Wq0(File file, Charset charset, boolean z) throws IOException {
        this(j(file, charset, z));
    }

    @Deprecated
    public C4643Wq0(File file, CharsetEncoder charsetEncoder) throws IOException {
        this(file, charsetEncoder, false);
    }

    @Deprecated
    public C4643Wq0(File file, CharsetEncoder charsetEncoder, boolean z) throws IOException {
        this(j(file, charsetEncoder, z));
    }

    @Deprecated
    public C4643Wq0(File file, String str) throws IOException {
        this(file, str, false);
    }

    @Deprecated
    public C4643Wq0(File file, String str, boolean z) throws IOException {
        this(j(file, str, z));
    }

    public C4643Wq0(OutputStreamWriter outputStreamWriter) {
        super(outputStreamWriter);
    }

    @Deprecated
    public C4643Wq0(String str, Charset charset) throws IOException {
        this(new File(str), charset, false);
    }

    @Deprecated
    public C4643Wq0(String str, Charset charset, boolean z) throws IOException {
        this(new File(str), charset, z);
    }

    @Deprecated
    public C4643Wq0(String str, CharsetEncoder charsetEncoder) throws IOException {
        this(new File(str), charsetEncoder, false);
    }

    @Deprecated
    public C4643Wq0(String str, CharsetEncoder charsetEncoder, boolean z) throws IOException {
        this(new File(str), charsetEncoder, z);
    }

    @Deprecated
    public C4643Wq0(String str, String str2) throws IOException {
        this(new File(str), str2, false);
    }

    @Deprecated
    public C4643Wq0(String str, String str2, boolean z) throws IOException {
        this(new File(str), str2, z);
    }
}
