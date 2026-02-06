package o;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.InputStream;
import o.InterfaceC7595kk1;

/* renamed from: o.yf  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C11003yf<Data> implements InterfaceC7595kk1<Uri, Data> {
    public static final String c = "android_asset";
    public static final String d = "file:///android_asset/";
    public static final int e = 22;
    public final AssetManager a;
    public final a<Data> b;

    /* renamed from: o.yf$a */
    /* loaded from: classes.dex */
    public interface a<Data> {
        InterfaceC9990uU<Data> a(AssetManager assetManager, String str);
    }

    public C11003yf(AssetManager assetManager, a<Data> aVar) {
        this.a = assetManager;
        this.b = aVar;
    }

    @Override // o.InterfaceC7595kk1
    /* renamed from: c */
    public InterfaceC7595kk1.a<Data> b(Uri uri, int i, int i2, C5448bw1 c5448bw1) {
        return new InterfaceC7595kk1.a<>(new C7874lt1(uri), this.b.a(this.a, uri.toString().substring(e)));
    }

    @Override // o.InterfaceC7595kk1
    /* renamed from: d */
    public boolean a(Uri uri) {
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !c.equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }

    /* renamed from: o.yf$b */
    /* loaded from: classes.dex */
    public static class b implements InterfaceC7838lk1<Uri, AssetFileDescriptor>, a<AssetFileDescriptor> {
        public final AssetManager a;

        public b(AssetManager assetManager) {
            this.a = assetManager;
        }

        @Override // o.C11003yf.a
        public InterfaceC9990uU<AssetFileDescriptor> a(AssetManager assetManager, String str) {
            return new C5419bp0(assetManager, str);
        }

        @Override // o.InterfaceC7838lk1
        public InterfaceC7595kk1<Uri, AssetFileDescriptor> e(C5650cm1 c5650cm1) {
            return new C11003yf(this.a, this);
        }

        @Override // o.InterfaceC7838lk1
        public void d() {
        }
    }

    /* renamed from: o.yf$c */
    /* loaded from: classes.dex */
    public static class c implements InterfaceC7838lk1<Uri, InputStream>, a<InputStream> {
        public final AssetManager a;

        public c(AssetManager assetManager) {
            this.a = assetManager;
        }

        @Override // o.C11003yf.a
        public InterfaceC9990uU<InputStream> a(AssetManager assetManager, String str) {
            return new C9780td2(assetManager, str);
        }

        @Override // o.InterfaceC7838lk1
        public InterfaceC7595kk1<Uri, InputStream> e(C5650cm1 c5650cm1) {
            return new C11003yf(this.a, this);
        }

        @Override // o.InterfaceC7838lk1
        public void d() {
        }
    }
}
