package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.gamingservices.q;
import com.facebook.internal.C2358c;
import java.util.HashMap;
import java.util.Map;
import o.AD1;
import o.C9698tH2;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfpi implements zzfoa {
    public final Object a;
    public final zzfpj b;
    public final zzfpu c;
    public final zzfnx d;

    public zzfpi(@InterfaceC5670cr1 Object obj, @InterfaceC5670cr1 zzfpj zzfpjVar, @InterfaceC5670cr1 zzfpu zzfpuVar, @InterfaceC5670cr1 zzfnx zzfnxVar, boolean z) {
        this.a = obj;
        this.b = zzfpjVar;
        this.c = zzfpuVar;
        this.d = zzfnxVar;
    }

    @InterfaceC11300zs1
    public static String i(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        zzatx s2 = zzaty.s2();
        s2.a2(5);
        s2.Y1(zzgxk.U(bArr, 0, bArr.length));
        return Base64.encodeToString(((zzaty) s2.V1()).b1(), 11);
    }

    @Override // com.google.android.gms.internal.ads.zzfoa
    public final synchronized void a(String str, MotionEvent motionEvent) throws zzfps {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("t", new Throwable());
            hashMap.put(C2358c.j, null);
            hashMap.put("evt", motionEvent);
            Object obj = this.a;
            obj.getClass().getDeclaredMethod("he", Map.class).invoke(obj, hashMap);
            this.d.d(AD1.n1, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new zzfps((int) AD1.h1, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfoa
    @InterfaceC11300zs1
    public final synchronized String b(Context context, String str, View view, Activity activity) {
        Map c;
        c = this.c.c();
        c.put("f", "v");
        c.put("ctx", context);
        c.put(C2358c.j, null);
        c.put(C9698tH2.A, view);
        c.put("act", activity);
        return i(j(null, c));
    }

    @Override // com.google.android.gms.internal.ads.zzfoa
    @InterfaceC11300zs1
    public final synchronized String c(Context context, String str) {
        Map b;
        b = this.c.b();
        b.put("f", q.a);
        b.put("ctx", context);
        b.put(C2358c.j, null);
        return i(j(null, b));
    }

    @Override // com.google.android.gms.internal.ads.zzfoa
    @InterfaceC11300zs1
    public final synchronized String d(Context context, String str, String str2, View view, Activity activity) {
        Map a;
        a = this.c.a();
        a.put("f", "c");
        a.put("ctx", context);
        a.put("cs", str2);
        a.put(C2358c.j, null);
        a.put(C9698tH2.A, view);
        a.put("act", activity);
        return i(j(null, a));
    }

    public final synchronized int e() throws zzfps {
        Object obj;
        try {
            obj = this.a;
        } catch (Exception e) {
            throw new zzfps(2006, e);
        }
        return ((Integer) obj.getClass().getDeclaredMethod("lcs", null).invoke(obj, null)).intValue();
    }

    public final zzfpj f() {
        return this.b;
    }

    public final synchronized void g() throws zzfps {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            Object obj = this.a;
            obj.getClass().getDeclaredMethod("close", null).invoke(obj, null);
            this.d.d(3001, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new zzfps(2003, e);
        }
    }

    public final synchronized boolean h() throws zzfps {
        Object obj;
        try {
            obj = this.a;
        } catch (Exception e) {
            throw new zzfps(2001, e);
        }
        return ((Boolean) obj.getClass().getDeclaredMethod("init", null).invoke(obj, null)).booleanValue();
    }

    @InterfaceC11300zs1
    public final synchronized byte[] j(Map map, Map map2) {
        Object obj;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            obj = this.a;
        } catch (Exception e) {
            this.d.c(AD1.j1, System.currentTimeMillis() - currentTimeMillis, e);
            return null;
        }
        return (byte[]) obj.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(obj, null, map2);
    }
}
