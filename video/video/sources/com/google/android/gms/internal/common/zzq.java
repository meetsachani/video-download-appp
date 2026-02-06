package com.google.android.gms.internal.common;

import o.MB;
import org.jspecify.nullness.NullMarked;

@NullMarked
/* loaded from: classes2.dex */
public final class zzq {
    public static final CharSequence a(@MB Object obj, String str) {
        obj.getClass();
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }
}
