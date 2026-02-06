package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import o.InterfaceC5056aJ2;
import o.X30;

/* loaded from: classes2.dex */
public final class zzaqq implements zzape {
    public final zzaqp c;
    public final Map a = new LinkedHashMap(16, 0.75f, true);
    public long b = 0;
    public final int d = 5242880;

    public zzaqq(zzaqp zzaqpVar, int i) {
        this.c = zzaqpVar;
    }

    public static int d(InputStream inputStream) throws IOException {
        return (m(inputStream) << 24) | m(inputStream) | (m(inputStream) << 8) | (m(inputStream) << 16);
    }

    public static long e(InputStream inputStream) throws IOException {
        return (m(inputStream) & 255) | ((m(inputStream) & 255) << 8) | ((m(inputStream) & 255) << 16) | ((m(inputStream) & 255) << 24) | ((m(inputStream) & 255) << 32) | ((m(inputStream) & 255) << 40) | ((m(inputStream) & 255) << 48) | ((m(inputStream) & 255) << 56);
    }

    public static String g(zzaqo zzaqoVar) throws IOException {
        return new String(l(zzaqoVar, e(zzaqoVar)), "UTF-8");
    }

    public static void i(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    public static void j(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) j);
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    public static void k(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        j(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    @InterfaceC5056aJ2
    public static byte[] l(zzaqo zzaqoVar, long j) throws IOException {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        long a = zzaqoVar.a();
        if (i >= 0 && j <= a) {
            int i2 = (int) j;
            if (i2 == j) {
                byte[] bArr = new byte[i2];
                new DataInputStream(zzaqoVar).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j + ", maxLength=" + a);
    }

    public static int m(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    public static final String p(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    @Override // com.google.android.gms.internal.ads.zzape
    public final synchronized void a(String str, boolean z) {
        zzapd w = w(str);
        if (w != null) {
            w.f = 0L;
            w.e = 0L;
            c(str, w);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzape
    public final synchronized void b() {
        long length;
        zzaqo zzaqoVar;
        File a = this.c.a();
        if (!a.exists()) {
            if (!a.mkdirs()) {
                zzaqg.b("Unable to create cache dir %s", a.getAbsolutePath());
            }
        } else {
            File[] listFiles = a.listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    try {
                        length = file.length();
                        zzaqoVar = new zzaqo(new BufferedInputStream(new FileInputStream(file)), length);
                    } catch (IOException unused) {
                        file.delete();
                    }
                    try {
                        zzaqn a2 = zzaqn.a(zzaqoVar);
                        a2.a = length;
                        n(a2.b, a2);
                        zzaqoVar.close();
                    } catch (Throwable th) {
                        zzaqoVar.close();
                        throw th;
                        break;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzape
    public final synchronized void c(String str, zzapd zzapdVar) {
        float f;
        try {
            long j = this.b;
            int length = zzapdVar.a.length;
            long j2 = j + length;
            int i = this.d;
            float f2 = 0.9f;
            if (j2 <= i || length <= i * 0.9f) {
                File f3 = f(str);
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(f3));
                    zzaqn zzaqnVar = new zzaqn(str, zzapdVar);
                    try {
                        i(bufferedOutputStream, X30.g);
                        k(bufferedOutputStream, zzaqnVar.b);
                        String str2 = zzaqnVar.c;
                        if (str2 == null) {
                            str2 = "";
                        }
                        k(bufferedOutputStream, str2);
                        j(bufferedOutputStream, zzaqnVar.d);
                        j(bufferedOutputStream, zzaqnVar.e);
                        j(bufferedOutputStream, zzaqnVar.f);
                        j(bufferedOutputStream, zzaqnVar.g);
                        List<zzapm> list = zzaqnVar.h;
                        if (list != null) {
                            i(bufferedOutputStream, list.size());
                            for (zzapm zzapmVar : list) {
                                k(bufferedOutputStream, zzapmVar.a());
                                k(bufferedOutputStream, zzapmVar.b());
                            }
                        } else {
                            i(bufferedOutputStream, 0);
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.write(zzapdVar.a);
                        bufferedOutputStream.close();
                        zzaqnVar.a = f3.length();
                        n(str, zzaqnVar);
                        long j3 = this.b;
                        int i2 = this.d;
                        if (j3 >= i2) {
                            boolean z = zzaqg.b;
                            if (z) {
                                zzaqg.d("Pruning old cache entries.", new Object[0]);
                            }
                            long j4 = this.b;
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            Iterator it = this.a.entrySet().iterator();
                            int i3 = 0;
                            while (it.hasNext()) {
                                zzaqn zzaqnVar2 = (zzaqn) ((Map.Entry) it.next()).getValue();
                                String str3 = zzaqnVar2.b;
                                if (f(str3).delete()) {
                                    f = f2;
                                    this.b -= zzaqnVar2.a;
                                } else {
                                    f = f2;
                                    zzaqg.a("Could not delete cache entry for key=%s, filename=%s", str3, p(str3));
                                }
                                it.remove();
                                i3++;
                                if (((float) this.b) < i2 * f) {
                                    break;
                                }
                                f2 = f;
                            }
                            if (z) {
                                zzaqg.d("pruned %d files, %d bytes, %d ms", Integer.valueOf(i3), Long.valueOf(this.b - j4), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                            }
                        }
                    } catch (IOException e) {
                        zzaqg.a("%s", e.toString());
                        bufferedOutputStream.close();
                        zzaqg.a("Failed to write header for %s", f3.getAbsolutePath());
                        throw new IOException();
                    }
                } catch (IOException unused) {
                    if (!f3.delete()) {
                        zzaqg.a("Could not clean up file %s", f3.getAbsolutePath());
                    }
                    if (!this.c.a().exists()) {
                        zzaqg.a("Re-initializing cache after external clearing.", new Object[0]);
                        this.a.clear();
                        this.b = 0L;
                        b();
                    }
                }
            }
        } finally {
        }
    }

    public final File f(String str) {
        return new File(this.c.a(), p(str));
    }

    public final synchronized void h(String str) {
        boolean delete = f(str).delete();
        o(str);
        if (!delete) {
            zzaqg.a("Could not delete cache entry for key=%s, filename=%s", str, p(str));
        }
    }

    public final void n(String str, zzaqn zzaqnVar) {
        Map map = this.a;
        if (!map.containsKey(str)) {
            this.b += zzaqnVar.a;
        } else {
            this.b += zzaqnVar.a - ((zzaqn) map.get(str)).a;
        }
        map.put(str, zzaqnVar);
    }

    public final void o(String str) {
        zzaqn zzaqnVar = (zzaqn) this.a.remove(str);
        if (zzaqnVar != null) {
            this.b -= zzaqnVar.a;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzape
    public final synchronized zzapd w(String str) {
        zzaqn zzaqnVar = (zzaqn) this.a.get(str);
        if (zzaqnVar == null) {
            return null;
        }
        File f = f(str);
        try {
            zzaqo zzaqoVar = new zzaqo(new BufferedInputStream(new FileInputStream(f)), f.length());
            try {
                String str2 = zzaqn.a(zzaqoVar).b;
                if (!TextUtils.equals(str, str2)) {
                    zzaqg.a("%s: key=%s, found=%s", f.getAbsolutePath(), str, str2);
                    o(str);
                    return null;
                }
                byte[] l = l(zzaqoVar, zzaqoVar.a());
                zzapd zzapdVar = new zzapd();
                zzapdVar.a = l;
                zzapdVar.b = zzaqnVar.c;
                zzapdVar.c = zzaqnVar.d;
                zzapdVar.d = zzaqnVar.e;
                zzapdVar.e = zzaqnVar.f;
                zzapdVar.f = zzaqnVar.g;
                List<zzapm> list = zzaqnVar.h;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (zzapm zzapmVar : list) {
                    treeMap.put(zzapmVar.a(), zzapmVar.b());
                }
                zzapdVar.g = treeMap;
                zzapdVar.h = Collections.unmodifiableList(list);
                return zzapdVar;
            } finally {
                zzaqoVar.close();
            }
        } catch (IOException e) {
            zzaqg.a("%s: %s", f.getAbsolutePath(), e.toString());
            h(str);
            return null;
        }
    }

    public zzaqq(File file, int i) {
        this.c = new zzaqm(this, file);
    }
}
