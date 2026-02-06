package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.QueueFile;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import o.C4500Ve2;

/* loaded from: classes3.dex */
class QueueFileLogStore implements FileLogStore {
    public static final Charset d = Charset.forName("UTF-8");
    public final File a;
    public final int b;
    public QueueFile c;

    /* loaded from: classes3.dex */
    public static class LogBytes {
        public final byte[] a;
        public final int b;

        public LogBytes(byte[] bArr, int i) {
            this.a = bArr;
            this.b = i;
        }
    }

    public QueueFileLogStore(File file, int i) {
        this.a = file;
        this.b = i;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public void a() {
        CommonUtils.f(this.c, "There was a problem closing the Crashlytics log file.");
        this.c = null;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public String b() {
        byte[] c = c();
        if (c != null) {
            return new String(c, d);
        }
        return null;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public byte[] c() {
        LogBytes g = g();
        if (g == null) {
            return null;
        }
        int i = g.b;
        byte[] bArr = new byte[i];
        System.arraycopy(g.a, 0, bArr, 0, i);
        return bArr;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public void d() {
        a();
        this.a.delete();
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public void e(long j, String str) {
        h();
        f(j, str);
    }

    public final void f(long j, String str) {
        int i;
        if (this.c != null) {
            if (str == null) {
                str = "null";
            }
            try {
                if (str.length() > this.b / 4) {
                    str = "..." + str.substring(str.length() - i);
                }
                this.c.i(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", C4500Ve2.b).replaceAll("\n", C4500Ve2.b)).getBytes(d));
                while (!this.c.p() && this.c.G() > this.b) {
                    this.c.z();
                }
            } catch (IOException e) {
                Logger.f().e("There was a problem writing to the Crashlytics log.", e);
            }
        }
    }

    public final LogBytes g() {
        if (!this.a.exists()) {
            return null;
        }
        h();
        QueueFile queueFile = this.c;
        if (queueFile == null) {
            return null;
        }
        final int[] iArr = {0};
        final byte[] bArr = new byte[queueFile.G()];
        try {
            this.c.m(new QueueFile.ElementReader() { // from class: com.google.firebase.crashlytics.internal.metadata.QueueFileLogStore.1
                @Override // com.google.firebase.crashlytics.internal.metadata.QueueFile.ElementReader
                public void a(InputStream inputStream, int i) throws IOException {
                    try {
                        inputStream.read(bArr, iArr[0], i);
                        int[] iArr2 = iArr;
                        iArr2[0] = iArr2[0] + i;
                    } finally {
                        inputStream.close();
                    }
                }
            });
        } catch (IOException e) {
            Logger.f().e("A problem occurred while reading the Crashlytics log file.", e);
        }
        return new LogBytes(bArr, iArr[0]);
    }

    public final void h() {
        if (this.c == null) {
            try {
                this.c = new QueueFile(this.a);
            } catch (IOException e) {
                Logger f = Logger.f();
                f.e("Could not open log file: " + this.a, e);
            }
        }
    }
}
