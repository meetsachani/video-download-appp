package o;

import android.app.RemoteInput;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: o.jR1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7282jR1 {
    public static final String h = "android.remoteinput.results";
    public static final String i = "android.remoteinput.resultsData";
    public static final String j = "android.remoteinput.dataTypeResultsData";
    public static final String k = "android.remoteinput.resultsSource";
    public static final int l = 0;
    public static final int m = 1;
    public static final int n = 0;

    /* renamed from: o  reason: collision with root package name */
    public static final int f774o = 1;
    public static final int p = 2;
    public final String a;
    public final CharSequence b;
    public final CharSequence[] c;
    public final boolean d;
    public final int e;
    public final Bundle f;
    public final Set<String> g;

    /* renamed from: o.jR1$a */
    /* loaded from: classes.dex */
    public static class a {
        public static void a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        public static RemoteInput b(C7282jR1 c7282jR1) {
            Set<String> g;
            RemoteInput.Builder addExtras = new RemoteInput.Builder(c7282jR1.o()).setLabel(c7282jR1.n()).setChoices(c7282jR1.h()).setAllowFreeFormInput(c7282jR1.f()).addExtras(c7282jR1.m());
            if (Build.VERSION.SDK_INT >= 26 && (g = c7282jR1.g()) != null) {
                for (String str : g) {
                    b.d(addExtras, str, true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                d.b(addExtras, c7282jR1.k());
            }
            return addExtras.build();
        }

        public static C7282jR1 c(Object obj) {
            Set<String> b;
            RemoteInput remoteInput = (RemoteInput) obj;
            e a = new e(remoteInput.getResultKey()).h(remoteInput.getLabel()).f(remoteInput.getChoices()).e(remoteInput.getAllowFreeFormInput()).a(remoteInput.getExtras());
            if (Build.VERSION.SDK_INT >= 26 && (b = b.b(remoteInput)) != null) {
                for (String str : b) {
                    a.d(str, true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                a.g(d.a(remoteInput));
            }
            return a.b();
        }

        public static Bundle d(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    /* renamed from: o.jR1$b */
    /* loaded from: classes.dex */
    public static class b {
        public static void a(C7282jR1 c7282jR1, Intent intent, Map<String, Uri> map) {
            RemoteInput.addDataResultToIntent(C7282jR1.c(c7282jR1), intent, map);
        }

        public static Set<String> b(Object obj) {
            return ((RemoteInput) obj).getAllowedDataTypes();
        }

        public static Map<String, Uri> c(Intent intent, String str) {
            return RemoteInput.getDataResultsFromIntent(intent, str);
        }

        public static RemoteInput.Builder d(RemoteInput.Builder builder, String str, boolean z) {
            return builder.setAllowDataType(str, z);
        }
    }

    /* renamed from: o.jR1$c */
    /* loaded from: classes.dex */
    public static class c {
        public static int a(Intent intent) {
            return RemoteInput.getResultsSource(intent);
        }

        public static void b(Intent intent, int i) {
            RemoteInput.setResultsSource(intent, i);
        }
    }

    /* renamed from: o.jR1$d */
    /* loaded from: classes.dex */
    public static class d {
        public static int a(Object obj) {
            return ((RemoteInput) obj).getEditChoicesBeforeSending();
        }

        public static RemoteInput.Builder b(RemoteInput.Builder builder, int i) {
            return builder.setEditChoicesBeforeSending(i);
        }
    }

    /* renamed from: o.jR1$e */
    /* loaded from: classes.dex */
    public static final class e {
        public final String a;
        public CharSequence d;
        public CharSequence[] e;
        public final Set<String> b = new HashSet();
        public final Bundle c = new Bundle();
        public boolean f = true;
        public int g = 0;

        public e(String str) {
            if (str != null) {
                this.a = str;
                return;
            }
            throw new IllegalArgumentException("Result key can't be null");
        }

        public e a(Bundle bundle) {
            if (bundle != null) {
                this.c.putAll(bundle);
            }
            return this;
        }

        public C7282jR1 b() {
            return new C7282jR1(this.a, this.d, this.e, this.f, this.g, this.c, this.b);
        }

        public Bundle c() {
            return this.c;
        }

        public e d(String str, boolean z) {
            if (z) {
                this.b.add(str);
                return this;
            }
            this.b.remove(str);
            return this;
        }

        public e e(boolean z) {
            this.f = z;
            return this;
        }

        public e f(CharSequence[] charSequenceArr) {
            this.e = charSequenceArr;
            return this;
        }

        public e g(int i) {
            this.g = i;
            return this;
        }

        public e h(CharSequence charSequence) {
            this.d = charSequence;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.jR1$f */
    /* loaded from: classes.dex */
    public @interface f {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.jR1$g */
    /* loaded from: classes.dex */
    public @interface g {
    }

    public C7282jR1(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, int i2, Bundle bundle, Set<String> set) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequenceArr;
        this.d = z;
        this.e = i2;
        this.f = bundle;
        this.g = set;
        if (k() == 2 && !f()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public static void a(C7282jR1 c7282jR1, Intent intent, Map<String, Uri> map) {
        if (Build.VERSION.SDK_INT >= 26) {
            b.a(c7282jR1, intent, map);
            return;
        }
        Intent i2 = i(intent);
        if (i2 == null) {
            i2 = new Intent();
        }
        for (Map.Entry<String, Uri> entry : map.entrySet()) {
            String key = entry.getKey();
            Uri value = entry.getValue();
            if (key != null) {
                Bundle bundleExtra = i2.getBundleExtra(l(key));
                if (bundleExtra == null) {
                    bundleExtra = new Bundle();
                }
                bundleExtra.putString(c7282jR1.o(), value.toString());
                i2.putExtra(l(key), bundleExtra);
            }
        }
        intent.setClipData(ClipData.newIntent(h, i2));
    }

    public static void b(C7282jR1[] c7282jR1Arr, Intent intent, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.a(d(c7282jR1Arr), intent, bundle);
            return;
        }
        Bundle p2 = p(intent);
        int q = q(intent);
        if (p2 != null) {
            p2.putAll(bundle);
            bundle = p2;
        }
        for (C7282jR1 c7282jR1 : c7282jR1Arr) {
            Map<String, Uri> j2 = j(intent, c7282jR1.o());
            a.a(d(new C7282jR1[]{c7282jR1}), intent, bundle);
            if (j2 != null) {
                a(c7282jR1, intent, j2);
            }
        }
        s(intent, q);
    }

    public static RemoteInput c(C7282jR1 c7282jR1) {
        return a.b(c7282jR1);
    }

    public static RemoteInput[] d(C7282jR1[] c7282jR1Arr) {
        if (c7282jR1Arr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[c7282jR1Arr.length];
        for (int i2 = 0; i2 < c7282jR1Arr.length; i2++) {
            remoteInputArr[i2] = c(c7282jR1Arr[i2]);
        }
        return remoteInputArr;
    }

    public static C7282jR1 e(RemoteInput remoteInput) {
        return a.c(remoteInput);
    }

    public static Intent i(Intent intent) {
        ClipData clipData = intent.getClipData();
        if (clipData == null) {
            return null;
        }
        ClipDescription description = clipData.getDescription();
        if (!description.hasMimeType("text/vnd.android.intent") || !description.getLabel().toString().contentEquals(h)) {
            return null;
        }
        return clipData.getItemAt(0).getIntent();
    }

    public static Map<String, Uri> j(Intent intent, String str) {
        String string;
        if (Build.VERSION.SDK_INT >= 26) {
            return b.c(intent, str);
        }
        Intent i2 = i(intent);
        if (i2 == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str2 : i2.getExtras().keySet()) {
            if (str2.startsWith(j)) {
                String substring = str2.substring(39);
                if (!substring.isEmpty() && (string = i2.getBundleExtra(str2).getString(str)) != null && !string.isEmpty()) {
                    hashMap.put(substring, Uri.parse(string));
                }
            }
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        return hashMap;
    }

    public static String l(String str) {
        return j + str;
    }

    public static Bundle p(Intent intent) {
        return a.d(intent);
    }

    public static int q(Intent intent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return c.a(intent);
        }
        Intent i2 = i(intent);
        if (i2 == null) {
            return 0;
        }
        return i2.getExtras().getInt(k, 0);
    }

    public static void s(Intent intent, int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            c.b(intent, i2);
            return;
        }
        Intent i3 = i(intent);
        if (i3 == null) {
            i3 = new Intent();
        }
        i3.putExtra(k, i2);
        intent.setClipData(ClipData.newIntent(h, i3));
    }

    public boolean f() {
        return this.d;
    }

    public Set<String> g() {
        return this.g;
    }

    public CharSequence[] h() {
        return this.c;
    }

    public int k() {
        return this.e;
    }

    public Bundle m() {
        return this.f;
    }

    public CharSequence n() {
        return this.b;
    }

    public String o() {
        return this.a;
    }

    public boolean r() {
        if (!f()) {
            if ((h() == null || h().length == 0) && g() != null && !g().isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }
}
