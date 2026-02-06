package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
class CrashlyticsAppQualitySessionsStore {
    public static final String d = "aqs.";
    public static final FilenameFilter e = new FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.common.a
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return CrashlyticsAppQualitySessionsStore.a(file, str);
        }
    };
    public static final Comparator<File> f = new Comparator() { // from class: com.google.firebase.crashlytics.internal.common.b
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return CrashlyticsAppQualitySessionsStore.b((File) obj, (File) obj2);
        }
    };
    public final FileStore a;
    @InterfaceC11300zs1
    public String b = null;
    @InterfaceC11300zs1
    public String c = null;

    public CrashlyticsAppQualitySessionsStore(FileStore fileStore) {
        this.a = fileStore;
    }

    public static /* synthetic */ boolean a(File file, String str) {
        return str.startsWith(d);
    }

    public static /* synthetic */ int b(File file, File file2) {
        return Long.compare(file2.lastModified(), file.lastModified());
    }

    public static void d(FileStore fileStore, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 String str2) {
        if (str != null && str2 != null) {
            try {
                fileStore.p(str, d + str2).createNewFile();
            } catch (IOException e2) {
                Logger.f().n("Failed to persist App Quality Sessions session id.", e2);
            }
        }
    }

    @InterfaceC11300zs1
    @InterfaceC5056aJ2
    public static String e(FileStore fileStore, @InterfaceC5670cr1 String str) {
        List<File> q = fileStore.q(str, e);
        if (q.isEmpty()) {
            Logger.f().m("Unable to read App Quality Sessions session id.");
            return null;
        }
        return ((File) Collections.min(q, f)).getName().substring(4);
    }

    @InterfaceC11300zs1
    public synchronized String c(@InterfaceC5670cr1 String str) {
        if (Objects.equals(this.b, str)) {
            return this.c;
        }
        return e(this.a, str);
    }

    public synchronized void f(@InterfaceC5670cr1 String str) {
        if (!Objects.equals(this.c, str)) {
            d(this.a, this.b, str);
            this.c = str;
        }
    }

    public synchronized void g(@InterfaceC11300zs1 String str) {
        if (!Objects.equals(this.b, str)) {
            d(this.a, str, this.c);
            this.b = str;
        }
    }
}
