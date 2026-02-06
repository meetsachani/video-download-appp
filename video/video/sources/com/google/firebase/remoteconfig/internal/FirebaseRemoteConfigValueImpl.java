package com.google.firebase.remoteconfig.internal;

import com.facebook.a0;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;
import o.InterfaceC8148mw2;

/* loaded from: classes3.dex */
public class FirebaseRemoteConfigValueImpl implements FirebaseRemoteConfigValue {
    public static final String c = "[Value: %s] cannot be converted to a %s.";
    public final String a;
    public final int b;

    public FirebaseRemoteConfigValueImpl(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public int a() {
        return this.b;
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public byte[] b() {
        if (this.b == 0) {
            return FirebaseRemoteConfig.r;
        }
        return this.a.getBytes(ConfigGetParameterHandler.e);
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public String c() {
        if (this.b == 0) {
            return "";
        }
        h();
        return this.a;
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public long d() {
        if (this.b == 0) {
            return 0L;
        }
        String g = g();
        try {
            return Long.valueOf(g).longValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format(c, g, a0.A), e);
        }
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public double e() {
        if (this.b == 0) {
            return 0.0d;
        }
        String g = g();
        try {
            return Double.valueOf(g).doubleValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format(c, g, a0.E), e);
        }
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public boolean f() throws IllegalArgumentException {
        if (this.b == 0) {
            return false;
        }
        String g = g();
        if (ConfigGetParameterHandler.f.matcher(g).matches()) {
            return true;
        }
        if (ConfigGetParameterHandler.g.matcher(g).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format(c, g, InterfaceC8148mw2.b.f));
    }

    public final String g() {
        return c().trim();
    }

    public final void h() {
        if (this.a != null) {
            return;
        }
        throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
    }
}
