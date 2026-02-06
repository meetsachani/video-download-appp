package o;

import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.UserHandle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class U42 {
    public static final String C = "extraPersonCount";
    public static final String D = "extraPerson_";
    public static final String E = "extraLocusId";
    public static final String F = "extraLongLived";
    public static final String G = "extraSliceUri";
    public static final int H = 1;
    public int A;
    public int B;
    public Context a;
    public String b;
    public String c;
    public Intent[] d;
    public ComponentName e;
    public CharSequence f;
    public CharSequence g;
    public CharSequence h;
    public IconCompat i;
    public boolean j;
    public NC1[] k;
    public Set<String> l;
    public H31 m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public int f623o;
    public PersistableBundle p;
    public Bundle q;
    public long r;
    public UserHandle s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y = true;
    public boolean z;

    /* loaded from: classes.dex */
    public static class a {
        public static void a(ShortcutInfo.Builder builder, int i) {
            builder.setExcludedFromSurfaces(i);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface c {
    }

    public static List<U42> c(Context context, List<ShortcutInfo> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (ShortcutInfo shortcutInfo : list) {
            arrayList.add(new b(context, G42.a(shortcutInfo)).c());
        }
        return arrayList;
    }

    public static H31 p(ShortcutInfo shortcutInfo) {
        if (Build.VERSION.SDK_INT >= 29) {
            if (H42.a(shortcutInfo) == null) {
                return null;
            }
            return H31.d(H42.a(shortcutInfo));
        }
        return q(I42.a(shortcutInfo));
    }

    public static H31 q(PersistableBundle persistableBundle) {
        String string;
        if (persistableBundle == null || (string = persistableBundle.getString(E)) == null) {
            return null;
        }
        return new H31(string);
    }

    public static boolean s(PersistableBundle persistableBundle) {
        if (persistableBundle != null && persistableBundle.containsKey(F)) {
            return persistableBundle.getBoolean(F);
        }
        return false;
    }

    public static NC1[] u(PersistableBundle persistableBundle) {
        if (persistableBundle != null && persistableBundle.containsKey(C)) {
            int i = persistableBundle.getInt(C);
            NC1[] nc1Arr = new NC1[i];
            int i2 = 0;
            while (i2 < i) {
                StringBuilder sb = new StringBuilder();
                sb.append(D);
                int i3 = i2 + 1;
                sb.append(i3);
                nc1Arr[i2] = NC1.c(persistableBundle.getPersistableBundle(sb.toString()));
                i2 = i3;
            }
            return nc1Arr;
        }
        return null;
    }

    public boolean A() {
        return this.t;
    }

    public boolean B() {
        return this.w;
    }

    public boolean C() {
        return this.u;
    }

    public boolean D() {
        return this.y;
    }

    public boolean E(int i) {
        if ((i & this.B) != 0) {
            return true;
        }
        return false;
    }

    public boolean F() {
        return this.x;
    }

    public boolean G() {
        return this.v;
    }

    public ShortcutInfo H() {
        K42.a();
        ShortcutInfo.Builder a2 = P42.a(C42.a(J42.a(this.a, this.b), this.f), this.d);
        IconCompat iconCompat = this.i;
        if (iconCompat != null) {
            Q42.a(a2, iconCompat.L(this.a));
        }
        if (!TextUtils.isEmpty(this.g)) {
            R42.a(a2, this.g);
        }
        if (!TextUtils.isEmpty(this.h)) {
            S42.a(a2, this.h);
        }
        ComponentName componentName = this.e;
        if (componentName != null) {
            T42.a(a2, componentName);
        }
        Set<String> set = this.l;
        if (set != null) {
            D42.a(a2, set);
        }
        E42.a(a2, this.f623o);
        PersistableBundle persistableBundle = this.p;
        if (persistableBundle != null) {
            N42.a(a2, persistableBundle);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            NC1[] nc1Arr = this.k;
            if (nc1Arr != null && nc1Arr.length > 0) {
                int length = nc1Arr.length;
                Person[] personArr = new Person[length];
                for (int i = 0; i < length; i++) {
                    personArr[i] = this.k[i].k();
                }
                F42.a(a2, personArr);
            }
            H31 h31 = this.m;
            if (h31 != null) {
                L42.a(a2, h31.c());
            }
            M42.a(a2, this.n);
        } else {
            N42.a(a2, b());
        }
        if (Build.VERSION.SDK_INT >= 33) {
            a.a(a2, this.B);
        }
        return O42.a(a2);
    }

    public Intent a(Intent intent) {
        Intent[] intentArr = this.d;
        intent.putExtra("android.intent.extra.shortcut.INTENT", intentArr[intentArr.length - 1]).putExtra("android.intent.extra.shortcut.NAME", this.f.toString());
        if (this.i != null) {
            Drawable drawable = null;
            if (this.j) {
                PackageManager packageManager = this.a.getPackageManager();
                ComponentName componentName = this.e;
                if (componentName != null) {
                    try {
                        drawable = packageManager.getActivityIcon(componentName);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                if (drawable == null) {
                    drawable = this.a.getApplicationInfo().loadIcon(packageManager);
                }
            }
            this.i.h(intent, drawable, this.a);
        }
        return intent;
    }

    public final PersistableBundle b() {
        if (this.p == null) {
            this.p = new PersistableBundle();
        }
        NC1[] nc1Arr = this.k;
        if (nc1Arr != null && nc1Arr.length > 0) {
            this.p.putInt(C, nc1Arr.length);
            int i = 0;
            while (i < this.k.length) {
                PersistableBundle persistableBundle = this.p;
                StringBuilder sb = new StringBuilder();
                sb.append(D);
                int i2 = i + 1;
                sb.append(i2);
                persistableBundle.putPersistableBundle(sb.toString(), this.k[i].n());
                i = i2;
            }
        }
        H31 h31 = this.m;
        if (h31 != null) {
            this.p.putString(E, h31.a());
        }
        this.p.putBoolean(F, this.n);
        return this.p;
    }

    public ComponentName d() {
        return this.e;
    }

    public Set<String> e() {
        return this.l;
    }

    public CharSequence f() {
        return this.h;
    }

    public int g() {
        return this.A;
    }

    public int h() {
        return this.B;
    }

    public PersistableBundle i() {
        return this.p;
    }

    public IconCompat j() {
        return this.i;
    }

    public String k() {
        return this.b;
    }

    public Intent l() {
        Intent[] intentArr = this.d;
        return intentArr[intentArr.length - 1];
    }

    public Intent[] m() {
        Intent[] intentArr = this.d;
        return (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
    }

    public long n() {
        return this.r;
    }

    public H31 o() {
        return this.m;
    }

    public CharSequence r() {
        return this.g;
    }

    public String t() {
        return this.c;
    }

    public int v() {
        return this.f623o;
    }

    public CharSequence w() {
        return this.f;
    }

    public Bundle x() {
        return this.q;
    }

    public UserHandle y() {
        return this.s;
    }

    public boolean z() {
        return this.z;
    }

    /* loaded from: classes.dex */
    public static class b {
        public final U42 a;
        public boolean b;
        public Set<String> c;
        public Map<String, Map<String, List<String>>> d;
        public Uri e;

        public b(Context context, String str) {
            U42 u42 = new U42();
            this.a = u42;
            u42.a = context;
            u42.b = str;
        }

        public b a(String str) {
            if (this.c == null) {
                this.c = new HashSet();
            }
            this.c.add(str);
            return this;
        }

        public b b(String str, String str2, List<String> list) {
            a(str);
            if (!list.isEmpty()) {
                if (this.d == null) {
                    this.d = new HashMap();
                }
                if (this.d.get(str) == null) {
                    this.d.put(str, new HashMap());
                }
                this.d.get(str).put(str2, list);
            }
            return this;
        }

        public U42 c() {
            String[] strArr;
            if (!TextUtils.isEmpty(this.a.f)) {
                U42 u42 = this.a;
                Intent[] intentArr = u42.d;
                if (intentArr != null && intentArr.length != 0) {
                    if (this.b) {
                        if (u42.m == null) {
                            u42.m = new H31(u42.b);
                        }
                        this.a.n = true;
                    }
                    if (this.c != null) {
                        U42 u422 = this.a;
                        if (u422.l == null) {
                            u422.l = new HashSet();
                        }
                        this.a.l.addAll(this.c);
                    }
                    if (this.d != null) {
                        U42 u423 = this.a;
                        if (u423.p == null) {
                            u423.p = new PersistableBundle();
                        }
                        for (String str : this.d.keySet()) {
                            Map<String, List<String>> map = this.d.get(str);
                            this.a.p.putStringArray(str, (String[]) map.keySet().toArray(new String[0]));
                            for (String str2 : map.keySet()) {
                                List<String> list = map.get(str2);
                                PersistableBundle persistableBundle = this.a.p;
                                String str3 = str + RemoteSettings.i + str2;
                                if (list == null) {
                                    strArr = new String[0];
                                } else {
                                    strArr = (String[]) list.toArray(new String[0]);
                                }
                                persistableBundle.putStringArray(str3, strArr);
                            }
                        }
                    }
                    if (this.e != null) {
                        U42 u424 = this.a;
                        if (u424.p == null) {
                            u424.p = new PersistableBundle();
                        }
                        this.a.p.putString(U42.G, MC2.a(this.e));
                    }
                    return this.a;
                }
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }

        public b d(ComponentName componentName) {
            this.a.e = componentName;
            return this;
        }

        public b e() {
            this.a.j = true;
            return this;
        }

        public b f(Set<String> set) {
            C3228Ie c3228Ie = new C3228Ie();
            c3228Ie.addAll(set);
            this.a.l = c3228Ie;
            return this;
        }

        public b g(CharSequence charSequence) {
            this.a.h = charSequence;
            return this;
        }

        public b h(int i) {
            this.a.B = i;
            return this;
        }

        public b i(PersistableBundle persistableBundle) {
            this.a.p = persistableBundle;
            return this;
        }

        public b j(IconCompat iconCompat) {
            this.a.i = iconCompat;
            return this;
        }

        public b k(Intent intent) {
            return l(new Intent[]{intent});
        }

        public b l(Intent[] intentArr) {
            this.a.d = intentArr;
            return this;
        }

        public b m() {
            this.b = true;
            return this;
        }

        public b n(H31 h31) {
            this.a.m = h31;
            return this;
        }

        public b o(CharSequence charSequence) {
            this.a.g = charSequence;
            return this;
        }

        @Deprecated
        public b p() {
            this.a.n = true;
            return this;
        }

        public b q(boolean z) {
            this.a.n = z;
            return this;
        }

        public b r(NC1 nc1) {
            return s(new NC1[]{nc1});
        }

        public b s(NC1[] nc1Arr) {
            this.a.k = nc1Arr;
            return this;
        }

        public b t(int i) {
            this.a.f623o = i;
            return this;
        }

        public b u(CharSequence charSequence) {
            this.a.f = charSequence;
            return this;
        }

        public b v(Uri uri) {
            this.e = uri;
            return this;
        }

        public b w(Bundle bundle) {
            this.a.q = (Bundle) C10907yF1.l(bundle);
            return this;
        }

        public b(U42 u42) {
            U42 u422 = new U42();
            this.a = u422;
            u422.a = u42.a;
            u422.b = u42.b;
            u422.c = u42.c;
            Intent[] intentArr = u42.d;
            u422.d = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
            u422.e = u42.e;
            u422.f = u42.f;
            u422.g = u42.g;
            u422.h = u42.h;
            u422.A = u42.A;
            u422.i = u42.i;
            u422.j = u42.j;
            u422.s = u42.s;
            u422.r = u42.r;
            u422.t = u42.t;
            u422.u = u42.u;
            u422.v = u42.v;
            u422.w = u42.w;
            u422.x = u42.x;
            u422.y = u42.y;
            u422.m = u42.m;
            u422.n = u42.n;
            u422.z = u42.z;
            u422.f623o = u42.f623o;
            NC1[] nc1Arr = u42.k;
            if (nc1Arr != null) {
                u422.k = (NC1[]) Arrays.copyOf(nc1Arr, nc1Arr.length);
            }
            if (u42.l != null) {
                u422.l = new HashSet(u42.l);
            }
            PersistableBundle persistableBundle = u42.p;
            if (persistableBundle != null) {
                u422.p = persistableBundle;
            }
            u422.B = u42.B;
        }

        public b(Context context, ShortcutInfo shortcutInfo) {
            U42 u42 = new U42();
            this.a = u42;
            u42.a = context;
            u42.b = V42.a(shortcutInfo);
            u42.c = W42.a(shortcutInfo);
            Intent[] a = Y42.a(shortcutInfo);
            u42.d = (Intent[]) Arrays.copyOf(a, a.length);
            u42.e = Z42.a(shortcutInfo);
            u42.f = C5000a52.a(shortcutInfo);
            u42.g = C5243b52.a(shortcutInfo);
            u42.h = C5485c52.a(shortcutInfo);
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                u42.A = C5728d52.a(shortcutInfo);
            } else {
                u42.A = C7924m52.a(shortcutInfo) ? 0 : 3;
            }
            u42.l = C5970e52.a(shortcutInfo);
            u42.k = U42.u(I42.a(shortcutInfo));
            u42.s = C6213f52.a(shortcutInfo);
            u42.r = C6468g52.a(shortcutInfo);
            if (i >= 30) {
                u42.t = C6711h52.a(shortcutInfo);
            }
            u42.u = C6954i52.a(shortcutInfo);
            u42.v = C7195j52.a(shortcutInfo);
            u42.w = C7438k52.a(shortcutInfo);
            u42.x = C7681l52.a(shortcutInfo);
            u42.y = C7924m52.a(shortcutInfo);
            u42.z = C8185n52.a(shortcutInfo);
            u42.m = U42.p(shortcutInfo);
            u42.f623o = X42.a(shortcutInfo);
            u42.p = I42.a(shortcutInfo);
        }
    }
}
