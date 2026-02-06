package com.google.firebase.crashlytics.internal.persistence;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import com.google.firebase.crashlytics.internal.Logger;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;

/* loaded from: classes3.dex */
public class FileStore {
    public static final String g = ".com.google.firebase.crashlytics.files.v1";
    public static final String h = ".com.google.firebase.crashlytics.files.v2";
    public static final String i = "open-sessions";
    public static final String j = "native";
    public static final String k = "reports";
    public static final String l = "priority-reports";
    public static final String m = "native-reports";
    public final File a;
    public final File b;
    public final File c;
    public final File d;
    public final File e;
    public final File f;

    public FileStore(Context context) {
        String str;
        String processName;
        File filesDir = context.getFilesDir();
        this.a = filesDir;
        if (w()) {
            StringBuilder sb = new StringBuilder();
            sb.append(h);
            sb.append(File.pathSeparator);
            processName = Application.getProcessName();
            sb.append(v(processName));
            str = sb.toString();
        } else {
            str = g;
        }
        File r = r(new File(filesDir, str));
        this.b = r;
        this.c = r(new File(r, i));
        this.d = r(new File(r, k));
        this.e = r(new File(r, l));
        this.f = r(new File(r, m));
    }

    public static synchronized File r(File file) {
        synchronized (FileStore.class) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        return file;
                    }
                    Logger f = Logger.f();
                    f.b("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                    file.delete();
                }
                if (!file.mkdirs()) {
                    Logger f2 = Logger.f();
                    f2.d("Could not create Crashlytics-specific directory: " + file);
                }
                return file;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static File s(File file) {
        file.mkdirs();
        return file;
    }

    public static boolean t(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                t(file2);
            }
        }
        return file.delete();
    }

    public static <T> List<T> u(@InterfaceC11300zs1 T[] tArr) {
        if (tArr == null) {
            return Collections.EMPTY_LIST;
        }
        return Arrays.asList(tArr);
    }

    @InterfaceC5056aJ2
    public static String v(String str) {
        return str.replaceAll("[^a-zA-Z0-9.]", CrashlyticsReportPersistence.m);
    }

    @SuppressLint({"AnnotateVersionCheck"})
    public static boolean w() {
        if (Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        return false;
    }

    public final void a(File file) {
        if (file.exists() && t(file)) {
            Logger f = Logger.f();
            f.b("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    public void b() {
        a(new File(this.a, ".com.google.firebase.crashlytics"));
        a(new File(this.a, ".com.google.firebase.crashlytics-ndk"));
        if (w()) {
            a(new File(this.a, g));
        }
    }

    @InterfaceC5056aJ2
    public void c() {
        t(this.b);
    }

    public boolean d(String str) {
        return t(new File(this.c, str));
    }

    public List<String> e() {
        return u(this.c.list());
    }

    public File f(String str) {
        return new File(this.b, str);
    }

    public List<File> g(FilenameFilter filenameFilter) {
        return u(this.b.listFiles(filenameFilter));
    }

    public File h(String str) {
        return new File(this.f, str);
    }

    public List<File> i() {
        return u(this.f.listFiles());
    }

    public File j(String str) {
        return s(new File(o(str), "native"));
    }

    public File k(String str) {
        return new File(this.e, str);
    }

    public List<File> l() {
        return u(this.e.listFiles());
    }

    public File m(String str) {
        return new File(this.d, str);
    }

    public List<File> n() {
        return u(this.d.listFiles());
    }

    public final File o(String str) {
        return s(new File(this.c, str));
    }

    public File p(String str, String str2) {
        return new File(o(str), str2);
    }

    public List<File> q(String str, FilenameFilter filenameFilter) {
        return u(o(str).listFiles(filenameFilter));
    }
}
