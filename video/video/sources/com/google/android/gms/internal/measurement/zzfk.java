package com.google.android.gms.internal.measurement;

import o.C11304zt1;

/* loaded from: classes3.dex */
public enum zzfk implements zzjc {
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_UNKNOWN(0),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_RESTRICTED(1),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_DENIED(2),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_AUTHORIZED(3),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_DETERMINED(4),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_CONFIGURED(5);
    
    public static final zzjb<zzfk> c1 = new zzjb<zzfk>() { // from class: com.google.android.gms.internal.measurement.zzfj
    };
    public final int X;

    zzfk(int i) {
        this.X = i;
    }

    public static zzfk e(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_CONFIGURED;
                        }
                        return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_DETERMINED;
                    }
                    return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_AUTHORIZED;
                }
                return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_DENIED;
            }
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_RESTRICTED;
        }
        return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_UNKNOWN;
    }

    public static zzje g() {
        return zzfl.a;
    }

    @Override // com.google.android.gms.internal.measurement.zzjc
    public final int a() {
        return this.X;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + zzfk.class.getName() + C11304zt1.a + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.X + " name=" + name() + '>';
    }
}
