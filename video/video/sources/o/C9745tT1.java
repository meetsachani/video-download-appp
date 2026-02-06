package o;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import java.util.List;
import o.InterfaceC7595kk1;

/* renamed from: o.tT1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9745tT1<DataT> implements InterfaceC7595kk1<Uri, DataT> {
    public static final int c = 0;
    public static final String d = "ResourceUriLoader";
    public final Context a;
    public final InterfaceC7595kk1<Integer, DataT> b;

    public C9745tT1(Context context, InterfaceC7595kk1<Integer, DataT> interfaceC7595kk1) {
        this.a = context.getApplicationContext();
        this.b = interfaceC7595kk1;
    }

    public static InterfaceC7838lk1<Uri, AssetFileDescriptor> e(Context context) {
        return new a(context);
    }

    public static InterfaceC7838lk1<Uri, InputStream> f(Context context) {
        return new b(context);
    }

    @Override // o.InterfaceC7595kk1
    /* renamed from: c */
    public InterfaceC7595kk1.a<DataT> b(Uri uri, int i, int i2, C5448bw1 c5448bw1) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 1) {
            return g(uri, i, i2, c5448bw1);
        }
        if (pathSegments.size() == 2) {
            return h(uri, i, i2, c5448bw1);
        }
        if (Log.isLoggable(d, 5)) {
            Log.w(d, "Failed to parse resource uri: " + uri);
            return null;
        }
        return null;
    }

    @Override // o.InterfaceC7595kk1
    /* renamed from: d */
    public boolean a(Uri uri) {
        if (C10977yY.t.equals(uri.getScheme()) && this.a.getPackageName().equals(uri.getAuthority())) {
            return true;
        }
        return false;
    }

    public final InterfaceC7595kk1.a<DataT> g(Uri uri, int i, int i2, C5448bw1 c5448bw1) {
        try {
            int parseInt = Integer.parseInt(uri.getPathSegments().get(0));
            if (parseInt == 0) {
                if (Log.isLoggable(d, 5)) {
                    Log.w(d, "Failed to parse a valid non-0 resource id from: " + uri);
                }
                return null;
            }
            return this.b.b(Integer.valueOf(parseInt), i, i2, c5448bw1);
        } catch (NumberFormatException e) {
            if (Log.isLoggable(d, 5)) {
                Log.w(d, "Failed to parse resource id from: " + uri, e);
            }
            return null;
        }
    }

    public final InterfaceC7595kk1.a<DataT> h(Uri uri, int i, int i2, C5448bw1 c5448bw1) {
        List<String> pathSegments = uri.getPathSegments();
        String str = pathSegments.get(1);
        int identifier = this.a.getResources().getIdentifier(str, pathSegments.get(0), this.a.getPackageName());
        if (identifier == 0) {
            if (Log.isLoggable(d, 5)) {
                Log.w(d, "Failed to find resource id for: " + uri);
                return null;
            }
            return null;
        }
        return this.b.b(Integer.valueOf(identifier), i, i2, c5448bw1);
    }

    /* renamed from: o.tT1$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC7838lk1<Uri, AssetFileDescriptor> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // o.InterfaceC7838lk1
        public InterfaceC7595kk1<Uri, AssetFileDescriptor> e(C5650cm1 c5650cm1) {
            return new C9745tT1(this.a, c5650cm1.d(Integer.class, AssetFileDescriptor.class));
        }

        @Override // o.InterfaceC7838lk1
        public void d() {
        }
    }

    /* renamed from: o.tT1$b */
    /* loaded from: classes.dex */
    public static final class b implements InterfaceC7838lk1<Uri, InputStream> {
        public final Context a;

        public b(Context context) {
            this.a = context;
        }

        @Override // o.InterfaceC7838lk1
        public InterfaceC7595kk1<Uri, InputStream> e(C5650cm1 c5650cm1) {
            return new C9745tT1(this.a, c5650cm1.d(Integer.class, InputStream.class));
        }

        @Override // o.InterfaceC7838lk1
        public void d() {
        }
    }
}
