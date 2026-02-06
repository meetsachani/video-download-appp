package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import o.C6566gU0;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzud implements zzvu {
    public final zzads a;
    @InterfaceC11300zs1
    public zzadn b;
    @InterfaceC11300zs1
    public zzado c;

    public zzud(zzads zzadsVar) {
        this.a = zzadsVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
        if (r1.e() != r11) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0075, code lost:
        if (r1.e() != r11) goto L29;
     */
    @Override // com.google.android.gms.internal.ads.zzvu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(zzl zzlVar, Uri uri, Map map, long j, long j2, zzadq zzadqVar) throws IOException {
        zzadd zzaddVar = new zzadd(zzlVar, j, j2);
        this.c = zzaddVar;
        if (this.b != null) {
            return;
        }
        zzadn[] a = this.a.a(uri, map);
        int length = a.length;
        zzfxz p = zzfyc.p(length);
        boolean z = false;
        if (length == 1) {
            this.b = a[0];
        } else {
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                zzadn zzadnVar = a[i];
                try {
                } catch (EOFException unused) {
                    if (this.b == null) {
                    }
                } catch (Throwable th) {
                    if (this.b != null || zzaddVar.e() == j) {
                        z = true;
                    }
                    zzdc.f(z);
                    zzaddVar.j();
                    throw th;
                }
                if (zzadnVar.g(zzaddVar)) {
                    this.b = zzadnVar;
                    zzdc.f(true);
                    zzaddVar.j();
                    break;
                }
                p.i(zzadnVar.f());
                if (this.b == null) {
                }
                boolean z2 = true;
                zzdc.f(z2);
                zzaddVar.j();
                i++;
            }
            if (this.b == null) {
                Iterator it = zzfys.b(zzfyc.D(a), new zzfur() { // from class: com.google.android.gms.internal.ads.zzuc
                    @Override // com.google.android.gms.internal.ads.zzfur
                    public final Object apply(Object obj) {
                        zzadn zzadnVar2 = (zzadn) obj;
                        zzadnVar2.c();
                        return zzadnVar2.getClass().getSimpleName();
                    }
                }).iterator();
                StringBuilder sb = new StringBuilder();
                zzfuu.c(sb, it, C6566gU0.h);
                throw new zzxf("None of the available extractors (" + sb.toString() + ") could read the stream.", uri, p.j());
            }
        }
        this.b.i(zzadqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final long b() {
        zzado zzadoVar = this.c;
        if (zzadoVar != null) {
            return zzadoVar.e();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final void c() {
        zzadn zzadnVar = this.b;
        if (zzadnVar != null && (zzadnVar instanceof zzahw)) {
            ((zzahw) zzadnVar).a();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final void d() {
        if (this.b != null) {
            this.b = null;
        }
        this.c = null;
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final void e(long j, long j2) {
        zzadn zzadnVar = this.b;
        zzadnVar.getClass();
        zzadnVar.e(j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final int f(zzaej zzaejVar) throws IOException {
        zzadn zzadnVar = this.b;
        zzadnVar.getClass();
        zzado zzadoVar = this.c;
        zzadoVar.getClass();
        return zzadnVar.j(zzadoVar, zzaejVar);
    }
}
