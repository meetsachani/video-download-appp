package o;

import android.content.Context;
import android.media.session.MediaSessionManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import o.C7098ih1;
import o.C7340jh1;

/* renamed from: o.ch1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5630ch1 {
    public static final String b = "MediaSessionManager";
    public static final boolean c = Log.isLoggable("MediaSessionManager", 3);
    public static final Object d = new Object();
    public static volatile C5630ch1 e;
    public a a;

    /* renamed from: o.ch1$a */
    /* loaded from: classes.dex */
    public interface a {
        boolean a(c cVar);

        Context getContext();
    }

    /* renamed from: o.ch1$c */
    /* loaded from: classes.dex */
    public interface c {
        int a();

        int b();

        String k0();
    }

    public C5630ch1(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.a = new C7098ih1(context);
        } else {
            this.a = new C5873dh1(context);
        }
    }

    public static C5630ch1 b(Context context) {
        C5630ch1 c5630ch1;
        if (context != null) {
            synchronized (d) {
                try {
                    if (e == null) {
                        e = new C5630ch1(context.getApplicationContext());
                    }
                    c5630ch1 = e;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return c5630ch1;
        }
        throw new IllegalArgumentException("context cannot be null");
    }

    public Context a() {
        return this.a.getContext();
    }

    public boolean c(b bVar) {
        if (bVar != null) {
            return this.a.a(bVar.a);
        }
        throw new IllegalArgumentException("userInfo should not be null");
    }

    /* renamed from: o.ch1$b */
    /* loaded from: classes.dex */
    public static final class b {
        public static final String b = "android.media.session.MediaController";
        public static final int c = -1;
        public static final int d = -1;
        public c a;

        public b(String str, int i, int i2) {
            if (str != null) {
                if (!TextUtils.isEmpty(str)) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        this.a = new C7098ih1.a(str, i, i2);
                        return;
                    } else {
                        this.a = new C7340jh1.a(str, i, i2);
                        return;
                    }
                }
                throw new IllegalArgumentException("packageName should be nonempty");
            }
            throw new NullPointerException("package shouldn't be null");
        }

        public String a() {
            return this.a.k0();
        }

        public int b() {
            return this.a.b();
        }

        public int c() {
            return this.a.a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return this.a.equals(((b) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public b(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            String c2 = C7098ih1.a.c(remoteUserInfo);
            if (c2 != null) {
                if (!TextUtils.isEmpty(c2)) {
                    this.a = new C7098ih1.a(remoteUserInfo);
                    return;
                }
                throw new IllegalArgumentException("packageName should be nonempty");
            }
            throw new NullPointerException("package shouldn't be null");
        }
    }
}
