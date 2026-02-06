package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o.AbstractC4253Sp2;

/* loaded from: classes2.dex */
public final class zzcdl extends zzcdi {
    public static final Set a1 = Collections.synchronizedSet(new HashSet());
    public static final DecimalFormat b1 = new DecimalFormat("#,###");
    public static final /* synthetic */ int c1 = 0;
    public File Y0;
    public boolean Z0;

    public zzcdl(zzcbw zzcbwVar) {
        super(zzcbwVar);
        File cacheDir = this.X.getCacheDir();
        if (cacheDir == null) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(zzfqi.a(zzfqh.a(), cacheDir, "admobVideoStreams"));
        this.Y0 = file;
        if (!file.isDirectory() && !this.Y0.mkdirs()) {
            String valueOf = String.valueOf(this.Y0.getAbsolutePath());
            int i2 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("Could not create preload cache directory at ".concat(valueOf));
            this.Y0 = null;
        } else if (this.Y0.setReadable(true, false) && this.Y0.setExecutable(true, false)) {
        } else {
            String valueOf2 = String.valueOf(this.Y0.getAbsolutePath());
            int i3 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("Could not set cache file permissions at ".concat(valueOf2));
            this.Y0 = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdi
    public final void l() {
        this.Z0 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x032e, code lost:
        r22 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0330, code lost:
        r22.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0338, code lost:
        if (com.google.android.gms.ads.internal.util.client.zzo.j(3) == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x033a, code lost:
        com.google.android.gms.ads.internal.util.client.zzo.b("Preloaded " + r14.format(r6) + " bytes from " + r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x035b, code lost:
        r9.setReadable(true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0364, code lost:
        if (r10.isFile() == false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0366, code lost:
        r10.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x036e, code lost:
        r10.createNewFile();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03e3  */
    @Override // com.google.android.gms.internal.ads.zzcdi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean w(final String str) {
        int i;
        File file;
        String concat;
        String str2;
        String str3;
        String str4;
        FileOutputStream fileOutputStream;
        int i2;
        ByteBuffer byteBuffer;
        int i3;
        int i4;
        int responseCode;
        File[] listFiles;
        boolean z;
        FileOutputStream fileOutputStream2 = null;
        if (this.Y0 != null) {
            do {
                File file2 = this.Y0;
                if (file2 == null) {
                    i = 0;
                } else {
                    i = 0;
                    for (File file3 : file2.listFiles()) {
                        if (!file3.getName().endsWith(".done")) {
                            i++;
                        }
                    }
                }
                if (i > ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.r)).intValue()) {
                    File file4 = this.Y0;
                    if (file4 == null) {
                        break;
                    }
                    long j = Long.MAX_VALUE;
                    File file5 = null;
                    for (File file6 : file4.listFiles()) {
                        if (!file6.getName().endsWith(".done")) {
                            long lastModified = file6.lastModified();
                            if (lastModified < j) {
                                file5 = file6;
                                j = lastModified;
                            }
                        }
                    }
                    if (file5 != null) {
                        z = file5.delete();
                        File z2 = z(file5);
                        if (z2.isFile()) {
                            z &= z2.delete();
                            continue;
                        } else {
                            continue;
                        }
                    } else {
                        z = false;
                        continue;
                    }
                } else {
                    file = new File(zzfqi.a(zzfqh.a(), this.Y0, com.google.android.gms.ads.internal.util.client.zzf.l(str)));
                    File z3 = z(file);
                    if (file.isFile() && z3.isFile()) {
                        int length = (int) file.length();
                        String valueOf = String.valueOf(str);
                        int i5 = com.google.android.gms.ads.internal.util.zze.b;
                        com.google.android.gms.ads.internal.util.client.zzo.b("Stream cache hit at ".concat(valueOf));
                        n(str, file.getAbsolutePath(), length);
                        return true;
                    }
                    String valueOf2 = String.valueOf(this.Y0.getAbsolutePath());
                    String valueOf3 = String.valueOf(str);
                    Set set = a1;
                    concat = valueOf2.concat(valueOf3);
                    synchronized (set) {
                        try {
                            if (set.contains(concat)) {
                                int i6 = com.google.android.gms.ads.internal.util.zze.b;
                                com.google.android.gms.ads.internal.util.client.zzo.g("Stream cache already in progress at " + str);
                                m(str, file.getAbsolutePath(), "inProgress", null);
                                return false;
                            }
                            set.add(concat);
                            str2 = "error";
                            try {
                                HttpURLConnection r = zzfqu.a().r(new zzfrf() { // from class: com.google.android.gms.internal.ads.zzcdk
                                    @Override // com.google.android.gms.internal.ads.zzfrf
                                    public final URLConnection a() {
                                        int i7 = zzcdl.c1;
                                        com.google.android.gms.ads.internal.zzv.C();
                                        int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.P)).intValue();
                                        URL url = new URL(str);
                                        int i8 = 0;
                                        while (true) {
                                            i8++;
                                            if (i8 <= 20) {
                                                int i9 = zzfqp.a;
                                                URLConnection openConnection = url.openConnection();
                                                openConnection.setConnectTimeout(intValue);
                                                openConnection.setReadTimeout(intValue);
                                                if (openConnection instanceof HttpURLConnection) {
                                                    HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                                                    com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
                                                    zzlVar.c(httpURLConnection, null);
                                                    httpURLConnection.setInstanceFollowRedirects(false);
                                                    int responseCode2 = httpURLConnection.getResponseCode();
                                                    zzlVar.e(httpURLConnection, responseCode2);
                                                    if (responseCode2 / 100 == 3) {
                                                        String headerField = httpURLConnection.getHeaderField("Location");
                                                        if (headerField != null) {
                                                            URL url2 = new URL(url, headerField);
                                                            String protocol = url2.getProtocol();
                                                            if (protocol != null) {
                                                                if (!protocol.equals("http") && !protocol.equals("https")) {
                                                                    throw new IOException("Unsupported scheme: ".concat(protocol));
                                                                }
                                                                String concat2 = "Redirecting to ".concat(headerField);
                                                                int i10 = com.google.android.gms.ads.internal.util.zze.b;
                                                                com.google.android.gms.ads.internal.util.client.zzo.b(concat2);
                                                                httpURLConnection.disconnect();
                                                                url = url2;
                                                            } else {
                                                                throw new IOException("Protocol is null");
                                                            }
                                                        } else {
                                                            throw new IOException("Missing Location header in redirect");
                                                        }
                                                    } else {
                                                        return httpURLConnection;
                                                    }
                                                } else {
                                                    throw new IOException("Invalid protocol.");
                                                }
                                            } else {
                                                throw new IOException("Too many redirects (20)");
                                            }
                                        }
                                    }
                                }, 265, -1);
                                if (r != null && (responseCode = r.getResponseCode()) >= 400) {
                                    str2 = "badUrl";
                                    try {
                                        str4 = "HTTP request failed. Code: " + Integer.toString(responseCode);
                                        try {
                                            throw new IOException("HTTP status code " + responseCode + " at " + str);
                                        } catch (IOException e) {
                                            e = e;
                                            str3 = concat;
                                            if (e instanceof RuntimeException) {
                                            }
                                            try {
                                                fileOutputStream2.close();
                                            } catch (IOException | NullPointerException unused) {
                                            }
                                            if (this.Z0) {
                                            }
                                            if (file.exists()) {
                                            }
                                            m(str, file.getAbsolutePath(), str2, str4);
                                            a1.remove(str3);
                                            return false;
                                        } catch (RuntimeException e2) {
                                            e = e2;
                                            str3 = concat;
                                            if (e instanceof RuntimeException) {
                                            }
                                            fileOutputStream2.close();
                                            if (this.Z0) {
                                            }
                                            if (file.exists()) {
                                            }
                                            m(str, file.getAbsolutePath(), str2, str4);
                                            a1.remove(str3);
                                            return false;
                                        }
                                    } catch (IOException | RuntimeException e3) {
                                        e = e3;
                                        str4 = null;
                                    }
                                }
                                int contentLength = r.getContentLength();
                                if (contentLength < 0) {
                                    int i7 = com.google.android.gms.ads.internal.util.zze.b;
                                    com.google.android.gms.ads.internal.util.client.zzo.g("Stream cache aborted, missing content-length header at " + str);
                                    m(str, file.getAbsolutePath(), "contentLengthMissing", null);
                                    set.remove(concat);
                                    return false;
                                }
                                DecimalFormat decimalFormat = b1;
                                String format = decimalFormat.format(contentLength);
                                int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.s)).intValue();
                                if (contentLength > intValue) {
                                    int i8 = com.google.android.gms.ads.internal.util.zze.b;
                                    com.google.android.gms.ads.internal.util.client.zzo.g("Content length " + format + " exceeds limit at " + str);
                                    m(str, file.getAbsolutePath(), "sizeExceeded", "File too big for full file cache. Size: " + format);
                                    set.remove(concat);
                                    return false;
                                }
                                int i9 = com.google.android.gms.ads.internal.util.zze.b;
                                com.google.android.gms.ads.internal.util.client.zzo.b("Caching " + format + " bytes from " + str);
                                ReadableByteChannel newChannel = Channels.newChannel(r.getInputStream());
                                FileOutputStream fileOutputStream3 = new FileOutputStream(file);
                                try {
                                    FileChannel channel = fileOutputStream3.getChannel();
                                    ByteBuffer allocate = ByteBuffer.allocate(1048576);
                                    Clock d = com.google.android.gms.ads.internal.zzv.d();
                                    long a = d.a();
                                    try {
                                        com.google.android.gms.ads.internal.util.zzbx zzbxVar = new com.google.android.gms.ads.internal.util.zzbx(((Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.O)).longValue());
                                        long longValue = ((Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.N)).longValue();
                                        i2 = 0;
                                        while (true) {
                                            int read = newChannel.read(allocate);
                                            if (read < 0) {
                                                break;
                                            }
                                            int i10 = i2 + read;
                                            try {
                                                try {
                                                    if (i10 <= intValue) {
                                                        allocate.flip();
                                                        do {
                                                        } while (channel.write(allocate) > 0);
                                                        allocate.clear();
                                                        if (d.a() - a <= 1000 * longValue) {
                                                            FileChannel fileChannel = channel;
                                                            if (!this.Z0) {
                                                                if (zzbxVar.b()) {
                                                                    fileOutputStream = fileOutputStream3;
                                                                    try {
                                                                        try {
                                                                            byteBuffer = allocate;
                                                                            i3 = i10;
                                                                            i4 = intValue;
                                                                            com.google.android.gms.ads.internal.util.client.zzf.b.post(new zzcdc(this, str, file.getAbsolutePath(), i3, contentLength, false));
                                                                        } catch (RuntimeException e4) {
                                                                            e = e4;
                                                                            str3 = concat;
                                                                            fileOutputStream2 = fileOutputStream;
                                                                            str4 = null;
                                                                            if (e instanceof RuntimeException) {
                                                                            }
                                                                            fileOutputStream2.close();
                                                                            if (this.Z0) {
                                                                            }
                                                                            if (file.exists()) {
                                                                                com.google.android.gms.ads.internal.util.client.zzo.g("Could not delete partial cache file at ".concat(String.valueOf(file.getAbsolutePath())));
                                                                            }
                                                                            m(str, file.getAbsolutePath(), str2, str4);
                                                                            a1.remove(str3);
                                                                            return false;
                                                                        }
                                                                    } catch (IOException e5) {
                                                                        e = e5;
                                                                        str3 = concat;
                                                                        fileOutputStream2 = fileOutputStream;
                                                                        str4 = null;
                                                                        if (e instanceof RuntimeException) {
                                                                            com.google.android.gms.ads.internal.zzv.t().x(e, "VideoStreamFullFileCache.preload");
                                                                        }
                                                                        fileOutputStream2.close();
                                                                        if (this.Z0) {
                                                                            int i11 = com.google.android.gms.ads.internal.util.zze.b;
                                                                            com.google.android.gms.ads.internal.util.client.zzo.f("Preload aborted for URL \"" + str + AbstractC4253Sp2.b.x1);
                                                                        } else {
                                                                            int i12 = com.google.android.gms.ads.internal.util.zze.b;
                                                                            com.google.android.gms.ads.internal.util.client.zzo.h("Preload failed for URL \"" + str + AbstractC4253Sp2.b.x1, e);
                                                                        }
                                                                        if (file.exists() && !file.delete()) {
                                                                            com.google.android.gms.ads.internal.util.client.zzo.g("Could not delete partial cache file at ".concat(String.valueOf(file.getAbsolutePath())));
                                                                        }
                                                                        m(str, file.getAbsolutePath(), str2, str4);
                                                                        a1.remove(str3);
                                                                        return false;
                                                                    }
                                                                } else {
                                                                    fileOutputStream = fileOutputStream3;
                                                                    byteBuffer = allocate;
                                                                    i3 = i10;
                                                                    i4 = intValue;
                                                                }
                                                                i2 = i3;
                                                                channel = fileChannel;
                                                                fileOutputStream3 = fileOutputStream;
                                                                intValue = i4;
                                                                allocate = byteBuffer;
                                                            } else {
                                                                throw new IOException("abort requested");
                                                            }
                                                        } else {
                                                            String str5 = "Timeout exceeded. Limit: " + Long.toString(longValue) + " sec";
                                                            throw new IOException("stream cache time limit exceeded");
                                                        }
                                                    } else {
                                                        String str6 = "File too big for full file cache. Size: " + Integer.toString(i10);
                                                        throw new IOException("stream cache file size limit exceeded");
                                                    }
                                                } catch (IOException | RuntimeException e6) {
                                                    e = e6;
                                                    str4 = newChannel;
                                                    str3 = concat;
                                                    fileOutputStream2 = fileOutputStream;
                                                    if (e instanceof RuntimeException) {
                                                    }
                                                    fileOutputStream2.close();
                                                    if (this.Z0) {
                                                    }
                                                    if (file.exists()) {
                                                    }
                                                    m(str, file.getAbsolutePath(), str2, str4);
                                                    a1.remove(str3);
                                                    return false;
                                                }
                                            } catch (IOException e7) {
                                                e = e7;
                                                str3 = concat;
                                                fileOutputStream2 = fileOutputStream;
                                                str4 = null;
                                                if (e instanceof RuntimeException) {
                                                }
                                                fileOutputStream2.close();
                                                if (this.Z0) {
                                                }
                                                if (file.exists()) {
                                                }
                                                m(str, file.getAbsolutePath(), str2, str4);
                                                a1.remove(str3);
                                                return false;
                                            } catch (RuntimeException e8) {
                                                e = e8;
                                                str3 = concat;
                                                fileOutputStream2 = fileOutputStream;
                                                str4 = null;
                                                if (e instanceof RuntimeException) {
                                                }
                                                fileOutputStream2.close();
                                                if (this.Z0) {
                                                }
                                                if (file.exists()) {
                                                }
                                                m(str, file.getAbsolutePath(), str2, str4);
                                                a1.remove(str3);
                                                return false;
                                            }
                                        }
                                    } catch (IOException e9) {
                                        e = e9;
                                        fileOutputStream = fileOutputStream3;
                                        str3 = concat;
                                        fileOutputStream2 = fileOutputStream;
                                        str4 = null;
                                        if (e instanceof RuntimeException) {
                                        }
                                        fileOutputStream2.close();
                                        if (this.Z0) {
                                        }
                                        if (file.exists()) {
                                        }
                                        m(str, file.getAbsolutePath(), str2, str4);
                                        a1.remove(str3);
                                        return false;
                                    } catch (RuntimeException e10) {
                                        e = e10;
                                        fileOutputStream = fileOutputStream3;
                                        str3 = concat;
                                        fileOutputStream2 = fileOutputStream;
                                        str4 = null;
                                        if (e instanceof RuntimeException) {
                                        }
                                        fileOutputStream2.close();
                                        if (this.Z0) {
                                        }
                                        if (file.exists()) {
                                        }
                                        m(str, file.getAbsolutePath(), str2, str4);
                                        a1.remove(str3);
                                        return false;
                                    }
                                } catch (IOException | RuntimeException e11) {
                                    e = e11;
                                    fileOutputStream = fileOutputStream3;
                                    str3 = concat;
                                }
                            } catch (IOException | RuntimeException e12) {
                                e = e12;
                                str3 = concat;
                                str4 = null;
                                fileOutputStream2 = null;
                            }
                        } finally {
                        }
                    }
                }
            } while (z);
            int i13 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("Unable to expire stream cache");
            m(str, null, "expireFailed", null);
            return false;
        }
        m(str, null, "noCacheDir", null);
        return false;
        n(str, file.getAbsolutePath(), i2);
        str3 = concat;
        try {
            a1.remove(str3);
            return true;
        } catch (IOException e13) {
            e = e13;
            fileOutputStream2 = fileOutputStream;
            str4 = null;
            if (e instanceof RuntimeException) {
            }
            fileOutputStream2.close();
            if (this.Z0) {
            }
            if (file.exists()) {
            }
            m(str, file.getAbsolutePath(), str2, str4);
            a1.remove(str3);
            return false;
        } catch (RuntimeException e14) {
            e = e14;
            fileOutputStream2 = fileOutputStream;
            str4 = null;
            if (e instanceof RuntimeException) {
            }
            fileOutputStream2.close();
            if (this.Z0) {
            }
            if (file.exists()) {
            }
            m(str, file.getAbsolutePath(), str2, str4);
            a1.remove(str3);
            return false;
        }
    }

    public final File z(File file) {
        return new File(zzfqi.a(zzfqh.a(), this.Y0, String.valueOf(file.getName()).concat(".done")));
    }
}
