package o;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import o.C5630ch1;

/* renamed from: o.jh1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7340jh1 implements C5630ch1.a {
    public static final String c = "MediaSessionManager";
    public static final boolean d = C5630ch1.c;
    public static final String e = "android.permission.STATUS_BAR_SERVICE";
    public static final String f = "android.permission.MEDIA_CONTENT_CONTROL";
    public static final String g = "enabled_notification_listeners";
    public Context a;
    public ContentResolver b;

    /* renamed from: o.jh1$a */
    /* loaded from: classes.dex */
    public static class a implements C5630ch1.c {
        public String a;
        public int b;
        public int c;

        public a(String str, int i, int i2) {
            this.a = str;
            this.b = i;
            this.c = i2;
        }

        @Override // o.C5630ch1.c
        public int a() {
            return this.c;
        }

        @Override // o.C5630ch1.c
        public int b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.b >= 0 && aVar.b >= 0) {
                if (TextUtils.equals(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c) {
                    return true;
                }
                return false;
            } else if (TextUtils.equals(this.a, aVar.a) && this.c == aVar.c) {
                return true;
            } else {
                return false;
            }
        }

        public int hashCode() {
            return C2691Ct1.b(this.a, Integer.valueOf(this.c));
        }

        @Override // o.C5630ch1.c
        public String k0() {
            return this.a;
        }
    }

    public C7340jh1(Context context) {
        this.a = context;
        this.b = context.getContentResolver();
    }

    @Override // o.C5630ch1.a
    public boolean a(C5630ch1.c cVar) {
        try {
            if (this.a.getPackageManager().getApplicationInfo(cVar.k0(), 0) == null) {
                return false;
            }
            if (!c(cVar, e) && !c(cVar, f) && cVar.a() != 1000 && !b(cVar)) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            if (d) {
                Log.d("MediaSessionManager", "Package " + cVar.k0() + " doesn't exist");
            }
            return false;
        }
    }

    public boolean b(C5630ch1.c cVar) {
        String string = Settings.Secure.getString(this.b, "enabled_notification_listeners");
        if (string != null) {
            for (String str : string.split(":")) {
                ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                if (unflattenFromString != null && unflattenFromString.getPackageName().equals(cVar.k0())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean c(C5630ch1.c cVar, String str) {
        if (cVar.b() < 0) {
            if (this.a.getPackageManager().checkPermission(str, cVar.k0()) != 0) {
                return false;
            }
            return true;
        } else if (this.a.checkPermission(str, cVar.b(), cVar.a()) != 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override // o.C5630ch1.a
    public Context getContext() {
        return this.a;
    }
}
