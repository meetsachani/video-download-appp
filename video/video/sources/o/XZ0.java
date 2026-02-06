package o;

import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.ArrayDeque;
import java.util.Queue;

@InterfaceC7797la0
@InterfaceC11149zF0
@InterfaceC4238Sm
/* loaded from: classes3.dex */
public final class XZ0 {
    public final Readable a;
    @MB
    public final Reader b;
    public final CharBuffer c;
    public final char[] d;
    public final Queue<String> e;
    public final SZ0 f;

    /* loaded from: classes3.dex */
    public class a extends SZ0 {
        public a() {
        }

        @Override // o.SZ0
        public void d(String str, String str2) {
            XZ0.this.e.add(str);
        }
    }

    public XZ0(Readable readable) {
        Reader reader;
        CharBuffer e = C7963mB.e();
        this.c = e;
        this.d = e.array();
        this.e = new ArrayDeque();
        this.f = new a();
        this.a = (Readable) C10664xF1.E(readable);
        if (readable instanceof Reader) {
            reader = (Reader) readable;
        } else {
            reader = null;
        }
        this.b = reader;
    }

    @InterfaceC6181ey
    @MB
    public String b() throws IOException {
        int read;
        while (true) {
            if (this.e.peek() != null) {
                break;
            }
            C10723xU0.a(this.c);
            Reader reader = this.b;
            if (reader != null) {
                char[] cArr = this.d;
                read = reader.read(cArr, 0, cArr.length);
            } else {
                read = this.a.read(this.c);
            }
            if (read == -1) {
                this.f.b();
                break;
            }
            this.f.a(this.d, 0, read);
        }
        return this.e.poll();
    }
}
