package o;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.facebook.bolts.C2333e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.ja2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7313ja2 {
    @NotNull
    public static final a c = new a(null);
    @NotNull
    public static final String d = "_fbSourceApplicationHasBeenSet";
    @NotNull
    public static final String e = "com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage";
    @NotNull
    public static final String f = "com.facebook.appevents.SourceApplicationInfo.openedByApplink";
    @Nullable
    public final String a;
    public final boolean b;

    /* renamed from: o.ja2$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        public final void a() {
            com.facebook.M m = com.facebook.M.a;
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(com.facebook.M.n()).edit();
            edit.remove(C7313ja2.e);
            edit.remove(C7313ja2.f);
            edit.apply();
        }

        @InterfaceC9511sW0
        @Nullable
        public final C7313ja2 b() {
            com.facebook.M m = com.facebook.M.a;
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(com.facebook.M.n());
            if (!defaultSharedPreferences.contains(C7313ja2.e)) {
                return null;
            }
            return new C7313ja2(defaultSharedPreferences.getString(C7313ja2.e, null), defaultSharedPreferences.getBoolean(C7313ja2.f, false), null);
        }

        public a() {
        }
    }

    /* renamed from: o.ja2$b */
    /* loaded from: classes2.dex */
    public static final class b {
        @NotNull
        public static final b a = new b();

        @InterfaceC9511sW0
        @Nullable
        public static final C7313ja2 a(@NotNull Activity activity) {
            String str;
            C6562gT0.p(activity, androidx.appcompat.widget.b.r);
            ComponentName callingActivity = activity.getCallingActivity();
            if (callingActivity != null) {
                str = callingActivity.getPackageName();
                if (C6562gT0.g(str, activity.getPackageName())) {
                    return null;
                }
            } else {
                str = "";
            }
            Intent intent = activity.getIntent();
            boolean z = false;
            if (intent != null && !intent.getBooleanExtra(C7313ja2.d, false)) {
                intent.putExtra(C7313ja2.d, true);
                C2333e c2333e = C2333e.a;
                Bundle a2 = C2333e.a(intent);
                if (a2 != null) {
                    Bundle bundle = a2.getBundle("referer_app_link");
                    if (bundle != null) {
                        str = bundle.getString("package");
                    }
                    z = true;
                }
            }
            if (intent != null) {
                intent.putExtra(C7313ja2.d, true);
            }
            return new C7313ja2(str, z, null);
        }
    }

    public /* synthetic */ C7313ja2(String str, boolean z, C9516sY c9516sY) {
        this(str, z);
    }

    @InterfaceC9511sW0
    public static final void a() {
        c.a();
    }

    @InterfaceC9511sW0
    @Nullable
    public static final C7313ja2 c() {
        return c.b();
    }

    @Nullable
    public final String b() {
        return this.a;
    }

    public final boolean d() {
        return this.b;
    }

    public final void e() {
        com.facebook.M m = com.facebook.M.a;
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(com.facebook.M.n()).edit();
        edit.putString(e, this.a);
        edit.putBoolean(f, this.b);
        edit.apply();
    }

    @NotNull
    public String toString() {
        String str;
        if (this.b) {
            str = "Applink";
        } else {
            str = "Unclassified";
        }
        if (this.a != null) {
            return str + '(' + ((Object) this.a) + ')';
        }
        return str;
    }

    public C7313ja2(String str, boolean z) {
        this.a = str;
        this.b = z;
    }
}
