package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import o.HT1;
import o.InterfaceC5056aJ2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class HeartBeatInfoStorage {
    public static HeartBeatInfoStorage b = null;
    public static final String c = "fire-global";
    public static final String d = "FirebaseAppHeartBeat";
    public static final String e = "FirebaseHeartBeat";
    public static final String f = "fire-count";
    public static final String g = "last-used-date";
    public static final int h = 30;
    public final SharedPreferences a;

    public HeartBeatInfoStorage(Context context, String str) {
        this.a = context.getSharedPreferences(e + str, 0);
    }

    public final synchronized void a() {
        try {
            long j = this.a.getLong(f, 0L);
            String str = "";
            String str2 = null;
            for (Map.Entry<String, ?> entry : this.a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str3 : (Set) entry.getValue()) {
                        if (str2 != null && str2.compareTo(str3) <= 0) {
                        }
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
            HashSet hashSet = new HashSet(this.a.getStringSet(str, new HashSet()));
            hashSet.remove(str2);
            this.a.edit().putStringSet(str, hashSet).putLong(f, j - 1).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void b() {
        try {
            SharedPreferences.Editor edit = this.a.edit();
            int i = 0;
            for (Map.Entry<String, ?> entry : this.a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    String d2 = d(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (((Set) entry.getValue()).contains(d2)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(d2);
                        i++;
                        edit.putStringSet(key, hashSet);
                    } else {
                        edit.remove(key);
                    }
                }
            }
            if (i == 0) {
                edit.remove(f);
            } else {
                edit.putLong(f, i);
            }
            edit.commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized List<HeartBeatResult> c() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(d(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(HeartBeatResult.a(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            n(System.currentTimeMillis());
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized String d(long j) {
        Instant instant;
        ZoneOffset zoneOffset;
        OffsetDateTime atOffset;
        LocalDateTime localDateTime;
        DateTimeFormatter dateTimeFormatter;
        String format;
        if (Build.VERSION.SDK_INT >= 26) {
            instant = new Date(j).toInstant();
            zoneOffset = ZoneOffset.UTC;
            atOffset = instant.atOffset(zoneOffset);
            localDateTime = atOffset.toLocalDateTime();
            dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
            format = localDateTime.format(dateTimeFormatter);
            return format;
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    @HT1({HT1.a.Z0})
    @InterfaceC5056aJ2
    public int e() {
        return (int) this.a.getLong(f, 0L);
    }

    public synchronized long f() {
        return this.a.getLong(c, -1L);
    }

    public final synchronized String g(String str) {
        for (Map.Entry<String, ?> entry : this.a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str2 : (Set) entry.getValue()) {
                    if (str.equals(str2)) {
                        return entry.getKey();
                    }
                }
                continue;
            }
        }
        return null;
    }

    public synchronized boolean h(long j, long j2) {
        return d(j).equals(d(j2));
    }

    public synchronized void i() {
        String d2 = d(System.currentTimeMillis());
        this.a.edit().putString(g, d2).commit();
        j(d2);
    }

    public final synchronized void j(String str) {
        try {
            String g2 = g(str);
            if (g2 == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.a.getStringSet(g2, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                this.a.edit().remove(g2).commit();
            } else {
                this.a.edit().putStringSet(g2, hashSet).commit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean k(long j) {
        return l(c, j);
    }

    public synchronized boolean l(String str, long j) {
        if (this.a.contains(str)) {
            if (!h(this.a.getLong(str, -1L), j)) {
                this.a.edit().putLong(str, j).commit();
                return true;
            }
            return false;
        }
        this.a.edit().putLong(str, j).commit();
        return true;
    }

    public synchronized void m(long j, String str) {
        String d2 = d(j);
        if (this.a.getString(g, "").equals(d2)) {
            String g2 = g(d2);
            if (g2 == null) {
                return;
            }
            if (g2.equals(str)) {
                return;
            }
            o(str, d2);
            return;
        }
        long j2 = this.a.getLong(f, 0L);
        if (j2 + 1 == 30) {
            a();
            j2 = this.a.getLong(f, 0L);
        }
        HashSet hashSet = new HashSet(this.a.getStringSet(str, new HashSet()));
        hashSet.add(d2);
        this.a.edit().putStringSet(str, hashSet).putLong(f, j2 + 1).putString(g, d2).commit();
    }

    public synchronized void n(long j) {
        this.a.edit().putLong(c, j).commit();
    }

    public final synchronized void o(String str, String str2) {
        j(str2);
        HashSet hashSet = new HashSet(this.a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.a.edit().putStringSet(str, hashSet).commit();
    }

    @HT1({HT1.a.Z0})
    @InterfaceC5056aJ2
    public HeartBeatInfoStorage(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }
}
