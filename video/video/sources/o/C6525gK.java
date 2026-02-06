package o;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.consent_sdk.zzcm;
import com.google.android.gms.internal.consent_sdk.zzcu;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.gK  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6525gK {
    public final boolean a;
    public final int b;

    /* renamed from: o.gK$a */
    /* loaded from: classes3.dex */
    public static class a {
        public final Context b;
        public boolean d;
        public final List a = new ArrayList();
        public int c = 0;

        public a(@RecentlyNonNull Context context) {
            this.b = context.getApplicationContext();
        }

        @RecentlyNonNull
        public a a(@RecentlyNonNull String str) {
            this.a.add(str);
            return this;
        }

        @RecentlyNonNull
        public C6525gK b() {
            boolean z = true;
            if (!zzcu.a(true) && !this.a.contains(zzcm.a(this.b)) && !this.d) {
                z = false;
            }
            return new C6525gK(z, this, null);
        }

        @RecentlyNonNull
        public a c(int i) {
            this.c = i;
            return this;
        }

        @RecentlyNonNull
        @KeepForSdk
        public a d(boolean z) {
            this.d = z;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.gK$b */
    /* loaded from: classes3.dex */
    public @interface b {
        public static final int U0 = 0;
        public static final int V0 = 1;
        @Deprecated
        public static final int W0 = 2;
        public static final int X0 = 3;
        public static final int Y0 = 4;
    }

    public /* synthetic */ C6525gK(boolean z, a aVar, JS2 js2) {
        this.a = z;
        this.b = aVar.c;
    }

    public int a() {
        return this.b;
    }

    public boolean b() {
        return this.a;
    }
}
