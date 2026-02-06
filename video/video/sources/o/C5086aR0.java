package o;

import com.facebook.S;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Iterator;
import o.HT1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@HT1({HT1.a.Y})
/* renamed from: o.aR0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5086aR0 {
    @NotNull
    public static final C5086aR0 a = new C5086aR0();
    @NotNull
    public static final String b = "analysis_log_";
    @NotNull
    public static final String c = "anr_log_";
    @NotNull
    public static final String d = "crash_log_";
    @NotNull
    public static final String e = "shield_log_";
    @NotNull
    public static final String f = "thread_check_log_";
    @NotNull
    public static final String g = "error_log_";
    @NotNull
    public static final String h = "com.facebook";
    @NotNull
    public static final String i = "com.meta";
    @NotNull
    public static final String j = "com.facebook.appevents.codeless";
    @NotNull
    public static final String k = "com.facebook.appevents.suggestedevents";
    @NotNull
    public static final String l = "instrument";

    @InterfaceC9511sW0
    public static final boolean d(@Nullable String str) {
        File f2 = f();
        if (f2 != null && str != null) {
            return new File(f2, str).delete();
        }
        return false;
    }

    @InterfaceC9511sW0
    @Nullable
    public static final String e(@Nullable Throwable th) {
        if (th == null) {
            return null;
        }
        if (th.getCause() == null) {
            return th.toString();
        }
        return String.valueOf(th.getCause());
    }

    @InterfaceC9511sW0
    @Nullable
    public static final File f() {
        com.facebook.M m = com.facebook.M.a;
        File file = new File(com.facebook.M.n().getCacheDir(), l);
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        return file;
    }

    @InterfaceC9511sW0
    @Nullable
    public static final String g(@NotNull Thread thread) {
        C6562gT0.p(thread, "thread");
        StackTraceElement[] stackTrace = thread.getStackTrace();
        JSONArray jSONArray = new JSONArray();
        C6562gT0.o(stackTrace, "stackTrace");
        int length = stackTrace.length;
        int i2 = 0;
        while (i2 < length) {
            StackTraceElement stackTraceElement = stackTrace[i2];
            i2++;
            jSONArray.put(stackTraceElement.toString());
        }
        return jSONArray.toString();
    }

    @InterfaceC9511sW0
    @Nullable
    public static final String h(@Nullable Throwable th) {
        Throwable th2 = null;
        if (th == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        while (th != null && th != th2) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            C6562gT0.o(stackTrace, "t.stackTrace");
            int length = stackTrace.length;
            int i2 = 0;
            while (i2 < length) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                i2++;
                jSONArray.put(stackTraceElement.toString());
            }
            th2 = th;
            th = th.getCause();
        }
        return jSONArray.toString();
    }

    @InterfaceC9511sW0
    public static final boolean i(@NotNull StackTraceElement stackTraceElement) {
        C6562gT0.p(stackTraceElement, "element");
        String className = stackTraceElement.getClassName();
        C6562gT0.o(className, "element.className");
        if (!C9545sf2.J2(className, "com.facebook", false, 2, null)) {
            String className2 = stackTraceElement.getClassName();
            C6562gT0.o(className2, "element.className");
            if (!C9545sf2.J2(className2, i, false, 2, null)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @InterfaceC9511sW0
    public static final boolean j(@Nullable Throwable th) {
        if (th == null) {
            return false;
        }
        Throwable th2 = null;
        while (th != null && th != th2) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            C6562gT0.o(stackTrace, "t.stackTrace");
            int length = stackTrace.length;
            int i2 = 0;
            while (i2 < length) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                i2++;
                C6562gT0.o(stackTraceElement, "element");
                if (i(stackTraceElement)) {
                    return true;
                }
            }
            th2 = th;
            th = th.getCause();
        }
        return false;
    }

    @InterfaceC9511sW0
    public static final boolean k(@Nullable Thread thread) {
        StackTraceElement[] stackTrace;
        if (thread != null && (stackTrace = thread.getStackTrace()) != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                C6562gT0.o(stackTraceElement, "element");
                if (i(stackTraceElement)) {
                    String className = stackTraceElement.getClassName();
                    C6562gT0.o(className, "element.className");
                    if (!C9545sf2.J2(className, j, false, 2, null)) {
                        String className2 = stackTraceElement.getClassName();
                        C6562gT0.o(className2, "element.className");
                        if (!C9545sf2.J2(className2, k, false, 2, null)) {
                            return true;
                        }
                    }
                    String methodName = stackTraceElement.getMethodName();
                    C6562gT0.o(methodName, "element.methodName");
                    if (C9545sf2.J2(methodName, "onClick", false, 2, null)) {
                        continue;
                    } else {
                        String methodName2 = stackTraceElement.getMethodName();
                        C6562gT0.o(methodName2, "element.methodName");
                        if (C9545sf2.J2(methodName2, "onItemClick", false, 2, null)) {
                            continue;
                        } else {
                            String methodName3 = stackTraceElement.getMethodName();
                            C6562gT0.o(methodName3, "element.methodName");
                            if (!C9545sf2.J2(methodName3, "onTouch", false, 2, null)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @InterfaceC9511sW0
    @NotNull
    public static final File[] l() {
        File f2 = f();
        if (f2 == null) {
            return new File[0];
        }
        File[] listFiles = f2.listFiles(new FilenameFilter() { // from class: o.YQ0
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean m;
                m = C5086aR0.m(file, str);
                return m;
            }
        });
        if (listFiles == null) {
            return new File[0];
        }
        return listFiles;
    }

    public static final boolean m(File file, String str) {
        C6562gT0.o(str, "name");
        C8319ne2 c8319ne2 = C8319ne2.a;
        String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{c}, 1));
        C6562gT0.o(format, "java.lang.String.format(format, *args)");
        return new C10219vQ1(format).m(str);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final File[] n() {
        File f2 = f();
        if (f2 == null) {
            return new File[0];
        }
        File[] listFiles = f2.listFiles(new FilenameFilter() { // from class: o.ZQ0
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean o2;
                o2 = C5086aR0.o(file, str);
                return o2;
            }
        });
        if (listFiles == null) {
            return new File[0];
        }
        return listFiles;
    }

    public static final boolean o(File file, String str) {
        C6562gT0.o(str, "name");
        C8319ne2 c8319ne2 = C8319ne2.a;
        String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{b}, 1));
        C6562gT0.o(format, "java.lang.String.format(format, *args)");
        return new C10219vQ1(format).m(str);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final File[] p() {
        File f2 = f();
        if (f2 == null) {
            return new File[0];
        }
        File[] listFiles = f2.listFiles(new FilenameFilter() { // from class: o.XQ0
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean q;
                q = C5086aR0.q(file, str);
                return q;
            }
        });
        if (listFiles == null) {
            return new File[0];
        }
        return listFiles;
    }

    public static final boolean q(File file, String str) {
        C6562gT0.o(str, "name");
        C8319ne2 c8319ne2 = C8319ne2.a;
        String format = String.format("^(%s|%s|%s)[0-9]+.json$", Arrays.copyOf(new Object[]{d, e, f}, 3));
        C6562gT0.o(format, "java.lang.String.format(format, *args)");
        return new C10219vQ1(format).m(str);
    }

    @InterfaceC9511sW0
    @Nullable
    public static final JSONObject r(@Nullable String str, boolean z) {
        File f2 = f();
        if (f2 != null && str != null) {
            try {
                FileInputStream fileInputStream = new FileInputStream(new File(f2, str));
                com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                return new JSONObject(com.facebook.internal.l0.x0(fileInputStream));
            } catch (Exception unused) {
                if (z) {
                    d(str);
                }
            }
        }
        return null;
    }

    @InterfaceC9511sW0
    public static final void s(@Nullable String str, @NotNull JSONArray jSONArray, @Nullable S.b bVar) {
        C6562gT0.p(jSONArray, FileStore.k);
        if (jSONArray.length() != 0) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(str, jSONArray.toString());
                com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
                JSONObject D = com.facebook.internal.l0.D();
                if (D != null) {
                    Iterator<String> keys = D.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject.put(next, D.get(next));
                    }
                }
                S.c cVar = com.facebook.S.n;
                C8319ne2 c8319ne2 = C8319ne2.a;
                com.facebook.M m = com.facebook.M.a;
                String format = String.format("%s/instruments", Arrays.copyOf(new Object[]{com.facebook.M.o()}, 1));
                C6562gT0.o(format, "java.lang.String.format(format, *args)");
                cVar.N(null, format, jSONObject, bVar).n();
            } catch (JSONException unused) {
            }
        }
    }

    @InterfaceC9511sW0
    public static final void t(@Nullable String str, @Nullable String str2) {
        File f2 = f();
        if (f2 != null && str != null && str2 != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(f2, str));
                byte[] bytes = str2.getBytes(HB.b);
                C6562gT0.o(bytes, "(this as java.lang.String).getBytes(charset)");
                fileOutputStream.write(bytes);
                fileOutputStream.close();
            } catch (Exception unused) {
            }
        }
    }
}
