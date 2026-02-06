package o;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.InterfaceC4747Xs;

/* loaded from: classes.dex */
public class X30 implements InterfaceC4747Xs {
    public static final int e = 5242880;
    public static final float f = 0.9f;
    public static final int g = 538247942;
    public final Map<String, b> a;
    public long b;
    public final d c;
    public final int d;

    /* loaded from: classes.dex */
    public class a implements d {
        public final /* synthetic */ File a;

        public a(File file) {
            this.a = file;
        }

        @Override // o.X30.d
        public File get() {
            return this.a;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        File get();
    }

    public X30(File file, int i) {
        this.a = new LinkedHashMap(16, 0.75f, true);
        this.b = 0L;
        this.c = new a(file);
        this.d = i;
    }

    public static int j(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    public static List<MG0> k(c cVar) throws IOException {
        List<MG0> arrayList;
        int l = l(cVar);
        if (l >= 0) {
            if (l == 0) {
                arrayList = Collections.EMPTY_LIST;
            } else {
                arrayList = new ArrayList<>();
            }
            for (int i = 0; i < l; i++) {
                arrayList.add(new MG0(o(cVar).intern(), o(cVar).intern()));
            }
            return arrayList;
        }
        throw new IOException("readHeaderList size=" + l);
    }

    public static int l(InputStream inputStream) throws IOException {
        return (j(inputStream) << 24) | j(inputStream) | (j(inputStream) << 8) | (j(inputStream) << 16);
    }

    public static long n(InputStream inputStream) throws IOException {
        return (j(inputStream) & 255) | ((j(inputStream) & 255) << 8) | ((j(inputStream) & 255) << 16) | ((j(inputStream) & 255) << 24) | ((j(inputStream) & 255) << 32) | ((j(inputStream) & 255) << 40) | ((j(inputStream) & 255) << 48) | ((255 & j(inputStream)) << 56);
    }

    public static String o(c cVar) throws IOException {
        return new String(q(cVar, n(cVar)), "UTF-8");
    }

    public static byte[] q(c cVar, long j) throws IOException {
        long d2 = cVar.d();
        if (j >= 0 && j <= d2) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(cVar).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j + ", maxLength=" + d2);
    }

    public static void r(List<MG0> list, OutputStream outputStream) throws IOException {
        if (list != null) {
            s(outputStream, list.size());
            for (MG0 mg0 : list) {
                u(outputStream, mg0.a());
                u(outputStream, mg0.b());
            }
            return;
        }
        s(outputStream, 0);
    }

    public static void s(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    public static void t(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) j);
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    public static void u(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        t(outputStream, bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    @Override // o.InterfaceC4747Xs
    public synchronized void a(String str, boolean z) {
        try {
            InterfaceC4747Xs.a m = m(str);
            if (m != null) {
                m.f = 0L;
                if (z) {
                    m.e = 0L;
                }
                b(str, m);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // o.InterfaceC4747Xs
    public synchronized void b(String str, InterfaceC4747Xs.a aVar) {
        BufferedOutputStream bufferedOutputStream;
        b bVar;
        long j = this.b;
        byte[] bArr = aVar.a;
        long length = j + bArr.length;
        int i = this.d;
        if (length > i && bArr.length > i * 0.9f) {
            return;
        }
        File e2 = e(str);
        try {
            bufferedOutputStream = new BufferedOutputStream(d(e2));
            bVar = new b(str, aVar);
        } catch (IOException unused) {
            if (!e2.delete()) {
                C6767hJ2.b("Could not clean up file %s", e2.getAbsolutePath());
            }
            g();
        }
        if (bVar.d(bufferedOutputStream)) {
            bufferedOutputStream.write(aVar.a);
            bufferedOutputStream.close();
            bVar.a = e2.length();
            i(str, bVar);
            h();
            return;
        }
        bufferedOutputStream.close();
        C6767hJ2.b("Failed to write header for %s", e2.getAbsolutePath());
        throw new IOException();
    }

    public InputStream c(File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }

    @Override // o.InterfaceC4747Xs
    public synchronized void clear() {
        try {
            File[] listFiles = this.c.get().listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    file.delete();
                }
            }
            this.a.clear();
            this.b = 0L;
            C6767hJ2.b("Cache cleared.", new Object[0]);
        } catch (Throwable th) {
            throw th;
        }
    }

    public OutputStream d(File file) throws FileNotFoundException {
        return new FileOutputStream(file);
    }

    public File e(String str) {
        return new File(this.c.get(), f(str));
    }

    public final String f(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(str.substring(0, length).hashCode());
        return valueOf + String.valueOf(str.substring(length).hashCode());
    }

    public final void g() {
        if (!this.c.get().exists()) {
            C6767hJ2.b("Re-initializing cache after external clearing.", new Object[0]);
            this.a.clear();
            this.b = 0L;
            initialize();
        }
    }

    public final void h() {
        if (this.b >= this.d) {
            int i = 0;
            if (C6767hJ2.b) {
                C6767hJ2.f("Pruning old cache entries.", new Object[0]);
            }
            long j = this.b;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Iterator<Map.Entry<String, b>> it = this.a.entrySet().iterator();
            while (it.hasNext()) {
                b value = it.next().getValue();
                if (e(value.b).delete()) {
                    this.b -= value.a;
                } else {
                    String str = value.b;
                    C6767hJ2.b("Could not delete cache entry for key=%s, filename=%s", str, f(str));
                }
                it.remove();
                i++;
                if (((float) this.b) < this.d * 0.9f) {
                    break;
                }
            }
            if (C6767hJ2.b) {
                C6767hJ2.f("pruned %d files, %d bytes, %d ms", Integer.valueOf(i), Long.valueOf(this.b - j), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
            }
        }
    }

    public final void i(String str, b bVar) {
        if (!this.a.containsKey(str)) {
            this.b += bVar.a;
        } else {
            this.b += bVar.a - this.a.get(str).a;
        }
        this.a.put(str, bVar);
    }

    @Override // o.InterfaceC4747Xs
    public synchronized void initialize() {
        File file = this.c.get();
        if (!file.exists()) {
            if (!file.mkdirs()) {
                C6767hJ2.c("Unable to create cache dir %s", file.getAbsolutePath());
            }
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file2 : listFiles) {
            try {
                long length = file2.length();
                c cVar = new c(new BufferedInputStream(c(file2)), length);
                try {
                    b b2 = b.b(cVar);
                    b2.a = length;
                    i(b2.b, b2);
                    cVar.close();
                } catch (Throwable th) {
                    cVar.close();
                    throw th;
                    break;
                }
            } catch (IOException unused) {
                file2.delete();
            }
        }
    }

    @Override // o.InterfaceC4747Xs
    public synchronized InterfaceC4747Xs.a m(String str) {
        b bVar = this.a.get(str);
        if (bVar == null) {
            return null;
        }
        File e2 = e(str);
        try {
            c cVar = new c(new BufferedInputStream(c(e2)), e2.length());
            try {
                b b2 = b.b(cVar);
                if (!TextUtils.equals(str, b2.b)) {
                    C6767hJ2.b("%s: key=%s, found=%s", e2.getAbsolutePath(), str, b2.b);
                    p(str);
                    return null;
                }
                return bVar.c(q(cVar, cVar.d()));
            } finally {
                cVar.close();
            }
        } catch (IOException e3) {
            C6767hJ2.b("%s: %s", e2.getAbsolutePath(), e3.toString());
            remove(str);
            return null;
        }
    }

    public final void p(String str) {
        b remove = this.a.remove(str);
        if (remove != null) {
            this.b -= remove.a;
        }
    }

    @Override // o.InterfaceC4747Xs
    public synchronized void remove(String str) {
        boolean delete = e(str).delete();
        p(str);
        if (!delete) {
            C6767hJ2.b("Could not delete cache entry for key=%s, filename=%s", str, f(str));
        }
    }

    /* loaded from: classes.dex */
    public static class c extends FilterInputStream {
        public final long X;
        public long Y;

        public c(InputStream inputStream, long j) {
            super(inputStream);
            this.X = j;
        }

        public long a() {
            return this.Y;
        }

        public long d() {
            return this.X - this.Y;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int read = super.read();
            if (read != -1) {
                this.Y++;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read = super.read(bArr, i, i2);
            if (read != -1) {
                this.Y += read;
            }
            return read;
        }
    }

    public X30(d dVar, int i) {
        this.a = new LinkedHashMap(16, 0.75f, true);
        this.b = 0L;
        this.c = dVar;
        this.d = i;
    }

    /* loaded from: classes.dex */
    public static class b {
        public long a;
        public final String b;
        public final String c;
        public final long d;
        public final long e;
        public final long f;
        public final long g;
        public final List<MG0> h;

        public b(String str, String str2, long j, long j2, long j3, long j4, List<MG0> list) {
            this.b = str;
            this.c = "".equals(str2) ? null : str2;
            this.d = j;
            this.e = j2;
            this.f = j3;
            this.g = j4;
            this.h = list;
        }

        public static List<MG0> a(InterfaceC4747Xs.a aVar) {
            List<MG0> list = aVar.h;
            if (list != null) {
                return list;
            }
            return C11161zI0.i(aVar.g);
        }

        public static b b(c cVar) throws IOException {
            if (X30.l(cVar) == 538247942) {
                return new b(X30.o(cVar), X30.o(cVar), X30.n(cVar), X30.n(cVar), X30.n(cVar), X30.n(cVar), X30.k(cVar));
            }
            throw new IOException();
        }

        public InterfaceC4747Xs.a c(byte[] bArr) {
            InterfaceC4747Xs.a aVar = new InterfaceC4747Xs.a();
            aVar.a = bArr;
            aVar.b = this.c;
            aVar.c = this.d;
            aVar.d = this.e;
            aVar.e = this.f;
            aVar.f = this.g;
            aVar.g = C11161zI0.j(this.h);
            aVar.h = Collections.unmodifiableList(this.h);
            return aVar;
        }

        public boolean d(OutputStream outputStream) {
            try {
                X30.s(outputStream, X30.g);
                X30.u(outputStream, this.b);
                String str = this.c;
                if (str == null) {
                    str = "";
                }
                X30.u(outputStream, str);
                X30.t(outputStream, this.d);
                X30.t(outputStream, this.e);
                X30.t(outputStream, this.f);
                X30.t(outputStream, this.g);
                X30.r(this.h, outputStream);
                outputStream.flush();
                return true;
            } catch (IOException e) {
                C6767hJ2.b("%s", e.toString());
                return false;
            }
        }

        public b(String str, InterfaceC4747Xs.a aVar) {
            this(str, aVar.b, aVar.c, aVar.d, aVar.e, aVar.f, a(aVar));
        }
    }

    public X30(File file) {
        this(file, 5242880);
    }

    public X30(d dVar) {
        this(dVar, 5242880);
    }
}
