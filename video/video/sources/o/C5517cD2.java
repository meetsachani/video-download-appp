package o;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o.InterfaceC7595kk1;

/* renamed from: o.cD2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5517cD2<Data> implements InterfaceC7595kk1<Uri, Data> {
    public static final Set<String> b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));
    public final InterfaceC7595kk1<C5519cE0, Data> a;

    public C5517cD2(InterfaceC7595kk1<C5519cE0, Data> interfaceC7595kk1) {
        this.a = interfaceC7595kk1;
    }

    @Override // o.InterfaceC7595kk1
    /* renamed from: c */
    public InterfaceC7595kk1.a<Data> b(Uri uri, int i, int i2, C5448bw1 c5448bw1) {
        return this.a.b(new C5519cE0(uri.toString()), i, i2, c5448bw1);
    }

    @Override // o.InterfaceC7595kk1
    /* renamed from: d */
    public boolean a(Uri uri) {
        return b.contains(uri.getScheme());
    }

    /* renamed from: o.cD2$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC7838lk1<Uri, InputStream> {
        @Override // o.InterfaceC7838lk1
        public InterfaceC7595kk1<Uri, InputStream> e(C5650cm1 c5650cm1) {
            return new C5517cD2(c5650cm1.d(C5519cE0.class, InputStream.class));
        }

        @Override // o.InterfaceC7838lk1
        public void d() {
        }
    }
}
