package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

/* renamed from: o.lT1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7776lT1 implements InterfaceC7290jT1<Uri, Drawable> {
    public static final C4274Sv1<Resources.Theme> b = C4274Sv1.f("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");
    public static final String c = "android";
    public static final int d = 0;
    public static final int e = 2;
    public static final int f = 0;
    public static final int g = 1;
    public static final int h = 1;
    public static final int i = 0;
    public final Context a;

    public C7776lT1(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // o.InterfaceC7290jT1
    /* renamed from: c */
    public InterfaceC5580cT1<Drawable> b(Uri uri, int i2, int i3, C5448bw1 c5448bw1) {
        Resources.Theme theme;
        Drawable a;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            Context d2 = d(uri, authority);
            int g2 = g(d2, uri);
            if (((String) C10175vF1.e(authority)).equals(this.a.getPackageName())) {
                theme = (Resources.Theme) c5448bw1.c(b);
            } else {
                theme = null;
            }
            if (theme == null) {
                a = H60.b(this.a, d2, g2);
            } else {
                a = H60.a(this.a, g2, theme);
            }
            return C6398fr1.c(a);
        }
        throw new IllegalStateException("Package name for " + uri + " is null or empty");
    }

    public final Context d(Uri uri, String str) {
        if (str.equals(this.a.getPackageName())) {
            return this.a;
        }
        try {
            return this.a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e2) {
            if (str.contains(this.a.getPackageName())) {
                return this.a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e2);
        }
    }

    public final int e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e2) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e2);
        }
    }

    public final int f(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    public final int g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return e(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    @Override // o.InterfaceC7290jT1
    /* renamed from: h */
    public boolean a(Uri uri, C5448bw1 c5448bw1) {
        String scheme = uri.getScheme();
        if (scheme != null && scheme.equals(C10977yY.t)) {
            return true;
        }
        return false;
    }
}
