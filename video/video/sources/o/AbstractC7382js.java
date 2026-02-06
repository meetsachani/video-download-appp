package o;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;

@InterfaceC7797la0
@InterfaceC11149zF0
/* renamed from: o.js  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7382js {

    /* renamed from: o.js$b */
    /* loaded from: classes3.dex */
    public final class b extends AbstractC7216jB {
        public final Charset a;

        @Override // o.AbstractC7216jB
        public Writer b() throws IOException {
            return new OutputStreamWriter(AbstractC7382js.this.c(), this.a);
        }

        public String toString() {
            String obj = AbstractC7382js.this.toString();
            String valueOf = String.valueOf(this.a);
            StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 13 + valueOf.length());
            sb.append(obj);
            sb.append(".asCharSink(");
            sb.append(valueOf);
            sb.append(C9811tl1.d);
            return sb.toString();
        }

        public b(Charset charset) {
            this.a = (Charset) C10664xF1.E(charset);
        }
    }

    public AbstractC7216jB a(Charset charset) {
        return new b(charset);
    }

    public OutputStream b() throws IOException {
        OutputStream c = c();
        if (c instanceof BufferedOutputStream) {
            return (BufferedOutputStream) c;
        }
        return new BufferedOutputStream(c);
    }

    public abstract OutputStream c() throws IOException;

    public void d(byte[] bArr) throws IOException {
        C10664xF1.E(bArr);
        try {
            OutputStream outputStream = (OutputStream) C8218nE.a().d(c());
            outputStream.write(bArr);
            outputStream.flush();
        } finally {
        }
    }

    @InterfaceC6181ey
    public long e(InputStream inputStream) throws IOException {
        C10664xF1.E(inputStream);
        try {
            OutputStream outputStream = (OutputStream) C8218nE.a().d(c());
            long b2 = C8129ms.b(inputStream, outputStream);
            outputStream.flush();
            return b2;
        } finally {
        }
    }
}
