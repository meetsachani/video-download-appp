package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.emoji2.text.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.C10907yF1;
import o.C4761Xw0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: androidx.emoji2.text.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0021a {
        public static final String b = "emoji2.text.DefaultEmojiConfig";
        public static final String c = "androidx.content.action.LOAD_EMOJI_FONT";
        public static final String d = "emojicompat-emoji-font";
        public final b a;

        public C0021a(b bVar) {
            this.a = bVar == null ? e() : bVar;
        }

        public static b e() {
            if (Build.VERSION.SDK_INT >= 28) {
                return new d();
            }
            return new c();
        }

        public final c.d a(Context context, C4761Xw0 c4761Xw0) {
            if (c4761Xw0 == null) {
                return null;
            }
            return new e(context, c4761Xw0);
        }

        public final List<List<byte[]>> b(Signature[] signatureArr) {
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            return Collections.singletonList(arrayList);
        }

        public c.d c(Context context) {
            return a(context, h(context));
        }

        public final C4761Xw0 d(ProviderInfo providerInfo, PackageManager packageManager) throws PackageManager.NameNotFoundException {
            String str = providerInfo.authority;
            String str2 = providerInfo.packageName;
            return new C4761Xw0(str, str2, d, b(this.a.b(packageManager, str2)));
        }

        public final boolean f(ProviderInfo providerInfo) {
            ApplicationInfo applicationInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                return true;
            }
            return false;
        }

        public final ProviderInfo g(PackageManager packageManager) {
            for (ResolveInfo resolveInfo : this.a.c(packageManager, new Intent(c), 0)) {
                ProviderInfo a = this.a.a(resolveInfo);
                if (f(a)) {
                    return a;
                }
            }
            return null;
        }

        public C4761Xw0 h(Context context) {
            PackageManager packageManager = context.getPackageManager();
            C10907yF1.m(packageManager, "Package manager required to locate emoji font provider");
            ProviderInfo g = g(packageManager);
            if (g == null) {
                return null;
            }
            try {
                return d(g, packageManager);
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf(b, e);
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public ProviderInfo a(ResolveInfo resolveInfo) {
            throw new IllegalStateException("Unable to get provider info prior to API 19");
        }

        public Signature[] b(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        public List<ResolveInfo> c(PackageManager packageManager, Intent intent, int i) {
            return Collections.EMPTY_LIST;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends b {
        @Override // androidx.emoji2.text.a.b
        public ProviderInfo a(ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        @Override // androidx.emoji2.text.a.b
        public List<ResolveInfo> c(PackageManager packageManager, Intent intent, int i) {
            return packageManager.queryIntentContentProviders(intent, i);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends c {
        @Override // androidx.emoji2.text.a.b
        public Signature[] b(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    public static e a(Context context) {
        return (e) new C0021a(null).c(context);
    }
}
