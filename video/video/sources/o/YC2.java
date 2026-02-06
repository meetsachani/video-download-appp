package o;

import java.io.InputStream;
import java.net.URL;
import o.InterfaceC7595kk1;

/* loaded from: classes.dex */
public class YC2 implements InterfaceC7595kk1<URL, InputStream> {
    public final InterfaceC7595kk1<C5519cE0, InputStream> a;

    public YC2(InterfaceC7595kk1<C5519cE0, InputStream> interfaceC7595kk1) {
        this.a = interfaceC7595kk1;
    }

    @Override // o.InterfaceC7595kk1
    /* renamed from: c */
    public InterfaceC7595kk1.a<InputStream> b(URL url, int i, int i2, C5448bw1 c5448bw1) {
        return this.a.b(new C5519cE0(url), i, i2, c5448bw1);
    }

    @Override // o.InterfaceC7595kk1
    /* renamed from: d */
    public boolean a(URL url) {
        return true;
    }

    /* loaded from: classes.dex */
    public static class a implements InterfaceC7838lk1<URL, InputStream> {
        @Override // o.InterfaceC7838lk1
        public InterfaceC7595kk1<URL, InputStream> e(C5650cm1 c5650cm1) {
            return new YC2(c5650cm1.d(C5519cE0.class, InputStream.class));
        }

        @Override // o.InterfaceC7838lk1
        public void d() {
        }
    }
}
