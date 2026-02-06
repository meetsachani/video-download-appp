package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import java.util.Date;
import o.InterfaceC10697xN2;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;

/* loaded from: classes3.dex */
public class ConfigMetadataClient {
    @InterfaceC5056aJ2
    public static final long e = -1;
    public static final int g = 0;
    @InterfaceC5056aJ2
    public static final int h = 0;
    public static final long i = -1;
    public static final String k = "fetch_timeout_in_seconds";
    public static final String l = "minimum_fetch_interval_in_seconds";
    public static final String m = "last_fetch_status";
    public static final String n = "last_fetch_time_in_millis";

    /* renamed from: o  reason: collision with root package name */
    public static final String f391o = "last_fetch_etag";
    public static final String p = "backoff_end_time_in_millis";
    public static final String q = "num_failed_fetches";
    public static final String r = "last_template_version";
    public static final String s = "num_failed_realtime_streams";
    public static final String t = "realtime_backoff_end_time_in_millis";
    public final SharedPreferences a;
    public final Object b = new Object();
    public final Object c = new Object();
    public final Object d = new Object();
    public static final Date f = new Date(-1);
    @InterfaceC5056aJ2
    public static final Date j = new Date(-1);

    /* loaded from: classes3.dex */
    public static class BackoffMetadata {
        public int a;
        public Date b;

        public BackoffMetadata(int i, Date date) {
            this.a = i;
            this.b = date;
        }

        public Date a() {
            return this.b;
        }

        public int b() {
            return this.a;
        }
    }

    @InterfaceC5056aJ2
    /* loaded from: classes3.dex */
    public static class RealtimeBackoffMetadata {
        public int a;
        public Date b;

        @InterfaceC5056aJ2
        public RealtimeBackoffMetadata(int i, Date date) {
            this.a = i;
            this.b = date;
        }

        public Date a() {
            return this.b;
        }

        public int b() {
            return this.a;
        }
    }

    public ConfigMetadataClient(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    @InterfaceC10697xN2
    public void a() {
        synchronized (this.b) {
            this.a.edit().clear().commit();
        }
    }

    public BackoffMetadata b() {
        BackoffMetadata backoffMetadata;
        synchronized (this.c) {
            backoffMetadata = new BackoffMetadata(this.a.getInt(q, 0), new Date(this.a.getLong(p, -1L)));
        }
        return backoffMetadata;
    }

    public long c() {
        return this.a.getLong(k, 60L);
    }

    public FirebaseRemoteConfigInfo d() {
        FirebaseRemoteConfigInfoImpl a;
        synchronized (this.b) {
            long j2 = this.a.getLong(n, -1L);
            int i2 = this.a.getInt(m, 0);
            a = FirebaseRemoteConfigInfoImpl.d().c(i2).d(j2).b(new FirebaseRemoteConfigSettings.Builder().f(this.a.getLong(k, 60L)).g(this.a.getLong(l, ConfigFetchHandler.j)).c()).a();
        }
        return a;
    }

    @InterfaceC11300zs1
    public String e() {
        return this.a.getString(f391o, null);
    }

    public int f() {
        return this.a.getInt(m, 0);
    }

    public Date g() {
        return new Date(this.a.getLong(n, -1L));
    }

    public long h() {
        return this.a.getLong(r, 0L);
    }

    public long i() {
        return this.a.getLong(l, ConfigFetchHandler.j);
    }

    @InterfaceC5056aJ2
    public RealtimeBackoffMetadata j() {
        RealtimeBackoffMetadata realtimeBackoffMetadata;
        synchronized (this.d) {
            realtimeBackoffMetadata = new RealtimeBackoffMetadata(this.a.getInt(s, 0), new Date(this.a.getLong(t, -1L)));
        }
        return realtimeBackoffMetadata;
    }

    public void k() {
        m(0, j);
    }

    public void l() {
        r(0, j);
    }

    public void m(int i2, Date date) {
        synchronized (this.c) {
            this.a.edit().putInt(q, i2).putLong(p, date.getTime()).apply();
        }
    }

    @InterfaceC10697xN2
    public void n(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        synchronized (this.b) {
            this.a.edit().putLong(k, firebaseRemoteConfigSettings.a()).putLong(l, firebaseRemoteConfigSettings.b()).commit();
        }
    }

    public void o(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        synchronized (this.b) {
            this.a.edit().putLong(k, firebaseRemoteConfigSettings.a()).putLong(l, firebaseRemoteConfigSettings.b()).apply();
        }
    }

    public void p(String str) {
        synchronized (this.b) {
            this.a.edit().putString(f391o, str).apply();
        }
    }

    public void q(long j2) {
        synchronized (this.b) {
            this.a.edit().putLong(r, j2).apply();
        }
    }

    public void r(int i2, Date date) {
        synchronized (this.d) {
            this.a.edit().putInt(s, i2).putLong(t, date.getTime()).apply();
        }
    }

    public void s() {
        synchronized (this.b) {
            this.a.edit().putInt(m, 1).apply();
        }
    }

    public void t(Date date) {
        synchronized (this.b) {
            this.a.edit().putInt(m, -1).putLong(n, date.getTime()).apply();
        }
    }

    public void u() {
        synchronized (this.b) {
            this.a.edit().putInt(m, 2).apply();
        }
    }
}
