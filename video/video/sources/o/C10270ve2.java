package o;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;
import o.InterfaceC7595kk1;

/* renamed from: o.ve2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10270ve2<Data> implements InterfaceC7595kk1<String, Data> {
    public final InterfaceC7595kk1<Uri, Data> a;

    public C10270ve2(InterfaceC7595kk1<Uri, Data> interfaceC7595kk1) {
        this.a = interfaceC7595kk1;
    }

    public static Uri e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return f(str);
        }
        Uri parse = Uri.parse(str);
        if (parse.getScheme() == null) {
            return f(str);
        }
        return parse;
    }

    public static Uri f(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // o.InterfaceC7595kk1
    /* renamed from: c */
    public InterfaceC7595kk1.a<Data> b(String str, int i, int i2, C5448bw1 c5448bw1) {
        Uri e = e(str);
        if (e != null && this.a.a(e)) {
            return this.a.b(e, i, i2, c5448bw1);
        }
        return null;
    }

    @Override // o.InterfaceC7595kk1
    /* renamed from: d */
    public boolean a(String str) {
        return true;
    }

    /* renamed from: o.ve2$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC7838lk1<String, AssetFileDescriptor> {
        @Override // o.InterfaceC7838lk1
        public InterfaceC7595kk1<String, AssetFileDescriptor> e(C5650cm1 c5650cm1) {
            return new C10270ve2(c5650cm1.d(Uri.class, AssetFileDescriptor.class));
        }

        @Override // o.InterfaceC7838lk1
        public void d() {
        }
    }

    /* renamed from: o.ve2$b */
    /* loaded from: classes.dex */
    public static class b implements InterfaceC7838lk1<String, ParcelFileDescriptor> {
        @Override // o.InterfaceC7838lk1
        public InterfaceC7595kk1<String, ParcelFileDescriptor> e(C5650cm1 c5650cm1) {
            return new C10270ve2(c5650cm1.d(Uri.class, ParcelFileDescriptor.class));
        }

        @Override // o.InterfaceC7838lk1
        public void d() {
        }
    }

    /* renamed from: o.ve2$c */
    /* loaded from: classes.dex */
    public static class c implements InterfaceC7838lk1<String, InputStream> {
        @Override // o.InterfaceC7838lk1
        public InterfaceC7595kk1<String, InputStream> e(C5650cm1 c5650cm1) {
            return new C10270ve2(c5650cm1.d(Uri.class, InputStream.class));
        }

        @Override // o.InterfaceC7838lk1
        public void d() {
        }
    }
}
