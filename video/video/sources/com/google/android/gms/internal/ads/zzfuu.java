package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzfuu {
    public static final CharSequence a(Object obj) {
        Objects.requireNonNull(obj);
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    public static final StringBuilder b(StringBuilder sb, Iterable iterable, String str) {
        c(sb, iterable.iterator(), str);
        return sb;
    }

    public static final StringBuilder c(StringBuilder sb, Iterator it, String str) {
        try {
            if (it.hasNext()) {
                sb.append(a(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) str);
                    sb.append(a(it.next()));
                }
            }
            return sb;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
