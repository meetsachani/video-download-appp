package com.google.firebase.crashlytics.internal.persistence;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public class CrashlyticsReportPersistence {
    public static final int f = 8;
    public static final String g = "report";
    public static final String h = "start-time";
    public static final String i = "event";
    public static final int j = 10;
    public static final String k = "%010d";
    public static final String m = "_";
    public static final String n = "";
    public final AtomicInteger a = new AtomicInteger(0);
    public final FileStore b;
    public final SettingsProvider c;
    public final CrashlyticsAppQualitySessionsSubscriber d;
    public static final Charset e = Charset.forName("UTF-8");
    public static final int l = 15;

    /* renamed from: o  reason: collision with root package name */
    public static final CrashlyticsReportJsonTransform f345o = new CrashlyticsReportJsonTransform();
    public static final Comparator<? super File> p = new Comparator() { // from class: o.YQ
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int compareTo;
            compareTo = ((File) obj2).getName().compareTo(((File) obj).getName());
            return compareTo;
        }
    };
    public static final FilenameFilter q = new FilenameFilter() { // from class: o.ZQ
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            boolean startsWith;
            startsWith = str.startsWith("event");
            return startsWith;
        }
    };

    public CrashlyticsReportPersistence(FileStore fileStore, SettingsProvider settingsProvider, CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber) {
        this.b = fileStore;
        this.c = settingsProvider;
        this.d = crashlyticsAppQualitySessionsSubscriber;
    }

    public static void E(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void F(File file, String str, long j2) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), e);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(h(j2));
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static int f(List<File> list, int i2) {
        int size = list.size();
        for (File file : list) {
            if (size <= i2) {
                break;
            }
            FileStore.t(file);
            size--;
        }
        return size;
    }

    public static long h(long j2) {
        return j2 * 1000;
    }

    @InterfaceC5670cr1
    public static String m(int i2, boolean z) {
        String str;
        String format = String.format(Locale.US, k, Integer.valueOf(i2));
        if (z) {
            str = m;
        } else {
            str = "";
        }
        return "event" + format + str;
    }

    @InterfaceC5670cr1
    public static String o(@InterfaceC5670cr1 String str) {
        return str.substring(0, l);
    }

    public static boolean s(@InterfaceC5670cr1 String str) {
        if (str.startsWith("event") && str.endsWith(m)) {
            return true;
        }
        return false;
    }

    public static boolean t(@InterfaceC5670cr1 File file, @InterfaceC5670cr1 String str) {
        if (str.startsWith("event") && !str.endsWith(m)) {
            return true;
        }
        return false;
    }

    public static int v(@InterfaceC5670cr1 File file, @InterfaceC5670cr1 File file2) {
        return o(file.getName()).compareTo(o(file2.getName()));
    }

    @InterfaceC5670cr1
    public static String z(@InterfaceC5670cr1 File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), e);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public final void A(@InterfaceC5670cr1 File file, @InterfaceC5670cr1 CrashlyticsReport.FilesPayload filesPayload, @InterfaceC5670cr1 String str, CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        String d = this.d.d(str);
        try {
            CrashlyticsReportJsonTransform crashlyticsReportJsonTransform = f345o;
            E(this.b.h(str), crashlyticsReportJsonTransform.O(crashlyticsReportJsonTransform.N(z(file)).t(filesPayload).q(applicationExitInfo).p(d)));
        } catch (IOException e2) {
            Logger f2 = Logger.f();
            f2.n("Could not synthesize final native report file for " + file, e2);
        }
    }

    public final void B(String str, long j2) {
        boolean z;
        List<File> q2 = this.b.q(str, q);
        if (q2.isEmpty()) {
            Logger.f().k("Session " + str + " has no events.");
            return;
        }
        Collections.sort(q2);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            z = false;
            for (File file : q2) {
                try {
                    arrayList.add(f345o.l(z(file)));
                } catch (IOException e2) {
                    Logger.f().n("Could not add event to report for " + file, e2);
                }
                if (z || s(file.getName())) {
                    z = true;
                }
            }
        }
        if (arrayList.isEmpty()) {
            Logger.f().m("Could not parse event files for session " + str);
            return;
        }
        C(this.b.p(str, g), arrayList, j2, z, UserMetadata.k(str, this.b), this.d.d(str));
    }

    public final void C(@InterfaceC5670cr1 File file, @InterfaceC5670cr1 List<CrashlyticsReport.Session.Event> list, long j2, boolean z, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 String str2) {
        File m2;
        try {
            CrashlyticsReportJsonTransform crashlyticsReportJsonTransform = f345o;
            CrashlyticsReport r = crashlyticsReportJsonTransform.N(z(file)).v(j2, z, str).p(str2).r(list);
            CrashlyticsReport.Session m3 = r.m();
            if (m3 == null) {
                return;
            }
            Logger f2 = Logger.f();
            f2.b("appQualitySessionId: " + str2);
            if (z) {
                m2 = this.b.k(m3.i());
            } else {
                m2 = this.b.m(m3.i());
            }
            E(m2, crashlyticsReportJsonTransform.O(r));
        } catch (IOException e2) {
            Logger f3 = Logger.f();
            f3.n("Could not synthesize final report file for " + file, e2);
        }
    }

    public final int D(String str, int i2) {
        List<File> q2 = this.b.q(str, new FilenameFilter() { // from class: o.aR
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                boolean t;
                t = CrashlyticsReportPersistence.t(file, str2);
                return t;
            }
        });
        Collections.sort(q2, new Comparator() { // from class: o.bR
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int v;
                v = CrashlyticsReportPersistence.v((File) obj, (File) obj2);
                return v;
            }
        });
        return f(q2, i2);
    }

    public final SortedSet<String> e(@InterfaceC11300zs1 String str) {
        this.b.b();
        SortedSet<String> p2 = p();
        if (str != null) {
            p2.remove(str);
        }
        if (p2.size() > 8) {
            while (p2.size() > 8) {
                String last = p2.last();
                Logger f2 = Logger.f();
                f2.b("Removing session over cap: " + last);
                this.b.d(last);
                p2.remove(last);
            }
        }
        return p2;
    }

    public final void g() {
        int i2 = this.c.b().a.b;
        List<File> n2 = n();
        int size = n2.size();
        if (size > i2) {
            for (File file : n2.subList(i2, size)) {
                file.delete();
            }
        }
    }

    public void i() {
        j(this.b.n());
        j(this.b.l());
        j(this.b.i());
    }

    public final void j(List<File> list) {
        for (File file : list) {
            file.delete();
        }
    }

    public void k(@InterfaceC11300zs1 String str, long j2) {
        for (String str2 : e(str)) {
            Logger f2 = Logger.f();
            f2.k("Finalizing report for session " + str2);
            B(str2, j2);
            this.b.d(str2);
        }
        g();
    }

    public void l(String str, CrashlyticsReport.FilesPayload filesPayload, CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        File p2 = this.b.p(str, g);
        Logger f2 = Logger.f();
        f2.b("Writing native session report for " + str + " to file: " + p2);
        A(p2, filesPayload, str, applicationExitInfo);
    }

    public final List<File> n() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.b.l());
        arrayList.addAll(this.b.i());
        Comparator<? super File> comparator = p;
        Collections.sort(arrayList, comparator);
        List<File> n2 = this.b.n();
        Collections.sort(n2, comparator);
        arrayList.addAll(n2);
        return arrayList;
    }

    public SortedSet<String> p() {
        return new TreeSet(this.b.e()).descendingSet();
    }

    public long q(String str) {
        return this.b.p(str, h).lastModified();
    }

    public boolean r() {
        if (this.b.n().isEmpty() && this.b.l().isEmpty() && this.b.i().isEmpty()) {
            return false;
        }
        return true;
    }

    @InterfaceC5670cr1
    public List<CrashlyticsReportWithSessionId> u() {
        List<File> n2 = n();
        ArrayList arrayList = new ArrayList();
        for (File file : n2) {
            try {
                arrayList.add(CrashlyticsReportWithSessionId.a(f345o.N(z(file)), file.getName(), file));
            } catch (IOException e2) {
                Logger f2 = Logger.f();
                f2.n("Could not load report file " + file + "; deleting", e2);
                file.delete();
            }
        }
        return arrayList;
    }

    public void w(@InterfaceC5670cr1 CrashlyticsReport.Session.Event event, @InterfaceC5670cr1 String str) {
        x(event, str, false);
    }

    public void x(@InterfaceC5670cr1 CrashlyticsReport.Session.Event event, @InterfaceC5670cr1 String str, boolean z) {
        int i2 = this.c.b().a.a;
        try {
            E(this.b.p(str, m(this.a.getAndIncrement(), z)), f345o.m(event));
        } catch (IOException e2) {
            Logger f2 = Logger.f();
            f2.n("Could not persist event for session " + str, e2);
        }
        D(str, i2);
    }

    public void y(@InterfaceC5670cr1 CrashlyticsReport crashlyticsReport) {
        CrashlyticsReport.Session m2 = crashlyticsReport.m();
        if (m2 == null) {
            Logger.f().b("Could not get session for report");
            return;
        }
        String i2 = m2.i();
        try {
            E(this.b.p(i2, g), f345o.O(crashlyticsReport));
            F(this.b.p(i2, h), "", m2.l());
        } catch (IOException e2) {
            Logger f2 = Logger.f();
            f2.c("Could not persist report for session " + i2, e2);
        }
    }
}
