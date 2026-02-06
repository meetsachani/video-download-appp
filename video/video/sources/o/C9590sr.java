package o;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@Deprecated
/* renamed from: o.sr  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9590sr implements InterfaceC7493kJ1 {
    public final InterfaceC4809Yj0 a;
    @InterfaceC11300zs1
    public InterfaceC4324Tj0 b;
    @InterfaceC11300zs1
    public InterfaceC4421Uj0 c;

    public C9590sr(InterfaceC4809Yj0 interfaceC4809Yj0) {
        this.a = interfaceC4809Yj0;
    }

    @Override // o.InterfaceC7493kJ1
    public void a(long j, long j2) {
        ((InterfaceC4324Tj0) C9542sf.g(this.b)).a(j, j2);
    }

    @Override // o.InterfaceC7493kJ1
    public int b(KE1 ke1) throws IOException {
        return ((InterfaceC4324Tj0) C9542sf.g(this.b)).j((InterfaceC4421Uj0) C9542sf.g(this.c), ke1);
    }

    @Override // o.InterfaceC7493kJ1
    public void c() {
        InterfaceC4324Tj0 interfaceC4324Tj0 = this.b;
        if (interfaceC4324Tj0 instanceof C11029yl1) {
            ((C11029yl1) interfaceC4324Tj0).k();
        }
    }

    @Override // o.InterfaceC7493kJ1
    public long d() {
        InterfaceC4421Uj0 interfaceC4421Uj0 = this.c;
        if (interfaceC4421Uj0 != null) {
            return interfaceC4421Uj0.getPosition();
        }
        return -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
        if (r1.getPosition() != r11) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006c, code lost:
        if (r1.getPosition() != r11) goto L28;
     */
    @Override // o.InterfaceC7493kJ1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e(CU cu, Uri uri, Map<String, List<String>> map, long j, long j2, InterfaceC4518Vj0 interfaceC4518Vj0) throws IOException {
        WY wy = new WY(cu, j, j2);
        this.c = wy;
        if (this.b != null) {
            return;
        }
        InterfaceC4324Tj0[] a = this.a.a(uri, map);
        boolean z = false;
        if (a.length == 1) {
            this.b = a[0];
        } else {
            int length = a.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                InterfaceC4324Tj0 interfaceC4324Tj0 = a[i];
                try {
                } catch (EOFException unused) {
                    if (this.b == null) {
                    }
                } catch (Throwable th) {
                    if (this.b != null || wy.getPosition() == j) {
                        z = true;
                    }
                    C9542sf.i(z);
                    wy.i();
                    throw th;
                }
                if (interfaceC4324Tj0.d(wy)) {
                    this.b = interfaceC4324Tj0;
                    C9542sf.i(true);
                    wy.i();
                    break;
                }
                if (this.b == null) {
                }
                boolean z2 = true;
                C9542sf.i(z2);
                wy.i();
                i++;
            }
            if (this.b == null) {
                throw new QB2("None of the available extractors (" + TD2.Z(a) + ") could read the stream.", (Uri) C9542sf.g(uri));
            }
        }
        this.b.b(interfaceC4518Vj0);
    }

    @Override // o.InterfaceC7493kJ1
    public void g() {
        InterfaceC4324Tj0 interfaceC4324Tj0 = this.b;
        if (interfaceC4324Tj0 != null) {
            interfaceC4324Tj0.g();
            this.b = null;
        }
        this.c = null;
    }
}
