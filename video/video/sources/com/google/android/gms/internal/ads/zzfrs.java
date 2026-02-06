package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
class zzfrs {
    public static final String h = new UUID(0, 0).toString();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final zzfrr f;
    public final zzfrq g;

    public zzfrs(Context context, String str, String str2, String str3) {
        this.f = zzfrr.b(context);
        this.g = zzfrq.a(context);
        this.a = str;
        this.b = str.concat("_3p");
        this.c = str2;
        this.d = str2.concat("_3p");
        this.e = str3;
    }

    public final long a(boolean z) {
        String str;
        if (z) {
            str = this.d;
        } else {
            str = this.c;
        }
        return this.f.a(str, -1L);
    }

    public final zzfrp b(@InterfaceC11300zs1 String str, @InterfaceC11300zs1 String str2, long j, boolean z) throws IOException {
        String str3;
        boolean z2 = true;
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(h)) {
                    String e = e(true);
                    String c = this.f.c("paid_3p_hash_key", null);
                    if (e != null && c != null && !e.equals(h(str, str2, c))) {
                        return c(str, str2);
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new zzfrp();
        }
        if (str == null) {
            z2 = false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis >= 0) {
            long a = a(z2);
            if (a != -1) {
                if (currentTimeMillis < a) {
                    zzfrr zzfrrVar = this.f;
                    if (z2) {
                        str3 = this.d;
                    } else {
                        str3 = this.c;
                    }
                    zzfrrVar.d(str3, Long.valueOf(currentTimeMillis));
                } else if (currentTimeMillis >= a + j) {
                    return c(str, str2);
                }
            }
            String e2 = e(z2);
            if (e2 == null && !z) {
                return c(str, str2);
            }
            return new zzfrp(e2, a(z2));
        }
        throw new IllegalStateException(this.e.concat(": Invalid negative current timestamp. Updating PAID failed"));
    }

    public final zzfrp c(String str, String str2) throws IOException {
        if (str == null) {
            return d(UUID.randomUUID().toString(), false);
        }
        String uuid = UUID.randomUUID().toString();
        this.f.d("paid_3p_hash_key", uuid);
        return d(h(str, str2, uuid), true);
    }

    public final zzfrp d(String str, boolean z) throws IOException {
        String str2;
        String str3;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis >= 0) {
            zzfrr zzfrrVar = this.f;
            if (z) {
                str2 = this.d;
            } else {
                str2 = this.c;
            }
            zzfrrVar.d(str2, Long.valueOf(currentTimeMillis));
            if (z) {
                str3 = this.b;
            } else {
                str3 = this.a;
            }
            zzfrrVar.d(str3, str);
            return new zzfrp(str, currentTimeMillis);
        }
        throw new IllegalStateException(this.e.concat(": Invalid negative current timestamp. Updating PAID failed"));
    }

    public final String e(boolean z) {
        String str;
        if (z) {
            str = this.b;
        } else {
            str = this.a;
        }
        return this.f.c(str, null);
    }

    public final void f(boolean z) throws IOException {
        String str;
        String str2;
        if (z) {
            str = this.d;
        } else {
            str = this.c;
        }
        zzfrr zzfrrVar = this.f;
        zzfrrVar.e(str);
        if (z) {
            str2 = this.b;
        } else {
            str2 = this.a;
        }
        zzfrrVar.e(str2);
    }

    public final boolean g(boolean z) {
        return this.f.g(this.a);
    }

    public final String h(String str, String str2, String str3) {
        String str4;
        if (str2 != null && str3 != null) {
            return UUID.nameUUIDFromBytes((str + str2 + str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        String str5 = this.e;
        StringBuilder sb = new StringBuilder();
        sb.append(str5);
        sb.append(": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ");
        String str6 = "not null";
        if (str2 != null) {
            str4 = "not null";
        } else {
            str4 = "null";
        }
        sb.append(str4);
        sb.append(", hashKey is ");
        if (str3 == null) {
            str6 = "null";
        }
        sb.append(str6);
        throw new IllegalArgumentException(sb.toString());
    }
}
