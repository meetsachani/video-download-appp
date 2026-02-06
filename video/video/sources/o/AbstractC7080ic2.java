package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: o.ic2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7080ic2 {
    public static final Set<AbstractC7080ic2> c = new HashSet();
    public static final String d = "org.chromium.android_webview.services.StartupFeatureMetadataHolder";
    public static final /* synthetic */ boolean e = false;
    public final String a;
    public final String b;

    /* renamed from: o.ic2$a */
    /* loaded from: classes.dex */
    public static class a extends AbstractC7080ic2 {
        public a(String str, String str2) {
            super(str, str2);
        }

        @Override // o.AbstractC7080ic2
        public final boolean e() {
            return false;
        }
    }

    /* renamed from: o.ic2$b */
    /* loaded from: classes.dex */
    public static class b extends AbstractC7080ic2 {
        public b(String str, String str2) {
            super(str, str2);
        }

        @Override // o.AbstractC7080ic2
        public final boolean e() {
            if (Build.VERSION.SDK_INT >= 28) {
                return true;
            }
            return false;
        }
    }

    public AbstractC7080ic2(String str, String str2) {
        this.a = str;
        this.b = str2;
        c.add(this);
    }

    public static Bundle a(Context context) {
        PackageInfo g = C6273fK2.g(context);
        if (g == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(g.packageName, d);
        if (Build.VERSION.SDK_INT >= 33) {
            try {
                return C10987yb.a(context.getPackageManager(), componentName, C10987yb.b(640L)).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
        try {
            return c(context, componentName, 640).metaData;
        } catch (PackageManager.NameNotFoundException unused2) {
            return null;
        }
    }

    public static ServiceInfo c(Context context, ComponentName componentName, int i) throws PackageManager.NameNotFoundException {
        return context.getPackageManager().getServiceInfo(componentName, i);
    }

    public static Set<AbstractC7080ic2> g() {
        return Collections.unmodifiableSet(c);
    }

    public String b() {
        return this.a;
    }

    public boolean d(Context context) {
        if (!e() && !f(context)) {
            return false;
        }
        return true;
    }

    public abstract boolean e();

    public boolean f(Context context) {
        Bundle a2 = a(context);
        if (a2 == null) {
            return false;
        }
        return a2.containsKey(this.b);
    }
}
