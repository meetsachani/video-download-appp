package com.google.android.gms.measurement.internal;

import o.C3599Ly1;

/* loaded from: classes3.dex */
enum zzaj {
    UNSET(C3599Ly1.j),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    FAILSAFE('9');
    
    public final char X;

    zzaj(char c) {
        this.X = c;
    }

    public static zzaj g(char c) {
        zzaj[] values;
        for (zzaj zzajVar : values()) {
            if (zzajVar.X == c) {
                return zzajVar;
            }
        }
        return UNSET;
    }
}
