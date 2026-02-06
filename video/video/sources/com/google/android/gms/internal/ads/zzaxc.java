package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import o.C2638Cg0;
import o.MS2;
import o.NS2;
import o.OS2;

/* loaded from: classes2.dex */
public final class zzaxc extends zzayb {
    public static final zzayc k = new zzayc();
    public final zzasg h;
    public final Context i;
    public final zzaug j;

    public zzaxc(zzawo zzawoVar, String str, String str2, zzask zzaskVar, int i, int i2, Context context, zzarx zzarxVar, zzasg zzasgVar, zzaug zzaugVar) {
        super(zzawoVar, "5l2BxulTXy+0Wovy9T0xreNvMgccuxz9Mfzqj2nIzDWreku9cf/hyHYbFP2gke7n", "rfz55QLsxMWzB2XqDjYWCElC2tXCWyMh5Hq3cP2KfWk=", zzaskVar, i, 27);
        this.i = context;
        this.h = zzasgVar;
        this.j = zzaugVar;
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    public final void a() throws IllegalAccessException, InvocationTargetException {
        int i;
        String str;
        zzaud zzaudVar;
        zzaud zzaudVar2;
        zzayc zzaycVar = k;
        Context context = this.i;
        AtomicReference a = zzaycVar.a(context.getPackageName());
        synchronized (a) {
            try {
                zzaud zzaudVar3 = (zzaud) a.get();
                if (zzaudVar3 != null) {
                    if (!zzawr.d(zzaudVar3.b)) {
                        if (!zzaudVar3.b.equals(C2638Cg0.S4)) {
                            if (zzaudVar3.b.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                            }
                            zzaudVar2 = (zzaud) a.get();
                        }
                    }
                }
                if (!zzawr.d(null)) {
                    i = 5;
                } else {
                    zzawr.d(null);
                    i = 3;
                }
                if (this.j != null) {
                    zzaudVar = c();
                } else {
                    boolean z = false;
                    if (i == 3 && !this.h.f()) {
                        z = true;
                    }
                    Boolean valueOf = Boolean.valueOf(z);
                    Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.K2);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.J2)).booleanValue()) {
                        str = b();
                    } else {
                        str = null;
                    }
                    if (bool.booleanValue() && this.a.o() && zzawr.d(str)) {
                        str = d();
                    }
                    zzaud zzaudVar4 = new zzaud((String) this.e.invoke(null, context, valueOf, str));
                    if (zzawr.d(zzaudVar4.b) || zzaudVar4.b.equals(C2638Cg0.S4)) {
                        int i2 = i - 1;
                        if (i2 != 3) {
                            if (i2 == 4) {
                                throw null;
                            }
                        } else {
                            String d = d();
                            if (!zzawr.d(d)) {
                                zzaudVar4.b = d;
                            }
                        }
                    }
                    zzaudVar = zzaudVar4;
                }
                a.set(zzaudVar);
                zzaudVar2 = (zzaud) a.get();
            } finally {
            }
        }
        zzask zzaskVar = this.d;
        synchronized (zzaskVar) {
            if (zzaudVar2 != null) {
                try {
                    zzaskVar.Z2(zzaudVar2.b);
                    zzaskVar.v2(zzaudVar2.c);
                    zzaskVar.x2(zzaudVar2.d);
                    zzaskVar.M2(zzaudVar2.e);
                    zzaskVar.Y2(zzaudVar2.f);
                } finally {
                }
            }
        }
    }

    public final String b() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] f = zzawr.f((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.L2));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(f)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzawr.f((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.M2)))));
            }
            Context context = this.i;
            String packageName = context.getPackageName();
            this.a.j();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
                return null;
            }
            final zzgds A = zzgds.A();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager$OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.zzayd
                public final void onChecksumsReady(List list) {
                    zzgds zzgdsVar = zzgds.this;
                    if (list == null) {
                        zzgdsVar.l(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            ApkChecksum a = MS2.a(list.get(i));
                            if (NS2.a(a) == 8) {
                                zzgdsVar.l(zzawr.b(OS2.a(a)));
                                return;
                            }
                        }
                        zzgdsVar.l(null);
                    } catch (Throwable unused) {
                        zzgdsVar.l(null);
                    }
                }
            });
            return (String) A.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }

    public final zzaud c() throws IllegalAccessException, InvocationTargetException {
        int a;
        String str;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.W2)).booleanValue()) {
            a = ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.b3)).intValue();
        } else {
            a = this.h.a();
        }
        zzaud zzaudVar = new zzaud((String) this.e.invoke(null, this.i, Boolean.FALSE, ""));
        zzaug zzaugVar = this.j;
        if (zzaugVar != null && zzaugVar.a() != null) {
            try {
                str = (String) zzaugVar.a().get(a, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            }
            zzaudVar.b = str;
            return zzaudVar;
        }
        str = C2638Cg0.S4;
        zzaudVar.b = str;
        return zzaudVar;
    }

    public final String d() {
        try {
            zzawo zzawoVar = this.a;
            if (zzawoVar.k() != null) {
                zzawoVar.k().get();
            }
            zzath c = zzawoVar.c();
            if (c != null && c.Y2()) {
                return c.k3();
            }
            return null;
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }
}
