package o;

import android.os.Build;
import android.os.ext.SdkExtensions;

/* renamed from: o.k7  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7443k7 {
    public static final C7443k7 a = new C7443k7();

    /* renamed from: o.k7$a */
    /* loaded from: classes.dex */
    public static final class a {
        public static final a a = new a();

        public final int a() {
            int extensionVersion;
            extensionVersion = SdkExtensions.getExtensionVersion(1000000);
            return extensionVersion;
        }
    }

    public final int a() {
        if (Build.VERSION.SDK_INT >= 30) {
            return a.a.a();
        }
        return 0;
    }
}
