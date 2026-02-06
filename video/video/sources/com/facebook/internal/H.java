package com.facebook.internal;

import com.facebook.C2381j;
import com.facebook.internal.H;
import com.facebook.internal.V;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.InvalidParameterException;
import java.util.Date;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import o.C6562gT0;
import o.C7458kA2;
import o.C9516sY;
import o.C9545sf2;
import o.HB;
import o.InterfaceC8289nW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes2.dex */
public final class H {
    @NotNull
    public static final String k = "key";
    @NotNull
    public static final String l = "tag";
    @NotNull
    public final String a;
    @NotNull
    public final e b;
    @NotNull
    public final File c;
    public boolean d;
    public boolean e;
    @NotNull
    public final ReentrantLock f;
    public final Condition g;
    @NotNull
    public final AtomicLong h;
    @NotNull
    public static final c i = new c(null);
    public static final String j = H.class.getSimpleName();
    @NotNull
    public static final AtomicLong m = new AtomicLong();

    /* loaded from: classes2.dex */
    public static final class a {
        @NotNull
        public static final String b = "buffer";
        @NotNull
        public static final a a = new a();
        @NotNull
        public static final FilenameFilter c = new FilenameFilter() { // from class: com.facebook.internal.F
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean f;
                f = H.a.f(file, str);
                return f;
            }
        };
        @NotNull
        public static final FilenameFilter d = new FilenameFilter() { // from class: com.facebook.internal.G
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean g;
                g = H.a.g(file, str);
                return g;
            }
        };

        public static final boolean f(File file, String str) {
            C6562gT0.o(str, "filename");
            return !C9545sf2.J2(str, b, false, 2, null);
        }

        public static final boolean g(File file, String str) {
            C6562gT0.o(str, "filename");
            return C9545sf2.J2(str, b, false, 2, null);
        }

        public final void c(@NotNull File file) {
            C6562gT0.p(file, "root");
            File[] listFiles = file.listFiles(e());
            if (listFiles != null) {
                int length = listFiles.length;
                int i = 0;
                while (i < length) {
                    File file2 = listFiles[i];
                    i++;
                    file2.delete();
                }
            }
        }

        @NotNull
        public final FilenameFilter d() {
            return c;
        }

        @NotNull
        public final FilenameFilter e() {
            return d;
        }

        @NotNull
        public final File h(@Nullable File file) {
            return new File(file, C6562gT0.C(b, Long.valueOf(H.m.incrementAndGet())));
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends OutputStream {
        @NotNull
        public final OutputStream X;
        @NotNull
        public final g Y;

        public b(@NotNull OutputStream outputStream, @NotNull g gVar) {
            C6562gT0.p(outputStream, "innerStream");
            C6562gT0.p(gVar, "callback");
            this.X = outputStream;
            this.Y = gVar;
        }

        @NotNull
        public final g a() {
            return this.Y;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            try {
                this.X.close();
            } finally {
                this.Y.a();
            }
        }

        @NotNull
        public final OutputStream d() {
            return this.X;
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.X.flush();
        }

        @Override // java.io.OutputStream
        public void write(@NotNull byte[] bArr, int i, int i2) throws IOException {
            C6562gT0.p(bArr, a.b);
            this.X.write(bArr, i, i2);
        }

        @Override // java.io.OutputStream
        public void write(@NotNull byte[] bArr) throws IOException {
            C6562gT0.p(bArr, a.b);
            this.X.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            this.X.write(i);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {
        public /* synthetic */ c(C9516sY c9516sY) {
            this();
        }

        public final String a() {
            return H.j;
        }

        public c() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class e {
        public int a = 1048576;
        public int b = 1024;

        public final int a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        public final void c(int i) {
            if (i >= 0) {
                this.a = i;
                return;
            }
            throw new InvalidParameterException("Cache byte-count limit must be >= 0");
        }

        public final void d(int i) {
            if (i >= 0) {
                this.b = i;
                return;
            }
            throw new InvalidParameterException("Cache file count limit must be >= 0");
        }
    }

    /* loaded from: classes2.dex */
    public static final class f implements Comparable<f> {
        public static final int Y0 = 29;
        @NotNull
        public static final a Z = new a(null);
        public static final int Z0 = 37;
        @NotNull
        public final File X;
        public final long Y;

        /* loaded from: classes2.dex */
        public static final class a {
            public /* synthetic */ a(C9516sY c9516sY) {
                this();
            }

            public a() {
            }
        }

        public f(@NotNull File file) {
            C6562gT0.p(file, "file");
            this.X = file;
            this.Y = file.lastModified();
        }

        @Override // java.lang.Comparable
        /* renamed from: e */
        public int compareTo(@NotNull f fVar) {
            C6562gT0.p(fVar, "another");
            long j = this.Y;
            long j2 = fVar.Y;
            if (j < j2) {
                return -1;
            }
            if (j > j2) {
                return 1;
            }
            return this.X.compareTo(fVar.X);
        }

        public boolean equals(@Nullable Object obj) {
            if ((obj instanceof f) && compareTo((f) obj) == 0) {
                return true;
            }
            return false;
        }

        @NotNull
        public final File g() {
            return this.X;
        }

        public final long h() {
            return this.Y;
        }

        public int hashCode() {
            return ((1073 + this.X.hashCode()) * 37) + ((int) (this.Y % Integer.MAX_VALUE));
        }
    }

    /* loaded from: classes2.dex */
    public interface g {
        void a();
    }

    /* loaded from: classes2.dex */
    public static final class h {
        @NotNull
        public static final h a = new h();
        public static final int b = 0;

        @Nullable
        public final JSONObject a(@NotNull InputStream inputStream) throws IOException {
            C6562gT0.p(inputStream, "stream");
            if (inputStream.read() != 0) {
                return null;
            }
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < 3; i3++) {
                int read = inputStream.read();
                if (read == -1) {
                    V.a aVar = V.e;
                    com.facebook.b0 b0Var = com.facebook.b0.CACHE;
                    String a2 = H.i.a();
                    C6562gT0.o(a2, "TAG");
                    aVar.d(b0Var, a2, "readHeader: stream.read returned -1 while reading header size");
                    return null;
                }
                i2 = (i2 << 8) + (read & 255);
            }
            byte[] bArr = new byte[i2];
            while (i < i2) {
                int read2 = inputStream.read(bArr, i, i2 - i);
                if (read2 < 1) {
                    V.a aVar2 = V.e;
                    com.facebook.b0 b0Var2 = com.facebook.b0.CACHE;
                    String a3 = H.i.a();
                    C6562gT0.o(a3, "TAG");
                    aVar2.d(b0Var2, a3, "readHeader: stream.read stopped at " + Integer.valueOf(i) + " when expected " + i2);
                    return null;
                }
                i += read2;
            }
            try {
                Object nextValue = new JSONTokener(new String(bArr, HB.b)).nextValue();
                if (!(nextValue instanceof JSONObject)) {
                    V.a aVar3 = V.e;
                    com.facebook.b0 b0Var3 = com.facebook.b0.CACHE;
                    String a4 = H.i.a();
                    C6562gT0.o(a4, "TAG");
                    aVar3.d(b0Var3, a4, C6562gT0.C("readHeader: expected JSONObject, got ", nextValue.getClass().getCanonicalName()));
                    return null;
                }
                return (JSONObject) nextValue;
            } catch (JSONException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final void b(@NotNull OutputStream outputStream, @NotNull JSONObject jSONObject) throws IOException {
            C6562gT0.p(outputStream, "stream");
            C6562gT0.p(jSONObject, C2381j.e1);
            String jSONObject2 = jSONObject.toString();
            C6562gT0.o(jSONObject2, "header.toString()");
            byte[] bytes = jSONObject2.getBytes(HB.b);
            C6562gT0.o(bytes, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(0);
            outputStream.write((bytes.length >> 16) & 255);
            outputStream.write((bytes.length >> 8) & 255);
            outputStream.write(bytes.length & 255);
            outputStream.write(bytes);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i implements g {
        public final /* synthetic */ long a;
        public final /* synthetic */ H b;
        public final /* synthetic */ File c;
        public final /* synthetic */ String d;

        public i(long j, H h, File file, String str) {
            this.a = j;
            this.b = h;
            this.c = file;
            this.d = str;
        }

        @Override // com.facebook.internal.H.g
        public void a() {
            if (this.a >= this.b.h.get()) {
                this.b.s(this.d, this.c);
            } else {
                this.c.delete();
            }
        }
    }

    public H(@NotNull String str, @NotNull e eVar) {
        C6562gT0.p(str, "tag");
        C6562gT0.p(eVar, "limits");
        this.a = str;
        this.b = eVar;
        com.facebook.M m2 = com.facebook.M.a;
        File file = new File(com.facebook.M.t(), str);
        this.c = file;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f = reentrantLock;
        this.g = reentrantLock.newCondition();
        this.h = new AtomicLong(0L);
        if (!file.mkdirs() && !file.isDirectory()) {
            return;
        }
        a.a.c(file);
    }

    public static final void h(File[] fileArr) {
        C6562gT0.o(fileArr, "filesToDelete");
        int length = fileArr.length;
        int i2 = 0;
        while (i2 < length) {
            File file = fileArr[i2];
            i2++;
            file.delete();
        }
    }

    public static /* synthetic */ InputStream k(H h2, String str, String str2, int i2, Object obj) throws IOException {
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        return h2.j(str, str2);
    }

    public static /* synthetic */ OutputStream p(H h2, String str, String str2, int i2, Object obj) throws IOException {
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        return h2.o(str, str2);
    }

    public static final void r(H h2) {
        C6562gT0.p(h2, "this$0");
        h2.u();
    }

    public final void g() {
        final File[] listFiles = this.c.listFiles(a.a.d());
        this.h.set(System.currentTimeMillis());
        if (listFiles != null) {
            com.facebook.M m2 = com.facebook.M.a;
            com.facebook.M.y().execute(new Runnable() { // from class: com.facebook.internal.D
                @Override // java.lang.Runnable
                public final void run() {
                    H.h(listFiles);
                }
            });
        }
    }

    @InterfaceC8289nW0
    @Nullable
    public final InputStream i(@NotNull String str) throws IOException {
        C6562gT0.p(str, "key");
        return k(this, str, null, 2, null);
    }

    @InterfaceC8289nW0
    @Nullable
    public final InputStream j(@NotNull String str, @Nullable String str2) throws IOException {
        C6562gT0.p(str, "key");
        File file = this.c;
        l0 l0Var = l0.a;
        File file2 = new File(file, l0.p0(str));
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file2), 8192);
            try {
                JSONObject a2 = h.a.a(bufferedInputStream);
                if (a2 == null) {
                    return null;
                }
                if (!C6562gT0.g(a2.optString("key"), str)) {
                    return null;
                }
                String optString = a2.optString("tag", null);
                if (str2 == null && !C6562gT0.g(str2, optString)) {
                    return null;
                }
                long time = new Date().getTime();
                V.a aVar = V.e;
                com.facebook.b0 b0Var = com.facebook.b0.CACHE;
                String str3 = j;
                C6562gT0.o(str3, "TAG");
                aVar.d(b0Var, str3, "Setting lastModified to " + Long.valueOf(time) + " for " + ((Object) file2.getName()));
                file2.setLastModified(time);
                return bufferedInputStream;
            } finally {
                bufferedInputStream.close();
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @NotNull
    public final String l() {
        String path = this.c.getPath();
        C6562gT0.o(path, "directory.path");
        return path;
    }

    @NotNull
    public final InputStream m(@NotNull String str, @NotNull InputStream inputStream) throws IOException {
        C6562gT0.p(str, "key");
        C6562gT0.p(inputStream, "input");
        return new d(inputStream, p(this, str, null, 2, null));
    }

    @InterfaceC8289nW0
    @NotNull
    public final OutputStream n(@NotNull String str) throws IOException {
        C6562gT0.p(str, "key");
        return p(this, str, null, 2, null);
    }

    @InterfaceC8289nW0
    @NotNull
    public final OutputStream o(@NotNull String str, @Nullable String str2) throws IOException {
        C6562gT0.p(str, "key");
        File h2 = a.a.h(this.c);
        h2.delete();
        if (h2.createNewFile()) {
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new b(new FileOutputStream(h2), new i(System.currentTimeMillis(), this, h2, str)), 8192);
                try {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("key", str);
                        l0 l0Var = l0.a;
                        if (!l0.f0(str2)) {
                            jSONObject.put("tag", str2);
                        }
                        h.a.b(bufferedOutputStream, jSONObject);
                        return bufferedOutputStream;
                    } catch (JSONException e2) {
                        V.a aVar = V.e;
                        com.facebook.b0 b0Var = com.facebook.b0.CACHE;
                        String str3 = j;
                        C6562gT0.o(str3, "TAG");
                        aVar.b(b0Var, 5, str3, C6562gT0.C("Error creating JSON header for cache file: ", e2));
                        throw new IOException(e2.getMessage());
                    }
                } catch (Throwable th) {
                    bufferedOutputStream.close();
                    throw th;
                }
            } catch (FileNotFoundException e3) {
                V.a aVar2 = V.e;
                com.facebook.b0 b0Var2 = com.facebook.b0.CACHE;
                String str4 = j;
                C6562gT0.o(str4, "TAG");
                aVar2.b(b0Var2, 5, str4, C6562gT0.C("Error creating buffer output stream: ", e3));
                throw new IOException(e3.getMessage());
            }
        }
        throw new IOException(C6562gT0.C("Could not create file at ", h2.getAbsolutePath()));
    }

    public final void q() {
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            if (!this.d) {
                this.d = true;
                com.facebook.M m2 = com.facebook.M.a;
                com.facebook.M.y().execute(new Runnable() { // from class: com.facebook.internal.E
                    @Override // java.lang.Runnable
                    public final void run() {
                        H.r(H.this);
                    }
                });
            }
            C7458kA2 c7458kA2 = C7458kA2.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void s(String str, File file) {
        File file2 = this.c;
        l0 l0Var = l0.a;
        if (!file.renameTo(new File(file2, l0.p0(str)))) {
            file.delete();
        }
        q();
    }

    public final long t() {
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        while (true) {
            try {
                if (!this.d && !this.e) {
                    break;
                }
                try {
                    this.g.await();
                } catch (InterruptedException unused) {
                }
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        C7458kA2 c7458kA2 = C7458kA2.a;
        reentrantLock.unlock();
        File[] listFiles = this.c.listFiles();
        long j2 = 0;
        if (listFiles != null) {
            int length = listFiles.length;
            int i2 = 0;
            while (i2 < length) {
                File file = listFiles[i2];
                i2++;
                j2 += file.length();
            }
        }
        return j2;
    }

    @NotNull
    public String toString() {
        return "{FileLruCache: tag:" + this.a + " file:" + ((Object) this.c.getName()) + '}';
    }

    public final void u() {
        PriorityQueue priorityQueue;
        long j2;
        f fVar;
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            this.d = false;
            this.e = true;
            C7458kA2 c7458kA2 = C7458kA2.a;
            reentrantLock.unlock();
            try {
                V.a aVar = V.e;
                com.facebook.b0 b0Var = com.facebook.b0.CACHE;
                String str = j;
                C6562gT0.o(str, "TAG");
                aVar.d(b0Var, str, "trim started");
                PriorityQueue priorityQueue2 = new PriorityQueue();
                File[] listFiles = this.c.listFiles(a.a.d());
                long j3 = 0;
                if (listFiles != null) {
                    int length = listFiles.length;
                    int i2 = 0;
                    j2 = 0;
                    while (i2 < length) {
                        File file = listFiles[i2];
                        i2++;
                        C6562gT0.o(file, "file");
                        priorityQueue2.add(new f(file));
                        V.a aVar2 = V.e;
                        com.facebook.b0 b0Var2 = com.facebook.b0.CACHE;
                        String str2 = j;
                        C6562gT0.o(str2, "TAG");
                        aVar2.d(b0Var2, str2, "  trim considering time=" + Long.valueOf(fVar.h()) + " name=" + ((Object) fVar.g().getName()));
                        j3 += file.length();
                        j2++;
                        priorityQueue2 = priorityQueue2;
                    }
                    priorityQueue = priorityQueue2;
                } else {
                    priorityQueue = priorityQueue2;
                    j2 = 0;
                }
                while (true) {
                    if (j3 <= this.b.a() && j2 <= this.b.b()) {
                        this.f.lock();
                        try {
                            this.e = false;
                            this.g.signalAll();
                            C7458kA2 c7458kA22 = C7458kA2.a;
                            return;
                        } finally {
                        }
                    }
                    File g2 = ((f) priorityQueue.remove()).g();
                    V.a aVar3 = V.e;
                    com.facebook.b0 b0Var3 = com.facebook.b0.CACHE;
                    String str3 = j;
                    C6562gT0.o(str3, "TAG");
                    aVar3.d(b0Var3, str3, C6562gT0.C("  trim removing ", g2.getName()));
                    j3 -= g2.length();
                    j2--;
                    g2.delete();
                }
            } catch (Throwable th) {
                this.f.lock();
                try {
                    this.e = false;
                    this.g.signalAll();
                    C7458kA2 c7458kA23 = C7458kA2.a;
                    throw th;
                } finally {
                }
            }
        } finally {
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends InputStream {
        @NotNull
        public final InputStream X;
        @NotNull
        public final OutputStream Y;

        public d(@NotNull InputStream inputStream, @NotNull OutputStream outputStream) {
            C6562gT0.p(inputStream, "input");
            C6562gT0.p(outputStream, "output");
            this.X = inputStream;
            this.Y = outputStream;
        }

        @NotNull
        public final InputStream a() {
            return this.X;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.X.available();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            try {
                this.X.close();
            } finally {
                this.Y.close();
            }
        }

        @NotNull
        public final OutputStream d() {
            return this.Y;
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            throw new UnsupportedOperationException();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return false;
        }

        @Override // java.io.InputStream
        public int read(@NotNull byte[] bArr) throws IOException {
            C6562gT0.p(bArr, a.b);
            int read = this.X.read(bArr);
            if (read > 0) {
                this.Y.write(bArr, 0, read);
            }
            return read;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            throw new UnsupportedOperationException();
        }

        @Override // java.io.InputStream
        public long skip(long j) throws IOException {
            int read;
            byte[] bArr = new byte[1024];
            long j2 = 0;
            while (j2 < j && (read = read(bArr, 0, (int) Math.min(j - j2, 1024))) >= 0) {
                j2 += read;
            }
            return j2;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            int read = this.X.read();
            if (read >= 0) {
                this.Y.write(read);
            }
            return read;
        }

        @Override // java.io.InputStream
        public int read(@NotNull byte[] bArr, int i, int i2) throws IOException {
            C6562gT0.p(bArr, a.b);
            int read = this.X.read(bArr, i, i2);
            if (read > 0) {
                this.Y.write(bArr, i, read);
            }
            return read;
        }
    }
}
