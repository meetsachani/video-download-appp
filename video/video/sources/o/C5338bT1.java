package o;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import o.FU;

@Deprecated
/* renamed from: o.bT1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5338bT1 implements FU {
    public final FU b;
    public final b c;
    public boolean d;

    /* renamed from: o.bT1$a */
    /* loaded from: classes2.dex */
    public static final class a implements FU.a {
        public final FU.a a;
        public final b b;

        public a(FU.a aVar, b bVar) {
            this.a = aVar;
            this.b = bVar;
        }

        @Override // o.FU.a
        /* renamed from: c */
        public C5338bT1 a() {
            return new C5338bT1(this.a.a(), this.b);
        }
    }

    public C5338bT1(FU fu, b bVar) {
        this.b = fu;
        this.c = bVar;
    }

    @Override // o.FU
    public long a(OU ou) throws IOException {
        OU a2 = this.c.a(ou);
        this.d = true;
        return this.b.a(a2);
    }

    @Override // o.FU
    public Map<String, List<String>> b() {
        return this.b.b();
    }

    @Override // o.FU
    public void close() throws IOException {
        if (this.d) {
            this.d = false;
            this.b.close();
        }
    }

    @Override // o.FU
    @InterfaceC11300zs1
    public Uri getUri() {
        Uri uri = this.b.getUri();
        if (uri == null) {
            return null;
        }
        return this.c.b(uri);
    }

    @Override // o.CU
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return this.b.read(bArr, i, i2);
    }

    @Override // o.FU
    public void s(InterfaceC4261Sr2 interfaceC4261Sr2) {
        C9542sf.g(interfaceC4261Sr2);
        this.b.s(interfaceC4261Sr2);
    }

    /* renamed from: o.bT1$b */
    /* loaded from: classes2.dex */
    public interface b {
        OU a(OU ou) throws IOException;

        default Uri b(Uri uri) {
            return uri;
        }
    }
}
