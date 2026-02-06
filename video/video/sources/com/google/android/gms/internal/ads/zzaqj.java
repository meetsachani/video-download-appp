package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import o.AI0;

/* loaded from: classes2.dex */
public class zzaqj implements zzapn {
    public final zzaqi a;
    public final zzaql b;

    public zzaqj(zzaqi zzaqiVar) {
        zzaql zzaqlVar = new zzaql(4096);
        this.a = zzaqiVar;
        this.b = zzaqlVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b3  */
    @Override // com.google.android.gms.internal.ads.zzapn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzapq a(zzapu zzapuVar) throws zzaqd {
        zzaqs zzaqsVar;
        byte[] bArr;
        zzaqw zzaqwVar;
        zzaqw zzaqwVar2;
        int e;
        String str;
        zzaqd zzaqdVar;
        String str2;
        Map map;
        byte[] bArr2;
        Object obj;
        byte[] bArr3;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            try {
                zzapd h = zzapuVar.h();
                if (h == null) {
                    map = Collections.EMPTY_MAP;
                } else {
                    HashMap hashMap = new HashMap();
                    String str3 = h.b;
                    if (str3 != null) {
                        hashMap.put("If-None-Match", str3);
                    }
                    long j = h.d;
                    if (j > 0) {
                        hashMap.put(AI0.z, zzaqr.c(j));
                    }
                    map = hashMap;
                }
                zzaqsVar = this.a.a(zzapuVar, map);
            } catch (IOException e2) {
                e = e2;
                zzaqsVar = null;
                bArr = null;
            }
            try {
                int b = zzaqsVar.b();
                List<zzapm> d = zzaqsVar.d();
                if (b == 304) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    zzapd h2 = zzapuVar.h();
                    if (h2 == null) {
                        return new zzapq(304, (byte[]) null, true, elapsedRealtime2, d);
                    }
                    TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                    if (!d.isEmpty()) {
                        for (zzapm zzapmVar : d) {
                            treeSet.add(zzapmVar.a());
                        }
                    }
                    ArrayList arrayList = new ArrayList(d);
                    List list = h2.h;
                    if (list != null) {
                        if (!list.isEmpty()) {
                            for (zzapm zzapmVar2 : h2.h) {
                                if (!treeSet.contains(zzapmVar2.a())) {
                                    arrayList.add(zzapmVar2);
                                }
                            }
                        }
                    } else if (!h2.g.isEmpty()) {
                        for (Map.Entry entry : h2.g.entrySet()) {
                            if (!treeSet.contains(entry.getKey())) {
                                arrayList.add(new zzapm((String) entry.getKey(), (String) entry.getValue()));
                            }
                        }
                    }
                    return new zzapq(304, h2.a, true, elapsedRealtime2, (List) arrayList);
                }
                InputStream c = zzaqsVar.c();
                if (c != null) {
                    int a = zzaqsVar.a();
                    zzaql zzaqlVar = this.b;
                    zzaqy zzaqyVar = new zzaqy(zzaqlVar, a);
                    try {
                        bArr3 = zzaqlVar.b(1024);
                        while (true) {
                            try {
                                int read = c.read(bArr3);
                                if (read == -1) {
                                    break;
                                }
                                zzaqyVar.write(bArr3, 0, read);
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    c.close();
                                    break;
                                } catch (IOException unused) {
                                    zzaqg.d("Error occurred when closing InputStream", new Object[0]);
                                }
                                zzaqlVar.a(bArr3);
                                zzaqyVar.close();
                                throw th;
                            }
                        }
                        bArr2 = zzaqyVar.toByteArray();
                        try {
                            c.close();
                        } catch (IOException unused2) {
                            zzaqg.d("Error occurred when closing InputStream", new Object[0]);
                        }
                        zzaqlVar.a(bArr3);
                        zzaqyVar.close();
                    } catch (Throwable th2) {
                        th = th2;
                        bArr3 = null;
                    }
                } else {
                    bArr2 = new byte[0];
                }
                bArr = bArr2;
                try {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    if (zzaqg.b || elapsedRealtime3 > 3000) {
                        Long valueOf = Long.valueOf(elapsedRealtime3);
                        if (bArr != null) {
                            obj = Integer.valueOf(bArr.length);
                        } else {
                            obj = "null";
                        }
                        zzaqg.a("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", zzapuVar, valueOf, obj, Integer.valueOf(b), Integer.valueOf(zzapuVar.D().a()));
                    }
                    if (b >= 200 && b <= 299) {
                        return new zzapq(b, bArr, false, SystemClock.elapsedRealtime() - elapsedRealtime, d);
                    }
                    throw new IOException();
                } catch (IOException e3) {
                    e = e3;
                    if (!(e instanceof SocketTimeoutException)) {
                        zzaqwVar = new zzaqw("socket", new zzaqc(), null);
                    } else if (!(e instanceof MalformedURLException)) {
                        if (zzaqsVar != null) {
                            int b2 = zzaqsVar.b();
                            zzaqg.b("Unexpected response code %d for %s", Integer.valueOf(b2), zzapuVar.p());
                            if (bArr != null) {
                                zzapq zzapqVar = new zzapq(b2, bArr, false, SystemClock.elapsedRealtime() - elapsedRealtime, zzaqsVar.d());
                                if (b2 != 401 && b2 != 403) {
                                    if (b2 >= 400 && b2 <= 499) {
                                        throw new zzaph(zzapqVar);
                                    }
                                    throw new zzaqb(zzapqVar);
                                }
                                zzaqwVar = new zzaqw("auth", new zzapc(zzapqVar), null);
                            } else {
                                zzaqwVar = new zzaqw("network", new zzapp(), null);
                            }
                        } else {
                            throw new zzapr(e);
                        }
                    } else {
                        throw new RuntimeException("Bad URL ".concat(String.valueOf(zzapuVar.p())), e);
                    }
                    zzaqwVar2 = zzaqwVar;
                    zzapi D = zzapuVar.D();
                    e = zzapuVar.e();
                    try {
                        zzaqdVar = zzaqwVar2.b;
                        D.c(zzaqdVar);
                        str2 = zzaqwVar2.a;
                        zzapuVar.r(String.format("%s-retry [timeout=%s]", str2, Integer.valueOf(e)));
                    } catch (zzaqd e4) {
                        str = zzaqwVar2.a;
                        zzapuVar.r(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(e)));
                        throw e4;
                    }
                }
            } catch (IOException e5) {
                e = e5;
                bArr = null;
                if (!(e instanceof SocketTimeoutException)) {
                }
                zzaqwVar2 = zzaqwVar;
                zzapi D2 = zzapuVar.D();
                e = zzapuVar.e();
                zzaqdVar = zzaqwVar2.b;
                D2.c(zzaqdVar);
                str2 = zzaqwVar2.a;
                zzapuVar.r(String.format("%s-retry [timeout=%s]", str2, Integer.valueOf(e)));
            }
            str2 = zzaqwVar2.a;
            zzapuVar.r(String.format("%s-retry [timeout=%s]", str2, Integer.valueOf(e)));
        }
    }
}
