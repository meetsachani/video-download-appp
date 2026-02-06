package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.C10664xF1;
import o.C2531Be;
import o.InterfaceC11300zs1;
import o.InterfaceC8710pF0;

/* loaded from: classes3.dex */
public final class zzfy implements zzgb {
    @InterfaceC8710pF0("ConfigurationContentLoader.class")
    public static final Map<Uri, zzfy> h = new C2531Be();
    public static final String[] i = {"key", "value"};
    public final ContentResolver a;
    public final Uri b;
    public final Runnable c;
    public final ContentObserver d;
    public final Object e;
    public volatile Map<String, String> f;
    @InterfaceC8710pF0("this")
    public final List<zzfz> g;

    public zzfy(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        zzga zzgaVar = new zzga(this, null);
        this.d = zzgaVar;
        this.e = new Object();
        this.g = new ArrayList();
        C10664xF1.E(contentResolver);
        C10664xF1.E(uri);
        this.a = contentResolver;
        this.b = uri;
        this.c = runnable;
        contentResolver.registerContentObserver(uri, false, zzgaVar);
    }

    public static zzfy a(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        zzfy zzfyVar;
        synchronized (zzfy.class) {
            Map<Uri, zzfy> map = h;
            zzfyVar = map.get(uri);
            if (zzfyVar == null) {
                try {
                    zzfy zzfyVar2 = new zzfy(contentResolver, uri, runnable);
                    try {
                        map.put(uri, zzfyVar2);
                    } catch (SecurityException unused) {
                    }
                    zzfyVar = zzfyVar2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return zzfyVar;
    }

    public static synchronized void d() {
        synchronized (zzfy.class) {
            try {
                for (zzfy zzfyVar : h.values()) {
                    zzfyVar.a.unregisterContentObserver(zzfyVar.d);
                }
                h.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Map<String, String> b() {
        Map<String, String> map = this.f;
        if (map == null) {
            synchronized (this.e) {
                try {
                    map = this.f;
                    if (map == null) {
                        map = f();
                        this.f = map;
                    }
                } finally {
                }
            }
        }
        if (map != null) {
            return map;
        }
        return Collections.EMPTY_MAP;
    }

    public final /* synthetic */ Map c() {
        Map hashMap;
        Cursor query = this.a.query(this.b, i, null, null, null);
        if (query == null) {
            return Collections.EMPTY_MAP;
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.EMPTY_MAP;
            }
            if (count <= 256) {
                hashMap = new C2531Be(count);
            } else {
                hashMap = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                hashMap.put(query.getString(0), query.getString(1));
            }
            return hashMap;
        } finally {
            query.close();
        }
    }

    public final void e() {
        synchronized (this.e) {
            this.f = null;
            this.c.run();
        }
        synchronized (this) {
            try {
                for (zzfz zzfzVar : this.g) {
                    zzfzVar.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @InterfaceC11300zs1
    public final Map<String, String> f() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                return (Map) zzge.a(new zzgd() { // from class: com.google.android.gms.internal.measurement.zzfx
                    @Override // com.google.android.gms.internal.measurement.zzgd
                    public final Object a() {
                        return zzfy.this.c();
                    }
                });
            } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return null;
            }
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgb
    public final /* synthetic */ Object w(String str) {
        return b().get(str);
    }
}
