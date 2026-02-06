package o;

import com.facebook.S;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import o.HT1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@HT1({HT1.a.Y})
/* renamed from: o.se0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9539se0 {
    @NotNull
    public static final C9539se0 a = new C9539se0();
    public static final int b = 1000;

    @InterfaceC9511sW0
    public static final void d() {
        com.facebook.M m = com.facebook.M.a;
        if (com.facebook.M.s()) {
            h();
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final File[] e() {
        C5086aR0 c5086aR0 = C5086aR0.a;
        File f = C5086aR0.f();
        if (f == null) {
            return new File[0];
        }
        File[] listFiles = f.listFiles(new FilenameFilter() { // from class: o.pe0
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean f2;
                f2 = C9539se0.f(file, str);
                return f2;
            }
        });
        C6562gT0.o(listFiles, "reportDir.listFiles { dir, name ->\n      name.matches(Regex(String.format(\"^%s[0-9]+.json$\", InstrumentUtility.ERROR_REPORT_PREFIX)))\n    }");
        return listFiles;
    }

    public static final boolean f(File file, String str) {
        C6562gT0.o(str, "name");
        C8319ne2 c8319ne2 = C8319ne2.a;
        String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{C5086aR0.g}, 1));
        C6562gT0.o(format, "java.lang.String.format(format, *args)");
        return new C10219vQ1(format).m(str);
    }

    @InterfaceC9511sW0
    public static final void g(@Nullable String str) {
        try {
            new C8561oe0(str).e();
        } catch (Exception unused) {
        }
    }

    @InterfaceC9511sW0
    public static final void h() {
        com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
        if (com.facebook.internal.l0.c0()) {
            return;
        }
        File[] e = e();
        final ArrayList arrayList = new ArrayList();
        int length = e.length;
        int i = 0;
        while (i < length) {
            File file = e[i];
            i++;
            C8561oe0 c8561oe0 = new C8561oe0(file);
            if (c8561oe0.d()) {
                arrayList.add(c8561oe0);
            }
        }
        C9201rF.p0(arrayList, new Comparator() { // from class: o.qe0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int i2;
                i2 = C9539se0.i((C8561oe0) obj, (C8561oe0) obj2);
                return i2;
            }
        });
        JSONArray jSONArray = new JSONArray();
        for (int i2 = 0; i2 < arrayList.size() && i2 < 1000; i2++) {
            jSONArray.put(arrayList.get(i2));
        }
        C5086aR0 c5086aR0 = C5086aR0.a;
        C5086aR0.s("error_reports", jSONArray, new S.b() { // from class: o.re0
            @Override // com.facebook.S.b
            public final void a(com.facebook.Y y) {
                C9539se0.j(arrayList, y);
            }
        });
    }

    public static final int i(C8561oe0 c8561oe0, C8561oe0 c8561oe02) {
        C6562gT0.o(c8561oe02, "o2");
        return c8561oe0.b(c8561oe02);
    }

    public static final void j(ArrayList arrayList, com.facebook.Y y) {
        Boolean valueOf;
        C6562gT0.p(arrayList, "$validReports");
        C6562gT0.p(y, "response");
        try {
            if (y.g() == null) {
                JSONObject k = y.k();
                if (k == null) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(k.getBoolean("success"));
                }
                if (C6562gT0.g(valueOf, Boolean.TRUE)) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((C8561oe0) it.next()).a();
                    }
                }
            }
        } catch (JSONException unused) {
        }
    }
}
