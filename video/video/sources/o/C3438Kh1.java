package o;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import o.InterfaceC7595kk1;

/* renamed from: o.Kh1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3438Kh1 implements InterfaceC7595kk1<Uri, InputStream> {
    public final Context a;

    public C3438Kh1(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // o.InterfaceC7595kk1
    /* renamed from: c */
    public InterfaceC7595kk1.a<InputStream> b(Uri uri, int i, int i2, C5448bw1 c5448bw1) {
        if (C3829Oh1.f(i, i2)) {
            return new InterfaceC7595kk1.a<>(new C7874lt1(uri), C8846po2.f(this.a, uri));
        }
        return null;
    }

    @Override // o.InterfaceC7595kk1
    /* renamed from: d */
    public boolean a(Uri uri) {
        return C3829Oh1.b(uri);
    }

    /* renamed from: o.Kh1$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC7838lk1<Uri, InputStream> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // o.InterfaceC7838lk1
        public InterfaceC7595kk1<Uri, InputStream> e(C5650cm1 c5650cm1) {
            return new C3438Kh1(this.a);
        }

        @Override // o.InterfaceC7838lk1
        public void d() {
        }
    }
}
