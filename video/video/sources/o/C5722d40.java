package o;

import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: o.d40  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5722d40 implements Closeable {
    public static final String j1 = "journal";
    public static final String k1 = "journal.tmp";
    public static final String l1 = "journal.bkp";
    public static final String m1 = "libcore.io.DiskLruCache";
    public static final String n1 = "1";
    public static final long o1 = -1;
    public static final String p1 = "CLEAN";
    public static final String q1 = "DIRTY";
    public static final String r1 = "REMOVE";
    public static final String s1 = "READ";
    public final File X;
    public final File Y;
    public final File Y0;
    public final File Z;
    public final int Z0;
    public long a1;
    public final int b1;
    public Writer d1;
    public int f1;
    public long c1 = 0;
    public final LinkedHashMap<String, d> e1 = new LinkedHashMap<>(0, 0.75f, true);
    public long g1 = 0;
    public final ThreadPoolExecutor h1 = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(null));
    public final Callable<Void> i1 = new a();

    /* renamed from: o.d40$a */
    /* loaded from: classes.dex */
    public class a implements Callable<Void> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            synchronized (C5722d40.this) {
                try {
                    if (C5722d40.this.d1 != null) {
                        C5722d40.this.P();
                        if (C5722d40.this.C()) {
                            C5722d40.this.I();
                            C5722d40.this.f1 = 0;
                        }
                        return null;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: o.d40$b */
    /* loaded from: classes.dex */
    public static final class b implements ThreadFactory {
        public b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    /* renamed from: o.d40$c */
    /* loaded from: classes.dex */
    public final class c {
        public final d a;
        public final boolean[] b;
        public boolean c;

        public /* synthetic */ c(C5722d40 c5722d40, d dVar, a aVar) {
            this(dVar);
        }

        public void a() throws IOException {
            C5722d40.this.q(this, false);
        }

        public void b() {
            if (!this.c) {
                try {
                    a();
                } catch (IOException unused) {
                }
            }
        }

        public void e() throws IOException {
            C5722d40.this.q(this, true);
            this.c = true;
        }

        public File f(int i) throws IOException {
            File k;
            synchronized (C5722d40.this) {
                try {
                    if (this.a.f == this) {
                        if (!this.a.e) {
                            this.b[i] = true;
                        }
                        k = this.a.k(i);
                        C5722d40.this.X.mkdirs();
                    } else {
                        throw new IllegalStateException();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return k;
        }

        public String g(int i) throws IOException {
            InputStream h = h(i);
            if (h != null) {
                return C5722d40.A(h);
            }
            return null;
        }

        public final InputStream h(int i) throws IOException {
            synchronized (C5722d40.this) {
                if (this.a.f == this) {
                    if (!this.a.e) {
                        return null;
                    }
                    try {
                        return new FileInputStream(this.a.j(i));
                    } catch (FileNotFoundException unused) {
                        return null;
                    }
                }
                throw new IllegalStateException();
            }
        }

        public void i(int i, String str) throws IOException {
            OutputStreamWriter outputStreamWriter;
            OutputStreamWriter outputStreamWriter2 = null;
            try {
                outputStreamWriter = new OutputStreamWriter(new FileOutputStream(f(i)), UD2.b);
            } catch (Throwable th) {
                th = th;
            }
            try {
                outputStreamWriter.write(str);
                UD2.a(outputStreamWriter);
            } catch (Throwable th2) {
                th = th2;
                outputStreamWriter2 = outputStreamWriter;
                UD2.a(outputStreamWriter2);
                throw th;
            }
        }

        public c(d dVar) {
            this.a = dVar;
            this.b = dVar.e ? null : new boolean[C5722d40.this.b1];
        }
    }

    /* renamed from: o.d40$d */
    /* loaded from: classes.dex */
    public final class d {
        public final String a;
        public final long[] b;
        public File[] c;
        public File[] d;
        public boolean e;
        public c f;
        public long g;

        public /* synthetic */ d(C5722d40 c5722d40, String str, a aVar) {
            this(str);
        }

        public File j(int i) {
            return this.c[i];
        }

        public File k(int i) {
            return this.d[i];
        }

        public String l() throws IOException {
            long[] jArr;
            StringBuilder sb = new StringBuilder();
            for (long j : this.b) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        public final IOException m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public final void n(String[] strArr) throws IOException {
            if (strArr.length == C5722d40.this.b1) {
                for (int i = 0; i < strArr.length; i++) {
                    try {
                        this.b[i] = Long.parseLong(strArr[i]);
                    } catch (NumberFormatException unused) {
                        throw m(strArr);
                    }
                }
                return;
            }
            throw m(strArr);
        }

        public d(String str) {
            this.a = str;
            this.b = new long[C5722d40.this.b1];
            this.c = new File[C5722d40.this.b1];
            this.d = new File[C5722d40.this.b1];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < C5722d40.this.b1; i++) {
                sb.append(i);
                this.c[i] = new File(C5722d40.this.X, sb.toString());
                sb.append(".tmp");
                this.d[i] = new File(C5722d40.this.X, sb.toString());
                sb.setLength(length);
            }
        }
    }

    /* renamed from: o.d40$e */
    /* loaded from: classes.dex */
    public final class e {
        public final String a;
        public final long b;
        public final long[] c;
        public final File[] d;

        public /* synthetic */ e(C5722d40 c5722d40, String str, long j, File[] fileArr, long[] jArr, a aVar) {
            this(str, j, fileArr, jArr);
        }

        public c a() throws IOException {
            return C5722d40.this.u(this.a, this.b);
        }

        public File b(int i) {
            return this.d[i];
        }

        public long c(int i) {
            return this.c[i];
        }

        public String d(int i) throws IOException {
            return C5722d40.A(new FileInputStream(this.d[i]));
        }

        public e(String str, long j, File[] fileArr, long[] jArr) {
            this.a = str;
            this.b = j;
            this.d = fileArr;
            this.c = jArr;
        }
    }

    public C5722d40(File file, int i, int i2, long j) {
        this.X = file;
        this.Z0 = i;
        this.Y = new File(file, j1);
        this.Z = new File(file, k1);
        this.Y0 = new File(file, l1);
        this.b1 = i2;
        this.a1 = j;
    }

    public static String A(InputStream inputStream) throws IOException {
        return UD2.c(new InputStreamReader(inputStream, UD2.b));
    }

    public static C5722d40 E(File file, int i, int i2, long j) throws IOException {
        if (j > 0) {
            if (i2 > 0) {
                File file2 = new File(file, l1);
                if (file2.exists()) {
                    File file3 = new File(file, j1);
                    if (file3.exists()) {
                        file2.delete();
                    } else {
                        N(file2, file3, false);
                    }
                }
                C5722d40 c5722d40 = new C5722d40(file, i, i2, j);
                if (c5722d40.Y.exists()) {
                    try {
                        c5722d40.G();
                        c5722d40.F();
                        return c5722d40;
                    } catch (IOException e2) {
                        PrintStream printStream = System.out;
                        printStream.println("DiskLruCache " + file + " is corrupt: " + e2.getMessage() + ", removing");
                        c5722d40.r();
                    }
                }
                file.mkdirs();
                C5722d40 c5722d402 = new C5722d40(file, i, i2, j);
                c5722d402.I();
                return c5722d402;
            }
            throw new IllegalArgumentException("valueCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public static void N(File file, File file2, boolean z) throws IOException {
        if (z) {
            s(file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        throw new IOException();
    }

    public static void p(Writer writer) throws IOException {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void s(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void v(Writer writer) throws IOException {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final boolean C() {
        int i = this.f1;
        if (i >= 2000 && i >= this.e1.size()) {
            return true;
        }
        return false;
    }

    public final void F() throws IOException {
        s(this.Z);
        Iterator<d> it = this.e1.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i = 0;
            if (next.f != null) {
                next.f = null;
                while (i < this.b1) {
                    s(next.j(i));
                    s(next.k(i));
                    i++;
                }
                it.remove();
            } else {
                while (i < this.b1) {
                    this.c1 += next.b[i];
                    i++;
                }
            }
        }
    }

    public final void G() throws IOException {
        C7088ie2 c7088ie2 = new C7088ie2(new FileInputStream(this.Y), UD2.a);
        try {
            String h = c7088ie2.h();
            String h2 = c7088ie2.h();
            String h3 = c7088ie2.h();
            String h4 = c7088ie2.h();
            String h5 = c7088ie2.h();
            if (m1.equals(h) && "1".equals(h2) && Integer.toString(this.Z0).equals(h3) && Integer.toString(this.b1).equals(h4) && "".equals(h5)) {
                int i = 0;
                while (true) {
                    try {
                        H(c7088ie2.h());
                        i++;
                    } catch (EOFException unused) {
                        this.f1 = i - this.e1.size();
                        if (c7088ie2.f()) {
                            I();
                        } else {
                            this.d1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.Y, true), UD2.a));
                        }
                        UD2.a(c7088ie2);
                        return;
                    }
                }
            } else {
                throw new IOException("unexpected journal header: [" + h + C6566gU0.h + h2 + C6566gU0.h + h4 + C6566gU0.h + h5 + C6566gU0.g);
            }
        } catch (Throwable th) {
            UD2.a(c7088ie2);
            throw th;
        }
    }

    public final void H(String str) throws IOException {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                substring = str.substring(i);
                if (indexOf == 6 && str.startsWith(r1)) {
                    this.e1.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i, indexOf2);
            }
            d dVar = this.e1.get(substring);
            if (dVar == null) {
                dVar = new d(this, substring, null);
                this.e1.put(substring, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith(p1)) {
                String[] split = str.substring(indexOf2 + 1).split(C4500Ve2.b);
                dVar.e = true;
                dVar.f = null;
                dVar.n(split);
                return;
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith(q1)) {
                dVar.f = new c(this, dVar, null);
                return;
            } else if (indexOf2 == -1 && indexOf == 4 && str.startsWith(s1)) {
                return;
            } else {
                throw new IOException("unexpected journal line: " + str);
            }
        }
        throw new IOException("unexpected journal line: " + str);
    }

    public final synchronized void I() throws IOException {
        try {
            Writer writer = this.d1;
            if (writer != null) {
                p(writer);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.Z), UD2.a));
            bufferedWriter.write(m1);
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.Z0));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.b1));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (d dVar : this.e1.values()) {
                if (dVar.f != null) {
                    bufferedWriter.write("DIRTY " + dVar.a + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + dVar.a + dVar.l() + '\n');
                }
            }
            p(bufferedWriter);
            if (this.Y.exists()) {
                N(this.Y, this.Y0, true);
            }
            N(this.Z, this.Y, false);
            this.Y0.delete();
            this.d1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.Y, true), UD2.a));
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean M(String str) throws IOException {
        try {
            o();
            d dVar = this.e1.get(str);
            if (dVar != null && dVar.f == null) {
                for (int i = 0; i < this.b1; i++) {
                    File j = dVar.j(i);
                    if (j.exists() && !j.delete()) {
                        throw new IOException("failed to delete " + j);
                    }
                    this.c1 -= dVar.b[i];
                    dVar.b[i] = 0;
                }
                this.f1++;
                this.d1.append((CharSequence) r1);
                this.d1.append(' ');
                this.d1.append((CharSequence) str);
                this.d1.append('\n');
                this.e1.remove(str);
                if (C()) {
                    this.h1.submit(this.i1);
                }
                return true;
            }
            return false;
        } finally {
        }
    }

    public synchronized void O(long j) {
        this.a1 = j;
        this.h1.submit(this.i1);
    }

    public final void P() throws IOException {
        while (this.c1 > this.a1) {
            M(this.e1.entrySet().iterator().next().getKey());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            if (this.d1 == null) {
                return;
            }
            Iterator it = new ArrayList(this.e1.values()).iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (dVar.f != null) {
                    dVar.f.a();
                }
            }
            P();
            p(this.d1);
            this.d1 = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void flush() throws IOException {
        o();
        P();
        v(this.d1);
    }

    public synchronized boolean isClosed() {
        boolean z;
        if (this.d1 == null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final void o() {
        if (this.d1 != null) {
            return;
        }
        throw new IllegalStateException("cache is closed");
    }

    public final synchronized void q(c cVar, boolean z) throws IOException {
        d dVar = cVar.a;
        if (dVar.f == cVar) {
            if (z && !dVar.e) {
                for (int i = 0; i < this.b1; i++) {
                    if (cVar.b[i]) {
                        if (!dVar.k(i).exists()) {
                            cVar.a();
                            return;
                        }
                    } else {
                        cVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                }
            }
            for (int i2 = 0; i2 < this.b1; i2++) {
                File k = dVar.k(i2);
                if (z) {
                    if (k.exists()) {
                        File j = dVar.j(i2);
                        k.renameTo(j);
                        long j2 = dVar.b[i2];
                        long length = j.length();
                        dVar.b[i2] = length;
                        this.c1 = (this.c1 - j2) + length;
                    }
                } else {
                    s(k);
                }
            }
            this.f1++;
            dVar.f = null;
            if (dVar.e | z) {
                dVar.e = true;
                this.d1.append((CharSequence) p1);
                this.d1.append(' ');
                this.d1.append((CharSequence) dVar.a);
                this.d1.append((CharSequence) dVar.l());
                this.d1.append('\n');
                if (z) {
                    long j3 = this.g1;
                    this.g1 = 1 + j3;
                    dVar.g = j3;
                }
            } else {
                this.e1.remove(dVar.a);
                this.d1.append((CharSequence) r1);
                this.d1.append(' ');
                this.d1.append((CharSequence) dVar.a);
                this.d1.append('\n');
            }
            v(this.d1);
            if (this.c1 > this.a1 || C()) {
                this.h1.submit(this.i1);
            }
            return;
        }
        throw new IllegalStateException();
    }

    public void r() throws IOException {
        close();
        UD2.b(this.X);
    }

    public synchronized long size() {
        return this.c1;
    }

    public c t(String str) throws IOException {
        return u(str, -1L);
    }

    public final synchronized c u(String str, long j) throws IOException {
        o();
        d dVar = this.e1.get(str);
        if (j != -1 && (dVar == null || dVar.g != j)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, null);
            this.e1.put(str, dVar);
        } else if (dVar.f != null) {
            return null;
        }
        c cVar = new c(this, dVar, null);
        dVar.f = cVar;
        this.d1.append((CharSequence) q1);
        this.d1.append(' ');
        this.d1.append((CharSequence) str);
        this.d1.append('\n');
        v(this.d1);
        return cVar;
    }

    public synchronized e x(String str) throws IOException {
        Throwable th;
        try {
            try {
                o();
                d dVar = this.e1.get(str);
                if (dVar == null) {
                    return null;
                }
                if (!dVar.e) {
                    return null;
                }
                for (File file : dVar.c) {
                    try {
                        if (!file.exists()) {
                            return null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                this.f1++;
                this.d1.append((CharSequence) s1);
                this.d1.append(' ');
                this.d1.append((CharSequence) str);
                this.d1.append('\n');
                if (C()) {
                    this.h1.submit(this.i1);
                }
                return new e(this, str, dVar.g, dVar.c, dVar.b, null);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public File y() {
        return this.X;
    }

    public synchronized long z() {
        return this.a1;
    }
}
